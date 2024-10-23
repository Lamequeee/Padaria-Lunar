package Modelo;

import java.util.ArrayList;

public interface IPessoaDAO {
	
	public Integer inserir(Pessoa f);

	public boolean atualizarPessoa(Pessoa f);

	public boolean atualizar(Pessoa f);

	public boolean excluir(Pessoa f);

	public ArrayList<Pessoa> ListarPessoa();

	public Pessoa login(Pessoa f);
	
	public Pessoa clicado(Integer f);

}
