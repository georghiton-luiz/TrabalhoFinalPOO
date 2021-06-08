package service;

import java.util.Objects;

public class ProtudoCadastrado {

    private static Integer codProduto;
    private static Integer codPtVenda;
    private static String categoriaProduto;
    private static String tipoProduto;
    private static String tamanhoProduto;
    private static String modeloProduto;
    private static String corProduto;
    private static String descricaoProduto;
    private static Integer qtdProduto;
    private static Double precoProduto;

    private ProtudoCadastrado() {
    }

    public static Integer getCodProduto() {
        return codProduto;
    }

    public static void setCodProduto(Integer codProduto) {
        ProtudoCadastrado.codProduto = codProduto;
    }

    public static Integer getCodPtVenda() {
        return codPtVenda;
    }

    public static void setCodPtVenda(Integer codPtVenda) {
        ProtudoCadastrado.codPtVenda = codPtVenda;
    }

    public static String getCategoriaProduto() {
        return categoriaProduto;
    }

    public static void setCategoriaProduto(String categoriaProduto) {
        ProtudoCadastrado.categoriaProduto = categoriaProduto;
    }

    public static String getTipoProduto() {
        return tipoProduto;
    }

    public static void setTipoProduto(String tipoProduto) {
        ProtudoCadastrado.tipoProduto = tipoProduto;
    }

    public static String getTamanhoProduto() {
        return tamanhoProduto;
    }

    public static void setTamanhoProduto(String tamanhoProduto) {
        ProtudoCadastrado.tamanhoProduto = tamanhoProduto;
    }

    public static String getModeloProduto() {
        return modeloProduto;
    }

    public static void setModeloProduto(String modeloProduto) {
        ProtudoCadastrado.modeloProduto = modeloProduto;
    }

    public static String getCorProduto() {
        return corProduto;
    }

    public static void setCorProduto(String corProduto) {
        ProtudoCadastrado.corProduto = corProduto;
    }

    public static String getDescricaoProduto() {
        return descricaoProduto;
    }

    public static void setDescricaoProduto(String descricaoProduto) {
        ProtudoCadastrado.descricaoProduto = descricaoProduto;
    }

    public static Integer getQtdProduto() {
        return qtdProduto;
    }

    public static void setQtdProduto(Integer qtdProduto) {
        ProtudoCadastrado.qtdProduto = qtdProduto;
    }

    public static Double getPrecoProduto() {
        return precoProduto;
    }

    public static void setPrecoProduto(Double precoProduto) {
        ProtudoCadastrado.precoProduto = precoProduto;
    }
}
