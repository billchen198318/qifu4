package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.EntityPK;

public class TbSysToken implements java.io.Serializable {
	private static final long serialVersionUID = 6649078428128443821L;
	
	private String oid;
    private String userId;
    private String token;
    private Date expiresDate;
    private Date rfExpiresDate;
    private Date cdate;
    
    @EntityPK(name = "oid", autoUUID = true)
    public String getOid() {
        return oid;
    }
    
    public void setOid(String oid) {
        this.oid = oid;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getToken() {
        return token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    
    public Date getExpiresDate() {
        return expiresDate;
    }
    
    public void setExpiresDate(Date expiresDate) {
        this.expiresDate = expiresDate;
    }
    
    public Date getRfExpiresDate() {
        return rfExpiresDate;
    }
    
    public void setRfExpiresDate(Date rfExpiresDate) {
        this.rfExpiresDate = rfExpiresDate;
    }
    
    @CreateDateField(name = "cdate")
    public Date getCdate() {
        return cdate;
    }
    
    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }
    
	
}
