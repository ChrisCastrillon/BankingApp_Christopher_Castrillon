package com.revature.repositories;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Account;
import com.revature.util.HibernateUtil;

public class AccountDAO implements IAccountDAO {

    public AccountDAO() {
        super();
    }
    @Override
    public Account addNewAccount(Account acc) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Account findByAccountId(int accountId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<Account> getAllAccountsOfUser(int userId) {    
        return null;
    }

    @Override
    public boolean deleteAccount(int accountId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean updateAccount(Account acc) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public Set<Account> getAllAccounts() {
        Set<Account> accountsList = new HashSet<Account>();
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<Account> query = builder.createQuery(Account.class);
        Root<Account> root = query.from(Account.class);
        query.select(root);
        accountsList = (Set<Account>)s.createQuery(query).getResultList();
        tx.commit();
        return accountsList;
    }

}
