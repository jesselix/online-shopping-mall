package li.jesse.mall.pojo;

import java.util.Date;

public class BargainRush {

    private String bargainRushId;

    private String bargainRushName;

    private int inventory;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    public String getBargainRushId() {
        return bargainRushId;
    }

    public void setBargainRushId(String bargainRushId) {
        this.bargainRushId = bargainRushId;
    }

    public String getBargainRushName() {
        return bargainRushName;
    }

    public void setBargainRushName(String bargainRushName) {
        this.bargainRushName = bargainRushName;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
