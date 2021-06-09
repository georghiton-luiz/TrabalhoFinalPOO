package controller;

import repository.PesquisarProduto;

import javax.swing.*;

public class MenuEditarProduto {

    public static void menuEditarProduto(){

        int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                Escolha o intem a ser editado de um produtos
                [1] Categoria
                [2] Tipo
                [3] Tamanho
                [4] Modelo
                [5] Cor
                [6] Preço
                [0] Sair"""));
        switch(op1){
            case 1:
                PesquisarProduto.pesquisarProdutoCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto")));
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
                PesquisarProduto.pesquisarProdutoTamanho(JOptionPane.showInputDialog("Digite o tipo do produto").toUpperCase());
                break;
            case 6:

                break;
            case 0:
                int resp = JOptionPane.showConfirmDialog(null, "Deseja sair da edição de produtos", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuListaProduto.menuListarProduto();
                }
                break;
            default:
                resp = JOptionPane.showConfirmDialog(null, "Opção inválida\nDeseja sair do menu editar produtos", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuListaProduto.menuListarProduto();
                }
        }
    }

}
