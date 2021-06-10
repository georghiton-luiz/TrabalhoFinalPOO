package repository;

import javax.swing.*;
import java.time.LocalDate;

public class EditarFuncionarioDAO {

    private static String update;
    private static Integer cod;

    public static void editarNomeFuncionario(String update, Integer cod) {

        String query = "UPDATE funcionario SET nome_fun = '" + update + "' "
                + "WHERE funcionario.cod_fun = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarDataNascFuncionario(LocalDate update, Integer cod) {

        String query = "UPDATE funcionario SET data_nasc_fun = '" + update + "' "
                + "WHERE funcionario.cod_fun = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarCpfFuncionario(String update, Integer cod) {

        String query = "UPDATE funcionario SET cpf_fun = '" + update + "' "
                + "WHERE funcionario.cod_fun = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarRuaFuncionario(String update, Integer cod) {

        String query = "UPDATE funcionario SET logradouro_fun = '" + update + "' "
                + "WHERE funcionario.cod_fun = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarNumFuncionario(String update, Integer cod) {

        String query = "UPDATE funcionario SET num_fun = '" + update + "' "
                + "WHERE funcionario.cod_fun = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarBairroFuncionario(String update, Integer cod) {

        String query = "UPDATE funcionario SET bairro_fun = '" + update + "' "
                + "WHERE funcionario.cod_fun = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarCidadeFuncionario(String update, Integer cod) {

        String query = "UPDATE funcionario SET cidade_fun = '" + update + "' "
                + "WHERE funcionario.cod_fun = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarUfFuncionario(String update, Integer cod) {

        String query = "UPDATE funcionario SET uf_fun = '" + update + "' "
                + "WHERE funcionario.cod_fun = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarComplementoFuncionario(String update, Integer cod) {

        String query = "UPDATE funcionario SET compl_fun = '" + update + "' "
                + "WHERE funcionario.cod_fun = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarCEPFuncionario(String update, Integer cod) {

        String query = "UPDATE funcionario SET cep_fun = '" + update + "' "
                + "WHERE funcionario.cod_fun = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarFoneFuncionario(String update, Integer cod) {

        String query = "UPDATE funcionario SET fone_fun = '" + update + "' "
                + "WHERE funcionario.cod_fun = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarCelularFuncionario(String update, Integer cod) {

        String query = "UPDATE funcionario SET celular_fun = '" + update + "' "
                + "WHERE funcionario.cod_fun = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarEmailFuncionario(String update, Integer cod) {

        String query = "UPDATE funcionario SET email_fun = '" + update + "' "
                + "WHERE funcionario.cod_fun = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }

    public static void editarRedeSocialFuncionario(String update, Integer cod) {

        String query = "UPDATE funcionario SET redesocial_fun = '" + update + "' "
                + "WHERE funcionario.cod_fun = "+ cod + "";
        ConexaoDAO.getInstance().executaSQL(query);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso");

    }
}
