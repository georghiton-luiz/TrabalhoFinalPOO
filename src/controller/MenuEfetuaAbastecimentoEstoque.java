package controller;

import repository.AbastecerEstoqueDAO;

import service.AbastecimentoCadastradoService;
import service.CadastroService;

import javax.swing.*;


public class MenuEfetuaAbastecimentoEstoque {

    public static void menuEfetuaAbastecimentoEstoque(){

        Integer codPtVenda = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do ponto de venda"));
        Integer codProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto vendido"));
        Integer qtdProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade vendida do produto"));

        CadastroService.cadAbastecerProduto(codPtVenda, codProduto, qtdProduto);
    }
}
