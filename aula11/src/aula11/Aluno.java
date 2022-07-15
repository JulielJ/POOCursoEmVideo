package aula11;

public class Aluno extends Pessoa {
	private int matricula;
	private float nota;
	private String curso;
	
	
	public void pagarMensalidade() {
		System.out.println("Pagando matricula do aluno "+ this.getNome());
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public float getNota() {
		return nota;
	}


	public void setNota(float nota) {
		this.nota = nota;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
