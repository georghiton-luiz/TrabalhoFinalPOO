package repository;

import javax.swing.*;

public class EditarProduto {

    public static void editarProdutoCategoria(String update, Integer cod) {

        String query = "UPDATE produto SET categoria_protudo = '" + update + "' "
                + "FROM produto WHERE produto.cod_produto = " + cod +"";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }
}
