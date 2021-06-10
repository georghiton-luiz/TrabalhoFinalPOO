package repository;

import controller.MenuListaProduto;
import service.PontoDeVendaCadastrado;
import service.ProtudoCadastrado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PesquisarProdutoDAO {

    public static boolean pesquisarProduto(Integer pesquisar){

        String query = "select * from produto where cod_produto = "+ pesquisar +";";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastrado> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastrado.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastrado.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastrado.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastrado.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastrado.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastrado.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastrado.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastrado.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastrado.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastrado.getInstance());
            }
            return PontoDeVendaCadastrado.getInstance().getCodigo().equals(pesquisar);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void pesquisarProdutoCodigo(Integer pesquisar){

        String query = "select * from produto where cod_produto = "+ pesquisar +";";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastrado> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastrado.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastrado.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastrado.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastrado.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastrado.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastrado.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastrado.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastrado.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastrado.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastrado.getInstance());
            }

            MenuListaProduto.menuListarProduto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarProdutoPtVenda(Integer pesquisar){

        String query = "select * from produto where cod_ptvenda = "+ pesquisar +";";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastrado> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastrado.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastrado.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastrado.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastrado.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastrado.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastrado.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastrado.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastrado.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastrado.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastrado.getInstance());
            }

            MenuListaProduto.menuListarProduto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarProdutoCategoria(String pesquisar){

        String query = "select * from produto where categoria_produto = '"+ pesquisar +"'";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastrado> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastrado.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastrado.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastrado.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastrado.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastrado.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastrado.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastrado.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastrado.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastrado.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastrado.getInstance());
            }
            MenuListaProduto.menuListarProduto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarProdutoTipo(String pesquisar){

        String query = "select * from produto where tipo_produto = '"+ pesquisar +"'";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastrado> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastrado.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastrado.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastrado.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastrado.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastrado.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastrado.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastrado.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastrado.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastrado.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastrado.getInstance());
            }
            MenuListaProduto.menuListarProduto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarProdutoTamanho(String pesquisar){

        String query = "select * from produto where tamanho_produto = '"+ pesquisar +"'";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastrado> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastrado.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastrado.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastrado.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastrado.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastrado.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastrado.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastrado.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastrado.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastrado.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastrado.getInstance());
            }
            MenuListaProduto.menuListarProduto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void pesquisarProdutoModelo(String pesquisar){

        String query = "select * from produto where modelo_produto = '"+ pesquisar +"'";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastrado> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastrado.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastrado.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastrado.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastrado.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastrado.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastrado.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastrado.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastrado.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastrado.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastrado.getInstance());
            }
            MenuListaProduto.menuListarProduto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void pesquisarProdutoCor(String pesquisar){

        String query = "select * from produto where cor_produto = '"+ pesquisar +"'";

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        List<ProtudoCadastrado> list = new ArrayList<>();

        try {
            while (rs.next()){
                ProtudoCadastrado.getInstance().setCodigo(rs.getInt("cod_produto"));
                ProtudoCadastrado.getInstance().setCategoria(rs.getString("categoria_produto"));
                ProtudoCadastrado.getInstance().setTipo(rs.getString("tipo_produto"));
                ProtudoCadastrado.getInstance().setTamanho(rs.getString("tamanho_produto"));
                ProtudoCadastrado.getInstance().setModelo(rs.getString("modelo_produto"));
                ProtudoCadastrado.getInstance().setCor(rs.getString("cor_produto"));
                ProtudoCadastrado.getInstance().setDescricao(rs.getString("descricao_produto"));
                ProtudoCadastrado.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                ProtudoCadastrado.getInstance().setPreco(rs.getDouble("preco_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVenda(rs.getInt("cod_ptvenda"));

                System.out.println(ProtudoCadastrado.getInstance());
            }
            MenuListaProduto.menuListarProduto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

