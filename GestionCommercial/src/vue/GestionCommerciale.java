package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import javax.swing.JLabel;

public class GestionCommerciale extends JFrame {

	private JPanel contentPane;

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
		setTitle("Gestion Commerciale");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		mnFournisseur.add(mntmAjouterFournisseur);
		
		JMenuItem mntmModifierFournisseur = new JMenuItem("Modifier Fournisseur");
		mnFournisseur.add(mntmModifierFournisseur);
		
		JMenuItem mntmSupprimerFournisseur = new JMenuItem("Supprimer Fournisseur");
		mnFournisseur.add(mntmSupprimerFournisseur);
		
		JMenuItem mntmConsulterFournisseur = new JMenuItem("Consulter Fournisseur");
		mnFournisseur.add(mntmConsulterFournisseur);
		
		JMenu mnArticle = new JMenu("Article");
		menuBar.add(mnArticle);
		
		JMenu mnFacture = new JMenu("Facture");
		menuBar.add(mnFacture);
		
		JMenu mnCommande = new JMenu("Commande");
		menuBar.add(mnCommande);
		
		JMenu mnPaiement = new JMenu("Paiement");
		menuBar.add(mnPaiement);
		
		JMenu mnStock = new JMenu("Stock");
		menuBar.add(mnStock);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\real\\Desktop\\1900449_1386007028337202_2064983812_o.jpg"));
		lblNewLabel.setBounds(0, 0, 950, 675);
		contentPane.add(lblNewLabel);
	}
}
