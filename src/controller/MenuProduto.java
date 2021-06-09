package controller;

import service.Cadastro;

import javax.swing.*;

public class MenuProduto {

    public static void menuProduto() {

        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Digita um opção
                    [1] Cadastrar Produto
                    [2] Listar Produto
                    [3] Editar Produto
                    [0] Sair"""));
            switch (op) {
                case 1:
                    Cadastro.cadProduto();
                    break;
                case 2:
            }
        } while (op != 0);
    }
}
