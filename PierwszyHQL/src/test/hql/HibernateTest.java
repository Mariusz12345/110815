package test.hql;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		
		UzytkownikDane dane = new UzytkownikDane();
		dane.setUserName("Alicja");
		
		Samochod samochod = new Samochod();
		samochod.setNazwaSamochodu("Ford");
		
		dane.setSamochod(samochod);
		
		//Przygotowanie Hibernata
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		
		session.beginTransaction();
		
		int minimalnyUser = 20;
		
		
		// select i where
		//Query query = session.createQuery("select userName from UzytkownikDane where userID >"+minimalnyUser);
		//Query query = session.createQuery("select nazwaSamochodu from Samochod ");
		//Query query = session.getNamedQuery("Uzytkownicy");
		//Query query = session.createQuery("from UzytkownikDane ");
		
		// order by
		//Query query = session.createQuery("select userName from UzytkownikDane order by userName.userName  ");
		
		// Update
		//Query query = session.createQuery("update UzytkownikDane set userName=:newNAme where userName=:userName");
		//query.setString("userName", "Alicja");
		//query.setString("newNAme", "zmian");
		 //query.executeUpdate();
		
		
		
		
		//List<UzytkownikDane> uzyDane = (List<UzytkownikDane>) query.list();
		
		//List<String> zapisDoListy = (List<String>) query.list();
		
		//session.save(samochod);
		//session.save(dane);
		session.getTransaction().commit();
		
		
		session.close();
		sessionfactory.close();
				
		//for(String u : zapisDoListy)
		//System.out.println("Uzytkownicy: " +u);
		
		
		//for(UzytkownikDane d : uzyDane)
		//System.out.println("Uzytkownicy : " + d.getUserName());
	}
}
