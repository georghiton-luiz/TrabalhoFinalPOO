package model;

import service.FormatarDadosService;
import service.VendaCadastradaService;

import java.time.LocalDate;

public class Venda{

    private Integer codVenda;
    private Integer codProduto;
    private Integer codPtVenda;
    private Integer codFun;
    private Integer qtd;
    private LocalDate ldData;

    public Venda() {
    }

    public Venda(Integer codProduto, Integer codPtVenda, Integer codFun, Integer qtd) {
        this.codProduto = codProduto;
        this.codPtVenda = codPtVenda;
        this.codFun = codFun;
        this.qtd = qtd;
    }

    public Integer getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(Integer codVenda) {
        this.codVenda = codVenda;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public Integer getCodPtVenda() {
        return codPtVenda;
    }

    public void setCodPtVenda(Integer codPtVenda) {
        this.codPtVenda = codPtVenda;
    }

    public Integer getCodFun() {
        return codFun;
    }

    public void setCodFun(Integer codFun) {
        this.codFun = codFun;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public LocalDate getLdData() {
        return ldData;
    }

    public void setLdData(LocalDate ldData) {
        this.ldData = ldData;
    }


    public String toString() {
        return "Venda: " +
                "\nCódigo da venda: " + VendaCadastradaService.getInstance().getCodVenda() +
                "\nCodigo do Produto: " + codProduto +
                "\nCódigo do ponto de venda: " + codPtVenda +
                "\nCódigo do funcionario: " + codFun +
                "\nQuantidade: " + qtd +
                "\nData da venda: " + FormatarDadosService.dataFormatada(VendaCadastradaService.getData());
    }
}
