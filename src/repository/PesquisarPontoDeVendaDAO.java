package repository;

import service.PontoDeVendaCadastradoService;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PesquisarPontoDeVendaDAO {

    public PesquisarPontoDeVendaDAO(){

    }

    public static boolean pesquisarPontoDeVenda(Integer cod){
        pesquisar("select * from ponto_de_venda where cod_ptvenda = "+ cod +"");
            return PontoDeVendaCadastradoService.getInstance().getCodigo().equals(cod);
    }

    public static void pesquisarPontoDeVendaCodigo(Integer cod){
        pesquisar("select * from ponto_de_venda where cod_ptvenda = "+ cod +"");
        PontoDeVendaCadastradoService.getInstance();
    }

    public static void pesquisarPontoDeVendaBairro(String pesquisar){
        pesquisar("select * from ponto_de_venda where bairro_ptvenda = '"+ pesquisar +"'");
        PontoDeVendaCadastradoService.getInstance();
    }

    public static void pesquisarPontoDeVendaCidade(String pesquisar){
        pesquisar("select * from ponto_de_venda where cidade_ptvenda = '"+ pesquisar +"'");
        PontoDeVendaCadastradoService.getInstance();
    }

    public static void pesquisarPontoDeVendaFuncionario(Integer cod){
        pesquisar("select * from ponto_de_venda where cod_fun = "+ cod +"");
        PontoDeVendaCadastradoService.getInstance().toStringFuncionario();
    }

    public static void pesquisar(String query){

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        try {
            while (rs.next()){
                PontoDeVendaCadastradoService.getInstance().setCodigo(rs.getInt("cod_ptvenda"));
                PontoDeVendaCadastradoService.getInstance().setLogradouro(rs.getString("logradouro_ptvenda"));
                PontoDeVendaCadastradoService.getInstance().setNum(rs.getString("num_ptvenda"));
                PontoDeVendaCadastradoService.getInstance().setBairro(rs.getString("bairro_ptvenda"));
                PontoDeVendaCadastradoService.getInstance().setCidade(rs.getString("cidade_ptvenda"));
                PontoDeVendaCadastradoService.getInstance().setUf(rs.getString("uf_ptvenda"));
                PontoDeVendaCadastradoService.getInstance().setComplemento(rs.getString("compl_ptvenda"));
                PontoDeVendaCadastradoService.getInstance().setCEP(rs.getString("cep_ptvenda"));
                PontoDeVendaCadastradoService.getInstance().setFone(rs.getString("fone_ptvenda"));
                PontoDeVendaCadastradoService.getInstance().setCelular(rs.getString("celular_ptvenda"));
                PontoDeVendaCadastradoService.getInstance().setEmail(rs.getString("email_ptvenda"));
                PesquisarFuncionarioDAO.pesquisarFuncionario(rs.getInt("cod_fun"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
