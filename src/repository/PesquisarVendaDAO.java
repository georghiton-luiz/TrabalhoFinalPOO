package repository;

import service.ProtudoCadastradoService;
import service.VendaCadastradaService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PesquisarVendaDAO {

    public static void pesquisarPontoDeVenda(Integer pesquisar){
        pesquisar("select * from venda where cod_ptVenda = "+ pesquisar +";");
        VendaCadastradaService.getInstance();
    }

    public static void pesquisarFuncionario(Integer pesquisar){
        pesquisar("select * from venda where cod_fun = "+ pesquisar +";");
        VendaCadastradaService.getInstance();
    }

    public static void pesquisarProduto(Integer pesquisar){
        pesquisar("select * from venda where cod_produto = "+ pesquisar +";");
        VendaCadastradaService.getInstance();
    }

    public static void pesquisarPontoDeVendaProduto(Integer pesquisar1, Integer pesquisar2){
        pesquisar("select * from venda where cod_produto = "+ pesquisar1 +" AND cod_ptVenda = " + pesquisar2 + "");
        VendaCadastradaService.getInstance();
    }

    public static void pesquisarFuncionarioProduto(Integer pesquisar1, Integer pesquisar2){
        pesquisar("select * from venda where cod_fun = "+ pesquisar1 +" AND cod_produto = " + pesquisar2 + "");
        VendaCadastradaService.getInstance();
    }

    public static void pesquisarFuncionarioPontoDeVenda(Integer pesquisar1, Integer pesquisar2){

        pesquisar("select * from venda where cod_fun = "+ pesquisar1 +" AND cod_ptVenda = " + pesquisar2 + "");
        VendaCadastradaService.getInstance();
    }

    public static void pesquisar(String query){
        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        try {
            while (rs.next()){
                VendaCadastradaService.getInstance().setCodVenda(rs.getInt("cod_venda"));
                VendaCadastradaService.getInstance().setCodPtVenda(rs.getInt("cod_ptVenda"));
                VendaCadastradaService.getInstance().setCodFun(rs.getInt("cod_fun"));
                VendaCadastradaService.getInstance().setCodProduto(rs.getInt("cod_produto"));
                VendaCadastradaService.getInstance().setQtd(rs.getInt("qtd_venda"));
                PesquisarProdutoDAO.pesquisarProdutoCodigo(rs.getInt("cod_venda"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVendaCodigo(rs.getInt("cod_ptVenda"));
                PesquisarFuncionarioDAO.pesquisarFuncionarioCod(rs.getInt("cod_fun"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
