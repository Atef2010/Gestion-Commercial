import java.awt.BorderLayout;
import java.awt.EventQueue;

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


public class Commande extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Commande frame = new Commande();
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
	public Commande() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 415);
		this.setTitle("Commande");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCin = new JLabel("CIN");
		lblCin.setBounds(10, 43, 46, 14);
		contentPane.add(lblCin);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(10, 83, 46, 14);
		contentPane.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(10, 125, 46, 14);
		contentPane.add(lblPrenom);
		
		textField = new JTextField();
		textField.setBounds(66, 40, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 80, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 122, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNDeCommande = new JLabel("N\u00B0 de Commande");
		lblNDeCommande.setBounds(200, 43, 102, 14);
		contentPane.add(lblNDeCommande);
		
		textField_3 = new JTextField();
		textField_3.setBounds(314, 40, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(206, 83, 46, 14);
		contentPane.add(lblDate);
		
		textField_4 = new JTextField();
		textField_4.setBounds(314, 80, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblRfrence = new JLabel("R\u00E9f\u00E9rence");
		lblRfrence.setBounds(444, 43, 68, 14);
		contentPane.add(lblRfrence);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9");
		lblQuantit.setBounds(444, 83, 68, 14);
		contentPane.add(lblQuantit);
		
		JLabel lblRemise = new JLabel("Remise");
		lblRemise.setBounds(444, 125, 46, 14);
		contentPane.add(lblRemise);
		
		textField_5 = new JTextField();
		textField_5.setBounds(521, 80, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(521, 122, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(522, 40, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTotalHt = new JLabel("Total HT");
		lblTotalHt.setBounds(653, 43, 67, 14);
		contentPane.add(lblTotalHt);
		
		JLabel lblTotalTva = new JLabel("Total TVA");
		lblTotalTva.setBounds(653, 83, 67, 14);
		contentPane.add(lblTotalTva);
		
		JLabel lblTotalTtc = new JLabel("Total TTC");
		lblTotalTtc.setBounds(653, 125, 67, 14);
		contentPane.add(lblTotalTtc);
		
		textField_8 = new JTextField();
		textField_8.setBounds(730, 40, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(730, 80, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(730, 122, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
	}
}
