package service;

import model.Funcionario;
import model.PontoDeVenda;

import java.util.Objects;

public class PontoDeVendaCadastradoService extends PontoDeVenda {

    private static PontoDeVendaCadastradoService pontoDeVendaService;

    private PontoDeVendaCadastradoService(){

    }

    public Integer getCodigo() {
        return super.getCodigo();
    }

    public void setCodigo(Integer codigo) {
        super.setCodigo(codigo);
    }

    public String getFone() {
        return super.getFone();
    }

    public void setFone(String fone) {
        super.setFone(fone);
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

    public Funcionario getFuncionario() {
        return super.getFuncionario();
    }

    public void setFuncionario(Funcionario funcionario) {
        super.setFuncionario(funcionario);
    }

    public static PontoDeVendaCadastradoService getInstance() {
        if (Objects.nonNull(pontoDeVendaService)) {
            return pontoDeVendaService;
        }
        pontoDeVendaService = new PontoDeVendaCadastradoService();
        return pontoDeVendaService;
    }
}
