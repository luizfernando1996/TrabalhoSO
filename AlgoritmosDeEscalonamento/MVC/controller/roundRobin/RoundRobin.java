package controller.roundRobin;

public class RoundRobin {
	
	
	private int tempoChegada;
	private int duracaoSurto;
	private int prioridade;

	
	public int getTempoChegada() {
		return tempoChegada;
	}
	public void setTempoChegada(int tempoChegada) {
		this.tempoChegada = tempoChegada;
	}
	public int getDuracaoSurto() {
		return duracaoSurto;
	}
	public void setDuracaoSurto(int duracaoSurto) {
		this.duracaoSurto = duracaoSurto;
	}
	public int getPrioridade() {
		return prioridade;
	}
	
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
}
