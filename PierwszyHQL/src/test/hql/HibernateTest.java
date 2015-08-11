package test.hql;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		
		UzytkownikDane dane = new UzytkownikDane();
		dane.setUserName("Patrycja");
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		
		String hql = ("select userName from UzytkownikDane");
		Query query = session.createQuery(hql);
		List<String> uzytkownicy = (List<String>) query.list();
		
		//session.save(dane);
		session.getTransaction().commit();
				
		session.close();
		sessionfactory.close();
		
		for(String u : uzytkownicy)
			System.out.println("Uzytkownicy: " +u);
	}
}
