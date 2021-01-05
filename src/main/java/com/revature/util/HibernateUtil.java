package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static Session session;

    // static initializr
    // wil run when the class is loaded inititally
    // do this when you have environment variables.
//    static {
//        
//        
//    }
    private static SessionFactory sf =
            // this would go in the static initializer
            new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

    private HibernateUtil() {
        super(); // you cant instatiate this, this is a singleton
    }

    public static Session getSession() {
        if (session == null) {
            session = sf.openSession();
        }
        return session;
    }

    public static void closeSession() {
        session.close();
        session = null;
        // once this executes a new session opens like the above method

    }
}
