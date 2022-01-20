package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class vista extends JFrame {

	private JPanel contentPane;
	public JTextField txtNumero1;
	public JTextField txtNumero2;
	public JTextField txtResultado;
	public JButton btnSumar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vista frame = new vista();
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
	public vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N\u00DAMERO 1:");
		lblNewLabel.setBounds(32, 42, 90, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00DAMERO 2:");
		lblNewLabel_1.setBounds(32, 102, 90, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("REULTADO:");
		lblNewLabel_2.setBounds(32, 169, 90, 16);
		contentPane.add(lblNewLabel_2);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(149, 39, 116, 22);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(149, 99, 116, 22);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setEnabled(false);
		txtResultado.setBounds(149, 166, 116, 22);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		btnSumar = new JButton("SUMAR");
		btnSumar.setBounds(32, 243, 97, 25);
		contentPane.add(btnSumar);
	}
}
