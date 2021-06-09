package service;

import repository.*;
import model.Funcionario;
import model.PontoDeVenda;
import model.Produtos;

import javax.swing.*;
import java.time.LocalDate;

public class Cadastro {

	private static Produtos produto;
	private static PontoDeVenda pdVenda;
	private static Funcionario funcionario;
	
	public Cadastro() {
		
	}

	public static void cadProduto() {


		Integer cod = Integer.parseInt(JOptionPane.showInputDialog("Código do produto"));
		String categoria = JOptionPane.showInputDialog("Categoria").toUpperCase();
		String tipo = JOptionPane.showInputDialog("Tipo").toUpperCase();
		String tamanho = JOptionPane.showInputDialog("Tamanho").toUpperCase();
		String modelo = JOptionPane.showInputDialog("Modelo").toUpperCase();
		String cor = JOptionPane.showInputDialog("Cor").toUpperCase();
		Integer qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade"));
		String descricao = JOptionPane.showInputDialog("Descrição do produto").toUpperCase();
		Double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço R$"));

		PontoDeVendaCadastrado ptVenda = PontoDeVendaCadastrado.getInstance();
		Integer codPtVenda = Integer.parseInt(JOptionPane.showInputDialog("Código o Ponto de venda cadastrado"));
		if(PesquisarPontoDeVenda.pesquisarPontoDeVenda(codPtVenda)){
			produto = new Produtos(cod, categoria, tipo, tamanho, modelo, cor, qtd, descricao, preco, ptVenda);
		}else{
			JOptionPane.showMessageDialog(null, "Ponto de venda não encontrado \nCadastre um ponto de venda");
		}
		CadastroDAO.cadastrarProduto(produto);

	}

	public static void cadPtVenda() {

		Integer cod = Integer.parseInt(JOptionPane.showInputDialog("Código do ponto de venda"));
		String logradouro = JOptionPane.showInputDialog("Logradouro");
		String num = JOptionPane.showInputDialog("Número");
		String bairro = JOptionPane.showInputDialog("Bairro");
		String cidade = JOptionPane.showInputDialog("Cidade");
		String uf = JOptionPane.showInputDialog("UF");
		String complemento = JOptionPane.showInputDialog("Complemento");
		String cep = FormatarDados.getCepFormatado(JOptionPane.showInputDialog("CEP"));
		String fone = FormatarDados.getFoneFormatado(JOptionPane.showInputDialog("Fone"));
		String celular = FormatarDados.getCelFormatado(JOptionPane.showInputDialog("Celular"));
		String email = JOptionPane.showInputDialog("E-mail");
		boolean auxEmail = ValidarDados.isEmailValido(email);
		while(!auxEmail){
			auxEmail = ValidarDados.isEmailValido(JOptionPane.showInputDialog("E-mail"));
		}
		FuncionarioCadastrado funcionario = FuncionarioCadastrado.getInstance();
		Integer codFun = Integer.parseInt(JOptionPane.showInputDialog("Código de funcionario cadastrado"));
		if(PesquisarFuncionario.pesquisarFuncionario(codFun)){
			pdVenda = new PontoDeVenda(cod, logradouro, num, bairro, cidade, uf, complemento, cep, fone, celular, email, funcionario);
		}else{
			JOptionPane.showMessageDialog(null, "funcionario não encontrado Cadastre um funcionario");
		}

		CadastroDAO.cadastrarPontoDeVenda(pdVenda);
	}

	public static void cadFuncionario() {
		Integer codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do funcionario"));
		String nome = JOptionPane.showInputDialog("Nome");
		LocalDate data = FormatarDados.formatarData(JOptionPane.showInputDialog("Data de Nascimento"));
		String cpf = JOptionPane.showInputDialog("CPF");
		boolean auxCpf = ValidarDados.isCPF(cpf);
		while(!auxCpf || PesquisarCpfDAO.pesquisarCpf(FormatarDados.getCpfFormatado(cpf))){
			auxCpf = ValidarDados.isCPF(cpf = JOptionPane.showInputDialog("CPF invalido ou já cadastrado\nDigite CPF"));
		}
		cpf = FormatarDados.getCpfFormatado(cpf);
		String logradouro = JOptionPane.showInputDialog("Logradouro");
		String num = JOptionPane.showInputDialog("Número");
		String bairro = JOptionPane.showInputDialog("Bairro");
		String cidade = JOptionPane.showInputDialog("Cidade");
		String uf = JOptionPane.showInputDialog("UF");
		String complemento = JOptionPane.showInputDialog("Complemento");
		String CEP = FormatarDados.getCepFormatado(JOptionPane.showInputDialog("CEP"));
		String fone = FormatarDados.getFoneFormatado(JOptionPane.showInputDialog("Fone"));
		String celular = FormatarDados.getCelFormatado(JOptionPane.showInputDialog("Celular"));
		String email = JOptionPane.showInputDialog("E-mail");
		boolean auxEmial = ValidarDados.isEmailValido(email);
		while(!auxEmial){
			auxEmial = ValidarDados.isEmailValido(email = JOptionPane.showInputDialog("E-mail"));
		}

		String redeSocial = JOptionPane.showInputDialog("Redes Sociais");
		String userName = JOptionPane.showInputDialog("Cadastre um login");
		String senha = JOptionPane.showInputDialog("Cadastre uma senha");

		CadastroDAO.cadastrarFuncionario(funcionario = new Funcionario(codigo, nome, data, cpf, logradouro, num, bairro, cidade, uf, complemento, CEP,
				fone, celular, email, redeSocial, userName, senha));
	}
}
