package li.jesse.shoppingmalldeal.dao;

import li.jesse.shoppingmalldeal.pojo.SuccessBargainRush;

public interface SuccessBargainRushDao {

    SuccessBargainRush queryByBargainRushId(long bargainRushId);

    int insertSuccessBargainRush(long bargainRushId, long userId);
}
