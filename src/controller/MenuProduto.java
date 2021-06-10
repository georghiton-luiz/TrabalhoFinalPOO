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
                    [4] Deletar Produto
                    [0] Sair"""));
            switch (op) {
                case 1 -> Cadastro.cadProduto();
                case 2 -> MenuListaProduto.menuListarProduto();
                case 3 -> MenuEditarProduto.menuEditarProduto();
            }
        } while (op != 0);
    }
}
