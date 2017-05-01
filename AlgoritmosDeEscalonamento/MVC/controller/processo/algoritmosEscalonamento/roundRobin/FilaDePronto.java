package controller.processo.algoritmosEscalonamento.roundRobin;
import controller.processo.NodeProcesso;

public class FilaDePronto {
	public NodeProcesso inicio, fim;

	

	public Boolean filaVazia(){		
		return inicio == null;
	}
	
//	public void insereLista(int numeroProcesso,int tempoChegada, int duracaoDoProcesso,int prioridade){
//		NodeProcesso novo = new NodeProcesso(numeroProcesso, tempoChegada, duracaoDoProcesso,prioridade);
//		
//		if(filaVazia()){
//			inicio = novo;
//			fim = novo;
//		}
//		else{			
//			fim.next = novo;
//			fim = novo;
//		}
//	}
	
	public void InserirProcessoOrdenado(int numeroProcesso,int tempoChegada, int duracaoDoProcesso,int prioridade) {
		NodeProcesso novo = new NodeProcesso(numeroProcesso, tempoChegada, duracaoDoProcesso,prioridade);
	NodeProcesso ant = null;
	NodeProcesso p = inicio;
	
	while(p!=null && p.getTempoChegada()< tempoChegada)
	{
		ant=p;
		p=p.next;
	}
	
	if(ant==null){
		novo.next = inicio;
		inicio = novo;
	}
	else{
		novo.next=ant.next;
		ant.next=novo;
	}

}
	
//	public int retiraFila() {
//		NodeProcesso p = inicio;
//		inicio = p.next;
//		return p.duracaoSurto;
//	}
	

}
