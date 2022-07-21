package projetoVideo;

public class ProjetoVideo {
	public static void main(String[] args) {
		Video v[] = new Video[5];
		
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		v[1].setCurtidas(2);
		
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
	}
	
	
}
