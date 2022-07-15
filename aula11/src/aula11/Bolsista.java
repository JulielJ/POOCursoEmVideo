package aula11;

public class Bolsista extends Aluno {
	private float bolsa;
	
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa do(a) " + this.getNome());
	}
	
	
	
	public float getBolsa() {
		return bolsa;
	}



	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}



	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista, não paga mensalidade");
	}
}
