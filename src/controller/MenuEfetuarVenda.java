package controller;

import service.CadastroService;

import javax.swing.*;


public class MenuEfetuarVenda {

    public static void menuEfetuarVender(){

        Integer codPtVenda = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do ponto de venda"));
        Integer codFun = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do funcionario vendedor"));
        Integer codProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto vendido"));
        Integer auxQtdProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade vendida do produto"));

        CadastroService.cadVendaProduto(codPtVenda, codProduto, codFun, auxQtdProduto);

    }
}
