package aula11;

public class Aula11 {
	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		
		v1.setIdade(29);
		v1.setNome("Ericka");
		v1.setSexo("F");
		
		System.out.println(v1.toString());
		
		
		a1.setNome("Eslaine");
		a1.setMatricula(1);
		a1.setNota(8);
		
		a1.pagarMensalidade();
		System.out.println(a1.toString());
		
		
		b1.setMatricula(3);
		b1.setNome("Juliel");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
		
		
		
	}
}
