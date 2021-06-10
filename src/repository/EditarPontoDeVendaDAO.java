package repository;

import javax.swing.*;

public class EditarPontoDeVendaDAO {

    private static String update;
    private static Integer cod;

    public static void editarRuaPontoDeVenda(String update, Integer cod) {

        String query = "UPDATE ponto_de_venda SET logradouro_ptvenda = '" + update + "' "
                + "WHERE ponto_de_venda.cod_ptvenda = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarNumPontoDeVenda(String update, Integer cod) {

        String query = "UPDATE ponto_de_venda SET num_ptvenda = '" + update + "' "
                + "WHERE ponto_de_venda.cod_ptvenda = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarBairroPontoDeVenda(String update, Integer cod) {

        String query = "UPDATE ponto_de_venda SET bairro_ptvenda = '" + update + "' "
                + "WHERE ponto_de_venda.cod_ptvenda = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarCidadePontoDeVenda(String update, Integer cod) {

        String query = "UPDATE ponto_de_venda SET cidade_ptvenda = '" + update + "' "
                + "WHERE ponto_de_venda.cod_ptvenda = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarUfPontoDeVenda(String update, Integer cod) {

        String query = "UPDATE ponto_de_venda SET uf_ptvenda = '" + update + "' "
                + "WHERE ponto_de_venda.cod_ptvenda = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarComplementoPontoDeVenda(String update, Integer cod) {

        String query = "UPDATE ponto_de_venda SET compl_ptvenda = '" + update + "' "
                + "WHERE ponto_de_venda.cod_ptvenda = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarCEPPontoDeVenda(String update, Integer cod) {

        String query = "UPDATE ponto_de_venda SET cep_ptvenda = '" + update + "' "
                + "WHERE ponto_de_venda.cod_ptvenda = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarFonePontoDeVenda(String update, Integer cod) {

        String query = "UPDATE ponto_de_venda SET fone_ptvenda = '" + update + "' "
                + "WHERE ponto_de_venda.cod_ptvenda = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarCelularPontoDeVenda(String update, Integer cod) {

        String query = "UPDATE ponto_de_venda SET celular_ptvenda = '" + update + "' "
                + "WHERE ponto_de_venda.cod_ptvenda = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarEmailPontoDeVenda(String update, Integer cod) {

        String query = "UPDATE ponto_de_venda SET email_ptvenda = '" + update + "' "
                + "FROM ponto_de_venda WHERE ponto_de_venda.cod_ptvenda = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }
}
