package Visão;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(TelaInicial.class.getResource("/Imagens/lista.png")));
		lblNewLabel_3.setBounds(10, 223, 40, 40);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Padaria");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1_1.setBounds(53, 11, 141, 40);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Bem-vindo");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(433, 69, 194, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<usuario>");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(461, 120, 141, 54);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Lunar");
		lblNewLabel_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1_1_1.setBounds(63, 62, 99, 40);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Lista de alimentos");
		lblNewLabel_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaHistorico Historico = new TelaHistorico();
				Historico.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(53, 223, 194, 40);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Cadastro de alimentos");
		lblNewLabel_1_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaCrudAlimento CrudAlimento = new TelaCrudAlimento();
				CrudAlimento.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_1.setBounds(53, 311, 194, 40);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Cadastro de funcionario");
		lblNewLabel_1_1_2_2.addMouseListener(new MouseAdapter() {
			@Override
			//QUANDO CLICAR COM O MOUSE NA OPÇÃO...
			public void mouseClicked(MouseEvent e) {
				//Chama a tela que eu quero abrir
				TelaCrudFuncionario CrudFuncionario = new TelaCrudFuncionario();
				//Deixa visivel a tela que eu quero abrir
				CrudFuncionario.setVisible(true);
				//fecha a tela que eu estou no momento
				dispose();
			}
		});
		lblNewLabel_1_1_2_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2.setBounds(53, 400, 194, 40);
		contentPane.add(lblNewLabel_1_1_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon(TelaInicial.class.getResource("/Imagens/pessoausuario.png")));
		lblNewLabel_3_2.setBounds(10, 400, 40, 40);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(TelaInicial.class.getResource("/Imagens/pao.png")));
		lblNewLabel_3_1.setBounds(10, 311, 40, 40);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_1_2_2_1 = new JLabel("Sair");
		lblNewLabel_1_1_2_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaLogin Login = new TelaLogin();
				Login.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1_1_2_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1.setBounds(53, 560, 40, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1);
		
		JLabel lblNewLabel_1_1_2_2_1_1 = new JLabel("");
		lblNewLabel_1_1_2_2_1_1.setIcon(new ImageIcon(TelaInicial.class.getResource("/Imagens/sair.png")));
		lblNewLabel_1_1_2_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_1.setBounds(10, 560, 40, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaInicial.class.getResource("/Imagens/lateral2.png")));
		lblNewLabel.setBounds(0, 0, 250, 611);
		contentPane.add(lblNewLabel);
	}
}
