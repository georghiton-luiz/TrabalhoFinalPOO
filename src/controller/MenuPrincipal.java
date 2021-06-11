package controller;

import javax.swing.*;

public class MenuPrincipal {

    public static void menuPrincipal(){

        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Digita um opção
                    [1] Funcionario
                    [2] Ponto de venda
                    [3] Produto
                    [4] Vender
                    [5] Repor estoque
                    [0] Sair"""));
            switch (op){
                case 1:
                    MenuFuncionario.menuFuncionario();
                    break;
                case 2:
                    MenuPontoDeVenda.menuPontoDeVenda();
                    break;
                case 3:
                    MenuProduto.menuProduto();
                    break;
                case 4:
                    MenuVenda.menuVenda();
                    break;
                case 5:
                    MenuAbastecerEstoque.menuAbastecerEstoque();
                    break;
                case 0:
                    int resp = JOptionPane.showConfirmDialog(null, "Deseja sair", "ALERT",
                            JOptionPane.YES_NO_OPTION);
                    if (resp == 0) {
                        JOptionPane.showMessageDialog(null, "Saindo do aplicativo");
                        System.exit(resp);
                    } else {
                        MenuPrincipal.menuPrincipal();
                    }
                    break;
                default:
                    resp = JOptionPane.showConfirmDialog(null, "Opção invalida\nDeseja sair do aplicativo", "ALERT",
                            JOptionPane.YES_NO_OPTION);
                    if (resp == 0) {
                        JOptionPane.showMessageDialog(null, "Saindo do aplicativo");
                        System.exit(resp);
                    } else {
                        MenuPrincipal.menuPrincipal();
                    }
            }

        }while(op != 0);
    }

}
