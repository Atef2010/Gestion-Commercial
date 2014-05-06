package vue;

import gestioncomm.Fournisseur;

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

public class CommandeFournisseurC extends JFrame {

	
	private JPanel contentPane;
	private JTextField textrechnom;
	private JTextField textrechcin;
	
	private String code;
	private String nom;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CommandeFournisseurC frame = new CommandeFournisseurC(null);
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
	public CommandeFournisseurC(final FicheCommande parent) {
		setResizable(false);
	
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
				parent.textcode.setText((model.getValueAt(t.getSelectedRow(),1).toString()));
				parent.textnom.setText((String)(model.getValueAt(t.getSelectedRow(),2)));
				CommandeFournisseurC.this.setVisible(false);
			
				
				
			}
		});
		btnAjouter.setBounds(670, 55, 118, 23);
		contentPane.add(btnAjouter);
		
		textrechnom = new JTextField();
		textrechnom.setBounds(135, 11, 110, 20);
		contentPane.add(textrechnom);
		textrechnom.setColumns(10);
		
		JLabel lblRechecher = new JLabel("Rechecher  Par Nom :");
		lblRechecher.setBounds(10, 12, 131, 19);
		contentPane.add(lblRechecher);
		
		JButton btnrechnom = new JButton("");
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
