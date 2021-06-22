public class Contato {
	public String nome;
	public String numero;
	public String email;
	
	public Contato(String nome, String numero, String email) throws Exception {
		if (nome == null || numero == null || email == null)
			throw new Exception("Nome, numero e e-mail s�o de preenchimento obrigat�rio.");
			
		if (nome.isBlank() || numero.isBlank() || email.isBlank())
			throw new Exception("Nome, numero e e-mail s�o de preenchimento obrigat�rio.");

		if (!Validacoes.validaEmail(email))
			throw new Exception("E-mail est� em um formato inv�lido");

		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}
}