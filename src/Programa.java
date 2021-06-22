import java.util.List;

public class Programa {
	public static void main(String[] args) {
		Agenda agendaTeste = new Agenda();
		
		try {
			// teste inserção
			agendaTeste.inserir("mateus", "44 99853-5228", "mateus_garcia01@hotmail.com");
			agendaTeste.inserir("mateus", "44 99964-3969", "mateusgarcia2001@gmail.com");
//			agendaTeste.inserir("", "44 99964-3969", "mateusgarcia2001@gmail.com");
//			agendaTeste.inserir("mateus", null, "mateusgarcia2001@gmail.com");
//			agendaTeste.inserir("mateus", "44 99964-3969", "   ");
		}
		catch (Exception e) {
			System.out.println("Erro: " + e.getMessage() + '\n');
		}
		
		// teste busca por nome
		List<Contato> contatos = agendaTeste.buscarPorNome("mateus");
		
		System.out.println("Busca pelo NOME 'mateus'\n\nPrimeira busca");
		imprimirContatos(contatos);
		
		// teste remoção primeira posição da lista de objetos retornado da busca por nomes
		agendaTeste.remover(contatos.get(1));
		
		contatos = agendaTeste.buscarPorNome("mateus");
		
		System.out.println("----------------------\n\nSegunda busca após remoção");
		if (contatos.size() == 0)
			System.out.println("Nenhum valor encontrado");
		else
			imprimirContatos(contatos);
		
		// teste busca por e-mail
		System.out.println("\nBusca pelo EMAIL 'mateus_garcia01@hotmail.com'");
		contatos = agendaTeste.buscarPorEmail("mateus_garcia01@hotmail.com");
		imprimirContatos(contatos);
		
		// teste busca por telefone
		System.out.println("\nBusca pelo TELEFONE '44 99853-5228'");
		contatos = agendaTeste.buscarPorTelefone("44 99853-5228");
		imprimirContatos(contatos);
		
	}
	
	private static void imprimirContatos(List<Contato> contatos)
	{
		for (Contato contato : contatos) {
			System.out.println("----------------------");
			System.out.println(contato.nome);
			System.out.println(contato.numero);
			System.out.println(contato.email);
		}
	}
}
