package controller;

import javax.swing.*;

public class MenuAbastecerEstoque {

    public static void menuAbastecerEstoque() {

        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Digita um opção
                    [1] Efetuar reposição
                    [2] Historico de reposição
                    [0] Sair"""));
            switch (op) {
                case 1 -> MenuEfetuaAbastecimentoEstoque.menuEfetuaAbastecimentoEstoque();
                case 2 -> MenuListarVenda.menuListarFuncionario();
            }
        } while (op != 0);
    }
}
