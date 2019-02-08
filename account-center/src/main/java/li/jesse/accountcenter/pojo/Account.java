package li.jesse.accountcenter.pojo;

import java.util.Date;

public class Account {

    private Integer accountId;

    private String accountName;

    private String password;

    private String mobile;

    private String email;

    private Byte role;

    private Date createTime;

    private Date updateTime;

    public Account(Integer accountId, String accountName, String password, String mobile, String email, Byte role, Date createTime, Date updateTime) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.password = password;
        this.mobile = mobile;
        this.email = email;
        this.role = role;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Account() {
        super();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
