package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import dao.TableModelArticle;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsulerListeArticles extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsulerListeArticles frame = new ConsulerListeArticles(null);
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
	public ConsulerListeArticles(final FicheCommande parent) {
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
		scrollPane.setBounds(5, 11, 707, 324);
		contentPane.add(scrollPane);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				parent.textqte.setText((model.getValueAt(t.getSelectedRow(),5).toString()));
				parent.textref.setText((String)(model.getValueAt(t.getSelectedRow(),1)));
				ConsulerListeArticles.this.setVisible(false);
			}
		});
		btnAjouter.setBounds(752, 11, 89, 23);
		contentPane.add(btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(752, 61, 89, 23);
		contentPane.add(btnModifier);
	}
}
