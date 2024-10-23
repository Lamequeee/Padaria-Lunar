package Modelo;

public class Pessoa {

	private String Usuario;
	private String Senha;
	private String Cargo;
	private Integer id_pessoa;
	
	public String getUsuario() {
		return Usuario;
	}
	
	public void setUsuario(String Usuario) {
		this.Usuario = Usuario;
	}
	
	public String getSenha() {
		return Senha;
	}
	
	public void setSenha(String Senha) {
		this.Senha = Senha;
	}
	
	public Integer getIdPessoa() {
		return id_pessoa;
	}

	public void setIdPessoa(Integer id_pessoa) {
		this.id_pessoa = id_pessoa;
	}
	
	public String getCargo() {
		return Cargo;
	}
	
	public void setCargo(String Cargo) {
		this.Cargo = Cargo;
	}
}
