package model;

import java.time.LocalDate;

public class Funcionario {

	private Integer codigo;
	private String nome;
	private String endereco;
	private LocalDate dataNascimento;
	private String CPF;
	private String fone;
	private String celular;
	private String email;
	private String redeSocial;
	
	
	public Funcionario() {
		
	}

	public Funcionario(int codigo, String nome, String endereco, LocalDate dataNascimento, String CPF, String fone, String celular,
					   String email, String redeSocial) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.CPF = CPF;
		this.fone = fone;
		this.celular = celular;
		this.email = email;
		this.redeSocial = redeSocial;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

}
