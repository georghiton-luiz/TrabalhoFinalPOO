package repository;

import javax.swing.*;

public class EditarProdutoDAO {

    private static String update;
    private static Integer cod;
    private static Integer codPtVenda;

    public static void editarProdutoCategoria(String update, Integer cod, Integer codPtVenda) {

        String query = "UPDATE produto SET categoria_produdo = '" + update + "' "
                + "WHERE produto.cod_produto = " + cod + " AND produto.cod_ptvenda = "+ codPtVenda +"";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarProdutoTipo(String update, Integer cod, Integer codPtVenda) {

        String query = "UPDATE produto SET tipo_produdt = '" + update + "' "
                + "WHERE produto.cod_produto = " + cod + " AND produto.cod_ptvenda = "+ codPtVenda +"";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarProdutoTamanho(String update, Integer cod, Integer codPtVenda) {

        String query = "UPDATE produto SET tamanho_produto = '" + update + "' "
                + "WHERE produto.cod_produto = " + cod + " AND produto.cod_ptvenda = "+ codPtVenda +"";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarProdutoModelo(String update, Integer cod, Integer codPtVenda) {

        String query = "UPDATE produto SET modelo_produto = '" + update + "' "
                + "WHERE produto.cod_produto = " + cod + " AND produto.cod_ptvenda = "+ codPtVenda +"";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarProdutoCor(String update, Integer cod, Integer codPtVenda) {

        String query = "UPDATE produto SET cor_produto = '" + update + "' "
                + "WHERE produto.cod_produto = " + cod + " AND produto.cod_ptvenda = "+ codPtVenda +"";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarProdutoPreco(Double update, Integer cod, Integer codPtVenda) {

        String query = "UPDATE produto SET preco_produto = " + update +
                " WHERE produto.cod_produto = " + cod + " AND produto.cod_ptvenda = "+ codPtVenda +"";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }
}
