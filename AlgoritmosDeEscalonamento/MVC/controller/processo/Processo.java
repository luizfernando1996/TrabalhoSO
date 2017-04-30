package controller.processo;


public class Processo {

	// string minusculo ele deseja implementar interface..classe...
	// deve se digitar String

	public static int contador;
	public int tempoChegada;
	public int duracaoSurto;
	public int prioridade;
	public Processo next;	

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
	
	/*public Processo(int tempoChegada, int duracaoSurto, int prioridade, Processo next){
		this.next = next;
		this.tempoChegada = tempoChegada;
		this.duracaoSurto = duracaoSurto;
		this.prioridade = prioridade;
	}*/
	
	/*public Processo(int tempoChegada, int duracaoSurto, int prioridade){		
		this.tempoChegada = tempoChegada;
		this.duracaoSurto = duracaoSurto;
		this.prioridade = prioridade;
	}	*/

}
