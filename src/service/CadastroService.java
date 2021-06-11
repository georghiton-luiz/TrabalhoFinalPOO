package service;

import model.*;
import repository.*;

import javax.swing.*;
import java.time.LocalDate;

public class CadastroService {

	private static Produtos produto;
	private static PontoDeVenda pdVenda;
	
	public CadastroService() {
		
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

		PontoDeVendaCadastradoService ptVenda = PontoDeVendaCadastradoService.getInstance();
		Integer codPtVenda = Integer.parseInt(JOptionPane.showInputDialog("Código o Ponto de venda cadastrado"));
		if(PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(codPtVenda)){
			produto = new Produtos(cod, categoria, tipo, tamanho, modelo, cor, qtd, descricao, preco, ptVenda);
		}else{
			JOptionPane.showMessageDialog(null, "Ponto de venda não encontrado \nCadastre um ponto de venda");
		}
		CadastroDAO.cadastrarProduto(produto);

	}

	public static void cadPtVenda() {

		Integer cod = Integer.parseInt(JOptionPane.showInputDialog("Código do ponto de venda"));
		String logradouro = JOptionPane.showInputDialog("Logradouro").toUpperCase();
		String num = JOptionPane.showInputDialog("Número").toUpperCase();
		String bairro = JOptionPane.showInputDialog("Bairro").toUpperCase();
		String cidade = JOptionPane.showInputDialog("Cidade").toUpperCase();
		String uf = JOptionPane.showInputDialog("UF").toUpperCase();
		String complemento = JOptionPane.showInputDialog("Complemento").toUpperCase();
		String cep = FormatarDadosService.getCepFormatado(JOptionPane.showInputDialog("CEP"));
		String fone = FormatarDadosService.getFoneFormatado(JOptionPane.showInputDialog("Fone"));
		String celular = FormatarDadosService.getCelFormatado(JOptionPane.showInputDialog("Celular"));
		String email = JOptionPane.showInputDialog("E-mail");
		boolean auxEmail = ValidarDadosService.isEmailValido(email);
		while(!auxEmail){
			auxEmail = ValidarDadosService.isEmailValido(JOptionPane.showInputDialog("E-mail"));
		}
		FuncionarioCadastradoService funcionario = FuncionarioCadastradoService.getInstance();
		Integer codFun = Integer.parseInt(JOptionPane.showInputDialog("Código de funcionario cadastrado"));
		if(PesquisarFuncionarioDAO.pesquisarFuncionario(codFun)){
			pdVenda = new PontoDeVenda(cod, logradouro, num, bairro, cidade, uf, complemento, cep, fone, celular, email, funcionario);
		}else{
			JOptionPane.showMessageDialog(null, "funcionario não encontrado Cadastre um funcionario");
		}

		CadastroDAO.cadastrarPontoDeVenda(pdVenda);
	}

	public static void cadFuncionario() {

		Integer codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do funcionario"));
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		LocalDate data = FormatarDadosService.formatarData(JOptionPane.showInputDialog("Data de Nascimento"));
		String cpf = JOptionPane.showInputDialog("CPF");
		boolean auxCpf = ValidarDadosService.isCPF(cpf);
		while(!auxCpf || PesquisarCpfDAO.pesquisarCpf(FormatarDadosService.getCpfFormatado(cpf))){
			auxCpf = ValidarDadosService.isCPF(cpf = JOptionPane.showInputDialog("CPF invalido ou já cadastrado\nDigite CPF"));
		}
		cpf = FormatarDadosService.getCpfFormatado(cpf);
		String logradouro = JOptionPane.showInputDialog("Logradouro").toUpperCase();
		String num = JOptionPane.showInputDialog("Número").toUpperCase();
		String bairro = JOptionPane.showInputDialog("Bairro").toUpperCase();
		String cidade = JOptionPane.showInputDialog("Cidade").toUpperCase();
		String uf = JOptionPane.showInputDialog("UF").toUpperCase();
		String complemento = JOptionPane.showInputDialog("Complemento").toUpperCase();
		String CEP = FormatarDadosService.getCepFormatado(JOptionPane.showInputDialog("CEP"));
		String fone = FormatarDadosService.getFoneFormatado(JOptionPane.showInputDialog("Fone"));
		String celular = FormatarDadosService.getCelFormatado(JOptionPane.showInputDialog("Celular"));
		String email = JOptionPane.showInputDialog("E-mail");
		boolean auxEmial = ValidarDadosService.isEmailValido(email);
		while(!auxEmial){
			auxEmial = ValidarDadosService.isEmailValido(email = JOptionPane.showInputDialog("E-mail"));
		}

		String redeSocial = JOptionPane.showInputDialog("Redes Sociais");
		String userName = JOptionPane.showInputDialog("Cadastre um login");
		String senha = JOptionPane.showInputDialog("Cadastre uma senha");

		CadastroDAO.cadastrarFuncionario(new Funcionario(codigo, nome, data, cpf, logradouro, num, bairro, cidade, uf, complemento, CEP,
				fone, celular, email, redeSocial, userName, senha));
	}

	public static void cadVendaProduto(){
		Integer codPtVenda = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do ponto de venda"));
		Integer codFun = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do funcionario vendedor"));
		Integer codProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto vendido"));
		Integer qtdProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade vendida do produto"));

		if(PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(codPtVenda) && PesquisarFuncionarioDAO.pesquisarFuncionario(codFun) && PesquisarProdutoDAO.pesquisarProduto(codProduto)){
			CadastroDAO.cadastrarVenda(new Venda(codProduto, codPtVenda, codFun, qtdProduto));
		}
	}

	public static void cadAbastecerProduto(){

		Integer codPtVenda = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do ponto de venda"));
		Integer codProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto vendido"));
		Integer qtdProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade vendida do produto"));

		if(PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(codPtVenda) && PesquisarProdutoDAO.pesquisarProduto(codProduto)){
			CadastroDAO.cadastrarAbastecimento(new Abestecer(codProduto, codPtVenda, qtdProduto));
		}
	}
}
