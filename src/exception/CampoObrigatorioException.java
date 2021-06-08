package exception;


public class CampoObrigatorioException extends Exception{
	
	public CampoObrigatorioException() {
		
	}

	@Override
	public String toString() {
		return "Preenchimento do campo é obrigatorio";
	}



}
