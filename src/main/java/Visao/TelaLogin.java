package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.PessoaDAO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Modelo.Pessoa;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textLogin;
	private JPasswordField passwordSenha;
	private PessoaDAO pessDAO = PessoaDAO.getInstancia();
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
		
		textLogin = new JTextField();
		textLogin.setBounds(398, 74, 226, 29);
		contentPane.add(textLogin);
		textLogin.setColumns(10);
		
		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(398, 229, 226, 29);
		contentPane.add(passwordSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Pega a string senha do TextField
				String login = textLogin.getText();

				// Pega o vetor de senha do TextField
				char[] pass = passwordSenha.getPassword();

				// Cria uma variável senha pra colocar o vetor
				String senha = "";

				// Se o vetor de senha não for nulo e maior do que 0...
				if (pass != null && pass.length > 0) {
					// Atribui o vetor pra uma variavel senha
					senha = String.valueOf(pass);
				}
				
				if (senha.isEmpty() && login.isEmpty()) {
					System.out.printf("Insira seus dados0");
				} else if (senha.isEmpty()) {
					// Exibe mensagem de erro
					System.out.printf("Insira sua senha");
				} else if (login.isEmpty()) {
					// Exibe mensagem de erro
					System.out.printf("Insira seus login");
				} else {
					// Cria obj Funcionário para atribuir login e senha
					Pessoa testelogin = new Pessoa();
					testelogin.setUsuario(login);
					testelogin.setSenha(senha);

					// Cria uma variavel boolean login1 que verifica se há o usuário no banco
					Pessoa funcTesteLogin = pessDAO.login(testelogin);

					// Se o valor retornado pela função ser true
					if (funcTesteLogin != null) {
						// Passa para a proxima tela
						TelaInicial telaPrincipal = new TelaInicial();
						dispose();
						telaPrincipal.setVisible(true);
						
					} else {
						// Exibe mensagem de erro
						JOptionPane.showMessageDialog(null, "Usuario ou senha errados");
					
					}

				}

			}
		});
		btnEntrar.setBounds(398, 346, 99, 33);
		contentPane.add(btnEntrar);
		
	}
}
