package controller;

import repository.PesquisarPontoDeVenda;

import javax.swing.*;

public class MenuListaPontoDeVenda {

    public static void menuListaPontoDeVenda() {

        int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                Escolha uma opção para listar os produtos
                [1] Código do Ponto de Venda
                [2] Código do Funcionario
                [3] Bairro
                [4] Cidade
                [5] Produto
                [0] Sair"""));
        switch (op1) {
            case 1:
                PesquisarPontoDeVenda.pesquisarPontoDeVendaCodigo(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do ponto de venda")));
                break;
            case 2:
                PesquisarPontoDeVenda.pesquisarPontoDeVendaFuncionario(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do funcionario")));
                break;
            case 3:
                PesquisarPontoDeVenda.pesquisarPontoDeVendaBairro(JOptionPane.showInputDialog("Digita o bairro do ponto de venda"));
                break;
            case 4:
                PesquisarPontoDeVenda.pesquisarPontoDeVendaCidade(JOptionPane.showInputDialog("Digita a cidade do ponto de venda"));
                break;
            case 5:
                MenuListaProduto.menuListarProduto();
                break;
            case 0:
                int resp = JOptionPane.showConfirmDialog(null, "Deseja sair da pesquisa de ponto de venda", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuListaProduto.menuListarProduto();
                }
            default:
                resp = JOptionPane.showConfirmDialog(null, "Opção invalida\nDeseja sair do menu listagem de ponto de venda", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuPontoDeVenda.menuPontoDeVenda();
                }
        }
    }
}
