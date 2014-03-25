import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;


public class FicheProduit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FicheProduit frame = new FicheProduit();
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
	public FicheProduit() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 420);
		this.setTitle("Fiche Produit");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_5206855803794");
		panel.setLayout(null);
		
		JLabel lblRfrence = new JLabel("R\u00E9f\u00E9rence ");
		lblRfrence.setBounds(10, 51, 68, 14);
		panel.add(lblRfrence);
		
		JLabel lblFournisseur = new JLabel("Fournisseur");
		lblFournisseur.setBounds(10, 94, 68, 14);
		panel.add(lblFournisseur);
		
		textField = new JTextField();
		textField.setBounds(88, 48, 112, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 88, 112, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLibell = new JLabel("Libell\u00E9");
		lblLibell.setBounds(274, 51, 46, 14);
		panel.add(lblLibell);
		
		JLabel lblQuantitDeProduit = new JLabel("Quantit\u00E9 de Produit");
		lblQuantitDeProduit.setBounds(274, 94, 112, 14);
		panel.add(lblQuantitDeProduit);
		
		textField_2 = new JTextField();
		textField_2.setBounds(390, 48, 112, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(390, 88, 112, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblMarque = new JLabel("Marque");
		lblMarque.setBounds(10, 175, 46, 14);
		panel.add(lblMarque);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(10, 221, 46, 14);
		panel.add(lblType);
		
		JLabel lblFamille = new JLabel("Famille");
		lblFamille.setBounds(10, 268, 46, 14);
		panel.add(lblFamille);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(88, 172, 112, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(88, 218, 112, 20);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(88, 265, 112, 20);
		panel.add(comboBox_2);
		
		JLabel lblTva = new JLabel("TVA");
		lblTva.setBounds(274, 175, 46, 14);
		panel.add(lblTva);
		
		JLabel lblPrixht = new JLabel("PrixHT");
		lblPrixht.setBounds(274, 221, 46, 14);
		panel.add(lblPrixht);
		
		JLabel lblPrixttc = new JLabel("PrixTTC");
		lblPrixttc.setBounds(274, 268, 46, 14);
		panel.add(lblPrixttc);
		
		textField_4 = new JTextField();
		textField_4.setBounds(390, 172, 112, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(390, 218, 112, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(390, 265, 112, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(156, 337, 89, 23);
		panel.add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(288, 337, 89, 23);
		panel.add(btnAnnuler);
	}
}
