package model;

import service.FuncionarioCadastradoService;
import service.ProtudoCadastradoService;

public class PontoDeVenda extends Endereco{

	private Integer codigo;
	private String fone;
	private String celular;
	private String email;
	private Funcionario funcionario;
	private Produtos produto;
		
	public PontoDeVenda() {
		
	}

	public PontoDeVenda(Integer codigo, String logradouro, String num, String bairro, String cidade, String uf, String complemento, String CEP,
						String fone, String celular, String email, Funcionario funcionario) {
		super(logradouro, num, bairro, cidade, uf, complemento, CEP);
		this.codigo = codigo;
		this.fone = fone;
		this.celular = celular;
		this.email = email;
		this.funcionario = funcionario;
	}

	public PontoDeVenda(Integer codigo, String logradouro, String num, String bairro, String cidade, String uf, String complemento, String CEP,
						String fone, String celular, String email, Produtos produto) {
		super(logradouro, num, bairro, cidade, uf, complemento, CEP);
		this.codigo = codigo;
		this.fone = fone;
		this.celular = celular;
		this.email = email;
		this.produto = produto;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Produtos getProduto() {
		return produto;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "PontoDeVenda: " +
				"\nCódigo = " + codigo +
				"\n Logradouro = " + super.getLogradouro() +
				"\n Número = " + super.getNum() +
				"\n Bairro = " + super.getBairro() +
				"\n Cidade = " + super.getCidade() +
				"\n Estado = " + super.getUf() +
				"\n Complemento = " + super.getComplemento() +
				"\n CEP = " + super.getCEP() +
				"\nFone = " + fone +
				"\nCelular = " + celular +
				"\nE-mail = " + email;
	}

	public String toStringFuncionario() {
		return "PontoDeVenda: " +
				"\nCódigo = " + codigo +
				"\nCódigo do Funcionario = " + FuncionarioCadastradoService.getInstance().getCodigo() +
				"\nLogradouro = " + super.getLogradouro() +
				"\nNúmero = " + super.getNum() +
				"\nBairro = " + super.getBairro() +
				"\nCidade = " + super.getCidade() +
				"\nEstado = " + super.getUf() +
				"\nComplemento = " + super.getComplemento() +
				"\nCEP = " + super.getCEP() +
				"\nFone = " + fone +
				"\nCelular = " + celular +
				"\nE-mail = " + email;
	}

	public String toStringProduto() {
		return "PontoDeVenda: " +
				"\nCódigo = " + codigo +
				"\nCódigo do Produto = " + ProtudoCadastradoService.getInstance().getCodigo() +
				"\nLogradouro = " + super.getLogradouro() +
				"\nNúmero = " + super.getNum() +
				"\nBairro = " + super.getBairro() +
				"\nCidade = " + super.getCidade() +
				"\nEstado = " + super.getUf() +
				"\nComplemento = " + super.getComplemento() +
				"\nCEP = " + super.getCEP() +
				"\nFone = " + fone +
				"\nCelular = " + celular +
				"\nE-mail = " + email;
	}
}
