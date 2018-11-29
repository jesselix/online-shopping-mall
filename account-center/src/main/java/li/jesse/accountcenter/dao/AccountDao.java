package li.jesse.accountcenter.dao;

import li.jesse.accountcenter.pojo.Account;

public interface AccountDao {

    // ===== Retrieve =====

    /**
     *
     * @param accountId
     * @return
     */
    Account selectById(Integer accountId);


}
