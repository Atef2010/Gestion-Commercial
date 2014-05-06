
package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;


import gestioncomm.Pcbureau;

public class PcbureauDAO {


	Session session;
	SessionFactory sf;

	public PcbureauDAO()
	{
		sf=new AnnotationConfiguration().configure().buildSessionFactory();
		session=sf.openSession();
	}
	public void save(Pcbureau a)
	{
		Transaction tr1=session.beginTransaction();
		session.save(a);
		tr1.commit();
	}
	public void update(Pcbureau a)
	{
		Transaction tr2=session.beginTransaction();
		session.update(a);
		tr2.commit();
	}
	public void delete(Pcbureau a)
	{
		Transaction tr3=session.beginTransaction();
		session.delete(a);
		tr3.commit();
	}
	
	public List<Pcbureau> getPcbureau()
	{
		List<Pcbureau> l=session.createQuery("from Pcbureau").list();
		return l;
	}
	
	public List<Pcbureau> getPcbureauById(int idpc)
	{
		List<Pcbureau> l=session.createQuery("from Pcbureau where ref="+idpc+" ").list();
		return l;
	}
	
	public void updatePcbureau(int idpc,String cin)
	 {

	Transaction tf=session.beginTransaction();
	org.hibernate.Query q1=session.createQuery("update Pcbureau set processeur='"+cin+"' where idpc='"+29+"'");
	int rowCount = q1.executeUpdate();
	System.out.println("Rows affected: " + rowCount);
	tf.commit();

	 }
	
	
	public void closeConnection()
	{
		session.close();
	}



}


