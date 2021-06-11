package exception;

import javax.swing.JOptionPane;

import repository.PesquisarCpfDAO;
import service.FormatarDadosService;
import service.ValidarDadosService;

public class StatusCPFException extends Exception {

	private final String resp;

	public StatusCPFException(String cpf) {

		if (!ValidarDadosService.isCPF(FormatarDadosService.getCpfFormatado(cpf))) {
			resp = "CPF invalido";
			JOptionPane.showMessageDialog(null, resp);
		} else if (!PesquisarCpfDAO.pesquisarCpf(FormatarDadosService.getCpfFormatado(cpf))) {
			resp = "CPF não cadastrado";
			JOptionPane.showMessageDialog(null, resp);
		} else if (PesquisarCpfDAO.pesquisarCpf(FormatarDadosService.getCpfFormatado(cpf))) {
			resp = "CPF já cadastrado";
			JOptionPane.showMessageDialog(null, resp);
		}else {
			resp = "Preencha com um CPF";	
			JOptionPane.showMessageDialog(null, resp);
		}
		
	}

	@Override
	public String toString() {
		return resp;
	}
}
