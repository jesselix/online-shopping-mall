package li.jesse.mall.dao;

import li.jesse.mall.entity.LimitedTimeOffer;

import java.util.Date;
import java.util.List;

public interface LimitedTimeOfferDao {

    LimitedTimeOffer queryByLimitedTimeOfferId(long limitedTimeOfferId);

    List<LimitedTimeOffer> queryAll(int offset, int limit);

    int reductInventory(long limitedTimeOfferId, Date createTime);
}
