package exception;

public class EmailCadastradoException extends Exception {

	private String email;
	
	public EmailCadastradoException(String email) {

		this.email = email;

	}

	@Override
	public String toString() {

		return "O email "+ email + " já está cadastrado";
	}
}
