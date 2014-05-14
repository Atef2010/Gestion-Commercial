package dao;

import org.hibernate.*;
import org.hibernate.cfg.*;
import gestioncomm.Client;
import java.util.*;
import javax.swing.table.AbstractTableModel; 


public class PersonTableModel extends AbstractTableModel
{
    private static final long serialVersionUID = 6105842825518764825L;
    private ArrayList<Client> ClientList;

    public PersonTableModel(String filtre)
    {
        super();
        loadData(filtre);
    }
    
    public void loadData(String filtre)
    {
    	SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        Query q=session.createQuery("from Client where nom || cin  LIKE '%"+filtre+"%'");
        ClientList=new ArrayList<Client>(q.list());
        session.close();
        sf.close();
    }
    public int getRowCount()
    {
        return ClientList.size();
    }

    public int getColumnCount()
    {
        return 8;
    }

    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Client p=ClientList.get(rowIndex);
        Object[] values=new Object[]{p.getIdp(),p.getCin(),p.getNom(),p.getPrenom(),
                p.getTel(),p.getVille(),p.getAdresse(),p.getCodepostal()};
        System.out.println(values[columnIndex]);
        return values[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        String[] columnNames=new String[]{"id","CIN","nom","Prenom","tel","Ville","Adresse","Code Postal"};
        return columnNames[column];
    }
}