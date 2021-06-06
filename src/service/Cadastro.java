package service;

import repository.CadastroDAO;
import repository.PesquisarCpfDAO;
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

		produto = new Produtos(
				Integer.parseInt(JOptionPane.showInputDialog("Código do produto")),
				JOptionPane.showInputDialog("Categoria"),
		        JOptionPane.showInputDialog("Tipo"),
				JOptionPane.showInputDialog("Tamanho").toUpperCase(),
				JOptionPane.showInputDialog("Modelo"),
				JOptionPane.showInputDialog("Cor"),
				Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade")),
				JOptionPane.showInputDialog("Descrição do produto"),
				Double.parseDouble(JOptionPane.showInputDialog("Preço R$")));
		CadastroDAO.cadastrarProduto(produto);
	}

	public static void cadPtVenda() {

		pdVenda = new PontoDeVenda(
				Integer.parseInt(JOptionPane.showInputDialog("Código do ponto de venda")),
				JOptionPane.showInputDialog("Logradouro"),
				JOptionPane.showInputDialog("Número"),
				JOptionPane.showInputDialog("Bairro"),
				JOptionPane.showInputDialog("Cidade"),
				JOptionPane.showInputDialog("UF"),
				JOptionPane.showInputDialog("Complemento"),
				FormatarDados.getCepFormatado(JOptionPane.showInputDialog("CEP")),
				FormatarDados.gerFoneFormatado(JOptionPane.showInputDialog("Fone")),
				FormatarDados.getCelFormatado(JOptionPane.showInputDialog("Celular")),
				JOptionPane.showInputDialog("E-mail"));
		CadastroDAO.cadastrarPontoDeVenda(pdVenda);
	}

	public static void cadFuncionario() {
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do funcionario"));
		String nome = JOptionPane.showInputDialog("Nome");
		String endereco = JOptionPane.showInputDialog("Endereço");
		LocalDate data = FormatarDados.formatarData(JOptionPane.showInputDialog("Data de Nascimento"));
		String cpf = JOptionPane.showInputDialog("CPF");
		boolean auxCpf = ValidarDados.isCPF(cpf);
		while(!auxCpf || PesquisarCpfDAO.pesquisarCpf(FormatarDados.getCpfFormatado(cpf))){
			auxCpf = ValidarDados.isCPF(cpf = JOptionPane.showInputDialog("CPF invalido ou já cadastrado\nDigite CPF"));
		}
		cpf = FormatarDados.getCpfFormatado(cpf);
		String fone = FormatarDados.gerFoneFormatado(JOptionPane.showInputDialog("Fone"));
		String celular = FormatarDados.getCelFormatado(JOptionPane.showInputDialog("Celular"));
		String email = JOptionPane.showInputDialog("E-mail");
		boolean auxEmial = ValidarDados.isEmailValido(email);
		while(!auxEmial){
			auxEmial = ValidarDados.isEmailValido(email = JOptionPane.showInputDialog("E-mail"));
		}
		String redeSocial = JOptionPane.showInputDialog("Redes Sociais");

		CadastroDAO.cadastrarFuncionario(funcionario = new Funcionario(codigo, nome, endereco, data, cpf, fone, celular, email, redeSocial));
	}
}
