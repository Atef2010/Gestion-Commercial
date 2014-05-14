package vue;

import gestioncomm.Cheque;
import gestioncomm.Facture;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.toedter.calendar.JDateChooser;

import dao.ChequeDAO;
import dao.FactureDAO;
import dao.TableModelFacture;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JButton;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FicheFacture extends JFrame {

	private JPanel contentPane;
	private JTextField textnumpaiment;
	private JTextField textmnttot;
	private JTextField textField;
	private JTextField textmntespese;
	private JTextField textcltesp;
	private JTextField textprenomesp;
	private JTextField textremise;
	private JTextField textmnt;
	private JTextField textnomch;
	private JTextField textprenomch;
	private JTextField textbanque;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FicheFacture frame = new FicheFacture();
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
	public FicheFacture() {
		setBounds(100, 100, 782, 583);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("Facture");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Paiment", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 113, 288, 103);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textmnttot = new JTextField();
		textmnttot.setBounds(150, 61, 115, 20);
		panel.add(textmnttot);
		textmnttot.setColumns(10);
		
		JLabel lblMontantTotal = new JLabel("Montant Total");
		lblMontantTotal.setBounds(10, 63, 130, 17);
		panel.add(lblMontantTotal);
		lblMontantTotal.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\16x16\\bank.png"));
		
		JLabel lblNumeroPaiement = new JLabel("Numero Paiement");
		lblNumeroPaiement.setBounds(0, 25, 140, 17);
		panel.add(lblNumeroPaiement);
		lblNumeroPaiement.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\16x16\\pen.png"));
		
		textnumpaiment = new JTextField();
		textnumpaiment.setBounds(150, 20, 115, 20);
		panel.add(textnumpaiment);
		textnumpaiment.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Type", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 240, 288, 103);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		final JPanel panelespse = new JPanel();
		final JPanel panelcheque = new JPanel();
		ButtonGroup g = new ButtonGroup();
		final JRadioButton rdbtnCheque = new JRadioButton("Cheque");
		panelcheque.show(true);
		panelespse.show(false);
		
		
		rdbtnCheque.setBounds(17, 42, 109, 23);
		panel_1.add(rdbtnCheque);
		
		JRadioButton rdbtnEspece = new JRadioButton("Espece");
		
		g.add(rdbtnEspece);
		g.add(rdbtnCheque);
		rdbtnEspece.setBounds(150, 42, 109, 23);
		panel_1.add(rdbtnEspece);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cheque", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(316, 113, 317, 230);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		
		JButton btnValider = new JButton("Valider");
		btnValider.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\16x16\\check.png"));
		btnValider.setBounds(655, 31, 101, 23);
		contentPane.add(btnValider);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information Facture", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 0, 623, 102);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNumeroFacture = new JLabel("Numero Facture");
		lblNumeroFacture.setBounds(10, 30, 101, 14);
		panel_3.add(lblNumeroFacture);
		
		final JTextField textnumfact = new JTextField();
		textnumfact.setBounds(151, 27, 114, 20);
		panel_3.add(textnumfact);
		textnumfact.setColumns(10);
		
		JLabel lblDate_1 = new JLabel("Date");
		lblDate_1.setBounds(315, 30, 56, 14);
		panel_3.add(lblDate_1);
		
		final JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(432, 27, 132, 20);
		
		panel_3.add(dateChooser);
		
		JLabel lblRfrence = new JLabel("R\u00E9f\u00E9rence");
		lblRfrence.setBounds(10, 65, 77, 14);
		panel_3.add(lblRfrence);
		
		textField_5 = new JTextField();
		textField_5.setBounds(151, 62, 114, 20);
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblLibelle = new JLabel("Libelle");
		lblLibelle.setBounds(315, 65, 46, 14);
		panel_3.add(lblLibelle);
		
		textField_6 = new JTextField();
		textField_6.setBounds(432, 62, 114, 20);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		/*
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 380, 623, 154);
		contentPane.add(scrollPane);
		textField.setColumns(10);
		*/
		panelespse.setBounds(10, 21, 297, 191);
		panel_2.add(panelespse);
		panelespse.setLayout(null);
		
		JLabel lblMontant = new JLabel("Montant");
		lblMontant.setBounds(10, 36, 62, 14);
		panelespse.add(lblMontant);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(10, 76, 46, 14);
		panelespse.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(10, 117, 62, 14);
		panelespse.add(lblPrenom);
		
		JLabel lblRemise = new JLabel("Remise");
		lblRemise.setBounds(10, 155, 62, 14);
		panelespse.add(lblRemise);
		
		textmntespese = new JTextField();
		textmntespese.setBounds(111, 30, 114, 20);
		panelespse.add(textmntespese);
		textmntespese.setColumns(10);
		
		textcltesp = new JTextField();
		textcltesp.setBounds(111, 76, 114, 20);
		panelespse.add(textcltesp);
		textcltesp.setColumns(10);
		
		textprenomesp = new JTextField();
		textprenomesp.setBounds(111, 114, 114, 20);
		panelespse.add(textprenomesp);
		textprenomesp.setColumns(10);
		
		textremise = new JTextField();
		textremise.setBounds(111, 152, 114, 20);
		panelespse.add(textremise);
		textremise.setColumns(10);
		
	
		
		panelcheque.setBounds(10, 21, 297, 191);
		panel_2.add(panelcheque);
		panelcheque.setLayout(null);
		
		JLabel label = new JLabel("Montant");
		label.setBounds(10, 36, 62, 14);
		panelcheque.add(label);
		
		JLabel label_1 = new JLabel("Nom");
		label_1.setBounds(10, 76, 46, 14);
		panelcheque.add(label_1);
		
		JLabel label_2 = new JLabel("Prenom");
		label_2.setBounds(10, 117, 62, 14);
		panelcheque.add(label_2);
		
		JLabel label_3 = new JLabel("Banque");
		label_3.setBounds(10, 155, 62, 14);
		panelcheque.add(label_3);
		
		textmnt = new JTextField();
		textmnt.setColumns(10);
		textmnt.setBounds(111, 30, 114, 20);
		panelcheque.add(textmnt);
		
		textnomch = new JTextField();
		textnomch.setColumns(10);
		textnomch.setBounds(111, 76, 114, 20);
		panelcheque.add(textnomch);
		
		textprenomch = new JTextField();
		textprenomch.setColumns(10);
		textprenomch.setBounds(111, 114, 114, 20);
		panelcheque.add(textprenomch);
		
		textbanque = new JTextField();
		textbanque.setColumns(10);
		textbanque.setBounds(111, 152, 114, 20);
		panelcheque.add(textbanque);
		
		final TableModelFacture model = new TableModelFacture("");
		final JTable t = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(t);
		scrollPane.setBounds(10, 362, 623, 172);
		contentPane.add(scrollPane);
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setBounds(655, 65, 99, 23);
		contentPane.add(btnImprimer);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id=(model.getValueAt(t.getSelectedRow(),0).toString());
				String numfact=(model.getValueAt(t.getSelectedRow(),1).toString());
				String numpaiment=(model.getValueAt(t.getSelectedRow(),2).toString());
				String mnt=(model.getValueAt(t.getSelectedRow(),3).toString());
				//String type=(String)model.getValueAt(t.getSelectedRow(),4);
				
				id=textnumfact.getSelectedText();
				
				
			}
		});
		btnModifier.setBounds(655, 99, 101, 23);
		contentPane.add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(655, 136, 101, 23);
		contentPane.add(btnSupprimer);
		rdbtnCheque.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				panelcheque.show(true);
				panelespse.show(false);
				
				
			}
		});
		rdbtnEspece.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				panelcheque.show(false);
				panelespse.show(true);
				
			}
		});
		
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Facture f = new Facture();
			f.setNumfact(Integer.parseInt(textnumfact.getText()));
			f.setNumpaiment(Integer.parseInt(textnumpaiment.getText()));	
			f.setMnttot(Double.parseDouble(textmnttot.getText()));
			f.setDate(dateChooser.getDate());
			if(rdbtnCheque.isSelected())
			{
				f.setType("Cheque");
				Cheque c = new Cheque();
				c.setBanque(textbanque.getText());
				c.setNom(textnomch.getText());
				c.setPrenom(textprenomch.getText());
				c.setMont(Double.parseDouble(textmnt.getText()));
				new ChequeDAO().save(c);
			}
			else
			{
				f.setType("Espece");
			}
			new FactureDAO().save(f);
			JOptionPane.showMessageDialog(null, "Facture Ajoute ", "OK", JOptionPane.INFORMATION_MESSAGE);
			}
		
		});
	}
}
