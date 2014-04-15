package dao;
import org.hibernate.*;
import org.hibernate.cfg.*;

import gestioncomm.Client;

import java.util.*;

import javax.swing.table.AbstractTableModel;
public class ClientTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 6105842825518764825L;
    private ArrayList<Client> ClientList;

    public ClientTableModel()
    {
        super();
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();

        Query q=session.createQuery("from Client");
        ClientList = new ArrayList<Client>(q.list());

        session.close();
        sf.close();
    }

    public int getRowCount()
    {
        return ClientList.size();
    }

    public int getColumnCount()
    {
        return 6;
    }

    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Client p=ClientList.get(rowIndex);
        Object[] values=new Object[]{p.getCin(),p.getNom(),p.getPrenom(),
                p.getTel(),p.getVille(),p.getAdresse()};
        return values[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        String[] columnNames=new String[]{"cin","Nom","Prenom","Tel","Ville","Adresse"};
        return columnNames[column];
    }

}
