package controller;

import service.CadastroService;

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
                    [5] Vender Produto
                    [0] Sair"""));
            switch (op) {
                case 1 -> CadastroService.cadProduto();
                case 2 -> MenuListaProduto.menuListarProduto();
                case 3 -> MenuEditarProduto.menuEditarProduto();
                case 4 -> MenuDeletarProtudo.menuDeletarProduto();
                case 5 -> MenuVenda.menuVenda();

            }
        } while (op != 0);
    }
}
