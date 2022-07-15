package desafioAula09;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		Pessoa[] p = new Pessoa[2];
		
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 18, "M");
		p[1] = new Pessoa("Maria", 29, "F");
		
		l[0] = new Livro("Aprendendo Java", "Jose Silva", 300 , p[0]);
		l[1] = new Livro("Segundo Livro", "Não sei quem escreveu", 240, p[1]);
		l[2] = new Livro("Terceiro Livro", "o doida da cg", 30, p[0]);
		
		
		
		
	System.out.println(l[1].detalhes());
	
	System.out.println(l[1].detalhes());
	
	l[1].folhear(500);
	
	
		
	}
}
