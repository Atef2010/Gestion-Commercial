package vue;

import gestioncomm.Fournisseur;

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

import dao.FournisseurDAO;
import dao.PersonTableModel2;

import org.hibernate.classic.Session;
import org.hibernate.mapping.List;
import org.hibernate.sql.Update;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class ConsulterFournisseur extends JFrame {

	//PersonTableModel2 dm ;
	private JPanel contentPane;
	private JTextField textrechnom;
	private JTextField textrechcin;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsulterFournisseur frame = new ConsulterFournisseur();
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
	public ConsulterFournisseur() {
		//setResizable(false);
		
		setBounds(100, 100, 804, 363);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
     
		final PersonTableModel2 model = new PersonTableModel2("");
		final JTable t = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(t);
		scrollPane.setBounds(10, 55, 636, 187);
		contentPane.add(scrollPane);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\pc.de-essen-icon-pack\\16x16\\plus.png"));
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FicheFournisseur f = new FicheFournisseur();
				f.show();
			}
		});
		btnAjouter.setBounds(670, 55, 118, 23);
		contentPane.add(btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\pc.de-essen-icon-pack\\16x16\\edit.png"));
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    
				String id=(model.getValueAt(t.getSelectedRow(),0).toString());
				String code=(String)(model.getValueAt(t.getSelectedRow(),1));
				String nom=(String)(model.getValueAt(t.getSelectedRow(),2));
				String prenom=(String)model.getValueAt(t.getSelectedRow(),3);
				String tel=(String)model.getValueAt(t.getSelectedRow(),4);
				String ville=(String)model.getValueAt(t.getSelectedRow(),5);
				String adresse=(String)model.getValueAt(t.getSelectedRow(),6);
				String codepostal=(String)model.getValueAt(t.getSelectedRow(),7);
				
				//ConsulterClient.this.validate();
				
				new ModifierFournisseur(id,code,nom,prenom,tel,ville,adresse,codepostal).show();
				
				
				}
		});
		//contentPane.revalidate();
		//t.revalidate();
		//t.setFillsViewportHeight(true);
		btnModifier.setBounds(670, 89, 118, 23);
		contentPane.add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\pc.de-essen-icon-pack\\16x16\\busy.png"));
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fournisseur c = new Fournisseur();
				 
				String id=(model.getValueAt(t.getSelectedRow(),0).toString());
				String code=(String)(model.getValueAt(t.getSelectedRow(),1));
				String nom=(String)(model.getValueAt(t.getSelectedRow(),2));
				String prenom=(String)model.getValueAt(t.getSelectedRow(),3);
				String tel=(String)model.getValueAt(t.getSelectedRow(),4);
				String ville=(String)model.getValueAt(t.getSelectedRow(),5);
				String adresse=(String)model.getValueAt(t.getSelectedRow(),6);
				String codepostal=(String)model.getValueAt(t.getSelectedRow(),5);

				c.setIdp(Integer.parseInt(id));
				c.setCode(code);
				c.setNom(nom);
				c.setPrenom(prenom);
				c.setCodepostal(codepostal);
				c.setTel(tel);
				c.setVille(ville);
				 
				new FournisseurDAO().delete(c);
				
				JOptionPane.showMessageDialog(null, "OK" ,"Fournisseur Supprimer ",  JOptionPane.INFORMATION_MESSAGE);
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
				
				 PersonTableModel2 nvmodel = new PersonTableModel2(nom);
				  t.setModel(nvmodel);
			}
		});
		btnrechnom.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\pc.de-essen-icon-pack\\16x16\\search.png"));
		btnrechnom.setBounds(261, 8, 40, 23);
		contentPane.add(btnrechnom);
		
		JLabel lblNewLabel = new JLabel("Rechecher  Par Code :");
		lblNewLabel.setBounds(311, 10, 121, 23);
		contentPane.add(lblNewLabel);
		
		textrechcin = new JTextField();
		textrechcin.setColumns(10);
		textrechcin.setBounds(432, 11, 110, 20);
		contentPane.add(textrechcin);
		
		JButton btnrechcin = new JButton("");
		btnrechcin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code = textrechcin.getText();
				PersonTableModel2 nmodel = new PersonTableModel2(code);
				  t.setModel(nmodel);
			}
		});
		btnrechcin.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\pc.de-essen-icon-pack\\16x16\\search.png"));
		btnrechcin.setBounds(553, 8, 40, 23);
		contentPane.add(btnrechcin);
		
		
		
	}
}
