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
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import Controle.AlimentoDAO;
import Modelo.Alimento;
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

public class TelaCrudAlimento extends JFrame {

	private JPanel contentPane;
	private JTextField textAlimento;
	private JTextField textValor;
	private JTextField textQuantidade;
	private JTable table;
	private AlimentoDAO aliDAO = AlimentoDAO.getInstancia(); //Faz que o table exista...	
	private JTextField textId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCrudAlimento frame = new TelaCrudAlimento();
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
	public TelaCrudAlimento() {
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
		lblNewLabel_1_1_2_2_1.setBounds(-11, -224, 67, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1);
		
	
		JLabel lblNewLabel_1_1_2_2_1_3 = new JLabel("Usuario");
		lblNewLabel_1_1_2_2_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_3.setBounds(169, -224, 67, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_3);
		
		
		JLabel lblNewLabel_1_1_2_2_1_4 = new JLabel("Usuario");
		lblNewLabel_1_1_2_2_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_4.setBounds(343, -224, 67, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(411, -212, 89, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("Padaria");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1_1.setBounds(-215, -234, 141, 40);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Lunar");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1_1_1.setBounds(-205, -183, 99, 40);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-271, -245, 250, 611);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(-258, -22, 40, 40);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Lista de alimentos");
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(-215, -22, 194, 40);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBounds(-258, 66, 40, 40);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Cadastro de alimentos");
		lblNewLabel_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_1.setBounds(-215, 66, 194, 40);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setBounds(-258, 155, 40, 40);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Cadastro de funcionario");
		lblNewLabel_1_1_2_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2.setBounds(-215, 155, 194, 40);
		contentPane.add(lblNewLabel_1_1_2_2);
		
		JLabel lblNewLabel_1_1_2_2_1_1 = new JLabel("");
		lblNewLabel_1_1_2_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_1.setBounds(-258, 315, 40, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_1);
		
		JLabel lblNewLabel_1_1_2_2_1_2 = new JLabel("Sair");
		lblNewLabel_1_1_2_2_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_2.setBounds(-215, 315, 40, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_2);
		
		JLabel lblNewLabel_1_1_2_2_1_5 = new JLabel("Alimento");
		lblNewLabel_1_1_2_2_1_5.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_5.setBounds(271, 0, 86, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_5);
		
		textAlimento = new JTextField();
		textAlimento.setColumns(10);
		textAlimento.setBounds(352, 13, 148, 20);
		contentPane.add(textAlimento);
		
		JLabel lblNewLabel_1_1_2_2_1_3_1 = new JLabel("Valor");
		lblNewLabel_1_1_2_2_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_3_1.setBounds(578, 0, 44, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_3_1);
		
		textValor = new JTextField();
		textValor.setColumns(10);
		textValor.setBounds(624, 13, 147, 20);
		contentPane.add(textValor);
		
		JLabel lblNewLabel_1_1_2_2_1_4_1 = new JLabel("Promoção");
		lblNewLabel_1_1_2_2_1_4_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_2_1_4_1.setBounds(271, 44, 86, 40);
		contentPane.add(lblNewLabel_1_1_2_2_1_4_1);
		
		JComboBox CBPromo = new JComboBox();
		CBPromo.setModel(new DefaultComboBoxModel(new String[] {"","Nenhuma", "10%", "15%", "20%"}));
		CBPromo.setBounds(353, 56, 147, 22);
		contentPane.add(CBPromo);
		
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
		lblNewLabel_3_3.setIcon(new ImageIcon(TelaCrudAlimento.class.getResource("/Imagens/lista.png")));
		lblNewLabel_3_3.setBounds(13, 223, 40, 40);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_1_1_2_3 = new JLabel("Lista de alimentos");
		lblNewLabel_1_1_2_3.addMouseListener(new MouseAdapter() {
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
		lblNewLabel_1_1_2_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_3.setBounds(56, 223, 194, 40);
		contentPane.add(lblNewLabel_1_1_2_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon(TelaCrudAlimento.class.getResource("/Imagens/pao.png")));
		lblNewLabel_3_1_1.setBounds(13, 311, 40, 40);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Cadastro de alimentos");
		lblNewLabel_1_1_2_1_1.addMouseListener(new MouseAdapter() {
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
		lblNewLabel_1_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_1_1.setBounds(56, 311, 194, 40);
		contentPane.add(lblNewLabel_1_1_2_1_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("");
		lblNewLabel_3_2_1.setIcon(new ImageIcon(TelaCrudAlimento.class.getResource("/Imagens/pessoausuario.png")));
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
		lblNewLabel_1_1_2_2_1_1_1.setIcon(new ImageIcon(TelaCrudAlimento.class.getResource("/Imagens/sair.png")));
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
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaCrudAlimento.class.getResource("/Imagens/lateral2.png")));
		lblNewLabel_1.setBounds(0, 0, 250, 611);
		contentPane.add(lblNewLabel_1);
		
		//DAQUI PARA BAIXO FOI UM CODIGO PRONTO PELA MINHA ANTIGA PROFESSORA...
				//CRIA O SCRILLPANE, QUE É ONDE O TABLE FICARA " DENTRO "
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				scrollPane.setBounds(270, 124, 501, 476);
				contentPane.add(scrollPane);
				//CHAMA O TABLE, QUE FOI CRIADO ATRAVES DO: PRIVATE JTable table NAS PRIMEIRAS LINHAS
				table = new JTable();
				table.setFont(new Font("Krona One", Font.PLAIN, 11));
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
				
						int setar = table.getSelectedRow();
						Integer IdAlimento = Integer.valueOf(table.getModel().getValueAt(setar, 0).toString());
					Alimento AlimentoC = new Alimento();
					
					AlimentoC = aliDAO.clicado(IdAlimento);
						
						textAlimento.setText(AlimentoC.getNome_alimento());
						textQuantidade.setText(AlimentoC.getQuantidade().toString());
						textValor.setText(AlimentoC.getValor().toString());
						
						if (AlimentoC.getPromocao().equals("Nenhnuma")) {
							CBPromo.setSelectedIndex(1);
						} else if(AlimentoC.getPromocao().equals("10%")){
							CBPromo.setSelectedIndex(2);
					} else if(AlimentoC.getPromocao().equals("15%")){
						CBPromo.setSelectedIndex(3);
					}else if(AlimentoC.getPromocao().equals("20%")){
						CBPromo.setSelectedIndex(4);
					}else {
						CBPromo.setSelectedIndex(0);
					}
						
						textAlimento.setEditable(true);
						textQuantidade.setEditable(true);
						textValor.setEditable(true);
						CBPromo.setEditable(true);
			
					textId.setText(String.valueOf(AlimentoC.getId_alimento()));
						
					}
				});
				
				
				
				//CRIA O MODELO DO TABLE
				scrollPane.setViewportView(table);
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"ID", "Alimento", "Valor", "Promoção", "Ações"
								 }
					) {
					boolean[] columnEditables = new boolean[] {
							false, false, false, false, true
						};
						public boolean isCellEditable(int row, int column) {
							return columnEditables[column];
						}
					});
				
				for (Alimento alim : aliDAO.ListarAlimento()) {
				    DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				    String data[] = {String.valueOf(alim.getId_alimento()), alim.getNome_alimento(),String.valueOf(alim.getValor()), alim.getPromocao(), String.valueOf(alim.getQuantidade())};
				    tblModel.addRow(data);
				}
				
								
				JLabel lblNewLabel_1_1_2_2_1_3_1_1 = new JLabel("Quantidade");
				lblNewLabel_1_1_2_2_1_3_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_2_2_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblNewLabel_1_1_2_2_1_3_1_1.setBounds(523, 44, 99, 40);
				contentPane.add(lblNewLabel_1_1_2_2_1_3_1_1);
				
				textQuantidade = new JTextField();
				textQuantidade.setColumns(10);
				textQuantidade.setBounds(624, 57, 147, 20);
				contentPane.add(textQuantidade);
				
				JButton btnNewButton = new JButton("Confirmar");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					     if (textAlimento.getText().trim().equals("") || textQuantidade.getText().trim().equals("") || textValor.getText().trim().equals("") ||CBPromo.getSelectedIndex() == 0) {
					            if (textAlimento.getText().trim().equals("")) {
					            	textAlimento.setBorder(redBorder);
					            }
					            if (textQuantidade.getText().trim().equals("")) {
					            	textQuantidade.setBorder(redBorder);
					            }
					            if (textValor.getText().trim().equals("")) {
					            	textValor.setBorder(redBorder);
					            }
					            if (CBPromo.getSelectedIndex() == 0) {
					            	CBPromo.setBorder(redBorder);
					            }
					        } else {
					            // Verifica se o usuário já existe
					            if (aliDAO.ListarAlimento(textAlimento.getText().trim()) == null) {
					                Alimento alim1 = new Alimento();
					                String Nome_alimento = textAlimento.getText();
					                Integer Quantidade = Integer.parseInt(textQuantidade.getText());
					                Double Valor= Double.parseDouble(textValor.getText());
					                String Promocao = (String) CBPromo.getSelectedItem();
					                
					                alim1.setNome_alimento(Nome_alimento);
					                alim1.setQuantidade(Quantidade);
					                alim1.setValor(Valor);
					                alim1.setPromocao(Promocao);
					                
					                Integer Id_alimento = aliDAO.inserirAlimento(alim1);
					                
					                String data[] = {String.valueOf(Id_alimento), Nome_alimento, String.valueOf(Quantidade), String.valueOf(Valor), Promocao};
					                
					                // Adiciona a nova linha na tabela
					                DefaultTableModel tbltable = (DefaultTableModel) table.getModel();
					                tbltable.addRow(data);
					                tbltable.fireTableDataChanged();  // Atualiza a tabela visualmente
					                
					                // Limpa os campos após inserção
					                textAlimento.setText("");
					                textQuantidade.setText("");
					                textValor.setText("");
					                CBPromo.setSelectedIndex(0);
					            } else {
					                System.out.print("Erro: Alimento já existe.");
					            }
					        }
					}
				});
				btnNewButton.setBounds(460, 86, 99, 33);
				contentPane.add(btnNewButton);
				
				textId = new JTextField();
				textId.setEditable(false);
				textId.setColumns(10);
				textId.setBounds(271, 95, 40, 20);
				contentPane.add(textId);
		
				TableActionEvent event = new TableActionEvent() {
					
					@Override
					public void onView(int row) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onEdit(int row) {
						
						Alimento ali1 = new Alimento();
							if(!textAlimento.getText().trim().equals("") && !textValor.getText().trim().equals("") && !(CBPromo.getSelectedIndex() == 0)  && !textQuantidade.getText().trim().equals("")) {
								ali1.setId_alimento(Integer.valueOf(textId.getText()));
								ali1.setNome_alimento(textAlimento.getText().trim());
								ali1.setValor(Double.valueOf(textValor.getText()));
								ali1.setPromocao(CBPromo.getSelectedItem().toString());
								ali1.setQuantidade(Integer.valueOf(textQuantidade.getText()));
								

								if(aliDAO.ListarAlimento(ali1.getNome_alimento()) == null) {
									aliDAO.atualizarAlimento(ali1);
							       
								}else {
									JOptionPane.showMessageDialog(null, "Alimento existe pae!");
								}
							}else {
									JOptionPane.showMessageDialog(null, "Preencha todos os dados");
								}
							if(textAlimento.getText().equals("")) {
								textAlimento.setBorder(redBorder);
							}
							if(textValor.getText().equals("")) {
								textValor.setBorder(redBorder);
							}
							if(textQuantidade.getText().equals("")) {
								textQuantidade.setBorder(redBorder);
							}
							
							
							 atualizarTabela(); 
							 textAlimento.setText("");
							 textValor.setText("");
				             CBPromo.setSelectedIndex(0);
				             
				             textQuantidade.setText("");
					}
					
					@Override
					public void onDelete(int row) {
						int linhaSelecionada = table.getSelectedRow(); // Obtém a linha selecionada na tabela

						if (linhaSelecionada >= 0 && linhaSelecionada < table.getRowCount()) {  // Verifica se a linha selecionada é válida
						    // Obtém o ID da pessoa a partir da tabela (coluna 0)
						    Integer Id_alimento = Integer.valueOf(table.getModel().getValueAt(linhaSelecionada, 0).toString());

						    // Cria uma instância de Pessoa e define o ID
						    Alimento aliDelete = new Alimento();
						    aliDelete.setId_alimento(Id_alimento); // Atribui o ID da pessoa a ser excluída

						    // Chama o DAO para executar a exclusão no banco de dados
						    boolean sucesso = aliDAO.excluirAlimento(aliDelete);

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

					}
					
				
				};

				
				table.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRender());
				table.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(event));
				table.getColumnModel().getColumn(0).setPreferredWidth(10);
				table.getColumnModel().getColumn(4).setPreferredWidth(90);
				table.setRowHeight(33);
	}
	
	//ATUALIZAR A LISTA SEM EU PRECISAR REABRIR O PROGRAMA
	public void atualizarTabela() {
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    model.setRowCount(0); // Limpa o modelo existente

	    List<Alimento> alimento = aliDAO.ListarAlimento(); // Busca todos os registros do banco
	    for (Alimento alimentos : alimento) {
	        model.addRow(new Object[]{alimentos.getId_alimento(), alimentos.getNome_alimento(), alimentos.getValor(), alimentos.getPromocao(), alimentos.getQuantidade(),});
	    }

	    model.fireTableDataChanged(); // Notifica a tabela sobre as mudanças
	}
	
}
