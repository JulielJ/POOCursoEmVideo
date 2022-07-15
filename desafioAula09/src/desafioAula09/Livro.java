package desafioAula09;

public class Livro implements Publicacao {
	
	
	private String titulo;
	private String autor;
	private int totalPagina;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	@Override
	public String detalhes() {
			
		return "Livro [\n titulo=" + titulo + ",\n autor=" 
				+ autor + ",\n totalPagina=" + totalPagina + ",\n paginaAtual="
				+ paginaAtual + ",\n aberto=" + aberto + ",\n leitor=" + leitor.getNome() + "]\n";
	}
	public Livro(String titulo, String autor, int totalPagina, Pessoa p) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.aberto = false;
		this.paginaAtual = 0;		
		this.totalPagina = totalPagina;
		this.leitor = p;
	}
 






	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public int getTotalPagina() {
		return totalPagina;
	}



	public void setTotalPagina(int totalPagina) {
		this.totalPagina = totalPagina;
	}



	public int getPaginaAtual() {
		return paginaAtual;
	}



	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}



	public boolean isAberto() {
		return aberto;
	}



	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}



	public Pessoa getLeitor() {
		return leitor;
	}



	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}



	@Override
	public void abrir() {
		this.aberto = true;
	}



	@Override
	public void fechar() {
		this.aberto = false;
	}



	@Override
	public void folhear(int p) {
		if(p > totalPagina) {
			System.out.println("O livro só possui " + totalPagina + " paginas");
			
		}else {
			
			this.paginaAtual = p;
		}
		
	}



	@Override
	public void avancarPag() {
		this.paginaAtual++;
		
	}



	@Override
	public void voltarPag() {
		this.paginaAtual--;
	}



	

}
