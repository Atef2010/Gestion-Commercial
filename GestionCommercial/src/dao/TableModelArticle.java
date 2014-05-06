package dao;

import org.hibernate.*;
import org.hibernate.cfg.*;
import gestioncomm.Produit;

import java.util.*;

import javax.swing.table.AbstractTableModel; 

public class TableModelArticle extends AbstractTableModel
{
    private static final long serialVersionUID = 6105842825518764825L;
    private ArrayList<Produit> Listproduit;

    public TableModelArticle(String filtre)
    {
        super();
        loadData(filtre);
    }
    
        public void loadData(String filtre)
        {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        Query q=session.createQuery("from Produit where ref || lib LIKE '%"+filtre+"%'");
        Listproduit=new ArrayList<Produit>(q.list());
        session.close();
        sf.close();
       
    }
    public int getRowCount()
    {
    	
        return Listproduit.size();
    }

    public int getColumnCount()
    {
        return 7;
    }

    public Object getValueAt(int rowIndex, int columnIndex)
    {
    	Produit p=Listproduit.get(rowIndex);
        Object[] values=new Object[]{p.getIdp(),p.getRef(),p.getLib(),p.getPrix_ht(),p.getPrixttc(),
                p.getQteprod(),p.getEtat()};
        System.out.println(values[columnIndex]);
        return values[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        String[] columnNames=new String[]{"id","Référence","Libelle","Prix HT","Prix TTC","Qantite","Etat"};
        return columnNames[column];
    }
}