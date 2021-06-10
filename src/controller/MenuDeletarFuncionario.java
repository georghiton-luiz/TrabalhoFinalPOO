package controller;

import repository.DeletarFuncionarioDAO;

import javax.swing.*;

public class MenuDeletarFuncionario {

    public static void menuDeletarFuncionario(){

        DeletarFuncionarioDAO.deletarFuncionario(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionario que deseja deletar")));
    }
}
