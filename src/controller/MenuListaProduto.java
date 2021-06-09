package controller;

import repository.PesquisarProduto;

import javax.swing.*;

public class MenuListaProduto {

    public static void listarProdutoCategoria(){

        int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                Escolha uma opção para listar os produtos
                [1] Código do Produto
                [2] Código Ponto de Venda
                [3] Categoria
                [4] Tipo
                [5] Tamanho
                [6] Modelo
                [7] Cor
                [0] Sair"""));
        switch(op1){
            case 1:
                PesquisarProduto.pesquisarProdutoPtVenda(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto")));
                break;
            case 2:
                PesquisarProduto.pesquisarProdutoPtVenda(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do ponto de venda")));
                break;
            case 3:
                PesquisarProduto.pesquisarProdutoCategoria(JOptionPane.showInputDialog("Digite a categoria do produto").toUpperCase());
                break;
            case 4:
                PesquisarProduto.pesquisarProdutoTipo(JOptionPane.showInputDialog("Digite o tipo do produto").toUpperCase());
                break;
            case 5:

                break;
            case 6:
                PesquisarProduto.pesquisarProdutoModelo(JOptionPane.showInputDialog("Digite o modelo do produto").toUpperCase());
                break;
            case 7:
                PesquisarProduto.pesquisarProdutoCor(JOptionPane.showInputDialog("Digite a cor do produto").toUpperCase());
                break;
            case 0:
                int resp = JOptionPane.showConfirmDialog(null, "Deseja sair da pesquisa de produtos", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuListaProduto.listarProdutoCategoria();
                }
                break;
            default:
        }
    }

}
