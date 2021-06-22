import java.util.ArrayList;
import java.util.List;

/**
 * Agenda
 * Responsável por gerenciar contatos telefônicos do usuário.
 */
public class Agenda {

	List<Contato> contatos;
	
	public Agenda() {
		this.contatos = new ArrayList<>();
	}
	
	public void inserir(String nome, String numero, String email) {
		this.contatos.add(new Contato(nome, numero, email));
	}
	
	public List<Contato> buscarPorNome(String nome) {
		List<Contato> busca = new ArrayList<>();
		
		for (Contato contato : this.contatos) {
			if (contato.nome.contentEquals(nome))
			{
				busca.add(contato);
			}
		}

		return busca;
	}
	
	public void remover(Contato contato) {
		this.contatos.remove(contato);
	}
}