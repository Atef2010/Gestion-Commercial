
package dao;

import org.hibernate.*;
import org.hibernate.cfg.*;
import gestioncomm.Commande;

import java.util.*;

import javax.swing.table.AbstractTableModel; 

public class TableModelCommande extends AbstractTableModel
{
    private static final long serialVersionUID = 6105842825518764825L;
    private ArrayList<Commande> CommandeList;

    public TableModelCommande(String filtre)
    {
        super();
        loadData(filtre);
    }
    
        public void loadData(String filtre)
        {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        Query q=session.createQuery("from Commande where fr LIKE '%"+filtre+"%'");
        CommandeList=new ArrayList<Commande>(q.list());
        session.close();
        sf.close();
       
    }
    public int getRowCount()
    {
    	
        return CommandeList.size();
    }

    public int getColumnCount()
    {
        return 7;
    }

    public Object getValueAt(int rowIndex, int columnIndex)
    {
    	Commande p=CommandeList.get(rowIndex);
        Object[] values=new Object[]{p.getIdc(),p.getIdc(),p.getNumdcmd(),p.getFr(),p.getRef(),
                p.getDate(),p.getQte()};
        System.out.println(values[columnIndex]);
        return values[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        String[] columnNames=new String[]{"id","idf","Nummd","Fournisseur","Référence","Date","Qantite"};
        return columnNames[column];
    }
}