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

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class GestionCommerciale extends JFrame {

	   private JPanel contentPane;
	  // private Timer minuteur = new Timer(1000, (ActionListener) this);
	   //private JLabel heure = new JLabel();
	   //private DateFormat pr�sentation = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionCommerciale frame = new GestionCommerciale();
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
	public GestionCommerciale() {
		super();
	//	heure.setFont(new Font("Goudy Stout", Font.BOLD+Font.ITALIC, 32));
	  //    heure.setHorizontalAlignment(JLabel.CENTER);
	  //    heure.setBorder(BorderFactory.createLoweredBevelBorder());
	    
	  //  JLabel  background=new JLabel(new ImageIcon("D:/WorksSapceZE/Gestion-Commercial/GestionCommercial/design_icons/logogestion.jpg"));
		//	background.setLayout(new FlowLayout(0,30,10));
	      
		Horloge horloge = new Horloge();
		  JOptionPane.showMessageDialog(null, horloge, "Horloge", JOptionPane.INFORMATION_MESSAGE);   
		    horloge.arr�t();
	   // add(heure, BorderLayout.NORTH);
	//  add(heure, BorderLayout.CENTER);
	    // add(background, BorderLayout.SOUTH )  ;
		setTitle("Gestion Commerciale");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 966, 734);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnClient = new JMenu("Client");
		menuBar.add(mnClient);
		
		JMenuItem mntmAjouterClient = new JMenuItem("Ajouter Client");
		mntmAjouterClient.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\designkode-free-icons\\add.png"));
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
		
		JMenu mnFacture = new JMenu("Facture");
		menuBar.add(mnFacture);
		
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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("");
		lblNewJgoodiesTitle.setBounds(0, 0, 558, 313);
		contentPane.add(lblNewJgoodiesTitle);
	}
}
class Horloge extends JComponent implements ActionListener {
	  private Timer timer = new Timer(100, this);
	  private double heure; 
	  private double minute, seconde;
	   
	  public Horloge() {
	    setPreferredSize(new Dimension(240, 190));
	    timer.start();
	  }
	   
	  public void arr�t() {
	    timer.stop();
	  }
	   
	  @Override
	  protected void paintComponent(Graphics g) {
	    Graphics2D dessin = (Graphics2D) g;
	    dessin.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	    dessin.setStroke(new BasicStroke(5));      
	    dessin.drawOval(5, 5, 181, 181);
	    dessin.setStroke(new BasicStroke(2));
	    dessin.drawLine(96, 5, 96, 183);
	    dessin.drawLine(5, 96, 183, 96);
	    dessin.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
	    dessin.setPaint(new Color(0.0F, 0.0F, 1.0F, 0.5F));
	    dessin.drawLine(96, 96,
	        (int) (96 + 50*Math.cos((heure-3) * 2.0 * Math.PI / 12)), 
	        (int) (96 + 50*Math.sin((heure-3) * 2.0 * Math.PI / 12)));
	    dessin.drawLine(96, 96,
	        (int) (96 + 70*Math.cos((minute-15) * 2.0 * Math.PI / 60)), 
	        (int) (96 + 70*Math.sin((minute-15) * 2.0 * Math.PI / 60)));
	    dessin.setPaint(new Color(1.0F, 0.0F, 0.0F, 0.5F));
	    dessin.drawLine(96, 96,
	        (int) (96 + 80*Math.cos((seconde-15) * 2.0 * Math.PI / 60)), 
	        (int) (96 + 80*Math.sin((seconde-15) * 2.0 * Math.PI / 60)));
	  }

	  public void actionPerformed(ActionEvent e) {
	    Calendar horaire = Calendar.getInstance();      
	    minute = horaire.get(Calendar.MINUTE);
	    seconde = horaire.get(Calendar.SECOND);
	    heure = horaire.get(Calendar.HOUR)+minute/60;
	    repaint();
	  }
	}