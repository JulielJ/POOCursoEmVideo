package ultraemojicombate;

import java.util.Random;

public class Luta {
	
	private Lutador desafiado ;
	private Lutador desafiante;
	private int ruunds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) 
				&& l1 != l2){
		this.aprovada = true;
		this.desafiado = l1;
		this.desafiante = l2;
			
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if(this.aprovada) {
				System.out.println("A luta vai acontecer ");
				System.out.println("####Desafiante####");
				this.desafiante.apresentar();
				System.out.println();
				System.out.println("####Desafiado####");
				this.desafiado.apresentar();
				System.out.println();
				
				Random aleatorio = new Random();
				int vencedor = aleatorio.nextInt(3); //0 1 2
				
				switch (vencedor) {
				case 0: {
					System.out.println("Empatou ");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				}
				case 1: {
					System.out.println("Vitoria do " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				}
				case 2: {
					System.out.println("Vittoria do " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
				}
				default:
				}
				
				
		} else {
			System.out.println("A luta não pode acontecer ");
		}
		
	}
	

	
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRuunds() {
		return ruunds;
	}

	public void setRuunds(int ruunds) {
		this.ruunds = ruunds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
	}
	
	
	


	
	
	
	
	
	}
