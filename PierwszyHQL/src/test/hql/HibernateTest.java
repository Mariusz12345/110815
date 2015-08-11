package test.hql;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		UzytkownikDane dane = new UzytkownikDane();
		UzytkownikDane dane2 = new UzytkownikDane();
		
		dane.setUserName("Jan");
		dane.setDataDolaczenia(new Date());
		
		dane2.setUserName("Piotr");
		dane2.setDataDolaczenia(new Date());
		
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(dane);
		session.save(dane2);
		session.getTransaction().commit();
		
		
			//odzyskywanie obiektu za pomoca session.get
//		dane = null;
//		
//		 session = sessionfactory.openSession();
//		 session.beginTransaction();
//		 dane = (UzytkownikDane) session.get(UzytkownikDane.class, 1);
//		 System.out.println("Dane uzytkownika: " + dane.getUserName());
		
		
		
		
		session.close();
		sessionfactory.close();
	}
}
