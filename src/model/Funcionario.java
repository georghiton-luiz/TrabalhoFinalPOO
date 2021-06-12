package model;

import service.FormatarDadosService;
import service.FuncionarioCadastradoService;
import service.PontoDeVendaCadastradoService;

import java.time.LocalDate;

public class Funcionario extends Endereco{

	private Integer codigo;
	private String nome;
	private LocalDate dataNascimento;
	private String CPF;
	private String fone;
	private String celular;
	private String email;
	private String redeSocial;
	private String userName;
	private String senha;


	public Funcionario() {

	}

	public Funcionario(Integer codigo, String nome, LocalDate dataNascimento, String CPF, String logradouro, String num, String bairro,
					   String cidade, String uf, String complemento, String CEP, String fone, String celular, String email,
					   String redeSocial, String userName, String senha) {
		super(logradouro, num, bairro, cidade, uf, complemento, CEP);
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.CPF = CPF;
		this.fone = fone;
		this.celular = celular;
		this.email = email;
		this.redeSocial = redeSocial;
		this.userName = userName;
		this.senha = senha;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
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

	public String getRedeSocial() {
		return redeSocial;
	}

	public void setRedeSocial(String redeSocial) {
		this.redeSocial = redeSocial;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Funcionario:" +
				"\nCódigo: " + codigo +
				"\nNome: " + nome +
				"\nData Nascimento: " + FormatarDadosService.dataFormatada(FuncionarioCadastradoService.getDataNasc()) +
				"\nCPF: " + CPF +
				"\nLogradouro: " + super.getLogradouro() +
				"\nNúmero: " + super.getNum() +
				"\nBairro: " + super.getBairro() +
				"\nCidade: " + super.getCidade() +
				"\nEstado: " + super.getUf() +
				"\nComplemento: " + super.getComplemento() +
				"\nCEP: " + super.getCEP() +
				"\nFone: " + fone +
				"\nCelular: " + celular +
				"\nE-mail: " + email +
				"\nRede Social: " + redeSocial +
				"\n-----------------------------------";
	}
}
