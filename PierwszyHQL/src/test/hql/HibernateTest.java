package test.hql;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		UzytkownikDane dane = new UzytkownikDane();
		dane.setUserID(5);
		dane.setUserName("inyy");
		dane.setDataDolaczenia(new Date());
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(dane);
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();
	}

}
