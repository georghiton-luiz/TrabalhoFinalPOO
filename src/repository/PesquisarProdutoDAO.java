package repository;

import controller.MenuListaProduto;
import service.PontoDeVendaCadastradoService;
import service.ProtudoCadastradoService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PesquisarProdutoDAO {

    public static boolean pesquisarProduto(Integer pesquisar){

        String query = "select * from produto where cod_produto = "+ pesquisar +";";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastradoService> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastradoService.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastradoService.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastradoService.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastradoService.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastradoService.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastradoService.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastradoService.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastradoService.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastradoService.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastradoService.getInstance());
            }
            return PontoDeVendaCadastradoService.getInstance().getCodigo().equals(pesquisar);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void pesquisarProdutoCodigo(Integer pesquisar){

        String query = "select * from produto where cod_produto = "+ pesquisar +";";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastradoService> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastradoService.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastradoService.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastradoService.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastradoService.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastradoService.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastradoService.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastradoService.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastradoService.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastradoService.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastradoService.getInstance());
            }

            MenuListaProduto.menuListarProduto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarProdutoPtVenda(Integer pesquisar){

        String query = "select * from produto where cod_ptvenda = "+ pesquisar +";";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastradoService> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastradoService.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastradoService.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastradoService.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastradoService.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastradoService.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastradoService.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastradoService.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastradoService.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastradoService.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastradoService.getInstance());
            }

            MenuListaProduto.menuListarProduto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarProdutoCategoria(String pesquisar){

        String query = "select * from produto where categoria_produto = '"+ pesquisar +"'";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastradoService> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastradoService.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastradoService.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastradoService.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastradoService.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastradoService.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastradoService.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastradoService.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastradoService.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastradoService.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastradoService.getInstance());
            }
            MenuListaProduto.menuListarProduto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarProdutoTipo(String pesquisar){

        String query = "select * from produto where tipo_produto = '"+ pesquisar +"'";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastradoService> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastradoService.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastradoService.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastradoService.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastradoService.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastradoService.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastradoService.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastradoService.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastradoService.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastradoService.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastradoService.getInstance());
            }
            MenuListaProduto.menuListarProduto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarProdutoTamanho(String pesquisar){

        String query = "select * from produto where tamanho_produto = '"+ pesquisar +"'";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastradoService> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastradoService.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastradoService.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastradoService.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastradoService.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastradoService.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastradoService.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastradoService.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastradoService.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastradoService.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastradoService.getInstance());
            }
            MenuListaProduto.menuListarProduto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarProdutoModelo(String pesquisar){

        String query = "select * from produto where modelo_produto = '"+ pesquisar +"'";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastradoService> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastradoService.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastradoService.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastradoService.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastradoService.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastradoService.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastradoService.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastradoService.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastradoService.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastradoService.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastradoService.getInstance());
            }
            MenuListaProduto.menuListarProduto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void pesquisarProdutoCor(String pesquisar){

        String query = "select * from produto where cor_produto = '"+ pesquisar +"'";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastradoService> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastradoService.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastradoService.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastradoService.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastradoService.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastradoService.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastradoService.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastradoService.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastradoService.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastradoService.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastradoService.getInstance());
            }
            MenuListaProduto.menuListarProduto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

