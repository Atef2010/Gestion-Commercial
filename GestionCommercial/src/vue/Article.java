package vue;

import gestioncomm.Laptop;
import gestioncomm.Pcbureau;
import gestioncomm.Produit;
import gestioncomm.Smartphone;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

import dao.LaptopDAO;
import dao.PcbureauDAO;
import dao.ProduitDAO;
import dao.SmartphoneDAO;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Article extends JFrame {

	private JPanel contentPane;
	private JTextField textmarque;
	private JTextField textdisquedure;
	private JTextField textqte;
	private JTextField textprixht;
	private JTextField textprixttc;
	private JTextField textlib;
	private JTextField textref;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Article() {
		setResizable(false);
		setTitle("Ajout Article\r\n");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 1275, 739);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Reference Article", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_1.setBounds(54, 42, 393, 187);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(10, 16, 373, 160);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Reference :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(100, 36, 67, 14);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Mohamed\\Desktop\\Gestion-Commercial\\GestionCommercial\\java project\\Originals\\Originals\\icon_256.png"));
		label.setBounds(70, 24, 20, 36);
		panel.add(label);
		
		Object[] elements = new Object[]{"PCB","PCP","SP"};
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Mohamed\\Desktop\\Gestion-Commercial\\GestionCommercial\\java project\\Originals\\Originals\\icon_256.png"));
		label_1.setBounds(70, 57, 20, 58);
		panel.add(label_1);
		
		JLabel lblLibelle = new JLabel("Libelle :");
		lblLibelle.setVerticalAlignment(SwingConstants.TOP);
		lblLibelle.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblLibelle.setBounds(100, 80, 56, 14);
		panel.add(lblLibelle);
		
		final JRadioButton rdbtnPcBureau = new JRadioButton("PC Bureau");
		rdbtnPcBureau.setBackground(SystemColor.menu);
		
		rdbtnPcBureau.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rdbtnPcBureau.setBounds(16, 111, 109, 42);
		panel.add(rdbtnPcBureau);
		
		JRadioButton rdbtnSmartPhone = new JRadioButton("Smart Phone");
		rdbtnSmartPhone.setBackground(SystemColor.menu);
		
		rdbtnSmartPhone.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rdbtnSmartPhone.setBounds(138, 113, 124, 39);
		panel.add(rdbtnSmartPhone);
		
		final JRadioButton rdbtnlaptop = new JRadioButton("LapTop");
		rdbtnlaptop.setBackground(SystemColor.menu);
		
		rdbtnlaptop.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rdbtnlaptop.setBounds(264, 111, 109, 42);
		panel.add(rdbtnlaptop);
		
		textlib = new JTextField();
		textlib.setBounds(185, 77, 119, 20);
		panel.add(textlib);
		textlib.setColumns(10);
		
		textref = new JTextField();
		textref.setBounds(185, 33, 119, 20);
		panel.add(textref);
		textref.setColumns(10);
		
		final JPanel panel_3 = new JPanel();
		panel_3.setForeground(SystemColor.menu);
		panel_3.setBackground(Color.BLACK);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "PC Bureau", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_3.setBounds(54, 240, 393, 270);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.menu);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBounds(10, 22, 373, 237);
		panel_3.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\cpu_icone_3896_128.png"));
		label_2.setBounds(27, 32, 40, 34);
		panel_2.add(label_2);
		
		JLabel lblProcesseur = new JLabel("Processeur :");
		lblProcesseur.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblProcesseur.setBounds(85, 32, 86, 34);
		panel_2.add(lblProcesseur);
		
		final JComboBox comboBoxprocesseur = new JComboBox();
		comboBoxprocesseur.setBounds(223, 39, 128, 20);
		panel_2.add(comboBoxprocesseur);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\icon-windows.png"));
		label_3.setBounds(27, 77, 40, 43);
		panel_2.add(label_3);
		
		JLabel lblSystemeExploitation = new JLabel("Systeme Exploitation :");
		lblSystemeExploitation.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSystemeExploitation.setBounds(85, 88, 128, 20);
		panel_2.add(lblSystemeExploitation);
		
		final JComboBox comboBoxsystemesx = new JComboBox();
		comboBoxsystemesx.setBounds(223, 88, 128, 20);
		panel_2.add(comboBoxsystemesx);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\logo_nvidia.png"));
		label_4.setBounds(27, 127, 45, 43);
		panel_2.add(label_4);
		
		JLabel lblCarteGraphique = new JLabel("Carte Graphique :");
		lblCarteGraphique.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCarteGraphique.setBounds(85, 127, 103, 43);
		panel_2.add(lblCarteGraphique);
		
		final JComboBox comboBoxcartegr = new JComboBox();
		comboBoxcartegr.setBounds(223, 138, 128, 20);
		panel_2.add(comboBoxcartegr);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\EcranMac_icon.png"));
		label_5.setBounds(27, 174, 46, 50);
		panel_2.add(label_5);
		
		JLabel lblEcran = new JLabel("Ecran :");
		lblEcran.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEcran.setBounds(85, 181, 86, 34);
		panel_2.add(lblEcran);
		
		final JComboBox comboBoxecran = new JComboBox();
		comboBoxecran.setBounds(223, 188, 128, 20);
		panel_2.add(comboBoxecran);
		
		// remplissage des combos box
		comboBoxcartegr.addItem("");
		comboBoxcartegr.addItem("Nvidia");
		comboBoxcartegr.addItem("ATI Radeon");
		comboBoxecran.addItem("");
		comboBoxecran.addItem("15 pouces");
		comboBoxecran.addItem("19 pouces");
		comboBoxprocesseur.addItem("");
		comboBoxprocesseur.addItem("I3");
		comboBoxprocesseur.addItem("I5");
		comboBoxprocesseur.addItem("I7");
		comboBoxsystemesx.addItem("");
		comboBoxsystemesx.addItem("Windows 7");
		comboBoxsystemesx.addItem("Windows Vista");
		
		
		final JPanel panel_7 = new JPanel();
		panel_7.setForeground(SystemColor.menu);
		panel_7.setBackground(Color.BLACK);
		panel_7.setBounds(54, 240, 393, 270);
		contentPane.add(panel_7);
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "LapTop ", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_7.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setForeground(SystemColor.menu);
		panel_6.setBounds(10, 22, 373, 237);
		panel_7.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\images.jpg"));
		label_10.setBounds(49, 11, 40, 48);
		panel_6.add(label_10);
		
		JLabel lblType = new JLabel("Marque :");
		lblType.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblType.setBounds(118, 11, 67, 48);
		panel_6.add(lblType);
		
		 textmarque = new JTextField();
		 textmarque.setBounds(244, 25, 107, 20);
		panel_6.add( textmarque);
		 textmarque.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\cpu_icone_3896_128.png"));
		lblNewLabel.setBounds(49, 70, 46, 40);
		panel_6.add(lblNewLabel);
		
		JLabel lblProcesseur_1 = new JLabel("Processeur :");
		lblProcesseur_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblProcesseur_1.setBounds(118, 70, 71, 40);
		panel_6.add(lblProcesseur_1);
		
		final JComboBox comboprosseur = new JComboBox();
		comboprosseur.setBounds(244, 80, 107, 20);
		panel_6.add(comboprosseur);
		comboprosseur.addItem("");
		comboprosseur.addItem("I7");
		comboprosseur.addItem("I5");
		comboprosseur.addItem("I3");
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\Disque-dur.jpg"));
		label_11.setBounds(49, 121, 46, 49);
		panel_6.add(label_11);
		
		JLabel lblDisqueDure = new JLabel("Disque Dure :");
		lblDisqueDure.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDisqueDure.setBounds(118, 121, 84, 49);
		panel_6.add(lblDisqueDure);
		
		textdisquedure = new JTextField();
		textdisquedure.setBounds(244, 135, 107, 20);
		panel_6.add(textdisquedure);
		textdisquedure.setColumns(10);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\win2.png"));
		label_12.setBounds(49, 181, 46, 48);
		panel_6.add(label_12);
		
		JLabel lblSystemeExploitation_1 = new JLabel("Systeme Exploitation :");
		lblSystemeExploitation_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSystemeExploitation_1.setBounds(118, 182, 129, 40);
		panel_6.add(lblSystemeExploitation_1);
		
		final JComboBox comboBsys = new JComboBox();
		comboBsys.setBounds(244, 192, 107, 20);
		panel_6.add(comboBsys);
		comboBsys.addItem("");
		comboBsys.addItem("Windows 7");
		comboBsys.addItem("Windows 8");
		comboBsys.addItem("Windows Vista");
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.BLACK);
		panel_9.setForeground(SystemColor.menu);
		panel_9.setForeground(Color.BLACK);
		panel_9.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Etat ", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_9.setBounds(54, 523, 393, 171);
		contentPane.add(panel_9);
		panel_9.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setForeground(SystemColor.menu);
		panel_8.setBounds(10, 21, 373, 138);
		panel_9.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblEtatDeLarticle = new JLabel("Etat de l'article :");
		lblEtatDeLarticle.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEtatDeLarticle.setBounds(55, 72, 119, 55);
		panel_8.add(lblEtatDeLarticle);
		
		final JComboBox comboBoxetat = new JComboBox();
		comboBoxetat.setBounds(184, 89, 130, 20);
		panel_8.add(comboBoxetat);
		
		comboBoxetat.addItem("");
		comboBoxetat.addItem("Disponible");
		comboBoxetat.addItem("Non Disponible");
		
		JLabel lblQuantitDeProduit = new JLabel("Quantit\u00E9 de produit :");
		lblQuantitDeProduit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblQuantitDeProduit.setBounds(55, 32, 130, 40);
		panel_8.add(lblQuantitDeProduit);
		
		textqte = new JTextField();
		textqte.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
			

		             char car = evt.getKeyChar(); 
		             
		             if((car<'0' || car>'9')) 
		              evt.consume(); 
		            
			}
		});
		textqte.setBounds(184, 42, 130, 20);
		panel_8.add(textqte);
		textqte.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.BLACK);
		panel_11.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Prix", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_11.setBounds(463, 523, 393, 171);
		contentPane.add(panel_11);
		panel_11.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setForeground(Color.BLACK);
		panel_10.setBackground(SystemColor.menu);
		panel_10.setBounds(10, 21, 373, 139);
		panel_11.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblPrixht = new JLabel("Prix-HT :");
		lblPrixht.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPrixht.setBounds(89, 35, 74, 30);
		panel_10.add(lblPrixht);
		
		textprixht = new JTextField();
		textprixht.setBounds(173, 40, 118, 20);
		panel_10.add(textprixht);
		textprixht.setColumns(10);
		
		JLabel lblPrixttc = new JLabel("Prix-TTC :");
		lblPrixttc.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPrixttc.setBounds(89, 76, 74, 28);
		panel_10.add(lblPrixttc);
		
		textprixttc = new JTextField();
		textprixttc.setBounds(173, 80, 118, 20);
		panel_10.add(textprixttc);
		textprixttc.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.BLACK);
		panel_13.setForeground(Color.BLACK);
		panel_13.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Conformation ou Annulation", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_13.setBounds(866, 523, 393, 171);
		contentPane.add(panel_13);
		panel_13.setLayout(null);
		
		JPanel panel_12 = new JPanel();
		panel_12.setForeground(Color.BLACK);
		panel_12.setBackground(SystemColor.menu);
		panel_12.setBounds(10, 22, 373, 138);
		panel_13.add(panel_12);
		panel_12.setLayout(null);
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\verifier-true-icone-8616-96 (2).png"));
		btnNewButton.setBounds(135, 22, 123, 42);
		panel_12.add(btnNewButton);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnAnnuler.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\sign_close_88775.jpg"));
		btnAnnuler.setBounds(135, 75, 123, 42);
		panel_12.add(btnAnnuler);
		
		final JLabel labelimage = new JLabel("");
		labelimage.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\pcb - Copie.jpg"));
		labelimage.setBounds(559, 42, 690, 440);
		contentPane.add(labelimage);
		labelimage.show(false);
		final JLabel labelimage1 = new JLabel("");
		labelimage1.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\divers smartphones - Copie.jpg"));
		labelimage1.setBounds(559, 42, 690, 440);
		contentPane.add(labelimage1);
		labelimage1.show(false);
		final JLabel labelimage2 = new JLabel("");
		labelimage2.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\laptop2 - Copie.jpg"));
		labelimage2.setBounds(559, 42, 690, 440);
		contentPane.add(labelimage2);
		labelimage2.show(false);
		final JPanel panel_5 = new JPanel();
		panel_5.setForeground(SystemColor.menu);
		panel_5.setBounds(54, 240, 393, 271);
		contentPane.add(panel_5);
		panel_5.setForeground(SystemColor.menu);
		panel_5.setBackground(Color.BLACK);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Smart Phone", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_5.setLayout(null);
		
		final JPanel panel_4 = new JPanel();
		panel_4.setForeground(SystemColor.menu);;
		//panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 21, 373, 239);
		panel_5.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\iphone_sparkweb.png"));
		label_7.setBounds(34, 52, 46, 40);
		panel_4.add(label_7);
		
		JLabel lblDimenssion = new JLabel("Dimenssion :");
		lblDimenssion.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDimenssion.setBounds(95, 52, 82, 40);
		panel_4.add(lblDimenssion);
		
		final JComboBox comboBoxdimension = new JComboBox();
		comboBoxdimension.setBounds(215, 62, 112, 20);
		panel_4.add(comboBoxdimension);
		comboBoxdimension.addItem("");
		comboBoxdimension.addItem("10.1 pouce ");
		comboBoxdimension.addItem("9.7 pouce");
		comboBoxdimension.addItem("4.3 pouce");
		comboBoxdimension.addItem("3 pouce");
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\9bca68abe70108382c8226cb9170ddf1.png"));
		label_8.setBounds(34, 103, 46, 49);
		panel_4.add(label_8);
		
		JLabel lblAutonomie = new JLabel("Autonomie :");
		lblAutonomie.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAutonomie.setBounds(95, 103, 82, 49);
		panel_4.add(lblAutonomie);
		
		final JComboBox comboBoxautonomie = new JComboBox();
		comboBoxautonomie .setBounds(215, 117, 112, 20);
		panel_4.add(comboBoxautonomie );
		comboBoxautonomie .addItem("");
		comboBoxautonomie .addItem("2h");
		comboBoxautonomie .addItem("4h");
		comboBoxautonomie .addItem("8h");
		comboBoxautonomie .addItem("12h");
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\media-flash-2.png"));
		label_9.setBounds(34, 161, 46, 51);
		panel_4.add(label_9);
		
		JLabel lblMemoire = new JLabel("Memoire :");
		lblMemoire.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMemoire.setBounds(95, 163, 82, 49);
		panel_4.add(lblMemoire);
		ButtonGroup g = new ButtonGroup();
		g.add(rdbtnlaptop);
		g.add(rdbtnSmartPhone);
		g.add(rdbtnPcBureau);
		
		final JComboBox comboBoxmemoire = new JComboBox();
		comboBoxmemoire.setBounds(215, 177, 112, 20);
		comboBoxmemoire.addItem("");
		comboBoxmemoire.addItem("1 Go");
		comboBoxmemoire.addItem("2 Go");
		comboBoxmemoire.addItem("4 Go");
		comboBoxmemoire.addItem("8 Go");
		comboBoxmemoire.addItem("16 Go");
		panel_4.add(comboBoxmemoire);
		panel_5.show(false);
		
		panel_3.show(true);
		panel_7.show(false);
		
		rdbtnPcBureau.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				panel_3.show(true);
				panel_5.show(false);
				panel_7.show(false);
				labelimage.show(true);
				labelimage1.show(false);
				labelimage2.show(false);
				
			}
		});
		
		rdbtnSmartPhone.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				panel_3.show(false);
				panel_5.show(true);
				panel_7.show(false);
				labelimage.show(false);
				labelimage1.show(true);
				labelimage2.show(false);
			}
		});
		
		rdbtnlaptop.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				panel_3.show(false);
				panel_5.show(false);
				panel_7.show(true);
				labelimage.show(false);
				labelimage1.show(false);
				labelimage2.show(true);
			}
		});
		// Ajouter des Articles 
				
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						Pcbureau pc = new Pcbureau();
						Smartphone sm = new Smartphone();
						Laptop lp = new Laptop();
						//pc.setIdpc(Integer.parseInt(textref.getText()));
						if(rdbtnPcBureau.isSelected())
						{
						pc.setProcesseur(comboBoxprocesseur.getSelectedItem().toString());
						pc.setCartegr(comboBoxcartegr.getSelectedItem().toString());
						pc.setEcran(comboBoxecran.getSelectedItem().toString());
						pc.setSystemex(comboBoxsystemesx.getSelectedItem().toString());
						
						new PcbureauDAO().save(pc);
						
						}
						else if(rdbtnlaptop.isSelected())
						{
							lp.setMarque(textmarque.getText());
							lp.setDisque(textdisquedure.getText());
							lp.setProcesseur(comboprosseur.getSelectedItem().toString());
							lp.setSystemex(comboBsys.getSelectedItem().toString());
							
							new LaptopDAO().save(lp);
							
						}
						else 
						{
							sm.setMemoire(comboBoxmemoire.getSelectedItem().toString());
							sm.setAlimentation(comboBoxautonomie.getSelectedItem().toString());
							sm.setDimension(comboBoxdimension.getSelectedItem().toString());
							
							new SmartphoneDAO().save(sm);
						}
						Produit p = new Produit();
						p.setRef(textref.getText());
						p.setLib(textlib.getText());
						p.setEtat(comboBoxetat.getSelectedItem().toString());
						p.setPrix_ht(Integer.parseInt(textprixht.getText()));
						p.setPrix_ttc(Integer.parseInt(textprixttc.getText()));
						new ProduitDAO().save(p);
						JOptionPane.showMessageDialog(null, "Produit Ajouter ", "OK", JOptionPane.INFORMATION_MESSAGE);
					}
				});
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Article frame = new Article();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
