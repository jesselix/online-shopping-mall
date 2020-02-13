package li.jesse.shoppingmalldeal.dao;

import li.jesse.shoppingmalldeal.pojo.BargainRush;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface BargainRushDao {

    BargainRush queryByBargainRushId(long bargainRushId);

    List<BargainRush> queryAll(int offset, int limit);

    int reduceInventory(long bargainRushId, Date createTime);



}
