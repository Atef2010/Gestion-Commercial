package vue;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

import gestioncomm.Fournisseur;
import dao.FournisseurDAO;
import com.jgoodies.forms.factories.DefaultComponentFactory;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FicheFournisseur extends JFrame {
	private JTextField textcode;
	private JTextField textnom;
	private JTextField textprenom;
	private JTextField textcodepostal;
	private JTextField texttel;
	private JTextField textadresse;
	private JTextField textville;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FicheFournisseur  frame = new FicheFournisseur ();
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
	public FicheFournisseur () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 415);
		this.setTitle("Fournisseur");
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setBounds(10, 43, 46, 14);
		contentPane.add(lblCode);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(10, 85, 46, 14);
		contentPane.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(10, 138, 46, 14);
		contentPane.add(lblPrenom);
		
		JLabel lblCodePostal = new JLabel("Code Postal");
		lblCodePostal.setBounds(10, 217, 69, 14);
		contentPane.add(lblCodePostal);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone");
		lblTlphone.setBounds(10, 270, 69, 14);
		contentPane.add(lblTlphone);
		
		textcode = new JTextField();
		textcode.setBounds(103, 40, 112, 20);
		contentPane.add(textcode);
		textcode.setColumns(10);
		
		textnom = new JTextField();
		textnom.setBounds(103, 82, 112, 20);
		contentPane.add(textnom);
		textnom.setColumns(10);
		
		textprenom = new JTextField();
		textprenom.setBounds(103, 135, 112, 20);
		contentPane.add(textprenom);
		textprenom.setColumns(10);
		
		textcodepostal = new JTextField();
		textcodepostal.setBounds(103, 214, 112, 20);
		contentPane.add(textcodepostal);
		textcodepostal.setColumns(10);
		
		texttel = new JTextField();
		texttel.setBounds(103, 267, 112, 20);
		contentPane.add(texttel);
		texttel.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(301, 217, 58, 14);
		contentPane.add(lblAdresse);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setBounds(301, 270, 46, 14);
		contentPane.add(lblVille);
		
		textadresse = new JTextField();
		textadresse.setBounds(394, 214, 112, 20);
		contentPane.add(textadresse);
		textadresse.setColumns(10);
		
		textville = new JTextField();
		textville.setBounds(394, 267, 112, 20);
		contentPane.add(textville);
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fournisseur c = new Fournisseur();
				c.setCode(textcode.getText());
				c.setNom(textnom.getText());
				c.setPrenom(textprenom.getText());
				c.setCodepostal(textcodepostal.getText());
				c.setTel(texttel.getText());
				c.setVille(textville.getText());
				new FournisseurDAO().save(c);
				JOptionPane.showMessageDialog(null, "Client Ajouter ", "OK", JOptionPane.OK_OPTION);
			}
		});
		btnValider.setBounds(543, 39, 89, 23);
		contentPane.add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(543, 81, 89, 23);
		contentPane.add(btnAnnuler);
	}
}
