package vue;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.*;

import gestioncomm.Client;
import gestioncomm.Fournisseur;
import dao.ClientDAO;
import dao.FournisseurDAO;

import com.jgoodies.forms.factories.DefaultComponentFactory;




import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FicheFournisseur extends JFrame {
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
		setBounds(100, 100, 788, 403);
		this.setTitle("Fournisseur");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		this.setLocationRelativeTo(null);
		final JTextArea textadresse = new JTextArea();
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String code=textcode.getText();
				String nom=textnom.getText();
				String tel = texttel.getText();
				String codepostal=textcodepostal.getText();
				String ville = textville.getText();
				String adr = textadresse.getText();
				
				String msg="";
				Fournisseur c = new Fournisseur();
				
				if(code.compareTo("")==0 ) 
			      {
			       msg+="Vous devez tapper votre code \n";
			      }
			      if(nom.compareTo("")==0 ) 
			      {
			       msg+="Vous devez tapper votre nom \n";
			      }
			     
			      if(codepostal.compareTo("")==0)
			      {
			       msg+="Vous devez tapper votre Code Postal \n";
			      }
			      if(ville.compareTo("")==0)
			      {
			       msg+="Vous devez tapper votre Ville \n";
			      }
			     if(adr.compareTo("")==0 ) 
			      {
			       msg+="Vous devez tapper votre adresse \n";
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
				
				
				c.setCode(textcode.getText());
				c.setNom(textnom.getText());

				c.setCodepostal(textcodepostal.getText());
				c.setTel(texttel.getText());
				c.setVille(textville.getText());
				c.setAdresse(textadresse.getText());
				
				new FournisseurDAO().save(c);
				JOptionPane.showMessageDialog(null, "OK", "Fournisseur Ajouter ",  JOptionPane.INFORMATION_MESSAGE);
				 System.exit(0);
			   }
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
				textadresse.setText(null);
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
		panel_3.setBounds(9, 1, 653, 360);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCodePostal = new JLabel("Code Postal");
		lblCodePostal.setBounds(10, 127, 101, 33);
		panel_3.add(lblCodePostal);
		
		textcodepostal = new JTextField();
		textcodepostal.setBounds(123, 129, 126, 28);
		panel_3.add(textcodepostal);
		textcodepostal.setToolTipText("Saisie le code postal");
		textcodepostal.setColumns(10);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone");
		lblTlphone.setBounds(10, 173, 101, 32);
		panel_3.add(lblTlphone);
		
		texttel = new JTextField();
		texttel.setBounds(123, 175, 126, 28);
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
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setBounds(10, 222, 69, 27);
		panel_3.add(lblVille);
		
		textville = new JTextField();
		textville.setBounds(123, 221, 126, 28);
		panel_3.add(textville);
		textville.setToolTipText("Saisie le ville");
		textville.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car = evt.getKeyChar(); 
	             
	             if((car<'a' || car>'z')&&(car<'A'||car>'Z')) 
	              evt.consume(); 
			}
		});
		textville.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(10, 274, 89, 27);
		panel_3.add(lblAdresse);
		
	
		textadresse.setBounds(123, 267, 258, 68);
		panel_3.add(textadresse);
		textadresse.setToolTipText("Saisie l'adresse");
		textadresse.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setBounds(10, 33, 69, 37);
		panel_3.add(lblCode);
		lblCode.setIcon(null);
		textcode = new JTextField();
		textcode.setBounds(123, 37, 126, 28);
		panel_3.add(textcode);
		textcode.setToolTipText("Saisie le code");
		textcode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {

             char car = evt.getKeyChar(); 
             
             if((car<'0' || car>'9')) 
              evt.consume(); 
            
			}
				
		});
		textcode.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(10, 81, 89, 32);
		panel_3.add(lblNom);
		lblNom.setIcon(null);
		
		textnom = new JTextField();
		textnom.setBounds(123, 83, 126, 28);
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 212, 645, 142);
		contentPane.add(panel_2);
	}
	
}
