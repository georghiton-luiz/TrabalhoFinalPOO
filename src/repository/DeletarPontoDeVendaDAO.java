package repository;

public class DeletarPontoDeVendaDAO {

    public static boolean deletarPontoDeVenda(Integer cod) {

        try {

            String query = "delete from ponto_de_venda where cod_ptvenda = " + cod +"";
            ConexaoDAO.getInstance().executaSQL(query);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
