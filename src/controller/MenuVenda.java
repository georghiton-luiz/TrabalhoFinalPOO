package controller;

import javax.swing.*;

public class MenuVenda {

    public static void menuVenda() {

        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Digita um opção
                    [1] Efetuar venda
                    [2] Listar venda
                    [0] Sair"""));
            switch (op) {
                case 1 -> MenuEfetuarVenda.menuEfetuarVender();
                case 2 -> MenuListarVenda.menuListarFuncionario();
            }
        } while (op != 0);
    }
}
