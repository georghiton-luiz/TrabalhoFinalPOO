package repository;

public class DeletarProtudoDAO {

    public static boolean deletarProduto(Integer cod) {

        try {

            String query = "delete from produto where cod_produto = " + cod +"";
            ConexaoDAO.getInstance().executaSQL(query);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
