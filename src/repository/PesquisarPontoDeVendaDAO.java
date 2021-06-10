package repository;

import service.PontoDeVendaCadastrado;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PesquisarPontoDeVendaDAO {

    public PesquisarPontoDeVendaDAO(){

    }

    public static boolean pesquisarPontoDeVenda(Integer cod){

        ConexaoDAO.getInstance();

        String query = "select * from ponto_de_venda where cod_ptvenda = "+ cod +"";
        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        try {
            while (rs.next()){
                PontoDeVendaCadastrado.getInstance().setCodigo(rs.getInt("cod_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setLogradouro(rs.getString("logradouro_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setNum(rs.getString("num_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setBairro(rs.getString("bairro_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCidade(rs.getString("cidade_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCidade(rs.getString("uf_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setComplemento(rs.getString("compl_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCEP(rs.getString("cep_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setFone(rs.getString("fone_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCelular(rs.getString("celular_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setEmail(rs.getString("email_ptvenda"));
                PesquisarFuncionarioDAO.pesquisarFuncionario(rs.getInt("cod_fun"));

                System.out.println(PontoDeVendaCadastrado.getInstance());
            }
            return PontoDeVendaCadastrado.getInstance().getCodigo().equals(cod);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void pesquisarPontoDeVendaCodigo(Integer cod){

        ConexaoDAO.getInstance();

        String query = "select * from ponto_de_venda where cod_ptvenda = "+ cod +"";
        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        try {
            while (rs.next()){
                PontoDeVendaCadastrado.getInstance().setCodigo(rs.getInt("cod_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setLogradouro(rs.getString("logradouro_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setNum(rs.getString("num_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setBairro(rs.getString("bairro_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCidade(rs.getString("cidade_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setUf(rs.getString("uf_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setComplemento(rs.getString("compl_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCEP(rs.getString("cep_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setFone(rs.getString("fone_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCelular(rs.getString("celular_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setEmail(rs.getString("email_ptvenda"));
                PesquisarFuncionarioDAO.pesquisarFuncionario(rs.getInt("cod_fun"));

                System.out.println(PontoDeVendaCadastrado.getInstance());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarPontoDeVendaBairro(String pesquisar){

        ConexaoDAO.getInstance();

        String query = "select * from ponto_de_venda where bairro_ptvenda = '"+ pesquisar +"'";
        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        try {
            while (rs.next()){
                PontoDeVendaCadastrado.getInstance().setCodigo(rs.getInt("cod_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setLogradouro(rs.getString("logradouro_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setNum(rs.getString("num_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setBairro(rs.getString("bairro_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCidade(rs.getString("cidade_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCidade(rs.getString("uf_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setComplemento(rs.getString("compl_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCEP(rs.getString("cep_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setFone(rs.getString("fone_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCelular(rs.getString("celular_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setEmail(rs.getString("email_ptvenda"));
                PesquisarFuncionarioDAO.pesquisarFuncionario(rs.getInt("cod_fun"));

                System.out.println(PontoDeVendaCadastrado.getInstance());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarPontoDeVendaCidade(String pesquisar){

        ConexaoDAO.getInstance();

        String query = "select * from ponto_de_venda where cidade_ptvenda = '"+ pesquisar +"'";
        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        try {
            while (rs.next()){
                PontoDeVendaCadastrado.getInstance().setCodigo(rs.getInt("cod_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setLogradouro(rs.getString("logradouro_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setNum(rs.getString("num_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setBairro(rs.getString("bairro_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCidade(rs.getString("cidade_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCidade(rs.getString("uf_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setComplemento(rs.getString("compl_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCEP(rs.getString("cep_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setFone(rs.getString("fone_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCelular(rs.getString("celular_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setEmail(rs.getString("email_ptvenda"));
                PesquisarFuncionarioDAO.pesquisarFuncionario(rs.getInt("cod_fun"));

                System.out.println(PontoDeVendaCadastrado.getInstance());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarPontoDeVendaFuncionario(Integer cod){

        ConexaoDAO.getInstance();

        String query = "select * from ponto_de_venda where cod_fun = "+ cod +"";
        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        try {
            while (rs.next()){
                PontoDeVendaCadastrado.getInstance().setCodigo(rs.getInt("cod_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setLogradouro(rs.getString("logradouro_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setNum(rs.getString("num_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setBairro(rs.getString("bairro_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCidade(rs.getString("cidade_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCidade(rs.getString("uf_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setComplemento(rs.getString("compl_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCEP(rs.getString("cep_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setFone(rs.getString("fone_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCelular(rs.getString("celular_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setEmail(rs.getString("email_ptvenda"));
                PesquisarFuncionarioDAO.pesquisarFuncionario(rs.getInt("cod_fun"));

                System.out.println(PontoDeVendaCadastrado.getInstance().toStringFuncionario());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarPontoDeVendaProduto(Integer cod){

        ConexaoDAO.getInstance();

        String query = "select * from ponto_de_venda where cod_fun = "+ cod +"";
        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        try {
            while (rs.next()){
                PontoDeVendaCadastrado.getInstance().setCodigo(rs.getInt("cod_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setLogradouro(rs.getString("logradouro_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setNum(rs.getString("num_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setBairro(rs.getString("bairro_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCidade(rs.getString("cidade_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCidade(rs.getString("uf_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setComplemento(rs.getString("compl_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCEP(rs.getString("cep_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setFone(rs.getString("fone_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCelular(rs.getString("celular_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setEmail(rs.getString("email_ptvenda"));
                PesquisarProdutoDAO.pesquisarProdutoCodigo(rs.getInt("cod_produto"));

                System.out.println(PontoDeVendaCadastrado.getInstance().toStringProduto());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
