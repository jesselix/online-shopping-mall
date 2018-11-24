package li.jesse.accountcenter.dao;

import li.jesse.accountcenter.pojo.Account;

public interface AccountDao {

    Account selectById(Integer accountId);


}
