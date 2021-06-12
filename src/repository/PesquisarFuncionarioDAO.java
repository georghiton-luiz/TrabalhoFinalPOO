package repository;

import service.FuncionarioCadastradoService;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PesquisarFuncionarioDAO {

    public static boolean pesquisarFuncionario(Integer cod){
        pesquisar("select * from funcionario where cod_fun = "+ cod +"");
            return FuncionarioCadastradoService.getInstance().getCodigo().equals(cod);
    }

    public static void pesquisarFuncionarioCod(Integer cod){
        pesquisar("select * from funcionario where cod_fun = "+ cod +"");
        FuncionarioCadastradoService.getInstance();
    }

    public static void pesquisarFuncionarioBairro(String pesquisar){
        pesquisar("select * from funcionario where bairro_fun = '"+ pesquisar +"'");
        FuncionarioCadastradoService.getInstance();
    }

    public static void pesquisarFuncionarioCidade(String pesquisar){
        pesquisar("select * from funcionario where cidade_fun = '"+ pesquisar +"'");
        FuncionarioCadastradoService.getInstance();
    }

    public static void pesquisar(String query){

        ResultSet rs = ConexaoDAO.getInstance().executaBusca(query);

        try {
            while (rs.next()){
                FuncionarioCadastradoService.getInstance().setCodigo(rs.getInt("cod_fun"));
                FuncionarioCadastradoService.getInstance().setNome(rs.getString("nome_fun"));
                FuncionarioCadastradoService.setDataNasc(rs.getDate("data_nasc_fun"));
                FuncionarioCadastradoService.getInstance().setCPF(rs.getString("cpf_fun"));
                FuncionarioCadastradoService.setDataNasc(rs.getDate("data_nasc_fun"));
                FuncionarioCadastradoService.getInstance().setLogradouro(rs.getString("logradouro_fun"));
                FuncionarioCadastradoService.getInstance().setNum(rs.getString("num_fun"));
                FuncionarioCadastradoService.getInstance().setBairro(rs.getString("bairro_fun"));
                FuncionarioCadastradoService.getInstance().setCidade(rs.getString("cidade_fun"));
                FuncionarioCadastradoService.getInstance().setUf(rs.getString("uf_fun"));
                FuncionarioCadastradoService.getInstance().setComplemento(rs.getString("compl_fun"));
                FuncionarioCadastradoService.getInstance().setCEP(rs.getString("cep_fun"));
                FuncionarioCadastradoService.getInstance().setFone(rs.getString("fone_fun"));
                FuncionarioCadastradoService.getInstance().setCelular(rs.getString("celular_fun"));
                FuncionarioCadastradoService.getInstance().setEmail(rs.getString("email_fun"));
                FuncionarioCadastradoService.getInstance().setRedeSocial(rs.getString("redesociais_fun"));
                FuncionarioCadastradoService.getInstance().setUserName(rs.getString("username_fun"));
                FuncionarioCadastradoService.getInstance().setSenha(rs.getString("senha_fun"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
