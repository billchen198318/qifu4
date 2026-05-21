FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY ./app/target/core-app-0.0.4-SNAPSHOT.jar app.jar
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "app.jar"]