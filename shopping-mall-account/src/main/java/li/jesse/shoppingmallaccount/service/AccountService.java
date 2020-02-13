package li.jesse.shoppingmallaccount.service;

public interface AccountService {

    Object login(String accountId, String password);

    Object getInformation(String accountId);

}
