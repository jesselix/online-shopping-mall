package li.jesse.mall.entity;

import java.util.Date;

public class SuccessLimitedTimeOffer {

    private String SuccessLimitedTimeOfferId;

    private String userId;

    private short state;

    private Date createTime;

    public String getSuccessLimitedTimeOfferId() {
        return SuccessLimitedTimeOfferId;
    }

    public void setSuccessLimitedTimeOfferId(String successLimitedTimeOfferId) {
        SuccessLimitedTimeOfferId = successLimitedTimeOfferId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
