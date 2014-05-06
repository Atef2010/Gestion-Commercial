package vue;

import gestioncomm.Produit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import dao.ProduitDAO;
import dao.TableModelArticle;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class ListeArticles extends JFrame {

	private JPanel contentPane;
	private JTextField textrechref;
	private JTextField textrechlib;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListeArticles frame = new ListeArticles(null);
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
	public ListeArticles(final FicheCommande parent) {
		setResizable(false);
		setBounds(100, 100, 876, 363);
		this.setTitle("Listes Des Produits ");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		final TableModelArticle model = new TableModelArticle("");
		contentPane.setLayout(null);
		final JTable t = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(t);
		scrollPane.setBounds(5, 85, 707, 250);
		contentPane.add(scrollPane);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\16x16\\plus.png"));
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Article a = new Article();
				a.setVisible(true);
				
			}
		});
		btnAjouter.setBounds(752, 27, 115, 28);
		contentPane.add(btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\pc.de-essen-icon-pack\\16x16\\edit.png"));
		btnModifier.setBounds(752, 69, 115, 28);
		contentPane.add(btnModifier);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Recherche", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(5, 11, 708, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRfrence = new JLabel("R\u00E9f\u00E9rence");
		lblRfrence.setBounds(10, 25, 73, 32);
		panel.add(lblRfrence);
		
		textrechref = new JTextField();
		textrechref.setBounds(99, 25, 108, 26);
		panel.add(textrechref);
		textrechref.setColumns(10);
		
		JButton btnrechref = new JButton("");
		btnrechref.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\16x16\\search.png"));
		btnrechref.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ref = textrechref.getText();
				TableModelArticle nvmodel = new TableModelArticle(ref);
				  t.setModel(nvmodel);
			}
		});
		btnrechref.setBounds(230, 25, 49, 28);
		panel.add(btnrechref);
		
		JLabel lblLibelle = new JLabel("Libelle");
		lblLibelle.setBounds(320, 25, 50, 32);
		panel.add(lblLibelle);
		
		textrechlib = new JTextField();
		textrechlib.setBounds(383, 25, 108, 26);
		panel.add(textrechlib);
		textrechlib.setColumns(10);
		
		JButton btnrechlib = new JButton("");
		btnrechlib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String libelle = textrechlib.getText();
				TableModelArticle nmodel = new TableModelArticle(libelle);
				  t.setModel(nmodel);
			}
		});
		btnrechlib.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\16x16\\search.png"));
		btnrechlib.setBounds(540, 25, 49, 28);
		panel.add(btnrechlib);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Produit p = new Produit();
				
				String id=(model.getValueAt(t.getSelectedRow(),0).toString());
				String ref=(String)(model.getValueAt(t.getSelectedRow(),1));
				String lib=(String)(model.getValueAt(t.getSelectedRow(),2));
				String prixht=(model.getValueAt(t.getSelectedRow(),3).toString());
				String prixttc=(model.getValueAt(t.getSelectedRow(),4).toString());
				String qte=(model.getValueAt(t.getSelectedRow(),5).toString());
				String etat=(String)model.getValueAt(t.getSelectedRow(),6);
			
		        p.setIdp(Integer.parseInt(id));
				p.setRef(ref);
				p.setLib(lib);
				p.setPrix_ht(Float.parseFloat(prixht));
				p.setPrix_ttc(Float.parseFloat(prixttc));
				p.setQteprod(Integer.parseInt(qte));
				p.setEtat(etat);
				
				new ProduitDAO().delete(p);
				JOptionPane.showMessageDialog(null, "Produit Supprimer ", "OK", JOptionPane.INFORMATION_MESSAGE);
				model.loadData("");
				model.fireTableDataChanged();
				t.revalidate();
			}
		});
		btnSupprimer.setIcon(new ImageIcon("D:\\WorksSapceZE\\Gestion-Commercial\\GestionCommercial\\design_icons\\pc.de-essen-icon-pack\\16x16\\busy.png"));
		btnSupprimer.setBounds(752, 110, 115, 28);
		contentPane.add(btnSupprimer);
	}
}
