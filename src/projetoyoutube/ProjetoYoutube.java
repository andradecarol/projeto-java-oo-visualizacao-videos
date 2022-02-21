package projetoyoutube;

public class ProjetoYoutube {
	
	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 2 de POO");
		v[2] = new Video("Aula 3 de POO");
		
		Telespectador t[] = new Telespectador[2];
		t[0] = new Telespectador("Jubileu", "M", 22, "juba");
		t[1] = new Telespectador("Creuza", "F", 23, "creuzita");
		
		Visualizacao vis = new Visualizacao(t[0], v[2]);
		vis.avaliar();
		System.out.println(vis.toString());
		
		//System.out.println(vis.toString());
		
//		System.out.println(t[0].toString());
//		System.out.println(v[0].toString());
	}	

}
