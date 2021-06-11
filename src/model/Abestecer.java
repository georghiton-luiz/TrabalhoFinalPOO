package model;


import service.AbastecimentoCadastradoService;
import service.FormatarDadosService;
import service.VendaCadastradaService;

import java.time.LocalDate;

public class Abestecer{

    private Integer codAbast;
    private Integer codProduto;
    private Integer codPtVenda;
    private Integer qtd;
    private LocalDate ldData;

    public Abestecer() {
    }

    public Abestecer(Integer codProduto, Integer codPtVenda, Integer qtd) {
        this.codProduto = codProduto;
        this.codPtVenda = codPtVenda;
        this.qtd = qtd;
    }

    public Integer getCodAbast() {
        return codAbast;
    }

    public void setCodAbast(Integer codAbast) {
        this.codAbast = codAbast;
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

    @Override
    public String toString() {
        return "Reposição de Estoque: " +
                "\nCódigo da reposição: " + AbastecimentoCadastradoService.getInstance().getCodAbast() +
                "\nCodigo do Produto: " + codProduto +
                "\nCódigo do ponto de venda: " + codPtVenda +
                "\nQuantidade: " + qtd +
                "\nData da venda: " + FormatarDadosService.dataFormatada(AbastecimentoCadastradoService.getData());
    }
}
