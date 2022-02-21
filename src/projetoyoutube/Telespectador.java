package projetoyoutube;

public class Telespectador extends Pessoa{
	
	private String login;
	private int totAssistido;
	
	public Telespectador(String nome, String sexo, int idade, String login) {
		super(nome, sexo, idade);
		this.login = login;
		this.totAssistido = 0;
	}	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	@Override
	public String toString() {
		return "Telespectador [login=" + login + ", totAssistido=" + totAssistido + ", nome=" + nome + ", sexo=" + sexo
				+ ", idade=" + idade + ", experiencia=" + experiencia + "]";
	}
	
	





}
