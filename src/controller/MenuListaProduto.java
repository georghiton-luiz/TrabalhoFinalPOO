package controller;

import repository.PesquisarProdutoDAO;

import javax.swing.*;

public class MenuListaProduto {

    public static void menuListarProduto(){

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
                PesquisarProdutoDAO.pesquisarProdutoCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto")));
                break;
            case 2:
                PesquisarProdutoDAO.pesquisarProdutoPtVenda(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do ponto de venda")));
                break;
            case 3:
                PesquisarProdutoDAO.pesquisarProdutoCategoria(JOptionPane.showInputDialog("Digite a categoria do produto").toUpperCase());
                break;
            case 4:
                PesquisarProdutoDAO.pesquisarProdutoTipo(JOptionPane.showInputDialog("Digite o tipo do produto").toUpperCase());
                break;
            case 5:
                PesquisarProdutoDAO.pesquisarProdutoTamanho(JOptionPane.showInputDialog("Digite o tipo do produto").toUpperCase());
                break;
            case 6:
                PesquisarProdutoDAO.pesquisarProdutoModelo(JOptionPane.showInputDialog("Digite o modelo do produto").toUpperCase());
                break;
            case 7:
                PesquisarProdutoDAO.pesquisarProdutoCor(JOptionPane.showInputDialog("Digite a cor do produto").toUpperCase());
                break;
            case 0:
                int resp = JOptionPane.showConfirmDialog(null, "Deseja sair da pesquisa de produtos", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuListaProduto.menuListarProduto();
                }
                break;
            default:
                resp = JOptionPane.showConfirmDialog(null, "Opção inválida\nDeseja sair do menu listagem de produto", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuListaProduto.menuListarProduto();
                }
        }
    }

}
