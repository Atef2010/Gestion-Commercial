package vue;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.FlowLayout;

import javax.swing.SwingConstants;

import java.awt.CardLayout;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import dao.ProduitDAO;
import gestioncomm.Produit;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;


public class FicheProduit extends JFrame {

	private JPanel contentPane;
	private JTextField textref;
	private JTextField textlib;
	private JTextField textfournisseur;
	private JTextField textqteprod;
	private JTextField textetat;
	private JTextField textprixht;
	private JTextField textprixttc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FicheProduit frame = new FicheProduit();
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
	public FicheProduit() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 362);
		this.setTitle("Fiche Produit");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_5206855803794");
		panel.setLayout(null);
		
		JLabel lblRfrence = new JLabel("R\u00E9f\u00E9rence ");
		lblRfrence.setBounds(10, 51, 68, 14);
		panel.add(lblRfrence);
		
		JLabel lblFournisseur = new JLabel("Fournisseur");
		lblFournisseur.setBounds(274, 51, 68, 14);
		panel.add(lblFournisseur);
		
		textref = new JTextField();
		textref.setBounds(88, 48, 112, 20);
		panel.add(textref);
		textref.setColumns(10);
		
		textlib = new JTextField();
		textlib.setBounds(88, 88, 112, 20);
		panel.add(textlib);
		textlib.setColumns(10);
		
		JLabel lblLibell = new JLabel("Libell\u00E9");
		lblLibell.setBounds(10, 94, 46, 14);
		panel.add(lblLibell);
		
		JLabel lblQuantitDeProduit = new JLabel("Quantit\u00E9 de Produit");
		lblQuantitDeProduit.setBounds(274, 94, 112, 14);
		panel.add(lblQuantitDeProduit);
		
		textfournisseur = new JTextField();
		textfournisseur.setBounds(390, 48, 112, 20);
		panel.add(textfournisseur);
		textfournisseur.setColumns(10);
		
		textqteprod = new JTextField();
		textqteprod.setBounds(390, 88, 112, 20);
		panel.add(textqteprod);
		textqteprod.setColumns(10);
		
		JLabel lblMarque = new JLabel("PC");
		lblMarque.setBounds(10, 175, 46, 14);
		panel.add(lblMarque);
		
		JLabel lblType = new JLabel("SmartPhone");
		lblType.setBounds(10, 221, 79, 14);
		panel.add(lblType);
		
		JLabel lblFamille = new JLabel("Laptop");
		lblFamille.setBounds(10, 268, 46, 14);
		panel.add(lblFamille);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(88, 172, 112, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(88, 218, 112, 20);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(88, 265, 112, 20);
		panel.add(comboBox_2);
		
		JLabel lblTva = new JLabel("Etat");
		lblTva.setBounds(274, 175, 46, 14);
		panel.add(lblTva);
		
		JLabel lblPrixht = new JLabel("PrixHT");
		lblPrixht.setBounds(274, 221, 46, 14);
		panel.add(lblPrixht);
		
		JLabel lblPrixttc = new JLabel("PrixTTC");
		lblPrixttc.setBounds(274, 268, 46, 14);
		panel.add(lblPrixttc);
		
		textetat = new JTextField();
		textetat.setBounds(390, 172, 112, 20);
		panel.add(textetat);
		textetat.setColumns(10);
		
		textprixht = new JTextField();
		textprixht.setBounds(390, 218, 112, 20);
		panel.add(textprixht);
		textprixht.setColumns(10);
		
		textprixttc = new JTextField();
		textprixttc.setBounds(390, 265, 112, 20);
		panel.add(textprixttc);
		textprixttc.setColumns(10);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Produit p = new  Produit();
				p.setRef(textref.getText());
				p.setEtat(textprixht.getText());
				p.setLib(textlib.getText());
				p.setFournisseur(textfournisseur.getText());
				p.setQteprod(Integer.parseInt(textqteprod.getText()));
				p.setEtat(textetat.getText());
				p.setPrix_ht(Integer.parseInt(textprixht.getText()));
				p.setPrix_ttc(Integer.parseInt(textprixttc.getText()));
				
				new ProduitDAO().save(p);
				JOptionPane.showMessageDialog(null, "Produit Ajouter", "OK", JOptionPane.OK_OPTION);
			}
		});
		btnValider.setBounds(547, 47, 89, 23);
		panel.add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(547, 94, 89, 23);
		panel.add(btnAnnuler);
	}
}
