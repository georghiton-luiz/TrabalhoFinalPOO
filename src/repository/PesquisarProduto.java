package repository;

import service.PontoDeVendaCadastrado;
import service.ProtudoCadastrado;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PesquisarProduto {

    public static void pesquisarProduto(){

        String query = "select * from produto";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        try {
            while (rs.next()){
                ProtudoCadastrado.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastrado.getInstance().getPontoDeVenda().setCodigo(rs.getInt("cod_ptvenda"));
                ProtudoCadastrado.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastrado.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastrado.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastrado.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastrado.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastrado.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastrado.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastrado.getInstance().setPreco(rs.getDouble("preco_produto"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

