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
	private JTextField textprenom;
	private JTextField textcodepostal;
	private JTextField texttel;
	private JTextField textville;
	private JTextField idp;
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
					String prenom= null;
					String tel=null;
					String ville=null;
					String adresse=null;
					String codepostal=null;
					ModifierFournisseur frame = new ModifierFournisseur(id,code,nom,prenom,tel,ville,adresse,codepostal);
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
	public ModifierFournisseur(final String id,final String code, final String nom, final String prenom ,final String tel , final String ville,final String adresse ,final String codepostal) {
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
		lblCode.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\thumbtack-red.png"));
		lblCode.setBounds(20, 46, 69, 37);
		contentPane.add(lblCode);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\thumbtack-yellow.png"));
		lblNom.setBounds(20, 94, 89, 32);
		contentPane.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\thumbtack-green.png"));
		lblPrenom.setBounds(20, 137, 89, 29);
		contentPane.add(lblPrenom);
		
		JLabel lblCodePostal = new JLabel("Code Postal");
		lblCodePostal.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\flag-blue.png"));
		lblCodePostal.setBounds(20, 222, 101, 33);
		contentPane.add(lblCodePostal);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone");
		lblTlphone.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\iphone.png"));
		lblTlphone.setBounds(20, 271, 101, 32);
		contentPane.add(lblTlphone);
		
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
		textcode.setBounds(131, 54, 126, 20);
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
		textnom.setBounds(131, 100, 126, 20);
		contentPane.add(textnom);
		textnom.setColumns(10);
		
		textprenom = new JTextField();
		textprenom.setToolTipText("Saisie le prenom");
		textprenom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car = evt.getKeyChar(); 
	             
	             if((car<'a' || car>'z')&&(car<'A'||car>'Z')) 
	              evt.consume(); 
			}
		});
		textprenom.setBounds(131, 141, 126, 20);
		contentPane.add(textprenom);
		textprenom.setColumns(10);
		
		textcodepostal = new JTextField();
		textcodepostal.setToolTipText("Saisie le code postal");
		textcodepostal.setBounds(131, 228, 126, 20);
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
		texttel.setBounds(131, 277, 126, 20);
		contentPane.add(texttel);
		texttel.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\32x32\\address.png"));
		lblAdresse.setBounds(295, 274, 89, 27);
		contentPane.add(lblAdresse);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\pc.de-essen-icon-pack\\32x32\\home.png"));
		lblVille.setBounds(20, 314, 69, 27);
		contentPane.add(lblVille);
		
		textville = new JTextField();
		textville.setToolTipText("Saisie le ville");
		textville.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car = evt.getKeyChar(); 
	             
	             if((car<'a' || car>'z')&&(car<'A'||car>'Z')) 
	              evt.consume(); 
			}
		});
		final JTextArea textadresse = new JTextArea();
		textville.setBounds(131, 317, 126, 20);
		contentPane.add(textville);
		textville.setColumns(10);
		textcode.setText(code);
		textnom.setText(nom);
		textprenom.setText(prenom);
		texttel.setText(tel);
		textville.setText(ville);
		textcodepostal.setText(codepostal);
		textadresse.setText(adresse);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
               
				
				Fournisseur c = new Fournisseur();
				
				c.setIdp(Integer.parseInt(idp.getText()));
				c.setCode(textcode.getText());
				c.setNom(textnom.getText());
				c.setPrenom(textprenom.getText());
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
				textprenom.setText(null);
				texttel.setText(null);
				textville.setText(null);
			}
		});
		btnAnnuler.setBounds(662, 81, 89, 23);
		contentPane.add(btnAnnuler);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Saisir", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_1.setBounds(10, 1, 269, 190);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Saisie le CIN");
		panel.setBounds(10, 27, 249, 149);
		panel_1.add(panel);
		
		JLabel label = DefaultComponentFactory.getInstance().createTitle("");
		label.setIcon(new ImageIcon("C:\\Users\\real\\Desktop\\eclipce\\Gestion-Commercial\\Gestion-Commercial\\GestionCommercial\\src\\Image\\aide-numericable.png"));
		label.setBounds(363, 1, 300, 256);
		contentPane.add(label);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");
		lblNewJgoodiesTitle.setBounds(77, 11, 88, 14);
		contentPane.add(lblNewJgoodiesTitle);
		
		
		textadresse.setToolTipText("Saisie l'adresse");
		textadresse.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		textadresse.setBounds(394, 276, 258, 68);
		contentPane.add(textadresse);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Adresse", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_3.setBounds(10, 196, 653, 165);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 212, 645, 142);
		contentPane.add(panel_2);
		idp = new JTextField();
		idp.setBounds(279, 22, 86, 20);
		contentPane.add(idp);
		idp.setEnabled(false);
		idp.setColumns(10);
		//recuperation
		idp.setText(id);
		
		
	}

	
}
