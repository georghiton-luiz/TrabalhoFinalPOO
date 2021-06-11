package repository;

import javax.swing.*;

public class VendaDAO {

    public static void venderProduto(Integer codProduto, Integer codPtVenda, Integer qtd_venda) {

        String query = "SELECT (SELECT SUM(qtd_venda) FROM venda where cod_produto = " + codProduto + " and cod_ptvenda = " + codPtVenda + ") - " + qtd_venda + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");
    }
}
