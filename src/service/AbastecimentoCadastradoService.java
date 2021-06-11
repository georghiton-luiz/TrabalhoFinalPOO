package service;

import model.Abestecer;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class AbastecimentoCadastradoService extends Abestecer {

    private static Date data;
    private static String dataConvertida;

    private static AbastecimentoCadastradoService abastecerService;

    private AbastecimentoCadastradoService(){

    }

    public Integer getCodAbast() {
        return super.getCodAbast();
    }

    public void setCodAbast(Integer codAbast) {
        super.setCodAbast(codAbast);
    }

    public Integer getCodProduto() {
        return super.getCodProduto();
    }

    public void setCodProduto(Integer codProduto) {
        super.setCodProduto(codProduto);
    }

    public Integer getCodPtVenda() {
        return super.getCodPtVenda();
    }

    public void setCodPtVenda(Integer codPtVenda) {
        super.setCodPtVenda(codPtVenda);
    }

    public Integer getQtd() {
        return super.getQtd();
    }

    public void setQtd(Integer qtd) {
        super.setQtd(qtd);
    }

    public static Date getData() {
        return data;
    }

    public static void setDataNasc(Date data) {
        AbastecimentoCadastradoService.data = data;
    }

    public static String getDataConvertida() {
        return dataConvertida;
    }

    public static void setDataConvertida(String dataConvertida) {
        AbastecimentoCadastradoService.dataConvertida = dataConvertida;
    }

    public LocalDate getLdData() {
        return super.getLdData();
    }

    public void setLdData(LocalDate ldData) {
        super.setLdData(ldData);
    }

    public static AbastecimentoCadastradoService getInstance() {
        if (Objects.nonNull(abastecerService)) {
            return abastecerService;
        }
        abastecerService = new AbastecimentoCadastradoService();
        return abastecerService;
    }
}
