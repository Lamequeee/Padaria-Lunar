package Visao;

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
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

import Controle.PessoaDAO;
import Modelo.Pessoa;
import raven.cell.TableActionCellEditor;
import raven.cell.TableActionCellRender;
import raven.cell.TableActionEvent;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCrudFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JTextField textSenha;
	private JTable table;
	private PessoaDAO pessDAO = PessoaDAO.getInstancia(); 
	private JTextField textId;

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
				
				
				String Cargo = pessDAO.passaLogado().getCargo();
				if (Cargo.equals("Administrador") || Cargo.equals("Gerente de Vendas")) {
					TelaHistorico Historico = new TelaHistorico();
					//Deixa visivel a tela que eu quero abrir
					Historico.setVisible(true);
					//fecha a tela que eu estou no momento
					dispose();
				}else {
					System.out.print("Não dá");
				}
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
		
		JComboBox CBCargo = new JComboBox();
		CBCargo.setModel(new DefaultComboBoxModel(new String[] {"","Funcionario", "Gerente"}));	
		CBCargo.setBounds(682, 23, 89, 22);
		contentPane.add(CBCargo);
		
		//DAQUI PARA BAIXO FOI UM CODIGO PRONTO PELA MINHA ANTIGA PROFESSORA...
		//CRIA O SCRILLPANE, QUE É ONDE O TABLE FICARA " DENTRO "
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(270, 99, 501, 501);
		contentPane.add(scrollPane);
		//CHAMA O TABLE, QUE FOI CRIADO ATRAVES DO: PRIVATE JTable table NAS PRIMEIRAS LINHAS
		table = new JTable();
		table.setFont(new Font("Krona One", Font.PLAIN, 11));
		table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
			
					int setar = table.getSelectedRow();
					Integer IdPessoa = Integer.valueOf(table.getModel().getValueAt(setar, 0).toString());
				Pessoa pessC = new Pessoa();
				
				pessC = pessDAO.clicado(IdPessoa);
					
					textUsuario.setText(pessC.getUsuario());
					textSenha.setText(pessC.getSenha());
					if (pessC.getCargo().equals("Gerente")) {
						CBCargo.setSelectedIndex(1);
					} else if(pessC.getCargo().equals("Funcionario")){
						CBCargo.setSelectedIndex(2);
				} else {
				CBCargo.setSelectedIndex(0);
				}
					
					textUsuario.setEditable(false);
					textSenha.setEditable(false);
					CBCargo.setEditable(false);
		
				textId.setText(String.valueOf(pessC.getIdPessoa()));
					
				}
			});
				
		
		//CRIA O MODELO DO TABLE
				scrollPane.setViewportView(table);
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"ID", "Usuario", "Senha", "Cargo", "A\u00E7\u00F5es"
					}
				) {
					boolean[] columnEditables = new boolean[] {
						false, false, false, false, true
					};
					public boolean isCellEditable(int row, int column) {
						return columnEditables[column];
					}
				});
				
				for (Pessoa pess : pessDAO.ListarPessoa()) {
				    DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				    String data[] = {String.valueOf(pess.getIdPessoa()), pess.getUsuario(), pess.getSenha(), pess.getCargo()};
				    tblModel.addRow(data);
				}

				
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Validação dos campos
		        if (textUsuario.getText().trim().equals("") || textSenha.getText().trim().equals("") || CBCargo.getSelectedIndex() == 0) {
		            if (textUsuario.getText().trim().equals("")) {
		                textUsuario.setBorder(redBorder);
		            }
		            if (textSenha.getText().trim().equals("")) {
		                textSenha.setBorder(redBorder);
		            }
		            if (CBCargo.getSelectedIndex() == 0) {
		                CBCargo.setBorder(redBorder);
		            }
		        } else {
		            // Verifica se o usuário já existe
		            if (pessDAO.ListarPessoa(textUsuario.getText().trim()) == null) {
		                Pessoa pess1 = new Pessoa();
		                String Usuario = textUsuario.getText();
		                String senha = textSenha.getText();
		                String cargo = (String) CBCargo.getSelectedItem();
		                
		                pess1.setUsuario(Usuario);
		                pess1.setSenha(senha);
		                pess1.setCargo(cargo);
		                
		                Integer id_pessoa = pessDAO.inserir(pess1);
		                
		                String data[] = {String.valueOf(id_pessoa), Usuario, senha, cargo};
		                
		                // Adiciona a nova linha na tabela
		                DefaultTableModel tbltable = (DefaultTableModel) table.getModel();
		                tbltable.addRow(data);
		                tbltable.fireTableDataChanged();  // Atualiza a tabela visualmente
		                
		                // Limpa os campos após inserção
		                textUsuario.setText("");
		                textSenha.setText("");
		                CBCargo.setSelectedIndex(0);
		            } else {
		                System.out.print("Erro: Usuário já existe.");
		            }
		        }
		    }
		});
		

		btnNewButton.setBounds(472, 56, 99, 33);
		contentPane.add(btnNewButton);
		
		textId = new JTextField();
		textId.setEditable(false);
		textId.setColumns(10);
		textId.setBounds(270, 62, 40, 20);
		contentPane.add(textId);
		
		TableActionEvent event = new TableActionEvent() {
			
			@Override
			public void onView(int row) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onEdit(int row) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onDelete(int row) {
				int linhaSelecionada = table.getSelectedRow(); // Obtém a linha selecionada na tabela

				if (linhaSelecionada >= 0 && linhaSelecionada < table.getRowCount()) {  // Verifica se a linha selecionada é válida
				    // Obtém o ID da pessoa a partir da tabela (coluna 0)
				    Integer id_pessoa = Integer.valueOf(table.getModel().getValueAt(linhaSelecionada, 0).toString());

				    // Cria uma instância de Pessoa e define o ID
				    Pessoa pessDelete = new Pessoa();
				    pessDelete.setIdPessoa(id_pessoa); // Atribui o ID da pessoa a ser excluída

				    // Chama o DAO para executar a exclusão no banco de dados
				    boolean sucesso = pessDAO.excluir(pessDelete);

				    if (sucesso) {
				        // Atualiza a tabela removendo a linha correspondente
				        DefaultTableModel model = (DefaultTableModel) table.getModel();
				        model.removeRow(linhaSelecionada); // Remove a linha da tabela

				        // Após remover a linha, ajusta a seleção
				        if (table.getRowCount() > 0) {
				            // Se ainda houver linhas, selecione a próxima linha ou a anterior
				            if (linhaSelecionada >= table.getRowCount()) {
				                linhaSelecionada = table.getRowCount() - 1; // Se a linha removida era a última, selecione a anterior
				            }
				            table.setRowSelectionInterval(linhaSelecionada, linhaSelecionada); // Ajusta a seleção
				        } else {
				            table.clearSelection(); // Se não houver mais linhas, limpe a seleção
				        }

				        // Atualiza visualmente a tabela
				        model.fireTableDataChanged();
				        table.revalidate();
				        table.repaint();

				        JOptionPane.showMessageDialog(null, "Pessoa excluída com sucesso!");
				    } else {
				        JOptionPane.showMessageDialog(null, "Erro ao excluir a pessoa no banco de dados.");
				    }
				} else {
				    JOptionPane.showMessageDialog(null, "Selecione uma linha válida para excluir.");
				}

			}};

		
		table.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRender());
		table.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(event));
		table.setRowHeight(33);
		table.getColumnModel().getColumn(0).setPreferredWidth(10);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		
	}
}


