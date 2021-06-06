package model;

public class Produtos {

	private Integer codigo;
	private String categoria;
	private String tipo;
	private String tamanho;
	private String modelo;
	private String cor;
	private Integer quantidade;
	private Double preco;
	private String descricao;
	private PontoDeVenda pontoDeVenda;
		
	public Produtos() {

	}


	public Produtos(int codigo, String categoria, String tipo, String tamanho, String modelo, String cor, int quantidade, String descricao, double preco) {
		this.codigo = codigo;
		this.categoria = categoria;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.modelo = modelo;
		this.cor = cor;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.preco = preco;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public PontoDeVenda getPontoDeVenda() {
		return pontoDeVenda;
	}

	public void setPontoDeVenda(PontoDeVenda pontoDeVenda) {
		this.pontoDeVenda = pontoDeVenda;
	}	
	
}
