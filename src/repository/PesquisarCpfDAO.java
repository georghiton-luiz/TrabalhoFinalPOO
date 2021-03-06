package repository;

import java.sql.ResultSet;

public class PesquisarCpfDAO {

    public static boolean pesquisarCpf(String cpf) {
        String auxCpf = "";
        try {
            String query = "SELECT cpf_fun FROM funcionario WHERE funcionario.cpf_fun = '"
                    + cpf + "'";
            ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

            while (rs.next()) {
                auxCpf = rs.getString("cpf_fun");
            }
            return auxCpf.equals(cpf);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
