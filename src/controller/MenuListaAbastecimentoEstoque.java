package controller;

import repository.PesquisarAbastecimentoDAO;
import repository.PesquisarVendaDAO;

import javax.swing.*;

public class MenuListaAbastecimentoEstoque {

    public static void menuListaAbastecimentoEstoque(){

        int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                Escolha uma opção para listar os produtos
                [1] Código do ponto de venda
                [2] Código do produto
                [3] Código do produto e ponto de venda
                [0] Sair"""));
        switch(op1){
            case 1:
                PesquisarAbastecimentoDAO.pesquisarPontoDeVenda(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do ponto de venda")));
                break;
            case 2:
                PesquisarAbastecimentoDAO.pesquisarProduto(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto")));
                break;
            case 3:
                PesquisarAbastecimentoDAO.pesquisarPontoDeVendaProduto(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do produto")), Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do ponto de venda"))) ;
                break;
            case 0:
                int resp = JOptionPane.showConfirmDialog(null, "Deseja sair do histórico de reposição do estoque", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuListaAbastecimentoEstoque.menuListaAbastecimentoEstoque();
                }
                break;
            default:
                resp = JOptionPane.showConfirmDialog(null, "Opção inválida\nDeseja sair do histórico de reposição do estoque", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuListaAbastecimentoEstoque.menuListaAbastecimentoEstoque();
                }
        }
    }
}
