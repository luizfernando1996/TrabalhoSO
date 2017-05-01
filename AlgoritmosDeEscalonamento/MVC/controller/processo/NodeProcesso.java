package controller.processo;


public class NodeProcesso{

	// string minusculo ele deseja implementar interface..classe...
	// deve se digitar String

	/**
	 * 
	 */
	private static int contadorDaView;
	private int contadorObjeto;
	private int tempoChegada;
	private int duracaoSurto;
	private int prioridade;
	public NodeProcesso next;

	
	public NodeProcesso(){}
	
	public NodeProcesso(int numeroProcesso,int tempoChegada, int duracaoDoProcesso,int prioridade) {
		
		this.contadorObjeto=numeroProcesso;
		this.tempoChegada=tempoChegada;
		this.duracaoSurto=duracaoDoProcesso;
		this.prioridade=prioridade;
		// this.tempoDeSurto = tempoDeSurto;
		this.next = null;
		// this.numeroProcesso = numeroProcesso;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	private Integer next;	

	// ctrl+3 and after "ggas"(generate getters and setters) for to encapsulate
	
	//contador da View
	public static int getContador() {
		return contadorDaView;
	}

	public static void setContador(int contador) {
		NodeProcesso.contadorDaView = contador;
	}
	
	public int getContadorObjeto() {
		return contadorObjeto;
	}

	public void setContadorObjeto(int contadorObjeto) {
		this.contadorObjeto = contadorObjeto;
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
}
