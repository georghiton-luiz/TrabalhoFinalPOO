package repository;

import javax.swing.*;

public class VendaDAO {

    public static void venderProduto(Integer codProduto, Integer codPtVenda, Integer qtd_venda) {

        String query = "UPDATE produto SET qtd_produto = " + qtd_venda + " WHERE produto.cod_produto = "+ codProduto +" AND produto.cod_ptvenda = "+ codPtVenda +";";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");
    }
}
