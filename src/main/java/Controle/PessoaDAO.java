package Controle;

import Modelo.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modelo.IPessoaDAO;

public class PessoaDAO implements IPessoaDAO {
	
	private static PessoaDAO instancia;
	
	public static PessoaDAO getInstancia() {
		if (instancia == null) {
			instancia = new PessoaDAO();
		}
		return instancia;
	}
	
	public Pessoa pessAchado = null;
	
	public Integer inserir(Pessoa f) {
		Conexao c = Conexao.getInstancia();
		Connection con = c.conectar();
		
		String query = "INSERT INTO pessoa (Usuario, Senha, Cargo) VALUES (?, ?, ?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

			ps.setString(1, f.getUsuario());
			ps.setString(2, f.getSenha());
			ps.setString(3, f.getCargo());
			
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

	public boolean atualizarPessoa(Pessoa f) {
		Conexao c = Conexao.getInstancia();
		Connection con = c.conectar();
		
		String query = "UPDATE Pessoa SET Usuario = ?," + "Senha =?," + "Cargo = ?" + "Where id_pessoa = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, f.getUsuario());
			ps.setString(2, f.getSenha());
			ps.setString(3, f.getCargo());
			ps.setInt(4, f.getIdPessoa());
			
			ps.executeUpdate();
			 
			return true;
					 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			c.fecharConexao();
		}

		return false;
	}


	public boolean atualizar(Pessoa f) {
		Conexao c = Conexao.getInstancia();
		Connection con = c.conectar();
		
		String query = "UPDATE Pessoa SET Usuario = ?," + "Senha =?," + "Cargo = ?" + "Where id_pessoa = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, f.getUsuario());
			ps.setString(2, f.getSenha());
			ps.setString(3, f.getCargo());
			
			ps.executeUpdate();
			 
			return true;
					 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			c.fecharConexao();
		}

		return false;
	}

	public boolean excluir(Pessoa f) {
	    Conexao c = Conexao.getInstancia(); // Obtém a conexão
	    Connection con = c.conectar(); // Conecta ao banco de dados
	    
	    String query = "DELETE FROM Pessoa WHERE id_pessoa = ?";
	    
	    try {
	        PreparedStatement ps = con.prepareStatement(query);
	        ps.setInt(1, f.getIdPessoa()); // Usa o ID da pessoa para excluir

	        int affectedRows = ps.executeUpdate(); // Executa a query de exclusão
	        
	        return affectedRows > 0; // Retorna true se a exclusão foi bem-sucedida
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false; // Retorna false se ocorrer um erro
	    } finally {
	        c.fecharConexao(); // Fecha a conexão
	    }
	}


	
	public ArrayList<Pessoa> ListarPessoa() {
		Conexao c = Conexao.getInstancia();

		Connection con = c.conectar();

		ArrayList<Pessoa> Pessoa = new ArrayList<>();

		String Query = "SELECT * FROM Pessoa";

		try {
			PreparedStatement ps = con.prepareStatement(Query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				
				Integer id_pessoa = rs.getInt("id_pessoa");
				String Usuario = rs.getString("Usuario");
				String Senha = rs.getString("Senha");
				String Cargo = rs.getString("Cargo");
				
				Pessoa F = new Pessoa();

				F.setIdPessoa(id_pessoa);
				F.setUsuario(Usuario);
				F.setSenha(Senha);
				F.setCargo(Cargo);
				
				Pessoa.add(F);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			c.fecharConexao();
		}

		return Pessoa;
	}
	

	public Pessoa login(Pessoa f) {
		for (Pessoa pess : ListarPessoa()) {
			if (pess.getUsuario().equals(f.getUsuario()) && pess.getSenha().equals(f.getSenha())) {

				pessAchado = pess;

				return pessAchado;
			}
		}
		return pessAchado;
	}
	
	public Pessoa logoff() {
		return pessAchado = null;
	}

	
	public Pessoa passaLogado() {
		return pessAchado;
	}
	
	
	public Pessoa clicado(Integer f) {
		Conexao c = Conexao.getInstancia();

		Connection con = c.conectar();

		Pessoa F = new Pessoa();

		String Query = "SELECT * FROM Pessoa WHERE id_pessoa = ?";

		try {
			PreparedStatement ps = con.prepareStatement(Query);

			ps.setInt(1, f);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Integer id_pessoa = rs.getInt("id_pessoa");
				String Usuario = rs.getString("Usuario");
				String Senha = rs.getString("Senha");
				String Cargo = rs.getString("Cargo");
		
				F.setIdPessoa(id_pessoa);
				F.setUsuario(Usuario);
				F.setSenha(Senha);
				F.setCargo(Cargo);
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			c.fecharConexao();
		}

		return F;
	}

	public Pessoa ListarPessoa(String usuario) {
	    Conexao c = Conexao.getInstancia();
	    Connection con = c.conectar();
	    Pessoa pessoa = null;

	    String Query = "SELECT * FROM Pessoa WHERE Usuario = ?";

	    try {
	        PreparedStatement ps = con.prepareStatement(Query);
	        ps.setString(1, usuario);
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            Integer id_pessoa = rs.getInt("id_pessoa");
	            String Usuario = rs.getString("Usuario");
	            String Senha = rs.getString("Senha");
	            String Cargo = rs.getString("Cargo");

	            pessoa = new Pessoa();
	            pessoa.setIdPessoa(id_pessoa);
	            pessoa.setUsuario(Usuario);
	            pessoa.setSenha(Senha);
	            pessoa.setCargo(Cargo);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        c.fecharConexao();
	    }

	    return pessoa;
	}


	
	}


