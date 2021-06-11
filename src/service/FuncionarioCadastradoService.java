package service;


import model.Funcionario;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class FuncionarioCadastradoService extends Funcionario {

    private static Date dataNasc;
    private static String dataConvertida;

    public static FuncionarioCadastradoService funcionarioCadastradoService;

    private FuncionarioCadastradoService(){

    }

    public Integer getCodigo() {
        return super.getCodigo();
    }

    public void setCodigo(Integer codigo) {
        super.setCodigo(codigo);
    }

    public String getNome() {
        return super.getNome();
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public LocalDate getDataNascimento() {
        return super.getDataNascimento();
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        super.setDataNascimento(dataNascimento);
    }

    public String getCPF() {
        return super.getCPF();
    }

    public void setCPF(String CPF) {
        super.setCPF(CPF);
    }

    public String getFone() {
        return super.getFone();
    }

    public void setFone(String fone) {
        super.setFone(fone);
    }

    public static Date getDataNasc() {
        return dataNasc;
    }

    public static void setDataNasc(Date dataNasc) {
        FuncionarioCadastradoService.dataNasc = dataNasc;
    }

    public static String getDataConvertida() {
        return dataConvertida;
    }

    public static void setDataConvertida(String dataConvertida) {
        FuncionarioCadastradoService.dataConvertida = dataConvertida;
    }

    public String getCelular() {
        return super.getCelular();
    }

    public void setCelular(String celular) {
        super.setCelular(celular);
    }

    public String getEmail() {
        return super.getEmail();
    }

    public void setEmail(String email) {
        super.setEmail(email);
    }

    public String getRedeSocial() {
        return super.getRedeSocial();
    }

    public void setRedeSocial(String redeSocial) {
        super.setRedeSocial(redeSocial);
    }

    public String getUserName() {
        return super.getUserName();
    }

    public void setUserName(String userName) {
        super.setUserName(userName);
    }

    public String getSenha() {
        return super.getSenha();
    }

    public void setSenha(String senha) {
        super.setSenha(senha);
    }

    public static FuncionarioCadastradoService getInstance() {
        if (Objects.nonNull(funcionarioCadastradoService)) {
            return funcionarioCadastradoService;
        }
        funcionarioCadastradoService = new FuncionarioCadastradoService();
        return funcionarioCadastradoService;
    }
}
