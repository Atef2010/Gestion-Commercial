package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import GestionComm.Client;;

public class ClientDAO {


	Session session;
	SessionFactory sf;

	public ClientDAO()
	{
		sf=new AnnotationConfiguration().configure().buildSessionFactory();
		session=sf.openSession();
	}
	public void save(Client a)
	{
		Transaction tr1=session.beginTransaction();
		session.save(a);
		tr1.commit();
	}
	public void update(Client a)
	{
		Transaction tr2=session.beginTransaction();
		session.update(a);
		tr2.commit();
	}
	public void delete(Client a)
	{
		Transaction tr3=session.beginTransaction();
		session.delete(a);
		tr3.commit();
	}
	
	public List<Client> getClient()
	{
		List<Client> l=session.createQuery("from Client").list();
		return l;
	}
	
	public List<Client> getClientById(int idp)
	{
		List<Client> l=session.createQuery("from Client where cin="+idp+" ").list();
		return l;
	}
	
	public void updateClient(int idp,String cin)
	 {

	Transaction tf=session.beginTransaction();
	org.hibernate.Query q1=session.createQuery("update Client set ref='"+cin+"' where idp='"+idp+"'");
	int rowCount = q1.executeUpdate();
	System.out.println("Rows affected: " + rowCount);
	tf.commit();

	 }
	
	
	public void closeConnection()
	{
		session.close();
	}



}


