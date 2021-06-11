package controller;

import repository.PesquisarFuncionarioDAO;
import repository.PesquisarVendaDAO;

import javax.swing.*;

public class MenuListarVenda {

    public static void menuListarFuncionario(){

        int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                Escolha uma opção para listar os produtos
                [1] Código do funcionario
                [2] Código do ponto de venda
                [3] Código do produto
                [4] Código do funcionario e ponto de venda
                [5] Código do produto e funcionario
                [6] Código do produto e ponto de venda
                [0] Sair"""));
        switch(op1){
            case 1:
                PesquisarVendaDAO.pesquisarFuncionario(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do funcionario")));
                break;
            case 2:
                PesquisarVendaDAO.pesquisarPontoDeVenda(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do ponto de venda")));
                break;
            case 3:
                PesquisarVendaDAO.pesquisarProduto(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do produto")));
                break;
            case 4:
                PesquisarVendaDAO.pesquisarFuncionarioPontoDeVenda(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do funcionario")), Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do ponto de venda")));
                break;
            case 5:
                PesquisarVendaDAO.pesquisarFuncionarioProduto(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do funcionario")), Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto")));
                break;
            case 6:
                PesquisarVendaDAO.pesquisarPontoDeVendaProduto(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto")), Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do ponto de venda")));
                break;
            case 0:
                int resp = JOptionPane.showConfirmDialog(null, "Deseja sair da pesquisa de venda", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuListarVenda.menuListarFuncionario();
                }
                break;
            default:
                resp = JOptionPane.showConfirmDialog(null, "Opção inválida\nDeseja sair do menu listagem de venda", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuListarVenda.menuListarFuncionario();
                }
        }
    }
}
