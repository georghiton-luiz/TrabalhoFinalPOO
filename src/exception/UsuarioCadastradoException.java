package exception;

public class UsuarioCadastradoException extends Exception{
	
	public UsuarioCadastradoException(String usuario) {
		
		System.out.println("O usuário "+ usuario + " já está cadastrado");
		
	}

}
