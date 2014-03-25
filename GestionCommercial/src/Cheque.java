import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToolBar;


public class Cheque extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cheque frame = new Cheque();
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
	public Cheque() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNDeCheque = new JLabel("N\u00B0 de Cheque");
		lblNDeCheque.setBounds(10, 49, 83, 14);
		contentPane.add(lblNDeCheque);
		
		JLabel lblMontant = new JLabel("Montant");
		lblMontant.setBounds(10, 96, 54, 14);
		contentPane.add(lblMontant);
		
		textField = new JTextField();
		textField.setBounds(126, 46, 100, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 93, 100, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBonque = new JLabel("Bonque");
		lblBonque.setBounds(326, 49, 46, 14);
		contentPane.add(lblBonque);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(326, 96, 46, 14);
		contentPane.add(lblDate);
		
		textField_2 = new JTextField();
		textField_2.setBounds(412, 46, 100, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(412, 93, 100, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(573, 45, 89, 23);
		contentPane.add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(573, 87, 89, 23);
		contentPane.add(btnAnnuler);
	}
}
