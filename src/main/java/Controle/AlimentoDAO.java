package Controle;

import Modelo.Alimento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modelo.IAlimentoDAO;

public class AlimentoDAO implements IAlimentoDAO {
	
	public static AlimentoDAO instancia;
	
	public static AlimentoDAO getInstancia() {
		if (instancia == null) {
			instancia = new AlimentoDAO();
		}
		return instancia;
	}
	
	public Alimento AlimentoAchado = null;
	
	public Integer inserirAlimento(Alimento f) {
		Conexao c = Conexao.getInstancia();
		Connection con = c.conectar();
		
		String query = "INSERT INTO alimentos (Nome_alimento, Valor, Promocao, Quantidade) VALUES (?,?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, f.getNome_alimento());
			ps.setDouble(2, f.getValor());
			ps.setString(3, f.getPromocao());
			ps.setInt(4, f.getQuantidade());
			
			ps.executeUpdate();
			
			try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
				if (generatedKeys.next()) {
					return generatedKeys.getInt(1);
				} else {
					throw new SQLException("Creating user failed, no ID obtained.");
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			c.fecharConexao();
		}

		return 0;
	}
	
	public boolean atualizarAlimento(Alimento f) {
		Conexao c = Conexao.getInstancia();
		Connection con = c.conectar();
		
		String query = "UPDATE Alimentos SET Nome_Alimento = ?, Valor = ?, Promocao = ?, Quantidade = ? WHERE id_alimento = ?";

		
		try {
			PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, f.getNome_alimento());
			ps.setDouble(2, f.getValor());
			ps.setString(3, f.getPromocao());
			ps.setInt(4, f.getQuantidade());
			ps.setInt(5, f.getId_alimento());
			
			ps.executeUpdate();
			 
			return true;
					 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			c.fecharConexao();
		}

		return false;
	}
	
	public boolean atualizar_ali(Alimento f) {
		Conexao c = Conexao.getInstancia();
		Connection con = c.conectar();
		
		String query = "UPDATE Alimentos SET Nome_Alimento = ?, Valor = ?, Promocao = ?, Quantidade = ? WHERE id_alimento = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, f.getNome_alimento());
			ps.setDouble(2, f.getValor());
			ps.setString(3, f.getPromocao());
			ps.setInt(4, f.getQuantidade());
			ps.setInt(5, f.getId_alimento());
			
			ps.executeUpdate();
			 
			return true;
					 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			c.fecharConexao();
		}

		return false;
	}
	
	public boolean excluirAlimento(Alimento f) {
		Conexao c = Conexao.getInstancia();
		Connection con = c.conectar();
		
		String query = "DELETE FROM Alimentos WHERE id_alimento = ?";

		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			 ps.setInt(1, f.getId_alimento());
			 
			 int affectedRows = ps.executeUpdate();
			 
			 return affectedRows > 0;
			 
		}catch (SQLException e) {
	        e.printStackTrace();
	        return false; // Retorna false se ocorrer um erro
	    } finally {
	        c.fecharConexao(); // Fecha a conexão
	    }
	}
	
	public ArrayList<Alimento> ListarAlimento() {
		Conexao c = Conexao.getInstancia();
		Connection con = c.conectar();
	
	ArrayList<Alimento> Alimento = new ArrayList<>();
	
	String query = "SELECT * FROM Alimentos";
	
	try {
		PreparedStatement ps = con.prepareStatement(query);

		ResultSet rs = ps.executeQuery();
	
		while(rs.next()) {
			
			Integer Id_alimento = rs.getInt("Id_alimento");
			String Nome_alimento = rs.getString("Nome_Alimento");
			Integer Quantidade = rs.getInt("Quantidade");
			Double Valor = rs.getDouble("Valor");
			String Promocao = rs.getString("Promocao");
			
			
			Alimento F = new Alimento();
			
			F.setId_alimento(Id_alimento);
			F.setNome_alimento(Nome_alimento);
			F.setQuantidade(Quantidade);
			F.setValor(Valor);
			F.setPromocao(Promocao);
			
			
			Alimento.add(F);
		}
	}catch (SQLException e) {
		e.printStackTrace();
	} finally {
		c.fecharConexao();
	}
	return Alimento;
	}
	
	
	public Alimento clicado(Integer f) {
		Conexao c = Conexao.getInstancia();
		Connection con = c.conectar();

		Alimento F = new Alimento();

		String Query = "SELECT * FROM Alimentos WHERE Id_alimento = ?";

		try {
			PreparedStatement ps = con.prepareStatement(Query);

			ps.setInt(1, f);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Integer Id_alimento = rs.getInt("id_alimento");
				String Nome_alimento = rs.getString("Nome_Alimento");
				Integer Quantidade = rs.getInt("Quantidade");
				Double Valor = rs.getDouble("Valor");
				String Promocao = rs.getString("Promocao");
				
								
				F.setId_alimento(Id_alimento);
				F.setNome_alimento(Nome_alimento);
				F.setQuantidade(Quantidade);
				F.setValor(Valor);
				F.setPromocao(Promocao);
				
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			c.fecharConexao();
		}

		return F;
	}
	
	public Alimento ListarAlimento(String Nome_alimento) {
	    Conexao c = Conexao.getInstancia();
	    Connection con = c.conectar();
	    Alimento alimento = null;

	    String Query = "SELECT * FROM Alimentos WHERE Nome_alimento = ?";

	    try {
	        PreparedStatement ps = con.prepareStatement(Query);
	        ps.setString(1, Nome_alimento);
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	        	Integer Id_alimento = rs.getInt("id_alimento");
				String Nome_Alimento = rs.getString("Nome_Alimento");
				Integer Quantidade = rs.getInt("Quantidade");
				Double Valor = rs.getDouble("Valor");
				String Promocao = rs.getString("Promocao");
				
						
				alimento = new Alimento();
				
				alimento.setId_alimento(Id_alimento);
				alimento.setNome_alimento(Nome_alimento);
				alimento.setQuantidade(Quantidade);
				alimento.setValor(Valor);
				alimento.setPromocao(Promocao);
				
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        c.fecharConexao();
	    }

	    return alimento;
	}



}
