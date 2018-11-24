package li.jesse.accountcenter.service;

import li.jesse.accountcenter.pojo.Account;

public interface AccountService {

    Object login(String accountId, String password);

    Object getInformation(String accountId);

}
