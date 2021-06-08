package repository;


import model.Funcionario;
import model.PontoDeVenda;
import model.Produtos;

import javax.swing.*;

public class CadastroDAO {
		
	public static void cadastrarProduto(Produtos produto) {
		
		String queryProduto;
				
		queryProduto = "INSERT INTO produto (cod_produto, cod_ptvenda, categoria_produto, tipo_produto, tamanho_produto, modelo_produto, cor_produto, " +
				"descricao_produto, qtd_produto, preco_produto)values"
				+ "('" + produto.getCodigo() + "','" + produto.getPontoDeVenda().getCodigo() + "','" + produto.getCategoria()
				+ "','" + produto.getTipo() + "','" + produto.getTamanho() + "','" + produto.getModelo()
				+ "','" + produto.getCor() + "','" + produto.getDescricao() + "','" + produto.getQuantidade() + "','"	+ produto.getPreco() + "')";
		ConexaoDAO.getInstance().executaSQL(queryProduto);
		ConexaoDAO.getInstance().fecharConexao();
		JOptionPane.showMessageDialog(null, "Cadastro realizado");
	}
	
	public static void cadastrarPontoDeVenda(PontoDeVenda pontoDeVenda) {

		String query = "INSERT INTO ponto_de_venda (cod_ptVenda, cod_fun, logradouro_ptVenda, num_ptVenda, bairro_ptVenda, " +
				"cidade_ptVenda, uf_ptVenda, compl_ptVenda, cep_ptVenda, fone_ptVenda, celular_ptVenda, email_ptVenda)values"
				+ "('" + pontoDeVenda.getCodigo() + "','" + pontoDeVenda.getFuncionario().getCodigo() + "','" + pontoDeVenda.getLogradouro()
				+ "','" + pontoDeVenda.getNum() + "','" + pontoDeVenda.getBairro() + "','" + pontoDeVenda.getCidade()
				+ "','" + pontoDeVenda.getUf() + "','" + pontoDeVenda.getComplemento() + "','" + pontoDeVenda.getCEP() + "','"	+ pontoDeVenda.getFone()
				+ "','" + pontoDeVenda.getCelular() + "','" + pontoDeVenda.getEmail() + "')";
		ConexaoDAO.getInstance().executaSQL(query);
		ConexaoDAO.getInstance().fecharConexao();
		JOptionPane.showMessageDialog(null, "Cadastro realizado");
	}

	public static void cadastrarFuncionario(Funcionario funcionario){

		String query = "INSERT INTO funcionario (cod_fun, nome_fun, data_nasc_fun, cpf_fun, logradouro_fun, num_fun, bairro_fun, cidade_fun, uf_fun, compl_fun, cep_fun, " +
				"fone_fun, celular_fun, email_fun, redesociais_fun, username_fun, senha_fun)values"
				+ "('" + funcionario.getCodigo() + "','" + funcionario.getNome() + "','" + funcionario.getDataNascimento() + "','" + funcionario.getCPF()
				+ "','" + funcionario.getLogradouro() + "','" + funcionario.getNum() + "','" + funcionario.getBairro() + "','" + funcionario.getCidade()
				+ "','" + funcionario.getUf() + "','" + funcionario.getComplemento() + "','" + funcionario.getCEP() + "','"	+ funcionario.getFone()
				+ "','" + funcionario.getCelular() + "','" + funcionario.getEmail() + "','" + funcionario.getRedeSocial()
				+ "','" + funcionario.getUserName() + "','" + funcionario.getSenha() +"')";
		ConexaoDAO.getInstance().executaSQL(query);
		ConexaoDAO.getInstance().fecharConexao();
		JOptionPane.showMessageDialog(null, "Cadastro realizado");
	}
}
