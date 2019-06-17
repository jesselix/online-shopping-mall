package li.jesse.mall.dao;

import li.jesse.mall.pojo.SuccessBargainRush;

public interface SuccessBargainRushDao {

    SuccessBargainRush queryByBargainRushId(long bargainRushId);

    int insertSuccessBargainRush(long bargainRushId, long userId);
}
