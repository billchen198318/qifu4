package org.qifu.base.support;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class TokenStoreBuilder implements TokenStore {
	
	private DataSource dataSource;
	
	private static String _insertSql = "insert into " + TokenStoreConfig.getTableName() + "(OID, USER_ID, TOKEN, EXPIRES_DATE, CDATE) values(:refreshToken, :userId, :accessToken, :expiresDate, :cdate)";
	
	public static TokenStoreBuilder build(DataSource dataSource) {
		TokenStoreBuilder b = new TokenStoreBuilder(dataSource);
		return b;
	}
	
	public TokenStoreBuilder(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public void save(String refreshToken, String accessToken, String userId, Date expiresDate) {
		NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource);
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("refreshToken", refreshToken);
		param.put("userId", userId);
		param.put("accessToken", accessToken);
		param.put("expiresDate", expiresDate);
		param.put("cdate", new Date());
		jdbcTemplate.update(_insertSql, param);
	}
	
}
