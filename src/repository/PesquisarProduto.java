package repository;

import service.ProtudoCadastrado;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PesquisarProduto {

    public static void pesquisarProduto(){

        String query = "select * from produto";
        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        try {
            while (rs.next()){
                ProtudoCadastrado.setCodProduto(rs.getInt("cod_produto"));
                ProtudoCadastrado.setCodPtVenda(rs.getInt("cod_ptvenda"));
                ProtudoCadastrado.setCategoriaProduto(rs.getString("categoria_produto"));
                ProtudoCadastrado.setTipoProduto(rs.getString("tipo_produto"));
                ProtudoCadastrado.setTamanhoProduto(rs.getString("tamanho_produto"));
                ProtudoCadastrado.setModeloProduto(rs.getString("modelo_produto"));
                ProtudoCadastrado.setCorProduto(rs.getString("cor_produto"));
                ProtudoCadastrado.setDescricaoProduto(rs.getString("descricao_produto"));
                ProtudoCadastrado.setQtdProduto(rs.getInt("qtd_produto"));
                ProtudoCadastrado.setPrecoProduto(rs.getDouble("preco_produto"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

