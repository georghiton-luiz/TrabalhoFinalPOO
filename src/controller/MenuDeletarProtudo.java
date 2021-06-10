package controller;

import repository.DeletarProtudoDAO;

import javax.swing.*;

public class MenuDeletarProtudo {

    public static void menuDeletarProduto(){

        DeletarProtudoDAO.deletarProduto(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto que deseja deletar")));

    }
}
