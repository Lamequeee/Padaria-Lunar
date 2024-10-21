package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaHistorico extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaHistorico frame = new TelaHistorico();
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
	public TelaHistorico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Padaria");
		lblNewLabel_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1_1_3.setBounds(56, 11, 141, 40);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Lunar");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1_1_1_1.setBounds(66, 62, 99, 40);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setIcon(new ImageIcon(TelaHistorico.class.getResource("/Imagens/lista.png")));
		lblNewLabel_3_3.setBounds(13, 223, 40, 40);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_1_1_2_3 = new JLabel("Lista de alimentos");
		lblNewLabel_1_1_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Chama a tela que eu quero abrir
				TelaHistorico Historico= new TelaHistorico();
				//Deixa visivel a tela que eu quero abrir
				Historico.setVisible(true);
				//fecha a tela que eu estou no momento
				dispose();
			}
		});
		lblNewLabel_1_1_2_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_3.setBounds(56, 223, 194, 40);
		contentPane.add(lblNewLabel_1_1_2_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon(TelaHistorico.class.getResource("/Imagens/pao.png")));
		lblNewLabel_3_1_1.setBounds(13, 311, 40, 40);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Cadastro de alimentos");
		lblNewLabel_1_1_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Chama a tela que eu quero abrir
				TelaCrudAlimento CrudAlimento= new TelaCrudAlimento();
				//Deixa visivel a tela que eu quero abrir
				CrudAlimento.setVisible(true);
				//fecha a tela que eu estou no momento
				dispose();
			}
		});
		lblNewLabel_1_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_1_1.setBounds(56, 311, 194, 40);
		contentPane.add(lblNewLabel_1_1_2_1_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("");
		lblNewLabel_3_2_1.setIcon(new ImageIcon(TelaHistorico.class.getResource("/Imagens/pessoausuario.png")));
		lblNewLabel_3_2_1.setBounds(13, 400, 40, 40);
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_1_1_2_2_2 = new JLabel("Cadastro de funcionario");
		lblNewLabel_1_1_2_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Chama a tela que eu quero abrir
				TelaCrudFuncionario CrudFuncionario = new TelaCrudFuncionario();
				//Deixa visivel a tela que eu quero abrir
				CrudFuncionario.setVisible(true);
				//fecha a tela que eu estou no momento
				dispose();
			}
		});
		lblNewLabel_1_1_2_2_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_2.setBounds(56, 400, 194, 40);
		contentPane.add(lblNewLabel_1_1_2_2_2);
		
		JLabel lblNewLabel_1_1_2_2_1_1_1 = new JLabel("");
		lblNewLabel_1_1_2_2_1_1_1.setIcon(new ImageIcon(TelaHistorico.class.getResource("/Imagens/sair.png")));
		lblNewLabel_1_1_2_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_1_1.setBounds(13, 560, 40, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_1_1);
		
		JLabel lblNewLabel_1_1_2_2_1_2_1 = new JLabel("Sair");
		lblNewLabel_1_1_2_2_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaInicial Inicio = new TelaInicial();
				Inicio.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1_1_2_2_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_2_1.setBounds(56, 560, 40, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_2_1);
		
		JLabel lblNewLabel_1_1_2_2_1_3_1 = new JLabel("Total");
		lblNewLabel_1_1_2_2_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_3_1.setBounds(642, 11, 48, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_3_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(688, 24, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaHistorico.class.getResource("/Imagens/lateral2.png")));
		lblNewLabel_1.setBounds(0, 0, 250, 611);
		contentPane.add(lblNewLabel_1);
		
		//CRIA O SCRILLPANE, QUE É ONDE O TABLE FICARA " DENTRO "
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(270, 80, 501, 520);
		contentPane.add(scrollPane);
		//CHAMA O TABLE, QUE FOI CRIADO ATRAVES DO: PRIVATE JTable table NAS PRIMEIRAS LINHAS
		table = new JTable();
		
		//CRIA O MODELO DO TABLE
		table.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[] {
					//AQUI É O NOME DAS COLUNAS CRIADAS, PODE SER ALTURADO A QUANTIDADE E NOME POR AQUI
					"Alimento", "Data", "Valor"
						 }
		));
		
		table.setFont(new Font("Krona One", Font.PLAIN, 11));
		scrollPane.setViewportView(table);
	}

}
