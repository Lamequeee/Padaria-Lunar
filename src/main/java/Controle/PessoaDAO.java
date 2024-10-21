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
		
		String query = "INSERT INTO pessoa " + "(Usuario, " + " Senha, " + " Cargo) " + "VALUES (?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

			ps.setString(1, f.getUsuario());
			ps.setString(2, f.getSenha());
			ps.setString(3, f.getCargo());
			
		
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
		
		String query = "UPDATE Pessoa SET Usuario = ?," + "Senha =?," + "Cargo = ?" + "Where Usuario = ?";
		
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


	public boolean atualizar(Pessoa f) {
		Conexao c = Conexao.getInstancia();
		Connection con = c.conectar();
		
		String query = "UPDATE Pessoa SET Usuario = ?," + "Senha =?," + "Cargo = ?" + "Where Usuario = ?";
		
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
		Conexao c = Conexao.getInstancia();
		Connection con = c.conectar();
		
		String query = "DELETE FROM Pessoa Where Usuario = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
		
			ps.setString(1, f.getUsuario());
			
			ps.executeUpdate();
			return true;
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			c.fecharConexao();
		}

		return false;
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

				String Usuario = rs.getString("Usuario");
				String Senha = rs.getString("Senha");
				String Cargo = rs.getString("Cargo");
				
				Pessoa F = new Pessoa();

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
	
	
	}


