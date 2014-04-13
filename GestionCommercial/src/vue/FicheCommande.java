package vue;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.border.BevelBorder;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import gestioncomm.Commande;
import dao.CommandeDAO;
import dao.ProduitDAO;


public class FicheCommande extends JFrame {

	private JPanel contentPane;
	private JTextField textcode;
	private JTextField textnom;
	private JTextField textnumcmd;
	private JTextField textField_4;
	private JTextField textqte;
	private JTextField textref;
	private JTextField texttotht;
	private JTextField texttotttc;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FicheCommande frame = new FicheCommande();
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
	public FicheCommande() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 954, 415);
		this.setTitle("Commande");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCin = new JLabel("Code");
		lblCin.setBounds(10, 43, 46, 14);
		contentPane.add(lblCin);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(10, 83, 46, 14);
		contentPane.add(lblNom);
		
		textcode = new JTextField();
		textcode.setBounds(66, 40, 86, 20);
		contentPane.add(textcode);
		textcode.setColumns(10);
		
		textnom = new JTextField();
		textnom.setBounds(66, 80, 86, 20);
		contentPane.add(textnom);
		textnom.setColumns(10);
		
		JLabel lblNDeCommande = new JLabel("N\u00B0 de Commande");
		lblNDeCommande.setBounds(200, 43, 102, 14);
		contentPane.add(lblNDeCommande);
		
		textnumcmd = new JTextField();
		textnumcmd.setBounds(314, 40, 86, 20);
		contentPane.add(textnumcmd);
		textnumcmd.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(206, 83, 46, 14);
		contentPane.add(lblDate);
		
		textField_4 = new JTextField();
		textField_4.setBounds(314, 80, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblRfrence = new JLabel("R\u00E9f\u00E9rence");
		lblRfrence.setBounds(444, 43, 68, 14);
		contentPane.add(lblRfrence);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9");
		lblQuantit.setBounds(444, 83, 68, 14);
		contentPane.add(lblQuantit);
		
		textqte = new JTextField();
		textqte.setBounds(521, 80, 86, 20);
		contentPane.add(textqte);
		textqte.setColumns(10);
		
		textref = new JTextField();
		textref.setBounds(522, 40, 86, 20);
		contentPane.add(textref);
		textref.setColumns(10);
		
		JLabel lblTotalHt = new JLabel("Total HT");
		lblTotalHt.setBounds(653, 43, 67, 14);
		contentPane.add(lblTotalHt);
		
		JLabel lblTotalTtc = new JLabel("Total TTC");
		lblTotalTtc.setBounds(653, 83, 67, 14);
		contentPane.add(lblTotalTtc);
		
		texttotht = new JTextField();
		texttotht.setBounds(730, 40, 86, 20);
		contentPane.add(texttotht);
		texttotht.setColumns(10);
		
		texttotttc = new JTextField();
		texttotttc.setBounds(730, 80, 86, 20);
		contentPane.add(texttotttc);
		texttotttc.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 181, 785, 185);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Quantit\u00E9", "R\u00E9fernce", "Lib\u00E9lle", "Prix_HT", "Remise", "Total"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Commande c = new Commande();
				c.setRef(textref.getText());
				c.setLib(textnom.getText());
				c.setFournisseur(textcode.getText());
				c.setQteprod(Integer.parseInt(textqte.getText()));
			 	c.setPrixht(Integer.parseInt(texttotht.getText()));
				c.setPrixttc(Integer.parseInt(texttotttc.getText()));

				
				new CommandeDAO().save(c);
				JOptionPane.showMessageDialog(null, "Commande Ajouter", "OK", JOptionPane.OK_OPTION);
			}
		});
		btnValider.setBounds(839, 39, 89, 23);
		contentPane.add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(839, 79, 89, 23);
		contentPane.add(btnAnnuler);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(826, 184, 102, 23);
		contentPane.add(btnAjouter);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(826, 218, 102, 23);
		contentPane.add(btnSupprimer);
	}
}
