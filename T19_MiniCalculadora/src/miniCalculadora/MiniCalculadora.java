package miniCalculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MiniCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField operador2;
	private JTextField operador1;
	private JTextField resultado;
	double num1,num2,resultOp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniCalculadora frame = new MiniCalculadora();
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
	public MiniCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		operador1 = new JTextField();
		operador1.setBounds(84, 51, 86, 20);
		contentPane.add(operador1);
		operador1.setColumns(10);
		
		operador2 = new JTextField();
		operador2.setBounds(261, 51, 86, 20);
		contentPane.add(operador2);
		operador2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Número 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(84, 26, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número 2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(261, 26, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton sumButton = new JButton("+");
		sumButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(operador1.getText());
				num2=Double.parseDouble(operador2.getText());
				resultOp=num1+num2;
				resultado.setText(String.valueOf(resultOp));
			}
		});
		sumButton.setBounds(84, 112, 89, 23);
		contentPane.add(sumButton);
		
		JButton resButton = new JButton("-");
		resButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(operador1.getText());
				num2=Double.parseDouble(operador2.getText());
				resultOp=num1-num2;
				resultado.setText(String.valueOf(resultOp));
			}
		});
		resButton.setBounds(261, 112, 89, 23);
		contentPane.add(resButton);
		
		JButton multButton = new JButton("x");
		multButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(operador1.getText());
				num2=Double.parseDouble(operador2.getText());
				resultOp=num1*num2;
				resultado.setText(String.valueOf(resultOp));
			}
		});
		multButton.setBounds(258, 161, 89, 23);
		contentPane.add(multButton);
		
		JButton divButton = new JButton("÷");
		divButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(operador1.getText());
				num2=Double.parseDouble(operador2.getText());
				resultOp=num1/num2;
				resultado.setText(String.valueOf(resultOp));
			}
		});
		divButton.setBounds(84, 161, 89, 23);
		contentPane.add(divButton);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(174, 195, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		resultado = new JTextField();
		resultado.setBounds(174, 220, 86, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
		});
		btnNewButton.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton);
	}
}
