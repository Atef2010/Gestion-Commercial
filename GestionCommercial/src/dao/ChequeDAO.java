package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import gestioncomm.Cheque;;

public class ChequeDAO {


	Session session;
	SessionFactory sf;

	public ChequeDAO()
	{
		sf=new AnnotationConfiguration().configure().buildSessionFactory();
		session=sf.openSession();
	}
	public void save(Cheque a)
	{
		Transaction tr1=session.beginTransaction();
		session.save(a);
		tr1.commit();
	}
	public void update(Cheque a)
	{
		Transaction tr2=session.beginTransaction();
		session.update(a);
		tr2.commit();
	}
	public void delete(Cheque a)
	{
		Transaction tr3=session.beginTransaction();
		session.delete(a);
		tr3.commit();
	}
	
	public List<Cheque> getCheque()
	{
		List<Cheque> l=session.createQuery("from Cheque").list();
		
		return l;
	}
	
	public List<Cheque> getChequeById(int idp)
	{
		List<Cheque> l=session.createQuery("from Cheque where cin="+idp+" ").list();
		return l;
	}
	
	public void updateCheque(int idp,String cin)
	 {

	Transaction tf=session.beginTransaction();
	org.hibernate.Query q1=session.createQuery("update Cheque set idecheque='"+cin+"' where idp='"+29+"'");
	int rowCount = q1.executeUpdate();
	System.out.println("Rows affected: " + rowCount);
	tf.commit();

	 }
	
	
	public void closeConnection()
	{
		session.close();
	}



}


