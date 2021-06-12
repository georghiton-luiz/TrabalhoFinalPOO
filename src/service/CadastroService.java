package service;

import controller.MenuCadastrarPontoDeVenda;
import model.*;
import repository.*;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class CadastroService {
	
	public CadastroService() {
		
	}

	public static void cadProduto() {

		try{

			Integer codPtVenda = Integer.parseInt(JOptionPane.showInputDialog("Código o Ponto de venda cadastrado"));

			if(PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(codPtVenda)){
				Integer cod = Integer.parseInt(JOptionPane.showInputDialog("Código do produto"));
				String categoria = JOptionPane.showInputDialog("Categoria").toUpperCase();
				String tipo = JOptionPane.showInputDialog("Tipo").toUpperCase();
				String tamanho = JOptionPane.showInputDialog("Tamanho").toUpperCase();
				String modelo = JOptionPane.showInputDialog("Modelo").toUpperCase();
				String cor = JOptionPane.showInputDialog("Cor").toUpperCase();
				Integer qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade"));
				String descricao = JOptionPane.showInputDialog("Descrição do produto").toUpperCase();
				Double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço R$"));

				Produtos produto = new Produtos(cod, categoria, tipo, tamanho, modelo, cor, qtd, descricao, preco, PontoDeVendaCadastradoService.getInstance());
				CadastroDAO.cadastrarProduto(produto);
			}else{
				throw new NullPointerException();
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Ponto de venda não encontrado \nCadastre um ponto de venda");
			MenuCadastrarPontoDeVenda.menuCadastrarPontoDeVenda();
		}
	}

	public static void cadPtVenda() {

		try{

			Integer codFun = Integer.parseInt(JOptionPane.showInputDialog("Código de funcionario cadastrado"));

			if(PesquisarFuncionarioDAO.pesquisarFuncionario(codFun)){

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
				PontoDeVenda pdVenda = new PontoDeVenda(cod, logradouro, num, bairro, cidade, uf, complemento, cep, fone, celular,
						email, FuncionarioCadastradoService.getInstance());
				CadastroDAO.cadastrarPontoDeVenda(pdVenda);
			}else{
				JOptionPane.showMessageDialog(null, "funcionario não encontrado\nCadastre um funcionario");
			}
		} catch (HeadlessException | NumberFormatException e) {
			e.printStackTrace();
		}
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

	public static void cadVendaProduto(Integer codPtVenda, Integer codProduto, Integer codFun, Integer qtdProduto){

		if(PesquisarProdutoDAO.pesquisarProduto(codProduto) && PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(codPtVenda)){

			if(ProtudoCadastradoService.getInstance().getQuantidade() > qtdProduto){
				CadastroDAO.cadastrarVenda(new Venda(codPtVenda, codProduto, codFun, qtdProduto));
				VendaDAO.venderProduto(VendaCadastradaService.getInstance().getCodProduto(), VendaCadastradaService.getInstance().getCodPtVenda(),
						ProtudoCadastradoService.getInstance().getQuantidade() - qtdProduto);
				JOptionPane.showMessageDialog(null, "Venda realizado");
			}else{
				JOptionPane.showMessageDialog(null, "Estoque insuficiente");
			}
		}
	}

	public static void cadAbastecerProduto(Integer codPtVenda, Integer codProduto, Integer qtdProduto){

		if(PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(codPtVenda) && PesquisarProdutoDAO.pesquisarProduto(codProduto)){
			CadastroDAO.cadastrarAbastecimento(new Abestecer(codProduto, codPtVenda, qtdProduto));
			VendaDAO.venderProduto(VendaCadastradaService.getInstance().getCodProduto(), VendaCadastradaService.getInstance().getCodPtVenda(),
					ProtudoCadastradoService.getInstance().getQuantidade() + qtdProduto);
			JOptionPane.showMessageDialog(null, "Reabastimento realizado");
		}
	}
}
