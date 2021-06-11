package repository;

import service.ProtudoCadastradoService;
import service.VendaCadastradaService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PesquisarVendaDAO {

    public static void pesquisarPontoDeVenda(Integer pesquisar){

        String query = "select * from venda where cod_ptVenda = "+ pesquisar +";";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastradoService> list = new ArrayList<>();

        try {
            while (rs.next()){
                VendaCadastradaService.getInstance().setCodVenda(rs.getInt("cod_venda"));
                VendaCadastradaService.getInstance().setCodPtVenda(rs.getInt("cod_ptVenda"));
                VendaCadastradaService.getInstance().setCodFun(rs.getInt("cod_fun"));
                VendaCadastradaService.getInstance().setCodProduto(rs.getInt("cod_produto"));
                VendaCadastradaService.getInstance().setQtd(rs.getInt("qtd_venda"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarFuncionario(Integer pesquisar){

        String query = "select * from venda where cod_fun = "+ pesquisar +";";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastradoService> list = new ArrayList<>();

        try {
            while (rs.next()){
                VendaCadastradaService.getInstance().setCodVenda(rs.getInt("cod_venda"));
                VendaCadastradaService.getInstance().setCodPtVenda(rs.getInt("cod_ptVenda"));
                VendaCadastradaService.getInstance().setCodFun(rs.getInt("cod_fun"));
                VendaCadastradaService.getInstance().setCodProduto(rs.getInt("cod_produto"));
                VendaCadastradaService.getInstance().setQtd(rs.getInt("qtd_venda"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarProduto(Integer pesquisar){

        String query = "select * from venda where cod_produto = "+ pesquisar +";";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastradoService> list = new ArrayList<>();

        try {
            while (rs.next()){
                VendaCadastradaService.getInstance().setCodVenda(rs.getInt("cod_venda"));
                VendaCadastradaService.getInstance().setCodPtVenda(rs.getInt("cod_ptVenda"));
                VendaCadastradaService.getInstance().setCodFun(rs.getInt("cod_fun"));
                VendaCadastradaService.getInstance().setCodProduto(rs.getInt("cod_produto"));
                VendaCadastradaService.getInstance().setQtd(rs.getInt("qtd_venda"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarPontoDeVendaProduto(Integer pesquisar1, Integer pesquisar2){

        String query = "select * from venda where cod_produto = "+ pesquisar1 +" AND cod_ptVenda = " + pesquisar2 + "";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastradoService> list = new ArrayList<>();

        try {
            while (rs.next()){
                VendaCadastradaService.getInstance().setCodVenda(rs.getInt("cod_venda"));
                VendaCadastradaService.getInstance().setCodPtVenda(rs.getInt("cod_ptVenda"));
                VendaCadastradaService.getInstance().setCodFun(rs.getInt("cod_fun"));
                VendaCadastradaService.getInstance().setCodProduto(rs.getInt("cod_produto"));
                VendaCadastradaService.getInstance().setQtd(rs.getInt("qtd_venda"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarFuncionarioProduto(Integer pesquisar1, Integer pesquisar2){

        String query = "select * from venda where cod_fun = "+ pesquisar1 +" AND cod_produto = " + pesquisar2 + "";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastradoService> list = new ArrayList<>();

        try {
            while (rs.next()){
                VendaCadastradaService.getInstance().setCodVenda(rs.getInt("cod_venda"));
                VendaCadastradaService.getInstance().setCodPtVenda(rs.getInt("cod_ptVenda"));
                VendaCadastradaService.getInstance().setCodFun(rs.getInt("cod_fun"));
                VendaCadastradaService.getInstance().setCodProduto(rs.getInt("cod_produto"));
                VendaCadastradaService.getInstance().setQtd(rs.getInt("qtd_venda"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarFuncionarioPontoDeVenda(Integer pesquisar1, Integer pesquisar2){

        String query = "select * from venda where cod_fun = "+ pesquisar1 +" AND cod_ptVenda = " + pesquisar2 + "";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastradoService> list = new ArrayList<>();

        try {
            while (rs.next()){
                VendaCadastradaService.getInstance().setCodVenda(rs.getInt("cod_venda"));
                VendaCadastradaService.getInstance().setCodPtVenda(rs.getInt("cod_ptVenda"));
                VendaCadastradaService.getInstance().setCodFun(rs.getInt("cod_fun"));
                VendaCadastradaService.getInstance().setCodProduto(rs.getInt("cod_produto"));
                VendaCadastradaService.getInstance().setQtd(rs.getInt("qtd_venda"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
