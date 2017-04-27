package controller.processo;


public class Processo {

	// string minusculo ele deseja implementar interface..classe...
	// deve se digitar String

	private static int contador;
	private int tempoChegada;
	private int duracaoSurto;
	private int prioridade;

	// ctrl+3 and after "ggas"(generate getters and setters) for to encapsulate

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Processo.contador = contador;
	}
	
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

	public int[] fornecerDadosView() {
		int[] vet=new int[4];
		vet[0]=contador;
		vet[1]=tempoChegada;
		vet[2]=duracaoSurto;
		vet[3]=prioridade;
		return vet;

	}

}
