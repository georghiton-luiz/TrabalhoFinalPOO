package repository;

import service.FuncionarioCadastrado;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PesquisarFuncionario {

    public static boolean pesquisarFuncionario(Integer cod){

        String query = "select * from cad_funcionario where id_fun = "+ cod +"";
        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        try {
            while (rs.next()){
                FuncionarioCadastrado.getInstance().setCodigo(rs.getInt("cod_fun"));
                FuncionarioCadastrado.getInstance().setNome(rs.getString("nome_fun"));
                FuncionarioCadastrado.getInstance().setCPF(rs.getString("cpf_fun"));
                FuncionarioCadastrado.getInstance().setLogradouro(rs.getString("logradouro_fun"));
                FuncionarioCadastrado.getInstance().setNum(rs.getString("num_fun"));
                FuncionarioCadastrado.getInstance().setBairro(rs.getString("bairro_fun"));
                FuncionarioCadastrado.getInstance().setCidade(rs.getString("cidade_fun"));
                FuncionarioCadastrado.getInstance().setUf(rs.getString("uf_fun"));
                FuncionarioCadastrado.getInstance().setComplemento(rs.getString("compl_fun"));
                FuncionarioCadastrado.getInstance().setCEP(rs.getString("cep_fun"));
                FuncionarioCadastrado.getInstance().setFone(rs.getString("fone_fun"));
                FuncionarioCadastrado.getInstance().setCelular(rs.getString("celular_fun"));
                FuncionarioCadastrado.getInstance().setEmail(rs.getString("email_fun"));
                FuncionarioCadastrado.getInstance().setRedeSocial(rs.getString("redesociais_fun"));
                FuncionarioCadastrado.getInstance().setUserName(rs.getString("username_fun"));
                FuncionarioCadastrado.getInstance().setSenha(rs.getString("senha_fun"));
            }
            return FuncionarioCadastrado.getInstance().getCodigo().equals(cod);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
