package org.qifu.test;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.junit.jupiter.api.Test;
import org.qifu.base.properties.MqttConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(properties = {"mqttbroker.enable=true", "mqttbroker.allowAnonymous=true"})
public class MqttIntegrationTest {

    @Autowired
    private MqttConfigProperties mqttConfigProperties;

    @Test
    public void testMqttPublishAndSubscribe() throws Exception {
        // 使用原有的配置屬性
        String brokerUrl = "tcp://" + mqttConfigProperties.getHost() + ":" + mqttConfigProperties.getPort();
        String topic = "test/topic";
        String messageContent = "Hello MQTT";

        CountDownLatch latch = new CountDownLatch(1);

        // 1. 訂閱者 (Consumer)
        MqttClient subscriber = new MqttClient(brokerUrl, "subscriber_client");
        MqttConnectOptions options = new MqttConnectOptions();
        options.setCleanSession(true);
        // 不設定帳號密碼，因為我們允許匿名
        subscriber.connect(options);

        subscriber.setCallback(new MqttCallback() {
            @Override
            public void connectionLost(Throwable cause) {}

            @Override
            public void messageArrived(String topic, MqttMessage message) {
                // 驗證訊息內容
                if (new String(message.getPayload()).equals(messageContent)) {
                    latch.countDown();
                }
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken token) {}
        });

        subscriber.subscribe(topic);

        // 2. 發布者 (Producer)
        MqttClient publisher = new MqttClient(brokerUrl, "publisher_client");
        publisher.connect(options);
        MqttMessage message = new MqttMessage(messageContent.getBytes());
        publisher.publish(topic, message);
        publisher.disconnect();
        publisher.close();

        // 等待訊息接收
        assertTrue(latch.await(5, TimeUnit.SECONDS), "訊息應該在 5 秒內被接收");

        subscriber.disconnect();
        subscriber.close();
    }
}
