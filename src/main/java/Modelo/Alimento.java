package Modelo;

public class Alimento {

	private Integer id_alimento;
	private String Nome_alimento;
	private Double Valor;
	private String Promocao;
	private Integer Quantidade;
	
	
	public Integer getId_alimento() {
		return id_alimento;
	}
	public void setId_alimento(Integer id_alimento) {
		this.id_alimento = id_alimento;
	}
	public String getNome_alimento() {
		return Nome_alimento;
	}
	public void setNome_alimento(String nome_alimento) {
		Nome_alimento = nome_alimento;
	}
	public Double getValor() {
		return Valor;
	}
	public void setValor(Double valor) {
		Valor = valor;
	}
	public String getPromocao() {
		return Promocao;
	}
	public void setPromocao(String promocao) {
		Promocao = promocao;
	}
	public Integer getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		Quantidade = quantidade;
	}
}
