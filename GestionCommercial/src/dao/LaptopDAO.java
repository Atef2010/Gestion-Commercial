package dao;

import gestioncomm.Laptop;
import gestioncomm.Pcbureau;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class LaptopDAO {


	Session session;
	SessionFactory sf;

	public LaptopDAO ()
	{
		sf=new AnnotationConfiguration().configure().buildSessionFactory();
		session=sf.openSession();
	}
	public void save(Laptop a)
	{
		Transaction tr1=session.beginTransaction();
		session.save(a);
		tr1.commit();
	}
	public void update(Laptop a)
	{
		Transaction tr2=session.beginTransaction();
		session.update(a);
		tr2.commit();
	}
	public void delete(Laptop a)
	{
		Transaction tr3=session.beginTransaction();
		session.delete(a);
		tr3.commit();
	}
	
	public List<Laptop> getLaptop()
	{
		List<Laptop> l=session.createQuery("from Laptop").list();
		return l;
	}
	
	public List<Laptop> getLaptopById(int idpc)
	{
		List<Laptop> l=session.createQuery("from Laptop where ref="+idpc+" ").list();
		return l;
	}
	
}
