package service;

import model.Venda;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class VendaCadastradaService extends Venda {

    private static Date data;
    private static String dataConvertida;

    private static VendaCadastradaService venderService;

    private VendaCadastradaService(){

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

    public Integer getCodFun() {
        return super.getCodFun();
    }

    public void setCodFun(Integer codFun) {
        super.setCodFun(codFun);
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
        VendaCadastradaService.data = data;
    }

    public static String getDataConvertida() {
        return dataConvertida;
    }

    public static void setDataConvertida(String dataConvertida) {
        VendaCadastradaService.dataConvertida = dataConvertida;
    }

    public LocalDate getLdData() {
        return super.getLdData();
    }

    public void setLdData(LocalDate ldData) {
        super.setLdData(ldData);
    }

    public static VendaCadastradaService getInstance() {
        if (Objects.nonNull(venderService)) {
            return venderService;
        }
        venderService = new VendaCadastradaService();
        return venderService;
    }
}