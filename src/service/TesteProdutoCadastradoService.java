package service;

import model.PontoDeVenda;

public class TesteProdutoCadastradoService {

    private Integer codigo;
    private String categoria;
    private String tipo;
    private String tamanho;
    private String modelo;
    private String cor;
    private Integer quantidade;
    private Double preco;
    private String descricao;
    private PontoDeVenda pontoDeVenda;
    private static Integer qtd;



    public TesteProdutoCadastradoService() {
    }

    public TesteProdutoCadastradoService(Integer codigo, String categoria, String tipo, String tamanho, String modelo, String cor, Integer quantidade,
                                         Double preco, String descricao, PontoDeVenda pontoDeVenda) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.modelo = modelo;
        this.cor = cor;
        this.quantidade = quantidade;
        this.preco = preco;
        this.descricao = descricao;
        this.pontoDeVenda = pontoDeVenda;
    }

    public TesteProdutoCadastradoService(Integer codigo, String categoria, String tipo, String tamanho, String modelo, String cor, Integer quantidade,
                                         Double preco, String descricao) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.modelo = modelo;
        this.cor = cor;
        this.quantidade = quantidade;
        this.preco = preco;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PontoDeVenda getPontoDeVenda() {
        return pontoDeVenda;
    }

    public void setPontoDeVenda(PontoDeVenda pontoDeVenda) {
        this.pontoDeVenda = pontoDeVenda;
    }

    public static Integer getQtd() {
        return qtd;
    }

    public static void setQtd(Integer qdt) {
        qtd = qdt;
    }


    @Override
    public String toString() {
        return "Produtos:" +
                "\nCódigo = " + codigo +
                "\nCódigo ponto de venda = " + PontoDeVendaCadastradoService.getInstance().getCodigo() +
                "\nCategoria = " + categoria +
                "\nTipo = " + tipo +
                "\nTamanho = " + tamanho +
                "\nModelo = " + modelo +
                "\nCor = " + cor +
                "\nQuantidade = " + quantidade +
                "\nPreco = " + FormatarDadosService.formatarPreco(preco) +
                "\nDescricao = " + descricao +
                "\n----------------------------------------------";
    }
}
