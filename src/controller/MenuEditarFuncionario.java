package controller;

import repository.EditarFuncionarioDAO;
import repository.EditarPontoDeVendaDAO;
import repository.PesquisarCpfDAO;
import service.FormatarDadosService;
import service.ValidarDadosService;

import javax.swing.*;

public class MenuEditarFuncionario {

    private static String update;
    private static Integer cod;

    public static void menuEditarPontoDeVenda(){


        int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                Escolha o item a ser editado de um produtos
                [1] Nome
                [2] CPF
                [3] Data de nascimento
                [4] Logradouro
                [5] Número
                [6] Bairro
                [7] Cidade
                [8] Estado
                [9] Complemento
                [10] CEP
                [0] Sair"""));

        Integer cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do funcionario que deseja alterar"));

        switch(op1){
            case 1:
                EditarFuncionarioDAO.editarNomeFuncionario(JOptionPane.showInputDialog("Digite o nome correto").toUpperCase(), cod);
                break;
            case 2:
                String cpf = JOptionPane.showInputDialog("Digite CPF correto");
                boolean auxCpf = ValidarDadosService.isCPF(cpf);
                while(!auxCpf || PesquisarCpfDAO.pesquisarCpf(FormatarDadosService.getCpfFormatado(cpf))){
                    auxCpf = ValidarDadosService.isCPF(cpf = JOptionPane.showInputDialog("CPF invalido ou já cadastrado\nDigite CPF correto"));
                }
                cpf = FormatarDadosService.getCpfFormatado(cpf);
                EditarFuncionarioDAO.editarCEPFuncionario(cpf, cod);
                break;
            case 3:
                EditarFuncionarioDAO.editarDataNascFuncionario(FormatarDadosService.formatarData(JOptionPane.showInputDialog("Digite a data de nascimento correta")),cod);
                break;
            case 4:
                EditarFuncionarioDAO.editarRuaFuncionario(JOptionPane.showInputDialog("Digite o logradouro correto").toUpperCase(), cod);
                break;
            case 5:
                EditarFuncionarioDAO.editarNumFuncionario(JOptionPane.showInputDialog("Digite o número correto").toUpperCase(), cod);
                break;
            case 6:
                EditarFuncionarioDAO.editarBairroFuncionario(JOptionPane.showInputDialog("Digite o bairro correto").toUpperCase(), cod);
                break;
            case 7:
                EditarFuncionarioDAO.editarCidadeFuncionario(JOptionPane.showInputDialog("Digite a cidade correta").toUpperCase(), cod);
                break;
            case 8:
                EditarFuncionarioDAO.editarUfFuncionario(JOptionPane.showInputDialog("Digite o estado(UF) correto").toUpperCase(), cod);
                break;
            case 9:
                EditarFuncionarioDAO.editarComplementoFuncionario(JOptionPane.showInputDialog("Digite no complemento correto").toUpperCase(), cod);
            case 10:
                EditarPontoDeVendaDAO.editarCEPPontoDeVenda(FormatarDadosService.getCepFormatado(JOptionPane.showInputDialog("Digite o CEP correto")), cod);
            case 0:
                int resp = JOptionPane.showConfirmDialog(null, "Deseja sair da edição de ponto de venda", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuEditarPontoDeVenda.menuEditarPontoDeVenda();
                }
                break;
            default:
                resp = JOptionPane.showConfirmDialog(null, "Opção inválida\nDeseja sair do menu editar ponto de venda", "ALERT",
                        JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    MenuPrincipal.menuPrincipal();
                } else {
                    MenuEditarPontoDeVenda.menuEditarPontoDeVenda();
                }
        }
    }
}
