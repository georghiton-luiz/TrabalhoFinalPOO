package service;

import model.PontoDeVenda;
import model.Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProtudoCadastrado extends Produtos {

    private static ProtudoCadastrado protudoCadastradoService;
    private static List<ProtudoCadastrado> listarProduto = new ArrayList<>();

    private ProtudoCadastrado() {
    }

    public Integer getCodigo() {
        return super.getCodigo();
    }

    public void setCodigo(Integer codigo) {
        super.setCodigo(codigo);
    }

    public String getCategoria() {
        return super.getCategoria();
    }

    public void setCategoria(String categoria) {
        super.setCategoria(categoria);
    }

    public String getTipo() {
        return super.getTipo();
    }

    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    public String getTamanho() {
        return super.getTamanho();
    }

    public void setTamanho(String tamanho) {
        super.setTamanho(tamanho);
    }

    public String getModelo() {
        return super.getModelo();
    }

    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    public String getCor() {
        return super.getCor();
    }

    public void setCor(String cor) {
        super.setCor(cor);
    }

    public Integer getQuantidade() {
        return super.getQuantidade();
    }

    public void setQuantidade(Integer quantidade) {
        super.setQuantidade(quantidade);
    }

    public String getDescricao() {
        return super.getDescricao();
    }

    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }

    public Double getPreco() {
        return super.getPreco();
    }

    public void setPreco(Double preco) {
        super.setPreco(preco);
    }

    public PontoDeVenda getPontoDeVenda() {
        return super.getPontoDeVenda();
    }

    public void setPontoDeVenda(PontoDeVenda ptVenda) {
        super.setPontoDeVenda(ptVenda);
    }

    public static List<ProtudoCadastrado> getListarProduto() {
        return listarProduto;
    }

    public static void setListarProduto(List<ProtudoCadastrado> listarProduto) {
        ProtudoCadastrado.listarProduto = listarProduto;
    }

    public static ProtudoCadastrado getInstance() {
        if (Objects.nonNull(protudoCadastradoService)) {
            return protudoCadastradoService;
        }
        protudoCadastradoService = new ProtudoCadastrado();
        return protudoCadastradoService;
    }
}
