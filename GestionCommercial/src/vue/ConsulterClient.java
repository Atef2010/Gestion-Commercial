package vue;

import gestioncomm.Client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import dao.ClientDAO;
import dao.PersonTableModel;

import org.hibernate.classic.Session;
import org.hibernate.mapping.List;
import org.hibernate.sql.Update;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class ConsulterClient extends JDialog {

	PersonTableModel dm ;
	private JPanel contentPane;
	private JTable table;
	private JTextField textrechnom;
	private JTextField textrechcin;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsulterClient frame = new ConsulterClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConsulterClient() {
		setResizable(false);
		setBounds(100, 100, 804, 363);
		this.setTitle("Consulter Clients");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
     
		final PersonTableModel model = new PersonTableModel("");
		final JTable t = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(t);
		scrollPane.setBounds(10, 55, 636, 187);
		contentPane.add(scrollPane);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\pc.de-essen-icon-pack\\16x16\\plus.png"));
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FicheClient c = new FicheClient();
				c.show();
			}
		});
		btnAjouter.setBounds(670, 55, 118, 23);
		contentPane.add(btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\pc.de-essen-icon-pack\\16x16\\edit.png"));
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    
				String id=(model.getValueAt(t.getSelectedRow(),0).toString());
				String cin=(String)(model.getValueAt(t.getSelectedRow(),1));
				String nom=(String)(model.getValueAt(t.getSelectedRow(),2));
				String prenom=(String)model.getValueAt(t.getSelectedRow(),3);
				String tel=(String)model.getValueAt(t.getSelectedRow(),4);
				String ville=(String)model.getValueAt(t.getSelectedRow(),5);
				String adresse=(String)model.getValueAt(t.getSelectedRow(),6);
				String codepostal=(String)model.getValueAt(t.getSelectedRow(),7);
				
				
				
				ModifierClient mc = new ModifierClient(id,cin,nom,prenom,tel,ville,adresse,codepostal);
				mc.addWindowListener(new WindowAdapter() {
					public void windowClosed(WindowEvent e)
					{
						model.loadData("");
						model.fireTableDataChanged();
						 t.revalidate();
					}
				});
				mc.setVisible(true);
				
				}
			
			
		});
		
		
		  
		btnModifier.setBounds(670, 89, 118, 23);
		contentPane.add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\pc.de-essen-icon-pack\\16x16\\busy.png"));
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Client c = new Client();
				 
				String id=(model.getValueAt(t.getSelectedRow(),0).toString());
				String cin=(String)(model.getValueAt(t.getSelectedRow(),1));
				String nom=(String)(model.getValueAt(t.getSelectedRow(),2));
				String prenom=(String)model.getValueAt(t.getSelectedRow(),3);
				String tel=(String)model.getValueAt(t.getSelectedRow(),4);
				String ville=(String)model.getValueAt(t.getSelectedRow(),5);
				String adresse=(String)model.getValueAt(t.getSelectedRow(),6);
				String codepostal=(String)model.getValueAt(t.getSelectedRow(),7);

				c.setIdp(Integer.parseInt(id));
				c.setCin(cin);
				c.setNom(nom);
				c.setPrenom(prenom);
				c.setCodepostal(codepostal);
				c.setTel(tel);
				c.setVille(ville);
				 
				new ClientDAO().delete(c);
				
				JOptionPane.showMessageDialog(null, "Client Supprimer ", "OK", JOptionPane.INFORMATION_MESSAGE);
				model.loadData("");
				model.fireTableDataChanged();
				 t.revalidate();
			}
		
		});
		btnSupprimer.setBounds(670, 123, 118, 23);
		contentPane.add(btnSupprimer);
		
		textrechnom = new JTextField();
		textrechnom.setBounds(135, 11, 110, 20);
		contentPane.add(textrechnom);
		textrechnom.setColumns(10);
		
		JLabel lblRechecher = new JLabel("Rechecher  Par Nom :");
		lblRechecher.setBounds(10, 12, 131, 19);
		contentPane.add(lblRechecher);
		
		JButton btnrechnom = new JButton("");
		btnrechnom.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String nom = textrechnom.getText();
				
				 PersonTableModel nvmodel = new PersonTableModel(nom);
				  t.setModel(nvmodel);
				 
			}
		});
		btnrechnom.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\pc.de-essen-icon-pack\\16x16\\search.png"));
		btnrechnom.setBounds(261, 8, 40, 23);
		contentPane.add(btnrechnom);
		
		JLabel lblNewLabel = new JLabel("Rechecher  Par Cin :");
		lblNewLabel.setBounds(311, 10, 121, 23);
		contentPane.add(lblNewLabel);
		
		textrechcin = new JTextField();
		textrechcin.setColumns(10);
		textrechcin.setBounds(432, 11, 110, 20);
		contentPane.add(textrechcin);
		
		JButton btnrechcin = new JButton("");
		btnrechcin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cin = textrechcin.getText();
				PersonTableModel nmodel = new PersonTableModel(cin);
				  t.setModel(nmodel);
				
			}
		});
		btnrechcin.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\pc.de-essen-icon-pack\\16x16\\search.png"));
		btnrechcin.setBounds(553, 8, 40, 23);
		contentPane.add(btnrechcin);
		
		
		}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
