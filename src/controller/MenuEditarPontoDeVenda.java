package controller;

import repository.EditarPontoDeVendaDAO;
import service.FormatarDados;

import javax.swing.*;

public class MenuEditarPontoDeVenda {

    public static void menuEditarPontoDeVenda(){


        int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                Escolha o item a ser editado de um produtos
                [1] Logradouro
                [2] Número
                [3] Bairro
                [4] Cidade
                [5] Estado
                [6] Complemento
                [7] CEP
                [0] Sair"""));

        Integer cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do ponto que deseja alterar"));

        switch(op1){
            case 1:
                EditarPontoDeVendaDAO.editarRuaPontoDeVenda(JOptionPane.showInputDialog("Digite o logradouro correto").toUpperCase(), cod);
                break;
            case 2:
                EditarPontoDeVendaDAO.editarNumPontoDeVenda(JOptionPane.showInputDialog("Digite o número correto").toUpperCase(), cod);
                break;
            case 3:
                EditarPontoDeVendaDAO.editarBairroPontoDeVenda(JOptionPane.showInputDialog("Digite o bairro correto").toUpperCase(), cod);
                break;
            case 4:
                EditarPontoDeVendaDAO.editarCidadePontoDeVenda(JOptionPane.showInputDialog("Digite a cidade correta").toUpperCase(), cod);
                break;
            case 5:
                EditarPontoDeVendaDAO.editarUfPontoDeVenda(JOptionPane.showInputDialog("Digite o estado(UF) correto").toUpperCase(), cod);
                break;
            case 6:
                EditarPontoDeVendaDAO.editarComplementoPontoDeVenda(JOptionPane.showInputDialog("Digite no complemento correto").toUpperCase(), cod);
                break;
            case 7:
                EditarPontoDeVendaDAO.editarCEPPontoDeVenda(FormatarDados.getCepFormatado(JOptionPane.showInputDialog("Digite o CEP correto")),cod);
                break;
            case 0:
                int resp = JOptionPane.showConfirmDialog(null, "Deseja sair da edição de ponto de venda", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuEditarPontoDeVenda.menuEditarPontoDeVenda();
                }
                break;
            default:
                resp = JOptionPane.showConfirmDialog(null, "Opção inválida\nDeseja sair do menu editar ponto de venda", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuEditarPontoDeVenda.menuEditarPontoDeVenda();
                }
        }
    }
}
