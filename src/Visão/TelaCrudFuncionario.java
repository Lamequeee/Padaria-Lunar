package Visão;

import java.awt.EventQueue;
import javax.swing.border.LineBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCrudFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JTextField textSenha;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCrudFuncionario frame = new TelaCrudFuncionario();
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
	public TelaCrudFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		LineBorder redBorder = new LineBorder(Color.RED);
		
		JLabel lblNewLabel_1_1_2_2_1 = new JLabel("Usuario");
		lblNewLabel_1_1_2_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1.setBounds(260, 11, 67, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(TelaCrudFuncionario.class.getResource("/Imagens/lista.png")));
		lblNewLabel_3.setBounds(13, 223, 40, 40);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Lista de alimentos");
		lblNewLabel_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Chama a tela que eu quero abrir
				TelaHistorico Historico = new TelaHistorico();
				//Deixa visivel a tela que eu quero abrir
				Historico.setVisible(true);
				//fecha a tela que eu estou no momento
				dispose();
			}
		});
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(56, 223, 194, 40);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(TelaCrudFuncionario.class.getResource("/Imagens/pao.png")));
		lblNewLabel_3_1.setBounds(13, 311, 40, 40);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Cadastro de alimentos");
		lblNewLabel_1_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Chama a tela que eu quero abrir
				TelaCrudAlimento CrudAlimento = new TelaCrudAlimento();
				//Deixa visivel a tela que eu quero abrir
				CrudAlimento.setVisible(true);
				//fecha a tela que eu estou no momento
				dispose();
			}
		});
		lblNewLabel_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_1.setBounds(56, 311, 194, 40);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon(TelaCrudFuncionario.class.getResource("/Imagens/pessoausuario.png")));
		lblNewLabel_3_2.setBounds(13, 400, 40, 40);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Cadastro de funcionario");
		lblNewLabel_1_1_2_2.addMouseListener(new MouseAdapter() {
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
		lblNewLabel_1_1_2_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2.setBounds(56, 400, 194, 40);
		contentPane.add(lblNewLabel_1_1_2_2);
		
		JLabel lblNewLabel_1_1_2_2_1_1 = new JLabel("");
		lblNewLabel_1_1_2_2_1_1.setIcon(new ImageIcon(TelaCrudFuncionario.class.getResource("/Imagens/sair.png")));
		lblNewLabel_1_1_2_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_1.setBounds(13, 560, 40, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_1);
		
		JLabel lblNewLabel_1_1_2_2_1_2 = new JLabel("Sair");
		lblNewLabel_1_1_2_2_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaInicial Inicio = new TelaInicial();
				Inicio.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1_1_2_2_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_2.setBounds(56, 560, 40, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Padaria");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1_1.setBounds(56, 11, 141, 40);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Lunar");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1_1_1.setBounds(66, 62, 99, 40);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCrudFuncionario.class.getResource("/Imagens/lateral2.png")));
		lblNewLabel.setBounds(0, 0, 250, 611);
		contentPane.add(lblNewLabel);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(331, 24, 86, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblNewLabel_1_1_2_2_1_3 = new JLabel("Senha");
		lblNewLabel_1_1_2_2_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_3.setBounds(440, 11, 67, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_3);
		
		textSenha = new JTextField();
		textSenha.setColumns(10);
		textSenha.setBounds(511, 24, 86, 20);
		contentPane.add(textSenha);
		
		JLabel lblNewLabel_1_1_2_2_1_4 = new JLabel("Cargo");
		lblNewLabel_1_1_2_2_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_4.setBounds(614, 11, 67, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_4);
		
		//DAQUI PARA BAIXO FOI UM CODIGO PRONTO PELA MINHA ANTIGA PROFESSORA...
		//CRIA O SCRILLPANE, QUE É ONDE O TABLE FICARA " DENTRO "
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(270, 99, 501, 501);
		contentPane.add(scrollPane);
		//CHAMA O TABLE, QUE FOI CRIADO ATRAVES DO: PRIVATE JTable table NAS PRIMEIRAS LINHAS
		table = new JTable();
		
		//CRIA O MODELO DO TABLE
		table.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[] {
					//AQUI É O NOME DAS COLUNAS CRIADAS, PODE SER ALTURADO A QUANTIDADE E NOME POR AQUI
					"Usuario", "Senha", "Cargo"
						 }
		));
		
		table.setFont(new Font("Krona One", Font.PLAIN, 11));
		scrollPane.setViewportView(table);
		
		JComboBox CBCargo = new JComboBox();
		CBCargo.setModel(new DefaultComboBoxModel(new String[] {"Funcionario", "Gerente"}));
		CBCargo.setBounds(682, 23, 89, 22);
		contentPane.add(CBCargo);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textUsuario.getText().trim().equals("") || textSenha.getText().trim().equals("") || CBCargo.getSelectedIndex() == 0){
								
					if (textUsuario.getText().trim().equals("")) {
						textUsuario.setBorder(redBorder);
					}
					if (textSenha.getText().trim().equals("")) {
						textSenha.setBorder(redBorder);
					}
					if (CBCargo.getSelectedIndex() == 0) {
						CBCargo.setBorder(redBorder);
					} //FAZER O ELSE DEPOIS
				
				textUsuario.setText("");
				textSenha.setText("");
				CBCargo.setSelectedIndex(0);
				
				
				DefaultTableModel tbltable = (DefaultTableModel) table.getModel();
				//FAZER PARTE DE MOSTAR NO TABLE
				}		
			}
		});
		btnNewButton.setBounds(472, 56, 99, 33);
		contentPane.add(btnNewButton);
	}
}
