package tarea_9;

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
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Tarea9 extends JFrame {

	private JPanel contentPane;
	private JTextField txtApellidos;
	private JTextField txtNombres;
	private JTextField txtPrimerParcial;
	private JTextField txtSegundoParcial;
	private JTextField txtTercerParcial;
	private JTable tbRegistros;
	private JTextField txtPromedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarea9 frame = new Tarea9();
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
	public Tarea9() {
		setTitle("Tarea 9 - Ricardo Vaca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 937, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS ESTUDIANTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(24, 11, 206, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 44, 57, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombres");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 100, 57, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(24, 69, 86, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		txtNombres.setBounds(24, 119, 86, 20);
		contentPane.add(txtNombres);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Materia");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(10, 150, 57, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JComboBox cmbMateria = new JComboBox();
		cmbMateria.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbMateria.setModel(new DefaultComboBoxModel(new String[] {"Base de Datos I", "Filosofia de las Ciencias Computacionales", "Programacion Orientada a Objetos", "Internet de las Cosas", "Redes II", "Sistemas Operativos"}));
		cmbMateria.setToolTipText("");
		cmbMateria.setBounds(10, 175, 133, 22);
		contentPane.add(cmbMateria);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Nota 1er parcial");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(158, 44, 96, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		txtPrimerParcial = new JTextField();
		txtPrimerParcial.setText("0");
		txtPrimerParcial.setColumns(5);
		txtPrimerParcial.setBounds(168, 69, 86, 20);
		contentPane.add(txtPrimerParcial);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Nota 2do parcial");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2_1.setBounds(158, 100, 117, 14);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		txtSegundoParcial = new JTextField();
		txtSegundoParcial.setText("0");
		txtSegundoParcial.setColumns(5);
		txtSegundoParcial.setBounds(168, 119, 86, 20);
		contentPane.add(txtSegundoParcial);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Nota 3er parcial");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2_1_1.setBounds(158, 150, 96, 14);
		contentPane.add(lblNewLabel_1_1_2_1_1);
		
		txtTercerParcial = new JTextField();
		txtTercerParcial.setText("0");
		txtTercerParcial.setColumns(5);
		txtTercerParcial.setBounds(168, 177, 86, 20);
		contentPane.add(txtTercerParcial);
		
		tbRegistros = new JTable();
		tbRegistros.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tbRegistros.setBounds(285, 45, 626, 269);
		contentPane.add(tbRegistros);
		
		JLabel lblRegistros = new JLabel("REGISTROS");
		lblRegistros.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRegistros.setBounds(404, 11, 206, 22);
		contentPane.add(lblRegistros);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restriccion datos = new Restriccion(txtPrimerParcial.getText(), txtSegundoParcial.getText(), txtTercerParcial.getText());
				
				if(datos.validarNota(txtPrimerParcial.getText()) == false && isNumeric(txtPrimerParcial.getText()) == true){
					JOptionPane.showMessageDialog(null, "Notas del primer parcial incorrecta, por favor vuelva a ingresarla");
				} else if(datos.validarNota(txtSegundoParcial.getText()) == false && isNumeric(txtSegundoParcial.getText()) == true){
					JOptionPane.showMessageDialog(null, "Notas del segundo parcial incorrecta, por favor vuelva a ingresarla");
				} else if(datos.validarNota(txtTercerParcial.getText()) == false && isNumeric(txtTercerParcial.getText()) == true){
					JOptionPane.showMessageDialog(null, "Notas del tercer parcial incorrecta, por favor vuelva a ingresarla");
				} else if(txtApellidos.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese los apellidos");
					txtApellidos.requestFocus();
				} else if(txtNombres.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor ingrese los nombres");
					txtNombres.requestFocus();
				} else if(cmbMateria.getSelectedIndex() == -1) {
					JOptionPane.showMessageDialog(null, "Por favor seleccione una materia");
					cmbMateria.requestFocus();
				} else if(txtPromedio.getText().equals("") || txtPromedio.getText().equals("0")) {
					JOptionPane.showMessageDialog(null, "Por favor calcule el promedio");
				} else {
					try {
						FileWriter fw = new FileWriter("Estudiantes.txt", true);	
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(txtApellidos.getText() + " | ");
						bw.write(txtNombres.getText() + " | ");
						bw.write(cmbMateria.getSelectedItem() + " | ");
						bw.write("Parcial 1: " + txtPrimerParcial.getText() + " | ");
						bw.write("Parcial 2: " + txtSegundoParcial.getText() + " | ");
						bw.write("Parcial 3: " + txtTercerParcial.getText() + " | ");
						bw.write("Promedio: " + txtPromedio.getText() + " | ");
						bw.newLine();
						bw.flush();
						
						txtApellidos.setText(" ");
						txtNombres.setText(" ");
						txtPrimerParcial.setText("0");
						txtSegundoParcial.setText("0");
						txtTercerParcial.setText("0");
						txtPromedio.setText("");
					} catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Error de ejecucion!");
					}
				}
				
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(10, 225, 120, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileReader fr = new FileReader("Estudiantes.txt");
					BufferedReader br = new BufferedReader(fr);
					DefaultTableModel modeltable = new DefaultTableModel();
					String linea;
					modeltable.addColumn("");
					while((linea = br.readLine()) != null) {
						modeltable.addRow(new String [] {linea});
					}
					tbRegistros.setModel(modeltable);
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error de ejecucion!");
				}
			}
		});
		btnCargar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCargar.setBounds(677, 12, 89, 23);
		contentPane.add(btnCargar);
		
		txtPromedio = new JTextField();
		txtPromedio.setEditable(false);
		txtPromedio.setBounds(168, 228, 86, 20);
		contentPane.add(txtPromedio);
		txtPromedio.setColumns(5);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Promedio");
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2_1_1_1.setBounds(158, 203, 96, 14);
		contentPane.add(lblNewLabel_1_1_2_1_1_1);
		
		JButton btnCalcular = new JButton("Calcular");
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double promedio = 0;
				if(
						txtPrimerParcial.getText() != "0" && 
						txtSegundoParcial.getText() != "0" && 
						txtTercerParcial.getText() != "0" && 
						isNumeric(txtPrimerParcial.getText()) == true && 
						isNumeric(txtSegundoParcial.getText()) == true && 
						isNumeric(txtTercerParcial.getText()) == true
						) {
					promedio = (Double.parseDouble(txtPrimerParcial.getText()) + Double.parseDouble(txtSegundoParcial.getText()) + Double.parseDouble(txtTercerParcial.getText()) ) / 3;
					promedio = Math.round(promedio * 100.00)/ 100.00;
					txtPromedio.setText(Double.toString(promedio));
				}else {
					txtPromedio.setText("0");
					if(isNumeric(txtPrimerParcial.getText()) == false) {
						JOptionPane.showMessageDialog(null, "La nota del 1er parcial debe ser un numero!");
						txtPrimerParcial.setText("0");
						txtPrimerParcial.requestFocus();
					} else if (isNumeric(txtSegundoParcial.getText()) == false) {
						JOptionPane.showMessageDialog(null, "La nota del 2do parcial debe ser un numero!");
						txtSegundoParcial.setText("0");
						txtSegundoParcial.requestFocus();
					} else if (isNumeric(txtTercerParcial.getText()) == false) {
						JOptionPane.showMessageDialog(null, "La nota del 3er parcial debe ser un numero!");
						txtTercerParcial.setText("0");
						txtTercerParcial.requestFocus();
					}
				}
				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalcular.setBounds(158, 259, 107, 23);
		contentPane.add(btnCalcular);
	}
	
	public static boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
}
