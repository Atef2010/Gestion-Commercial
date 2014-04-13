package vue;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.hibernate.hql.ast.tree.Statement;


public class DAO_ModelTable extends AbstractTableModel
{
	private String[] columnName;
	private List <Object[]> rowValue;
	private int columnCount;
	private ResultSetMetaData rsmd;
	private Class[] columnClass;
	
public DAO_ModelTable(ResultSet rs)
{
 try 
    {
	rsmd=rs.getMetaData();
	columnCount=rsmd.getColumnCount();
	columnName=new String[columnCount];
	columnClass=new Class[columnCount];
	
for(int i=0;i<columnCount;i++)
	{
		columnName[i]=rsmd.getColumnName(i+1);
		columnClass[i]=Class.forName(rsmd.getColumnClassName(i+1));
	}
	rowValue=new ArrayList <Object[]>();
	while(rs.next())
	{
	  Object[] row =new Object[columnCount];
	  for(int i=0;i<columnCount;i++)
		{
			
		row[i]=rs.getObject(i+1);
					
		}
		rowValue.add(row);
		}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	public String getColumnName(int i)
	{
		return columnName[i];
	}

	public int getColumnCount() 
	{
		return columnCount;
	}

	public int getRowCount() 
	{
		return rowValue.size();
	}

	public Object getValueAt(int arg0, int arg1) 
	{
		System.out.println(((Object[]) rowValue.get(arg0))[arg1]);
		return ((Object[]) rowValue.get(arg0))[arg1];
		
		
	}

	public boolean isCellEditable(int arg0, int arg1)
	{
		return true;
	}

	public void setValueAt(Object ob, int arg0, int arg1)
	{
		((Object[]) rowValue.get(arg0))[arg1]=ob;
		fireTableCellUpdated(arg0, arg1);
	}
	
	
	public void addRow(Object[] row)
	{
		rowValue.add(row);
		fireTableRowsInserted(getRowCount(), getRowCount());
	}
	
	public void removeRow(int arg)
	{
		rowValue.remove(arg);
		fireTableRowsDeleted(arg, arg);
		fireTableDataChanged();
	
}
}