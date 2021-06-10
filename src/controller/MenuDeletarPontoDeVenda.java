package controller;

import repository.DeletarPontoDeVendaDAO;

import javax.swing.*;

public class MenuDeletarPontoDeVenda {

    public static void menuDeletarPontoDeVenda(){

        DeletarPontoDeVendaDAO.deletarPontoDeVenda(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do ponto de venda que deseja deletar")));

    }

}
