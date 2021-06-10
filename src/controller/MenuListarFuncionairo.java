package controller;

import repository.PesquisarFuncionarioDAO;
import repository.PesquisarPontoDeVendaDAO;

import javax.swing.*;

public class MenuListarFuncionairo {

    public static void menuListarFuncionario(){

        int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                Escolha uma opção para listar os produtos
                [1] Código do Funcionario
                [2] Código Ponto de Venda
                [3] Bairro
                [4] Cidade
                [0] Sair"""));
        switch(op1){
            case 1:
                PesquisarFuncionarioDAO.pesquisarFuncionarioCod(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto")));
                break;
            case 2:
                PesquisarFuncionarioDAO.pesquisarFuncionarioPtVenda(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do ponto de venda")));
                break;
            case 3:
                PesquisarFuncionarioDAO.pesquisarFuncionarioBairro(JOptionPane.showInputDialog("Digite o bairro do funcionario").toUpperCase());
                break;
            case 4:
                PesquisarFuncionarioDAO.pesquisarFuncionarioCidade(JOptionPane.showInputDialog("Digite a cidade").toUpperCase());
                break;
            case 0:
                int resp = JOptionPane.showConfirmDialog(null, "Deseja sair da pesquisa de funcionario", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuListarFuncionairo.menuListarFuncionario();
                }
                break;
            default:
                resp = JOptionPane.showConfirmDialog(null, "Opção inválida\nDeseja sair do menu listagem de funcionario", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuListarFuncionairo.menuListarFuncionario();
                }
        }
    }

}
