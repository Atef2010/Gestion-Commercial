package vue;
import java.awt.BorderLayout;
import java.awt.TextArea;
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

import gestioncomm.Client;
import dao.ClientDAO;
import dao.ProduitDAO;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Label;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Font;

import javax.swing.border.TitledBorder;

import java.awt.Color;

public class FicheClient extends JFrame {


	private JPanel contentPane;
	private JTextField textcin;
	private JTextField textnom;
	private JTextField textprenom;
	private JTextField textcodepostal;
	private JTextField texttel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FicheClient frame = new FicheClient();
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
	public FicheClient() {
		setResizable(false);
		this.setTitle("FicheClient");
		setBounds(100, 100, 788, 403);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCode = new JLabel("CIN");
		lblCode.setIcon(null);
		lblCode.setBounds(20, 46, 69, 37);
		contentPane.add(lblCode);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setIcon(null);
		lblNom.setBounds(20, 94, 89, 32);
		contentPane.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setIcon(null);
		lblPrenom.setBounds(20, 137, 89, 29);
		contentPane.add(lblPrenom);
		
		final JComboBox comboBoxville = new JComboBox();
		comboBoxville.setBounds(120, 298, 125, 28);
		final JTextArea textadresse = new JTextArea();
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(295, 274, 89, 27);
		contentPane.add(lblAdresse);
		
		JButton btnValider = new JButton("Ajouter");
		btnValider.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\16x16\\plus.png"));
		btnValider.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String cin=textcin.getText();
				String nom=textnom.getText();
				String prenom = textprenom.getText();
				String codepostal=textcodepostal.getText();
				String adr = textadresse.getText();
				String ville = comboBoxville.getSelectedItem().toString();
				String msg="";
				Client c = new Client();
				 if(textcin.getText().length()!=8)
			      {
					 msg+="CIN Non Valide  \n"; 
			      }
				 if(cin.compareTo("")==0)
			      {
			       msg+="Vous devez tapper votre CIN \n";
			      }
			      if(nom.compareTo("")==0 ) 
			      {
			       msg+="Vous devez tapper votre nom \n";
			      }
			      if(prenom.compareTo("")==0)
			      {
			       msg+="Vous devez tapper votre prenom \n";
			      }
			      if(codepostal.compareTo("")==0)
			      {
			       msg+="Vous devez tapper votre Code Postal \n";
			      }
			      if(ville.compareTo("")==0)
			      {
			       msg+="Vous devez tapper votre Ville \n";
			      }
			      if(msg.compareTo("")==0)
			      {
			       System.out.println(msg);
			      }
			      else
			      {
					JOptionPane.showMessageDialog(null,msg,"Erreur",JOptionPane.WARNING_MESSAGE);
			      }
			     
			  
			      if (msg=="")
			      {
				c.setCin(textcin.getText());
				c.setNom(textnom.getText());
				c.setPrenom(textprenom.getText());
				c.setCodepostal(textcodepostal.getText());
				c.setTel(texttel.getText());
				c.setAdresse(textadresse.getText());
			
				new ClientDAO().save(c);
			     
			      JOptionPane.showMessageDialog(null,  "Client Ajouter", "OK ", JOptionPane.INFORMATION_MESSAGE);
				
			      System.exit(0);
			      }   
			}
			
		});
		btnValider.setBounds(662, 39, 101, 23);
		contentPane.add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\16x16\\busy.png"));
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textcin.setText(null);
				textcodepostal.setText(null);
				textnom.setText(null);
				textprenom.setText(null);
				texttel.setText(null);
				comboBoxville.setSelectedItem(null);
				
			}
		});
		btnAnnuler.setBounds(662, 81, 101, 23);
		contentPane.add(btnAnnuler);
		
		JLabel label = DefaultComponentFactory.getInstance().createTitle("");
		label.setIcon(new ImageIcon("C:\\Users\\real\\Desktop\\eclipce\\Gestion-Commercial\\Gestion-Commercial\\GestionCommercial\\src\\Image\\aide-numericable.png"));
		label.setBounds(363, 1, 300, 256);
		contentPane.add(label);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Client", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_3.setBounds(10, 0, 653, 360);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCodePostal = new JLabel("Code Postal");
		lblCodePostal.setBounds(10, 183, 112, 33);
		panel_3.add(lblCodePostal);
		
		textcodepostal = new JTextField();
		textcodepostal.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		textcodepostal.setBounds(120, 185, 126, 28);
		panel_3.add(textcodepostal);
		textcodepostal.setToolTipText("Saisie le code postal");
		textcodepostal.setColumns(10);
		
		texttel = new JTextField();
		texttel.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		texttel.setBounds(120, 240, 126, 28);
		panel_3.add(texttel);
		texttel.setToolTipText("Saisie le numero de telephone");
		texttel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {

	             char car = evt.getKeyChar(); 
	             
	             if((car<'0' || car>'9')) 
	              evt.consume(); 
	            
				}
		});
		texttel.setColumns(10);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone");
		lblTlphone.setBounds(10, 241, 101, 32);
		panel_3.add(lblTlphone);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setBounds(10, 295, 69, 27);
		panel_3.add(lblVille);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(346, 268, 266, 68);
		panel_3.add(scrollPane);
		
		
		scrollPane.setViewportView(textadresse);
		textadresse.setToolTipText("Saisie l'adresse");
		textadresse.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		
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
		
		textcin = new JTextField();
		textcin.setBounds(120, 43, 126, 28);
		panel_3.add(textcin);
		textcin.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		textcin.setToolTipText("Saisie le cin");
		textcin.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {

             char car = evt.getKeyChar(); 
             
             if((car<'0' || car>'9')) 
              evt.consume(); 
            
			}
				
		});
		textcin.setColumns(10);
		
		textnom = new JTextField();
		textnom.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		textnom.setBounds(120, 90, 126, 28);
		panel_3.add(textnom);
		textnom.setToolTipText("Saisie le nom");
		textnom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car = evt.getKeyChar(); 
	             
	             if((car<'a' || car>'z')&&(car<'A'||car>'Z')&&(car>' ')) 
	              evt.consume(); 
			}
		});
		textnom.setColumns(10);
		
		textprenom = new JTextField();
		textprenom.setFont(new Font("Tahoma", Font.ITALIC, 15));
		textprenom.setBounds(120, 134, 126, 28);
		panel_3.add(textprenom);
		textprenom.setToolTipText("Saisie le prenom");
		textprenom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car = evt.getKeyChar(); 
	             
	             if((car<'a' || car>'z')&&(car<'A'||car>'Z')&&(car>' ')) 
	              evt.consume(); 
			}
		});
		textprenom.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 212, 645, 142);
		contentPane.add(panel_2);
	}
}
