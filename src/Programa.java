import java.util.List;

public class Programa {
	public static void main(String[] args) {
		Agenda agendaTeste = new Agenda();
		
		// teste inserção
		agendaTeste.inserir("mateus", "4499853-5228", "mateus_garcia01@hotmail.com");
		agendaTeste.inserir("mateus", "4499964-3969", "mateusgarcia2001@gmail.com");
		
		// teste busca
		List<Contato> contatos = agendaTeste.buscarPorNome("mateus");
		
		System.out.println("Primeira busca");
		for (Contato contato : contatos) {
			System.out.println("----------------------");
			System.out.println(contato.nome);
			System.out.println(contato.numero);
			System.out.println(contato.email);
		}
		
		// teste remoção primeira posição da lista de objetos retornado da busca
		agendaTeste.remover(contatos.get(0));
		
		contatos = agendaTeste.buscarPorNome("mateus");
		
		System.out.println("----------------------\n\nSegunda busca");
		if (contatos.size() == 0)
			System.out.println("Nenhum valor encontrado");
		else
			for (Contato contato : contatos) {
				System.out.println("----------------------");
				System.out.println(contato.nome);
				System.out.println(contato.numero);
				System.out.println(contato.email);
			}
	}
}
