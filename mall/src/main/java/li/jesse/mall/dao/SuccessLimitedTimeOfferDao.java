package li.jesse.mall.dao;

import li.jesse.mall.entity.SuccessLimitedTimeOffer;

public interface SuccessLimitedTimeOfferDao {

    SuccessLimitedTimeOffer queryBySuccessLimitedTimeOfferId(long successLimitedTimeOfferId);

    int insertSuccessLimitedTimeOffer(long limitedTimeOfferId, long userId);


}
