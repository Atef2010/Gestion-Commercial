package vue;

import java.awt.BorderLayout;
import java.util.Scanner;
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


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Label;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Font;

import javax.swing.border.TitledBorder;

import java.awt.Color;

import com.jgoodies.forms.factories.DefaultComponentFactory;


public class ModifierFournisseur extends JFrame {

	private JPanel contentPane;
	private JTextField textcode;
	private JTextField textnom;
	private JTextField textcodepostal;
	private JTextField texttel;
	private JTextField textville;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id = null ;
					String code= null;
					String nom= null;
					String tel=null;
					String ville=null;
					String adresse=null;
					String codepostal=null;
					ModifierFournisseur frame = new ModifierFournisseur(id,code,nom,tel,ville,adresse,codepostal);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param prenom 
	 * @param nom 
	 * @param id 
	 */
	public ModifierFournisseur(final String id,final String code, final String nom,final String tel , final String ville,final String adresse ,final String codepostal) {
		this.setLocationRelativeTo(null);
		this.
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 788, 403);
		this.setTitle("Modifier Fournisseur");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setBounds(20, 46, 69, 37);
		contentPane.add(lblCode);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(20, 94, 89, 32);
		contentPane.add(lblNom);
		
		textcode = new JTextField();
		textcode.setToolTipText("Saisie le code");
		
		textcode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {

             char car = evt.getKeyChar(); 
             
             if((car<'0' || car>'9')) 
              evt.consume(); 
            
			}
				
		});
		textcode.setBounds(131, 54, 126, 28);
		contentPane.add(textcode);
		textcode.setColumns(10);
		
		textnom = new JTextField();
		textnom.setToolTipText("Saisie le nom");
		textnom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car = evt.getKeyChar(); 
	             
	             if((car<'a' || car>'z')&&(car<'A'||car>'Z')) 
	              evt.consume(); 
			}
		});
		textnom.setBounds(131, 100, 126, 28);
		contentPane.add(textnom);
		textnom.setColumns(10);
		
		textcodepostal = new JTextField();
		textcodepostal.setToolTipText("Saisie le code postal");
		textcodepostal.setBounds(131, 146, 126, 28);
		contentPane.add(textcodepostal);
		textcodepostal.setColumns(10);
		
		texttel = new JTextField();
		texttel.setToolTipText("Saisie le numero de telephone");
		texttel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {

	             char car = evt.getKeyChar(); 
	             
	             if((car<'0' || car>'9')) 
	              evt.consume(); 
	            
				}
		});
		texttel.setBounds(131, 192, 126, 28);
		contentPane.add(texttel);
		texttel.setColumns(10);
		
		final JComboBox comboBoxville = new JComboBox();
		
		
		comboBoxville.setBounds(120, 225, 126, 28);
		
		
		textcode.setText(code);
		textnom.setText(nom);
		texttel.setText(tel);
		textcodepostal.setText(codepostal);
		final JTextArea textadresse = new JTextArea();
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
               
				
				Fournisseur c = new Fournisseur();
				
				//c.setIdp(Integer.parseInt(idp.getText()));
				c.setCode(textcode.getText());
				c.setNom(textnom.getText());
				c.setCodepostal(textcodepostal.getText());
				c.setTel(texttel.getText());
				c.setVille(textville.getText());
				c.setAdresse(textadresse.getText());
				new FournisseurDAO().update(c);
				
				JOptionPane.showMessageDialog(null, "OK", "Fournisseur Modifier ",  JOptionPane.INFORMATION_MESSAGE);
				ModifierFournisseur.this.dispose();
			
				
			}
		});
		btnValider.setBounds(662, 39, 89, 23);
		contentPane.add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textcode.setText(null);
				textcodepostal.setText(null);
				textnom.setText(null);
				texttel.setText(null);
				textville.setText(null);
			}
		});
		btnAnnuler.setBounds(662, 81, 89, 23);
		contentPane.add(btnAnnuler);
		
		JLabel label = DefaultComponentFactory.getInstance().createTitle("");
		label.setIcon(new ImageIcon("C:\\Users\\real\\Desktop\\eclipce\\Gestion-Commercial\\Gestion-Commercial\\GestionCommercial\\src\\Image\\aide-numericable.png"));
		label.setBounds(363, 1, 300, 256);
		contentPane.add(label);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Fournisseur", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_3.setBounds(10, 11, 653, 350);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCodePostal = new JLabel("Code Postal");
		lblCodePostal.setBounds(10, 129, 101, 33);
		panel_3.add(lblCodePostal);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone");
		lblTlphone.setBounds(10, 184, 101, 32);
		panel_3.add(lblTlphone);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setBounds(10, 227, 69, 27);
		panel_3.add(lblVille);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(10, 268, 89, 27);
		panel_3.add(lblAdresse);
		
		textadresse.setBounds(120, 271, 258, 68);
		panel_3.add(textadresse);
		textadresse.setText(adresse);
		panel_3.add(comboBoxville);
		comboBoxville.setMaximumRowCount(3);
		comboBoxville.addItem("");   
		comboBoxville.addItem("Mahdia");
		comboBoxville.addItem("Monastir");
		comboBoxville.addItem("Tunis"); 
		comboBoxville.addItem("Nabeul");
		comboBoxville.addItem("Sousse");
		comboBoxville.addItem("Ariana");       
		comboBoxville.addItem("Béja");           
		comboBoxville.addItem("Ben Arous");            
		comboBoxville.addItem("Bizerte");
		comboBoxville.addItem("Gabès");
		comboBoxville.addItem("Gafsa");
		comboBoxville.addItem("Jendouba");           
		comboBoxville.addItem("Kairouan");            
		comboBoxville.addItem("Kasserine");
		comboBoxville.addItem("Kébili");
		comboBoxville.addItem("Le Kef");
		comboBoxville.addItem("La Manouba");            
		comboBoxville.addItem("Médenine");
		comboBoxville.addItem("Sfax");           
		comboBoxville.addItem("Sidi Bouzid");            
		comboBoxville.addItem("Siliana");
		comboBoxville.addItem("Tataouine");
		comboBoxville.addItem("Tozeur");           
		comboBoxville.addItem("Zaghouan");
		
		
		textadresse.setToolTipText("Saisie l'adresse");
		textadresse.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 212, 645, 142);
		contentPane.add(panel_2);
		
		
	}

	
}
