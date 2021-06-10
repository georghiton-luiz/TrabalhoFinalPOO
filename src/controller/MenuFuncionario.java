package controller;

import service.Cadastro;

import javax.swing.*;

public class MenuFuncionario {

    public static void menuFuncionario(){
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Digita um opção
                    [1] Cadastrar Funcionario
                    [2] Listar Funcionario
                    [3] Editar Funcionario
                    [4] Deletar Funcionario
                    [0] Sair"""));
            switch (op) {
                case 1 -> Cadastro.cadFuncionario();
                case 2 -> MenuListarFuncionairo.menuListarFuncionario();
                case 3 -> MenuFuncionario.menuFuncionario();
            }
        } while (op != 0);
    }
}

