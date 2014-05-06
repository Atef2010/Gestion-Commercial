package dao;

import gestioncomm.Facture;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class FactureDAO {

	


	Session session;
	SessionFactory sf;

	public FactureDAO()
	{
		sf=new AnnotationConfiguration().configure().buildSessionFactory();
		session=sf.openSession();
	}
	public void save(Facture a)
	{
		Transaction tr1=session.beginTransaction();
		session.save(a);
		tr1.commit();
	}
	public void update(Facture a)
	{
		Transaction tr2=session.beginTransaction();
		session.update(a);
		tr2.commit();
	}
	public void delete(Facture a)
	{
		Transaction tr3=session.beginTransaction();
		session.delete(a);
		tr3.commit();
	}
	
	public List<Facture> getFacture()
	{
		List<Facture> l=session.createQuery("from Facture").list();
		
		return l;
	}
	
	public List<Facture> getFactureById(int idp)
	{
		List<Facture> l=session.createQuery("from Facture where numfact="+idp+" ").list();
		return l;
	}
	
	public void updateFacture(int idp,String cin)
	 {

	Transaction tf=session.beginTransaction();
	org.hibernate.Query q1=session.createQuery("update Facture set numfact='"+cin+"' where idp='"+29+"'");
	int rowCount = q1.executeUpdate();
	System.out.println("Rows affected: " + rowCount);
	tf.commit();

	 }
	
	
	public void closeConnection()
	{
		session.close();
	}



}




