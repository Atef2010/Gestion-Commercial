
       package dao;

       import org.hibernate.*;
       import org.hibernate.cfg.*;
       import gestioncomm.Fournisseur;

       import java.util.*;

       import javax.swing.table.AbstractTableModel; 


       public class PersonTableModel2 extends AbstractTableModel
       {
           private static final long serialVersionUID = 6105842825518764825L;
           private ArrayList<Fournisseur> FournisseurList;

           public PersonTableModel2(String filtre)
           {
               super();
               SessionFactory sf=new Configuration().configure().buildSessionFactory();
               Session session=sf.openSession();

               Query q=session.createQuery("from Fournisseur where nom || code  LIKE '%"+filtre+"%'");
              FournisseurList=new ArrayList<Fournisseur>(q.list());
               
               session.close();
               sf.close();
           }

           public int getRowCount()
           {
           	
               return FournisseurList.size();
           }

           public int getColumnCount()
           {
               return 8;
           }

           public Object getValueAt(int rowIndex, int columnIndex)
           {
           	Fournisseur p=FournisseurList.get(rowIndex);
               Object[] values=new Object[]{p.getIdp(),p.getCode(),p.getNom(),p.getPrenom(),
                       p.getTel(),p.getVille(),p.getAdresse(),p.getCodepostal()};
               System.out.println(values[columnIndex]);
               return values[columnIndex];
           }

           @Override
           public String getColumnName(int column)
           {
               String[] columnNames=new String[]{"id","Code","nom","Prenom","tel","Ville","Adresse","Code Postal"};
               return columnNames[column];
           }
       }