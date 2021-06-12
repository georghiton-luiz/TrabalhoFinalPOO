package controller;

import repository.EditarProdutoDAO;

import javax.swing.*;

public class MenuEditarProduto {

    public static void menuEditarProduto(){


        int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                Escolha o item a ser editado de um produtos
                [1] Categoria
                [2] Tipo
                [3] Tamanho
                [4] Modelo
                [5] Cor
                [6] Preço
                [0] Sair"""));

        Integer codPtVenda = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do ponto de venda onde esta o produto que deseja alterar"));
        Integer cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto que deseja alterar"));

        switch(op1){
            case 1:
                EditarProdutoDAO.editarProdutoCategoria(JOptionPane.showInputDialog("Digite a categoria correta desse produto").toUpperCase(), cod, codPtVenda);
                break;
            case 2:
                EditarProdutoDAO.editarProdutoTipo(JOptionPane.showInputDialog("Digite o tipo correto desse produto").toUpperCase(), cod, codPtVenda);
                break;
            case 3:
                EditarProdutoDAO.editarProdutoTamanho(JOptionPane.showInputDialog("Digite o tamanho correto desse produto").toUpperCase(), cod, codPtVenda);
                break;
            case 4:
                EditarProdutoDAO.editarProdutoModelo(JOptionPane.showInputDialog("Digite o modelo correto desse produto").toUpperCase(), cod, codPtVenda);
                break;
            case 5:
                EditarProdutoDAO.editarProdutoCor(JOptionPane.showInputDialog("Digite a cor correta desse produto").toUpperCase(), cod, codPtVenda);
                break;
            case 6:
                EditarProdutoDAO.editarProdutoPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite a cor correta desse produto")), cod, codPtVenda);
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
