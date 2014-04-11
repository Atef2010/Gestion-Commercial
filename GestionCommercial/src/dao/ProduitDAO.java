package dao;

import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import GestionComm.Produit;

public class ProduitDAO {
		
		Session session;
		SessionFactory sf;

		public ProduitDAO()
		{
			sf=new AnnotationConfiguration().configure().buildSessionFactory();
			session=sf.openSession();
		}
		public void save(Produit a)
		{
			Transaction tr1=session.beginTransaction();
			session.save(a);
			tr1.commit();
		}
		public void update(Produit a)
		{
			Transaction tr2=session.beginTransaction();
			session.update(a);
			tr2.commit();
		}
		public void delete(Produit a)
		{
			Transaction tr3=session.beginTransaction();
			session.delete(a);
			tr3.commit();
		}
		
		public List<Produit> getProduit()
		{
			List<Produit> l=session.createQuery("from Produit").list();
			return l;
		}
		
		public List<Produit> getProduitById(int idp)
		{
			List<Produit> l=session.createQuery("from Produit where ref="+idp+" ").list();
			return l;
		}
		
		public void updateProduit(int idp,String ref , String lib)
		 {

		Transaction tf=session.beginTransaction();
		org.hibernate.Query q1=session.createQuery("update Produit set ref='"+ref+"' where idp='"+idp+"'");
		int rowCount = q1.executeUpdate();
		System.out.println("Rows affected: " + rowCount);
		tf.commit();

		 }
		
		
		public void closeConnection()
		{
			session.close();
		}

	

}
