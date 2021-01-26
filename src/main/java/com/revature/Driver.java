package com.revature;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Address;
import com.revature.models.Role;
import com.revature.models.User;
import com.revature.util.HibernateUtil;

public class Driver {
    public static void main(String[] args) {
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
//        Role financeManager = new Role(0,"Finance_Manager");
//        Role client = new Role(0,"client");
//        Role employee = new Role(0,"Employee");
//        Address testUser1Address = new Address(0,null, "14 Loraine street", "Brentwood", "New York", 11717, "United States");
//        Set<Address> testUserAddresses = new HashSet<>();
//        testUserAddresses.add(testUser1Address);
//        User testUser1 = new User(0, "Christopher", "Castrillon", "christophercastrillonart@gmail.com", "cc3988", "password",financeManager,testUserAddresses,000000000, null,null);
        
        Role financeManager = new Role(0,"Finance_Manager");
        Set<User> user = new HashSet<>();
        Address testUser1Address = new Address(0,null, "14 Loraine Stret", "Brentwood", "New York", 11717, "United States" );
        User testUser1 = new User(0, "Christopher", "Castrillon", "christophercastrillonart@gmail.com", "cc3988", "password", financeManager, null, 111111111, null, null);
        user.add(testUser1);
        Set<Address> addresses = new HashSet<>();
        testUser1Address.setUsers(user);
        addresses.add(testUser1Address);
        testUser1.setAddresses(addresses);
        s.save(testUser1Address);
        s.save(testUser1);
        tx.commit();
    }

}
