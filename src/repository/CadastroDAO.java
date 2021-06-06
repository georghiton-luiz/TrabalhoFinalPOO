package repository;


import model.Funcionario;
import model.PontoDeVenda;
import model.Produtos;

public class CadastroDAO {
		
	public static void cadastrarProduto(Produtos produto) {
		
		String queryProduto;
				
		queryProduto = "INSERT INTO dados_paciente (id_paciente,nome_paciente,data_nasc_paciente,"
				+ "rg_paciente,org_emissor_paciente,cpf_paciente,num_sus_paciente)values" + "(default,')";
		ConexaoDAO.getInstance().executaSQL(queryProduto);
		ConexaoDAO.getInstance().fecharConexao();
	}
	
	public static void cadastrarPontoDeVenda(PontoDeVenda pontoDeVenda) {

		String query = "INSERT INTO cad_funcionario (id_fun, nome_fun, doc_fun, user_name_fun, senha_fun, email_fun)"
				+ "values" + "(default,')";
		ConexaoDAO.getInstance().executaSQL(query);
		ConexaoDAO.getInstance().fecharConexao();
	}

	public static void cadastrarFuncionario(Funcionario funcionario){

		String query = "INSERT INTO funcionario (id_fun, nome_fun, endereco_fun, data_nasc_fun, cpf_fun, fone_fun, celular_fun, email_fun, rede_sociais_fun)values"
				+ "(default,'" + funcionario.getNome() + "','" + funcionario.getEndereco() + "','" + funcionario.getDataNascimento() + "','" + funcionario.getCPF()
				+ "','"	+ funcionario.getFone() + "','" + funcionario.getCelular() + "','" + funcionario.getEmail() + "','" + funcionario.getRedeSocial() +"')";
		ConexaoDAO.getInstance().executaSQL(query);
		ConexaoDAO.getInstance().fecharConexao();
	}
}
