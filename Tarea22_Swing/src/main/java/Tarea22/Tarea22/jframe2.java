package Tarea22.Tarea22;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class jframe2 extends JFrame {

	private JPanel contentPane;
	static int opcion2=0,id;
	static String nombre;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframe2 frame = new jframe2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public int getOption() {
		return opcion2;
	}
	
//	public void setId() {
//		JOptionPane.showInputDialog("Inserta el id: ");
//	}
	
	public String getId() {
		return JOptionPane.showInputDialog("Inserta el id: ");
	}
	
	public String getNombre() {
		return JOptionPane.showInputDialog("Inserta el nombre deseado: ");
	}
	
	public void mostrarMensaje(boolean correcto, String mensaje, String mensajeE){
		if (correcto) {
			JOptionPane.showMessageDialog(null, mensaje);
		} else {
			JOptionPane.showMessageDialog(null, mensajeE);
		}
		opcion2=0; //lo igualamos a 0 para que no entre en bucle
	}
	
	public void mostrarArray(Object[][] data){
		String tabla="";
		for (int f=0;f<data.length;f++) {
			for (int c=0;c<data[f].length;c++) {
				tabla+=data[f][c]+"          ";
			}
			tabla+="\n";
		}
		
		JOptionPane.showMessageDialog(null,tabla);
		opcion2=0; //lo igualamos a 0 para que no entre en bucle
	}
	
	/**
	 * Create the frame.
	 */
	public jframe2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton insertButton = new JButton("Añadir registro");
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion2=11;
			}
		});
		insertButton.setBounds(115, 41, 203, 23);
		contentPane.add(insertButton);
		
		JButton idSelectButton = new JButton("Mostrar por id");
		idSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion2=22;
			}
		});
		idSelectButton.setBounds(115, 75, 203, 23);
		contentPane.add(idSelectButton);
		
		JButton selectButton = new JButton("Mostrar tabla");
		selectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion2=33;
			}
		});
		selectButton.setBounds(115, 109, 203, 23);
		contentPane.add(selectButton);
		
		JButton updateButton = new JButton("Modificar registro");
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion2=44;
			}
		});
		updateButton.setBounds(115, 143, 203, 23);
		contentPane.add(updateButton);
		
		JButton salirButton = new JButton("Salir");
		salirButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion2=66;
			}
		});
		salirButton.setBounds(335, 227, 89, 23);
		contentPane.add(salirButton);
		
		JButton deleteButton = new JButton("Eliminar pieza");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion2=55;
			}
		});
		deleteButton.setBounds(115, 177, 203, 23);
		contentPane.add(deleteButton);
	}
}
