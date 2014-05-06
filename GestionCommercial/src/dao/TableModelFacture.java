package dao;

import javax.swing.table.AbstractTableModel;

import org.hibernate.*;
import org.hibernate.cfg.*;

import gestioncomm.Facture;
import gestioncomm.Produit;

import java.util.*;

import javax.swing.table.AbstractTableModel; 

public class TableModelFacture extends AbstractTableModel {
	 private static final long serialVersionUID = 6105842825518764825L;
	    private ArrayList<Facture> Listfacture;

	    public TableModelFacture(String filtre)
	    {
	        super();
	        loadData(filtre);
	    }
	    
	        public void loadData(String filtre)
	        {
	        SessionFactory sf=new Configuration().configure().buildSessionFactory();
	        Session session=sf.openSession();
	        Query q=session.createQuery("from Facture where type LIKE '%"+filtre+"%'");
	        Listfacture=new ArrayList<Facture>(q.list());
	        session.close();
	        sf.close();
	       
	    }
	    public int getRowCount()
	    {
	    	
	        return Listfacture.size();
	    }

	    public int getColumnCount()
	    {
	        return 6;
	    }

	    public Object getValueAt(int rowIndex, int columnIndex)
	    {
	    	Facture p=Listfacture.get(rowIndex);
	        Object[] values=new Object[]{p.getId(),p.getNumfact(),p.getNumpaiment(),p.getMnttot(),p.getType(),
	                p.getDate()};
	        System.out.println(values[columnIndex]);
	        return values[columnIndex];
	    }

	    @Override
	    public String getColumnName(int column)
	    {
	        String[] columnNames=new String[]{"id","N Facture","N Paiement","Montant","Type de Paiemnt","Date"};
	        return columnNames[column];
	    }
	}