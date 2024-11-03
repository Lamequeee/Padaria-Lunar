package Modelo;

import java.util.ArrayList;

public interface IAlimentoDAO {

	public Integer inserirAlimento(Alimento f);

	public boolean atualizarAlimento(Alimento f);

	public boolean atualizar_ali(Alimento f);

	public boolean excluirAlimento(Alimento f);

	public ArrayList<Alimento> ListarAlimento();

	//public Pessoa login(Pessoa f);
	
	public Alimento clicado(Integer f);
	
}
