package Tarea22.Tarea22;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class jframe extends JFrame {

	private JPanel contentPane;
	private JButton insDataPackButton;
	private JButton dropTblButton;
	private JButton CRUDButton;
	private JButton salirButton;
	static int opcion,id;
	String nombre;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframe frame = new jframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void mostrarMensaje(boolean correcto, String mensaje, String mensajeE){
		if (correcto) {
			JOptionPane.showMessageDialog(null, mensaje);
		} else {
			JOptionPane.showMessageDialog(null, mensajeE);
		}
		opcion=0; //lo igualamos a 0 para que no entre en bucle
	}
	
	public int getOpcion() {
		return opcion;
	}
	
	public String getNombre() {
		return JOptionPane.showInputDialog("Inserta el nombre deseado: ");
	}
	
	public void exit() {
		System.exit(0);
	}
	
	/**
	 * Create the frame.
	 */
	public jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton resButton = new JButton("Resetear tabla");
		resButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion=1;
			}
		});
		resButton.setBounds(148, 58, 198, 23);
		contentPane.add(resButton);
		
		insDataPackButton = new JButton("Insertar paquete de datos");
		insDataPackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion=2;
			}
		});
		insDataPackButton.setBounds(148, 92, 198, 23);
		contentPane.add(insDataPackButton);
		
		dropTblButton = new JButton("Eliminar tabla");
		dropTblButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion=3;
			}
		});
		dropTblButton.setBounds(148, 126, 198, 23);
		contentPane.add(dropTblButton);
		
		CRUDButton = new JButton("CRUD");
		CRUDButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion=4;
			}
		});
		CRUDButton.setBounds(148, 160, 198, 23);
		contentPane.add(CRUDButton);
		
		salirButton = new JButton("Salir");
		salirButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion=5;
				System.exit(0);
			}
		});
		salirButton.setBounds(438, 274, 89, 23);
		contentPane.add(salirButton);
	}
}
