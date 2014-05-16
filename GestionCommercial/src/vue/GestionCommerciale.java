package vue;

import gestioncomm.Fournisseur;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.awt.Window.Type;
import java.text.DateFormat;

import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.*;

public class GestionCommerciale extends JFrame implements ActionListener {

	  
	 
private Timer minuteur = new Timer(1000, this);
   private JLabel heure = new JLabel();
   private DateFormat présentation = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM);
   

	/**
	 * Create the frame.
	 */
	
	  
	public GestionCommerciale() {
		
		super();
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		setTitle("Gestion Commerciale");
			heure.setForeground(Color.BLUE);
		
			heure.setFont(new Font("Shonar Bangla", Font.BOLD | Font.ITALIC, 36));
      		heure.setHorizontalAlignment(JLabel.CENTER);
      		
		this.setLocationRelativeTo(null);
	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 966, 734);
			Horloge h = new Horloge();
				
			getContentPane().add(h);
			getContentPane().add(heure,BorderLayout.SOUTH);
			
			getContentPane().setLayout(null);
			h.setBounds(400,20,198,191);
			heure.setBounds(268,582,450,69);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\logo.jpg"));
			lblNewLabel.setBounds(304, 259, 400, 250);
			getContentPane().add(lblNewLabel);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnClient = new JMenu("Client");
		menuBar.add(mnClient);
		
		JMenuItem mntmAjouterClient = new JMenuItem("Ajouter Client");
		//mntmAjouterClient.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\add.png"));
		mntmAjouterClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("//design_icons//designkode-free-icons//add.png")));
		mntmAjouterClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FicheClient c = new FicheClient();
				c.show();
			}
		});
		mnClient.add(mntmAjouterClient);
		
		JMenuItem mntmModifierClient = new JMenuItem("Modifier Client");
		mntmModifierClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsulterClient cc = new ConsulterClient();
				cc.show();
			}
		});
		mntmModifierClient.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\art-knife.png"));
		mnClient.add(mntmModifierClient);
		
		JMenuItem mntmSupprimerClient = new JMenuItem("Supprimer Client");
		mntmSupprimerClient.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\remove.png"));
		mnClient.add(mntmSupprimerClient);
		
		JMenuItem mntmConsulterClient = new JMenuItem("Consulter Client");
		mntmConsulterClient.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\document.png"));
		mnClient.add(mntmConsulterClient);
		
		JMenu mnFournisseur = new JMenu("Fournisseur");
		menuBar.add(mnFournisseur);
		
		JMenuItem mntmAjouterFournisseur = new JMenuItem("Ajouter Fournisseur");
		mntmAjouterFournisseur.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\add.png"));
		mntmAjouterFournisseur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FicheFournisseur f =  new FicheFournisseur();
				f.show();
			}
		});
		mnFournisseur.add(mntmAjouterFournisseur);
		
		JMenuItem mntmModifierFournisseur = new JMenuItem("Modifier Fournisseur");
		mntmModifierFournisseur.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\art-knife.png"));
		mntmModifierFournisseur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsulterFournisseur cf = new ConsulterFournisseur();
				cf.show();
			}
		});
		mnFournisseur.add(mntmModifierFournisseur);
		
		JMenuItem mntmSupprimerFournisseur = new JMenuItem("Supprimer Fournisseur");
		mntmSupprimerFournisseur.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\remove.png"));
		mntmSupprimerFournisseur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsulterFournisseur cf = new ConsulterFournisseur();
				cf.show();
			}
		});
		mnFournisseur.add(mntmSupprimerFournisseur);
		
		JMenuItem mntmConsulterFournisseur = new JMenuItem("Consulter Fournisseur");
		mntmConsulterFournisseur.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\document.png"));
		mntmConsulterFournisseur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsulterFournisseur cf = new ConsulterFournisseur();
			}
		});
		mnFournisseur.add(mntmConsulterFournisseur);
		
		JMenu mnArticle = new JMenu("Article");
		menuBar.add(mnArticle);
		
		JMenuItem mntmAjouterArticle = new JMenuItem("Ajouter Article");
		mntmAjouterArticle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Article a = new Article();
				a.show();
			}
		});
		mntmAjouterArticle.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\add.png"));
		mnArticle.add(mntmAjouterArticle);
		
		JMenuItem mntmConsulterArticle = new JMenuItem("Consulter Article");
		mntmConsulterArticle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListeArticles l = new ListeArticles(null);
				l.show();
			}
		});
		mnArticle.add(mntmConsulterArticle);
		
		JMenu mnFacture = new JMenu("Facture");
		menuBar.add(mnFacture);
		
		JMenuItem mntmAjouterFacture = new JMenuItem("Ajouter Facture");
		mntmAjouterFacture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FicheFacture f = new FicheFacture();
				f.show();
			}
		});
		mnFacture.add(mntmAjouterFacture);
		
		JMenu mnCommande = new JMenu("Commande");
		menuBar.add(mnCommande);
		
		JMenuItem mntmGrerCommande = new JMenuItem("G\u00E9rer Commande");
		mntmGrerCommande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FicheCommande c = new FicheCommande();
				c.show();
			}
		});
		mntmGrerCommande.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\32x32\\old-versions.png"));
		mnCommande.add(mntmGrerCommande);
		
		JMenu mnStock = new JMenu("Stock");
		menuBar.add(mnStock);
		
		
    	minuteur.start();
      setSize(1000, 700);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setResizable(false);
	}

 public void actionPerformed(ActionEvent e) {
            présentation = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM);
         heure.setText(présentation.format(new Date()));
     }

public static void main(String[] args) {
	
			
					GestionCommerciale frame = new GestionCommerciale();
					frame.setVisible(true);
			
	
	}
}


