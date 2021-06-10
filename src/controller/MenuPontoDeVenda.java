package controller;

import service.Cadastro;

import javax.swing.*;

public class MenuPontoDeVenda {

    public static void menuPontoDeVenda(){

        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Digita um opção
                    [1] Cadastrar ponto de venda
                    [2] Listar ponto de venda
                    [3] Editar ponto de venda
                    [4] Deletar ponto de venda
                    [0] Sair"""));
            switch (op) {
                case 1 -> Cadastro.cadPtVenda();
                case 2 -> MenuListaPontoDeVenda.menuListaPontoDeVenda();
                case 3 -> MenuEditarPontoDeVenda.menuEditarPontoDeVenda();
                case 4 -> MenuDeletarPontoDeVenda.menuDeletarPontoDeVenda();
            }
        } while (op != 0);
    }

}


