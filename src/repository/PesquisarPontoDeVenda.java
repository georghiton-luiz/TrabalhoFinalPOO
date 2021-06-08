package repository;

import service.PontoDeVendaCadastrado;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PesquisarPontoDeVenda {

    public PesquisarPontoDeVenda(){

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
                PontoDeVendaCadastrado.getInstance().setCidade(rs.getString("cidade_prvenda"));
                PontoDeVendaCadastrado.getInstance().setCidade(rs.getString("uf_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setComplemento(rs.getString("compl_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCEP(rs.getString("cep_prvenda"));
                PontoDeVendaCadastrado.getInstance().setFone(rs.getString("fone_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setCelular(rs.getString("celular_ptvenda"));
                PontoDeVendaCadastrado.getInstance().setEmail(rs.getString("email_ptvenda"));
            }
            return PontoDeVendaCadastrado.getInstance().getCodigo().equals(cod);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
