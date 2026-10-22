package com.aadiandjava.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory SESSION_FACTORY=buildSessionFactory();
	
	public static SessionFactory buildSessionFactory() {
		
		try {
			
			return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public static SessionFactory getSessionFactory() {
		
		return SESSION_FACTORY;
	}

}
