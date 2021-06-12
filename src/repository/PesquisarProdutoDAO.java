package repository;

import service.PontoDeVendaCadastradoService;
import service.ProtudoCadastradoService;
import service.TesteProdutoCadastradoService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PesquisarProdutoDAO {

    private static List<TesteProdutoCadastradoService> list;

    public static boolean pesquisarProduto(Integer pesquisar){
        pesquisa("select * from produto where cod_produto = " + pesquisar + "");
        return PontoDeVendaCadastradoService.getInstance().getCodigo().equals(pesquisar);
    }

    public static void pesquisarProdutoCodigo(Integer pesquisar){
        pesquisa("select * from produto where cod_produto = " + pesquisar + "");
        toStringListProtudo();
    }

    public static void pesquisarProdutoPtVenda(Integer pesquisar){
        pesquisa("select * from produto where cod_ptvenda = " + pesquisar + "");
        toStringListProtudo();
    }

    public static void pesquisarProdutoCategoria(String pesquisar){
        pesquisa("select * from produto where categoria_produto = '" + pesquisar + "'");
        toStringListProtudo();
    }

    public static void pesquisarProdutoTipo(String pesquisar){
        pesquisa("select * from produto where tipo_produto = '" + pesquisar + "'");
        toStringListProtudo();
    }

    public static void pesquisarProdutoTamanho(String pesquisar){
        pesquisa("select * from produto where tamanho_produto = '" + pesquisar + "'");
        toStringListProtudo();
    }

    public static void pesquisarProdutoModelo(String pesquisar){
        pesquisa("select * from produto where modelo_produto = '" + pesquisar + "'");
        toStringListProtudo();
    }

    public static void pesquisarProdutoCor(String pesquisar){
        pesquisa("select * from produto where cor_produto = '" + pesquisar + "'");
        toStringListProtudo();
    }

    public static void pesquisa(String query){

        TesteProdutoCadastradoService pds = new TesteProdutoCadastradoService();

        ArrayList<TesteProdutoCadastradoService> list = new ArrayList<>();

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        try {
            while (rs.next()){

                pds.setCodigo(rs.getInt("cod_produto"));
                PesquisarPontoDeVendaDAO.pesquisarPontoDeVendaCodigo(rs.getInt("cod_ptvenda"));
                pds.setCategoria(rs.getString("categoria_produto"));
                pds.setTipo(rs.getString("tipo_produto"));
                pds.setTamanho(rs.getString("tamanho_produto"));
                pds.setModelo(rs.getString("modelo_produto"));
                pds.setCor(rs.getString("cor_produto"));
                pds.setDescricao(rs.getString("descricao_produto"));
                pds.setQuantidade(rs.getInt("qtd_produto"));
                pds.setPreco(rs.getDouble("preco_produto"));
                pds.setPontoDeVenda(PontoDeVendaCadastradoService.getInstance());
                ProtudoCadastradoService.getInstance().setQuantidade(rs.getInt("qtd_produto"));
                list.add(pds);
                PesquisarProdutoDAO.setList(list);
                pds = new TesteProdutoCadastradoService();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void toStringListProtudo(){
        for(TesteProdutoCadastradoService pds : getList()){
            System.out.println(pds);
        }
    }

    public static List<TesteProdutoCadastradoService> getList() {
        return list;
    }

    public static void setList(List<TesteProdutoCadastradoService> list) {
        PesquisarProdutoDAO.list = list;
    }
}

