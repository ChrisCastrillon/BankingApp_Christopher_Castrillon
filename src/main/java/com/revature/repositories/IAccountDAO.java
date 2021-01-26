package com.revature.repositories;

import java.util.Set;

import com.revature.models.Account;

public interface IAccountDAO {
    
 
    
    public Account addNewAccount(Account acc);
    public Account findByAccountId(int accountId);
    public Set<Account> getAllAccountsOfUser(int userId);
    public boolean deleteAccount(int accountId);
    public boolean updateAccount(Account acc);
    public Set<Account> getAllAccounts();
    
}
