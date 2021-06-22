public class Contato {
	public String nome;
	public String numero;
	public String email;
	
	public Contato(String nome, String numero, String email) throws Exception {
		if (nome == null || numero == null || email == null)
			throw new Exception("Nome, numero e e-mail são de preenchimento obrigatório.");
			
		if (nome.isBlank() || numero.isBlank() || email.isBlank())
			throw new Exception("Nome, numero e e-mail são de preenchimento obrigatório.");

		if (!Validacoes.validaEmail(email))
			throw new Exception("E-mail está em um formato inválido");

		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}
}