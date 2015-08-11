package test.hql;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		
		UzytkownikDane dane = new UzytkownikDane();
		dane.setUserName("Celina");
		
		Samochod samochod = new Samochod();
		samochod.setNazwaSamochodu("Fiat");
		
		dane.setSamochod(samochod);
		
		//Przygotowanie Hibernata
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		
		session.beginTransaction();
		
		int minimalnyUser =3;
		
		//Klazule select i where
		Query query = session.createQuery("select userName from UzytkownikDane where userID >"+minimalnyUser);
		//Query query = session.getNamedQuery("Uzytkownicy");
		
		//Klazula order by
		//		Query query = session.createQuery("select userName from UzytkownikDane order by userName.userName  ");

		List<String> uzytkownicy = (List<String>) query.list();
		
		session.save(samochod);
		session.save(dane);
		session.getTransaction().commit();
				
		session.close();
		sessionfactory.close();
		
		for(String u : uzytkownicy)
			System.out.println("Uzytkownicy: " +u);
	}
}
