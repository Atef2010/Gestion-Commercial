package dao;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import gestioncomm.Commande;

public class CommandeDAO {
		
		Session session;
		SessionFactory sf;

		public CommandeDAO()
		{
			sf=new AnnotationConfiguration().configure().buildSessionFactory();
			session=sf.openSession();
		}
		public void save(Commande a)
		{
			Transaction tr1=session.beginTransaction();
			session.save(a);
			tr1.commit();
		}
		public void update(Commande a)
		{
			Transaction tr2=session.beginTransaction();
			session.update(a);
			tr2.commit();
		}
		public void delete(Commande a)
		{
			Transaction tr3=session.beginTransaction();
			session.delete(a);
			tr3.commit();
		}
		
		public List<Commande> getCommande()
		{
			List<Commande> l=session.createQuery("from Commande").list();
			for (int i=0;i<100;i++)
			{
				System.out.println(l.get(i).getFr()+"  "+l.get(i).getDate()+"  "+l.get(i).getNumdcmd()+"  "+l.get(i).getQte());
			
			}
			return l;
		}
		
		public List<Commande> getCommandeById(int idc)
		{
			List<Commande> l=session.createQuery("from Commande where numcmd="+idc+" ").list();
			return l;
		}
		
		public void updateCommande(int idc,String numdcmd)
		 {

		Transaction tf=session.beginTransaction();
		org.hibernate.Query q1=session.createQuery("update Commande set numdcmd='"+numdcmd+"' where idc='"+idc+"'");
		int rowCount = q1.executeUpdate();
		System.out.println("Rows affected: " + rowCount);
		tf.commit();

		 }
		
		
		public void closeConnection()
		{
			session.close();
		}

	

}
