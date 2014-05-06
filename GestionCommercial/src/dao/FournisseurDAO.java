package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import gestioncomm.Fournisseur;
public class FournisseurDAO {

	Session session;
	SessionFactory sf;

	public FournisseurDAO()
	{
		sf=new AnnotationConfiguration().configure().buildSessionFactory();
		session=sf.openSession();
	}
	public void save(Fournisseur a)
	{
		Transaction tr1=session.beginTransaction();
		session.save(a);
		tr1.commit();
	}
	public void update(Fournisseur a)
	{
		Transaction tr2=session.beginTransaction();
		session.update(a);
		tr2.commit();
	}
	public void delete(Fournisseur a)
	{
		Transaction tr3=session.beginTransaction();
		session.delete(a);
		tr3.commit();
	}
	
	public List<Fournisseur> getFournisseur()
	{
		List<Fournisseur> l=session.createQuery("from fournisseur").list();
		for (int i=0;i<100;i++)
		{
			System.out.println(l.get(i).getCode()+"  "+l.get(i).getNom()+"  "+l.get(i).getPrenom()+"  "+l.get(i).getTel());
		
		}
		return l;
	}
	
	public List<Fournisseur> getFournisseurById(int idf)
	{
		List<Fournisseur> l=session.createQuery("from fournisseur where code="+idf+" ").list();
		return l;
	}
	
	public void updateFournisseur(int idp,String code)
	 {

	Transaction tf=session.beginTransaction();
	org.hibernate.Query q1=session.createQuery("update fournisseur set ref='"+code+"' where idp='"+idp+"'");
	int rowCount = q1.executeUpdate();
	System.out.println("Rows affected: " + rowCount);
	tf.commit();

	 }
	
	
	public void closeConnection()
	{
		session.close();
	}


}
