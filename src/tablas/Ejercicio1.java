package tablas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCedula;
	private JTextField txtApellidos;
	private JTextField txtNombres;
	private JTextField txtSalario;
	private JTable tblDatos;

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
		setTitle("DATOS DE USUARIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CEDULA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 30, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblApellidos = new JLabel("APELLIDOS");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellidos.setBounds(10, 72, 74, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblNombres = new JLabel("NOMBRES");
		lblNombres.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombres.setBounds(10, 113, 74, 14);
		contentPane.add(lblNombres);
		
		JLabel lblGenero = new JLabel("GENERO");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGenero.setBounds(10, 159, 74, 14);
		contentPane.add(lblGenero);
		
		JLabel lblSalario = new JLabel("SALARIO");
		lblSalario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSalario.setBounds(10, 212, 74, 14);
		contentPane.add(lblSalario);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(82, 27, 86, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(82, 69, 86, 20);
		contentPane.add(txtApellidos);
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		txtNombres.setBounds(82, 110, 86, 20);
		contentPane.add(txtNombres);
		
		txtSalario = new JTextField();
		txtSalario.setText("0");
		txtSalario.setColumns(10);
		txtSalario.setBounds(82, 209, 86, 20);
		contentPane.add(txtSalario);
		
		JComboBox cmbGenero = new JComboBox();
		cmbGenero.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		cmbGenero.setBounds(82, 155, 86, 22);
		contentPane.add(cmbGenero);
		
		tblDatos = new JTable();
		tblDatos.setBounds(210, 30, 450, 267);
		contentPane.add(tblDatos);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restriccion datos = new Restriccion(txtCedula.getText(), txtSalario.getText());
				// Validacion de cedula
				if(datos.validarCedula(txtCedula.getText()) == false ) {
					JOptionPane.showMessageDialog(null, "Cedula incorrecta, por favor vuelva a ingresarla");
					txtCedula.setText(" ");
					txtCedula.requestFocus();
				}else if(txtApellidos.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese los apellidos");
					txtApellidos.requestFocus();
				}else if(txtNombres.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese los nombres");
					txtNombres.requestFocus();
				}else if(datos.validarSalario(txtSalario.getText()) == false) {
					JOptionPane.showMessageDialog(null, "Salario incorrecto, por favor vuelva a ingresarlo");
					txtSalario.setText("0");
					txtSalario.requestFocus();
				} else {
					try {
						FileWriter fw = new FileWriter("Trabajadores.txt", true);	
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(txtCedula.getText() + " ");
						bw.write(txtApellidos.getText() + " ");
						bw.write(txtNombres.getText() + " ");
						bw.write(cmbGenero.getSelectedItem() + " ");
						bw.write(txtSalario.getText() + " ");
						bw.newLine();
						bw.flush();
						JOptionPane.showMessageDialog(null, "Se guardó con éxito!");
						txtCedula.setText(" ");
						txtApellidos.setText(" ");
						txtNombres.setText(" ");
						txtSalario.setText("0");
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Error de ejecucion!");
					}
				}
			}
		});
		btnGuardar.setBounds(57, 254, 114, 23);
		contentPane.add(btnGuardar);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileReader fr = new FileReader("Trabajadores.txt");
					BufferedReader br = new BufferedReader(fr);
					DefaultTableModel modeltable = new DefaultTableModel();
					String linea;
					modeltable.addColumn("");
					while((linea = br.readLine()) != null) {
						modeltable.addRow(new String [] {linea});
					}
					tblDatos.setModel(modeltable);
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error de ejecucion!");
				}
			}
		});
		btnMostrar.setBounds(571, 308, 89, 23);
		contentPane.add(btnMostrar);
	}
}
