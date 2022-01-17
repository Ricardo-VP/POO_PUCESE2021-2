package JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setTitle("Mi primer programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero 1:");
		lblNewLabel.setBounds(10, 11, 68, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2:");
		lblNewLabel_1.setBounds(10, 56, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setBounds(10, 105, 67, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNumero1 = new JTextField();
		txtNumero1.setText("0");
		txtNumero1.setBackground(Color.CYAN);
		txtNumero1.setBounds(72, 11, 86, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBackground(Color.CYAN);
		txtNumero2.setText("0");
		txtNumero2.setBounds(72, 53, 86, 20);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBackground(Color.CYAN);
		txtResultado.setText("0");
		txtResultado.setBounds(72, 102, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnSumar = new JButton("SUMAR");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1, n2, r;
				n1 = Double.parseDouble(txtNumero1.getText());
				n2 = Double.parseDouble(txtNumero2.getText());
				r = n1 + n2;
				txtResultado.setText(String.valueOf(r));
			}
		});
		btnSumar.setBounds(197, 7, 89, 23);
		contentPane.add(btnSumar);
		
		JButton btnRestar = new JButton("RESTAR");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1, n2, r;
				n1 = Double.parseDouble(txtNumero1.getText());
				n2 = Double.parseDouble(txtNumero2.getText());
				r = n1 - n2;
				txtResultado.setText(String.valueOf(r));
			}
		});
		btnRestar.setBounds(198, 36, 89, 23);
		contentPane.add(btnRestar);
		
		JButton btnMultiplicar = new JButton("MULTIPLICAR");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1, n2, r;
				n1 = Double.parseDouble(txtNumero1.getText());
				n2 = Double.parseDouble(txtNumero2.getText());
				r = n1 * n2;
				txtResultado.setText(String.valueOf(r));
			}
		});
		btnMultiplicar.setBounds(195, 67, 99, 23);
		contentPane.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("DIVISION");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1, n2, r;
				n1 = Double.parseDouble(txtNumero1.getText());
				n2 = Double.parseDouble(txtNumero2.getText());
				r = n1 / n2;
				txtResultado.setText(String.valueOf(r));
			}
		});
		btnDividir.setBounds(197, 101, 89, 23);
		contentPane.add(btnDividir);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNumero1.setText("0");
				txtNumero2.setText("0");
				txtResultado.setText("0");
			
			}
		});
		btnNuevo.setBounds(309, 7, 89, 23);
		contentPane.add(btnNuevo);
	}
}
