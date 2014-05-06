package vue;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.border.BevelBorder;

import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import gestioncomm.Commande;
import dao.CommandeDAO;
import dao.TableModelCommande;

import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;

import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class FicheCommande extends JFrame {

	private JPanel contentPane;
	public JTextField textcode;
	public JTextField textnom;
	private JTextField textnumcmd;
	public JTextField textqte;
	public JTextField textref;
	private FicheCommande _this;
	private JTextField textcmdparfr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FicheCommande frame = new FicheCommande();
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
	public FicheCommande() {
		setResizable(false);
		setBounds(100, 100, 954, 415);
		this.setTitle("Commande");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		_this = this;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textcode = new JTextField();
		textcode.setEnabled(false);
		textcode.setBounds(66, 40, 100, 20);
		contentPane.add(textcode);
		textcode.setColumns(10);
		
		textnom = new JTextField();
		textnom.setEnabled(false);
		textnom.setBounds(66, 80, 100, 20);
		contentPane.add(textnom);
		textnom.setColumns(10);
		final JDateChooser dateChooser = new JDateChooser();
		//////////Recupuration des donnees ///////////
		
		final TableModelCommande model = new TableModelCommande("");
		final JTable t = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(t);
		//model.fireTableDataChanged();
		scrollPane.setBounds(10, 181, 785, 185);
		contentPane.add(scrollPane);
	
		
		JButton btnValider = new JButton("Valider");
		btnValider.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\16x16\\check.png"));
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Commande c = new Commande();
				
				int i = model.getRowCount();
				
				
				c.setIdc(Integer.parseInt(textcode.getText()));
				c.setNumdcmd(Integer.parseInt(textnumcmd.getText()));
				c.setNumdcmd(i);
				c.setQte(Integer.parseInt(textqte.getText()));
				c.setRef(textref.getText());
				c.setFr(textnom.getText());
				c.setDate(dateChooser.getDate());
				
				new CommandeDAO().save(c);
				
				JOptionPane.showMessageDialog(null, "Commande Ajouter", "OK", JOptionPane.INFORMATION_MESSAGE);
				
				model.loadData("");
				model.fireTableDataChanged();
				 t.revalidate();
			}
			
		});
			
		btnValider.setBounds(822, 39, 116, 23);
		contentPane.add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\16x16\\communication.png"));
		btnAnnuler.setBounds(822, 75, 116, 23);
		contentPane.add(btnAnnuler);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Fournisseur", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 21, 247, 102);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCin = new JLabel("Code");
		lblCin.setBounds(10, 22, 46, 14);
		panel.add(lblCin);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(10, 63, 46, 14);
		panel.add(lblNom);
		
		JButton btrechcode = new JButton("");
		btrechcode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CommandeFournisseurC f = new CommandeFournisseurC(_this);
				f.setVisible(true);
				
			}
		});
		
		btrechcode.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\16x16\\search.png"));
		btrechcode.setBounds(180, 16, 44, 23);
		panel.add(btrechcode);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Commande", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(279, 21, 247, 102);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textnumcmd = new JTextField();
		textnumcmd.setBounds(122, 24, 100, 20);
		panel_1.add(textnumcmd);
		textnumcmd.setColumns(10);
		
		
		
		JLabel lblNDeCommande = new JLabel("N\u00B0 de Commande");
		lblNDeCommande.setBounds(10, 27, 102, 14);
		panel_1.add(lblNDeCommande);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(20, 61, 46, 14);
		panel_1.add(lblDate);

		
		dateChooser.setBounds(122, 55, 115, 20);
		panel_1.add(dateChooser);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Article", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(548, 21, 247, 102);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblRfrence = new JLabel("R\u00E9f\u00E9rence");
		lblRfrence.setBounds(22, 27, 68, 14);
		panel_2.add(lblRfrence);
		
		textref = new JTextField();
		textref.setEnabled(false);
		textref.setBounds(87, 24, 100, 20);
		panel_2.add(textref);
		textref.setColumns(10);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9");
		lblQuantit.setBounds(22, 65, 68, 14);
		panel_2.add(lblQuantit);
		
		textqte = new JTextField();
		textqte.setBounds(87, 62, 100, 20);
		panel_2.add(textqte);
		textqte.setColumns(10);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsulerListeArticles a = new ConsulerListeArticles(_this);
				a.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\16x16\\search.png"));
		button.setBounds(194, 23, 44, 23);
		panel_2.add(button);
		
		JButton btnNewButton = new JButton("Supprimer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Commande c = new Commande();
				
				String id=(model.getValueAt(t.getSelectedRow(),0).toString());
				String numcmd=(model.getValueAt(t.getSelectedRow(),1).toString());
				String nomfr=(String)model.getValueAt(t.getSelectedRow(),2);
				String ref=(String)model.getValueAt(t.getSelectedRow(),3);
			//	String lib=(String)model.getValueAt(t.getSelectedRow(),4);
				String qte=(model.getValueAt(t.getSelectedRow(),5).toString());
				
				c.setIdc(Integer.parseInt(id));
				c.setNumdcmd(Integer.parseInt(numcmd));
				c.setFr(nomfr);
				c.setQte(Integer.parseInt(qte));
			//	c.setLib(lib);
				c.setRef(ref);
				
				 
				new CommandeDAO().delete(c);
				
				JOptionPane.showMessageDialog(null, "OK", "Commande Supprimer ", JOptionPane.INFORMATION_MESSAGE);
				model.loadData("");
				model.fireTableDataChanged();
				 t.revalidate();
			}
		});
		
		btnNewButton.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\16x16\\busy.png"));
		btnNewButton.setBounds(822, 109, 116, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblRechercheCommande = new JLabel("Recherche Commande / Fournisseur :");
		lblRechercheCommande.setBounds(10, 134, 220, 25);
		contentPane.add(lblRechercheCommande);
		
		textcmdparfr = new JTextField();
		textcmdparfr.setBounds(227, 134, 116, 20);
		contentPane.add(textcmdparfr);
		textcmdparfr.setColumns(10);
		
		JButton btnRecherche = new JButton("Recherche");
		btnRecherche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nom = textcmdparfr.getText();
			      TableModelCommande nvmodel = new TableModelCommande(nom);
				  t.setModel(nvmodel);
			}
		});
		btnRecherche.setBounds(374, 134, 100, 23);
		contentPane.add(btnRecherche);
		
	}
}
