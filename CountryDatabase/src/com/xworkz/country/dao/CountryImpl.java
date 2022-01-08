package com.xworkz.country.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.country.entity.CountryEntity;


public class CountryImpl implements CountryDAO{

	@Override
	public void create(CountryEntity countryEntity) {
		System.out.println(countryEntity);
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CountryEntity.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
	
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(countryEntity);
		tr.commit();
		session.close();
		sessionFactory.close();
		
		
	}

}