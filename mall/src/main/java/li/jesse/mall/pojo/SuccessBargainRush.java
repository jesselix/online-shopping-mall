package li.jesse.mall.pojo;

import java.util.Date;

public class SuccessBargainRush {

    private String bargainRushId;

    private String userId;

    private short state;

    private Date createTime;

    public String getBargainRushId() {
        return bargainRushId;
    }

    public void setBargainRushId(String bargainRushId) {
        this.bargainRushId = bargainRushId;
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
