package projetoyoutube;

public class Video implements AcoesVideos{
	
	private String titulo;
	private int avaliacao, views, curtidas;
	private boolean reproduzindo;
	
	

	public Video(String titulo) {		
		this.setTitulo(titulo);
		//this.setAvaliacao(1);
		this.setViews(0);
		this.setCurtidas(0);
		this.setReproduzindo(false);		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		int novaAvaliacao;
		novaAvaliacao = (int) ((this.avaliacao + avaliacao)/this.views);
		this.avaliacao = novaAvaliacao;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public void play() {
		this.reproduzindo = true;
		
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
	}

	@Override
	public void like() {
		this.curtidas++;		
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
	
	

}
