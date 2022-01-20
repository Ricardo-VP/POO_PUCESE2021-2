package tarea_10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tarea10 extends JFrame {
	
	private double TOTALSINIVA = 0;
	private double TOTALCONIVA = 0;
	private double TOTALIVA = 0;
	private double PRECIOUNIDAD = 0;

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextField txtPU;
	private JTextField txtTotalUnidad;
	private JTextField txtTotalSinIva;
	private JTextField txtIVA;
	private JTextField txtTotalConIVA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarea10 frame = new Tarea10();
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
	public Tarea10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 370);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cmbElectrodomestico = new JComboBox();
		cmbElectrodomestico.setBounds(20, 36, 173, 22);
		contentPane.add(cmbElectrodomestico);
		cmbElectrodomestico.setModel(new DefaultComboBoxModel(Electrodomesticos.values()));
		
		JLabel lblNewLabel = new JLabel("Electrodomestico");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 151, 14);
		contentPane.add(lblNewLabel);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(20, 94, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCantidad.setBounds(20, 69, 151, 14);
		contentPane.add(lblCantidad);
		
		JLabel lblPrecioUnitario = new JLabel("Precio Unitario");
		lblPrecioUnitario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrecioUnitario.setBounds(20, 132, 151, 14);
		contentPane.add(lblPrecioUnitario);
		
		txtPU = new JTextField();
		txtPU.setColumns(10);
		txtPU.setBounds(20, 157, 86, 20);
		contentPane.add(txtPU);
		
		JLabel lblPrecioTotal = new JLabel("Total");
		lblPrecioTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrecioTotal.setBounds(20, 188, 86, 14);
		contentPane.add(lblPrecioTotal);
		
		txtTotalUnidad = new JTextField();
		txtTotalUnidad.setEditable(false);
		txtTotalUnidad.setBounds(20, 213, 86, 20);
		contentPane.add(txtTotalUnidad);
		txtTotalUnidad.setColumns(10);
		
		JLabel lblPrecioTotalsuma = new JLabel("Precio Total sin IVA");
		lblPrecioTotalsuma.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrecioTotalsuma.setBounds(181, 132, 151, 14);
		contentPane.add(lblPrecioTotalsuma);
		
		txtTotalSinIva = new JTextField();
		txtTotalSinIva.setEditable(false);
		txtTotalSinIva.setColumns(10);
		txtTotalSinIva.setBounds(191, 157, 86, 20);
		contentPane.add(txtTotalSinIva);
		
		JLabel lblIva = new JLabel("IVA");
		lblIva.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIva.setBounds(181, 69, 151, 14);
		contentPane.add(lblIva);
		
		txtIVA = new JTextField();
		txtIVA.setEditable(false);
		txtIVA.setColumns(10);
		txtIVA.setBounds(191, 94, 86, 20);
		contentPane.add(txtIVA);
		
		JLabel lblPrecioTotalCon = new JLabel("Precio Total con IVA");
		lblPrecioTotalCon.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrecioTotalCon.setBounds(181, 190, 151, 14);
		contentPane.add(lblPrecioTotalCon);
		
		txtTotalConIVA = new JTextField();
		txtTotalConIVA.setEditable(false);
		txtTotalConIVA.setColumns(10);
		txtTotalConIVA.setBounds(191, 213, 86, 20);
		contentPane.add(txtTotalConIVA);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean comprobarTxtCantidad = txtCantidad.getText().matches("-?\\d+");
				boolean comprobarTxtPU = txtPU.getText().matches("[+-]?\\d*(\\.\\d+)?");
				if(comprobarTxtCantidad == false) {
					JOptionPane.showMessageDialog(null, "Por favor vuelva a ingresar la cantidad.");
				} else if(comprobarTxtPU == false) {
					JOptionPane.showMessageDialog(null, "Por favor vuelva a ingresar el precio unitario.");
				} else {
					double precioUnitario = Double.parseDouble(txtCantidad.getText()) * Double.parseDouble(txtPU.getText());
					PRECIOUNIDAD = precioUnitario;
					txtTotalUnidad.setText("$" +Double.toString(precioUnitario));
					txtCantidad.setText("");
					txtPU.setText("");
				}
			}
		});
		btnCalcular.setBackground(Color.GREEN);
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCalcular.setBounds(20, 254, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCantidad.setText("");
				txtPU.setText("");
				txtTotalUnidad.setText("");
				txtIVA.setText("");
				txtTotalSinIva.setText("");
				txtTotalConIVA.setText("");
				
				TOTALSINIVA = 0;
				TOTALIVA = 0;
				TOTALCONIVA = 0;
				PRECIOUNIDAD = 0;
				
			}
		});
		btnNuevo.setBackground(Color.RED);
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevo.setBounds(246, 9, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtTotalUnidad.getText().matches("")) {
					JOptionPane.showMessageDialog(null, "Por favor calcule el precio unitario!");
				}else {
					
					TOTALSINIVA += Math.round(PRECIOUNIDAD * 100.00) / 100.00;
					TOTALCONIVA += Math.round((PRECIOUNIDAD + (PRECIOUNIDAD*0.12)) * 100.00)/ 100.00;
					TOTALIVA += Math.round((PRECIOUNIDAD*0.12) * 100.00)/100.00;
					
					txtTotalSinIva.setText("$" + Double.toString(Math.round(TOTALSINIVA * 100.00) / 100.00));
					txtTotalConIVA.setText("$" + Double.toString(Math.round(TOTALCONIVA * 100.00) / 100.00));
					txtIVA.setText("$" + Double.toString(Math.round(TOTALIVA * 100.00) / 100.00));
				
					txtTotalUnidad.setText("");
					PRECIOUNIDAD = 0;
				}
			}
		});
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgregar.setBackground(Color.GREEN);
		btnAgregar.setBounds(191, 244, 89, 23);
		contentPane.add(btnAgregar);
	}
	
}
