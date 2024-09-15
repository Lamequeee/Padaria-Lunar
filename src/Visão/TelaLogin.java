package Visão;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/paogrande.png")));
		lblNewLabel.setBounds(25, 149, 198, 173);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Padaria");
		lblNewLabel_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1_1_3.setBounds(56, 63, 141, 40);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Lunar");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1_1_1_1.setBounds(56, 346, 99, 40);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/lateral2.png")));
		lblNewLabel_1.setBounds(0, 0, 250, 461);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Usuario");
		lblNewLabel_1_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel_1_1_3_1.setBounds(272, 63, 141, 40);
		contentPane.add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_3_2 = new JLabel("Senha");
		lblNewLabel_1_1_3_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel_1_1_3_2.setBounds(272, 219, 141, 40);
		contentPane.add(lblNewLabel_1_1_3_2);
		
		textField = new JTextField();
		textField.setBounds(398, 74, 226, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(398, 229, 226, 29);
		contentPane.add(passwordField);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(398, 346, 99, 33);
		contentPane.add(btnEntrar);
	}
}
