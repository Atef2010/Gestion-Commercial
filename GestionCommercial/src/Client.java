import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

public class Client extends JFrame {


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
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
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
	public Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 420);
		this.setTitle("Client");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCode = new JLabel("CIN");
		lblCode.setBounds(10, 43, 46, 14);
		contentPane.add(lblCode);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(10, 85, 46, 14);
		contentPane.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(10, 138, 46, 14);
		contentPane.add(lblPrenom);
		
		JLabel lblCodePostal = new JLabel("Code Postal");
		lblCodePostal.setBounds(10, 217, 69, 14);
		contentPane.add(lblCodePostal);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone");
		lblTlphone.setBounds(10, 270, 69, 14);
		contentPane.add(lblTlphone);
		
		JLabel lblFax = new JLabel("Fax");
		lblFax.setBounds(10, 320, 46, 14);
		contentPane.add(lblFax);
		
		textField = new JTextField();
		textField.setBounds(103, 40, 126, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 82, 126, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(103, 135, 126, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(103, 214, 126, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(103, 267, 126, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(103, 317, 126, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(352, 217, 58, 14);
		contentPane.add(lblAdresse);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setBounds(352, 270, 46, 14);
		contentPane.add(lblVille);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(352, 320, 46, 14);
		contentPane.add(lblEmail);
		
		textField_6 = new JTextField();
		textField_6.setBounds(445, 214, 126, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(445, 267, 126, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(445, 317, 126, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(586, 39, 89, 23);
		contentPane.add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(586, 81, 89, 23);
		contentPane.add(btnAnnuler);
	}
}
