package vue;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Authentification extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldpseudo;
	private JTextField textFieldmotpass;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification frame = new Authentification();
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
	public Authentification() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 351);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelimage = new JLabel("");
		labelimage.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\login.jpg"));
		labelimage.setBounds(0, 0, 297, 317);
		contentPane.add(labelimage);
		
		final JLabel labelpseudo = new JLabel("Pseudo :");
		
		
		
		
		labelpseudo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		labelpseudo.setBounds(307, 75, 80, 26);
		contentPane.add(labelpseudo);
		
		final JLabel lblMotDePasse = new JLabel("Mot de passe :");
		
		lblMotDePasse.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMotDePasse.setBounds(307, 147, 129, 33);
		contentPane.add(lblMotDePasse);
		
		textFieldpseudo = new JTextField();
		textFieldpseudo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textFieldpseudo.setBounds(479, 81, 129, 20);
		contentPane.add(textFieldpseudo);
		textFieldpseudo.setColumns(10);
		
	
		
		JButton btnValider = new JButton("Valider");
		
		
		
		
		btnValider.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\verifier-true-icone-8616-96 (2).png"));
		btnValider.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnValider.setBounds(307, 233, 121, 39);
		contentPane.add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		
		
		
		
		btnAnnuler.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\sign_close_88775.jpg"));
		btnAnnuler.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnAnnuler.setBounds(487, 233, 121, 39);
		contentPane.add(btnAnnuler);
		
		passwordField = new JPasswordField();
		
		passwordField.setBounds(479, 156, 129, 20);
		contentPane.add(passwordField);
		
		labelpseudo.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent e)
			{
				labelpseudo.setForeground(java.awt.Color.BLUE);
			
			}  
			public void mouseExited(MouseEvent e)
			{
				labelpseudo.setForeground(java.awt.Color.BLACK);
			}
		});
		
		btnValider.addActionListener(new ActionListener()  
		{
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane jOptionPane=new JOptionPane();
				
				if (textFieldpseudo.getText().equals("admin") && (passwordField.getText().equals("admin")))
	  	        {
	  	           GestionCommerciale g = new GestionCommerciale();
	  	         g.setVisible(true); 
	    	    }
	  		    else
	  	        {
						JOptionPane.showMessageDialog(null,"Votre Pseudo ou Mot de passe est incorrect!","Erreur Authentification",JOptionPane.ERROR_MESSAGE);
	  	        }	  
	  	    }
	    });
		
		lblMotDePasse.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent e)
			{
				lblMotDePasse.setForeground(java.awt.Color.BLUE);
			
			}  
			public void mouseExited(MouseEvent e)
			{
				lblMotDePasse.setForeground(java.awt.Color.BLACK);
			}
		});
		
		btnAnnuler.addActionListener(new ActionListener()  
		{
		public void actionPerformed(ActionEvent e) 
			{
				JOptionPane jOptionPane=new JOptionPane();
				switch (JOptionPane.showConfirmDialog(null, 
          "Désirez-vous quitter l'application ?","Sortir du programme", 
          JOptionPane.YES_NO_OPTION))
           {
              
           case JOptionPane.YES_OPTION : System.exit(0); 
               
           case JOptionPane.CLOSED_OPTION : 
           {
               JLabel alerte = new JLabel("Attention, vous devez faire un choix !");
               alerte.setForeground(Color.RED);
               int choix;
               while ((choix = JOptionPane.showConfirmDialog(null, 
                  new Object[] {alerte, "Désirez-vous quitter l'application ?"},
                  "Sortir du programme", 
                  JOptionPane.YES_NO_OPTION,
                  JOptionPane.ERROR_MESSAGE))==JOptionPane.CLOSED_OPTION); 
               if (choix==JOptionPane.YES_OPTION) System.exit(0);
            }
        }
      }
      });
	}
}
