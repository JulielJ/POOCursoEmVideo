package projetoPessoas;

public class ProjetoPessoas {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Claudia");
		p4.setNome("Fabiana");
		
		
		p1.setSexo("M");
		
		
		p4.setSexo("F");
		
		
		p2.setIdade(18);
		p2.setCurso("Informática");
		
		p3.setSalario(1500);
		
		
		p3.redeceberAumento(1500.5f);
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}
	
}
