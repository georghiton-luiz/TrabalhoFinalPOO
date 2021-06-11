package controller;

import repository.AbastecerEstoqueDAO;

import service.AbastecimentoCadastradoService;
import service.CadastroService;



public class MenuEfetuaAbastecimentoEstoque {

    public static void menuEfetuaAbastecimentoEstoque(){

        CadastroService.cadAbastecerProduto();
        AbastecerEstoqueDAO.abastecerProduto(AbastecimentoCadastradoService.getInstance().getCodProduto(), AbastecimentoCadastradoService.getInstance().getCodPtVenda(), AbastecimentoCadastradoService.getInstance().getQtd());
    }
}
