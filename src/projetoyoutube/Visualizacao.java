package projetoyoutube;

public class Visualizacao {
	
	private Telespectador espectador;
	private Video filme;
	
	public Visualizacao(Telespectador espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}
	
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar (int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public Telespectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Telespectador espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
	
	
	
	

}
