package controller;

import repository.VendaDAO;
import service.VendaCadastradaService;

import static service.CadastroService.cadVendaProduto;

public class MenuEfetuarVenda {

    public static void menuEfetuarVender(){

        cadVendaProduto();
        VendaDAO.venderProduto(VendaCadastradaService.getInstance().getCodProduto(), VendaCadastradaService.getInstance().getCodPtVenda(), VendaCadastradaService.getInstance().getQtd());

    }
}
