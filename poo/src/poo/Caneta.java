package poo;

public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	
	public void status() {
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("cor: "+ this.cor);
		System.out.println("ponta: "+ this.ponta);
		System.out.println("Carga: "+ this.carga);
		System.out.println("Está tampaada?: "+ this.tampada);
		
	}
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar pois estou tampada");
		}else{
			System.out.println("Estou Rabiscando");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	
	
	
	
	
}
