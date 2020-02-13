package li.jesse.shoppingmallaccount.dao;

import li.jesse.shoppingmallaccount.pojo.Account;

public interface AccountDao {

    // ===== Retrieve =====

    /**
     *
     * @param accountId
     * @return
     */
    Account selectById(Integer accountId);


}
