package repository;

public class DeletarFuncionarioDAO {

    public static boolean deletarFuncionario(Integer cod) {

        try {

            String query = "delete from funcionario where cod_fun = " + cod +"";
            ConexaoDAO.getInstance().executaSQL(query);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
