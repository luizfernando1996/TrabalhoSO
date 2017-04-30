package controller.processo.algoritmosEscalonamento.roundRobin;
import controller.processo.NodeProcesso;

public class FilaDePronto {
	public NodeProcesso inicio, fim;

	

	public Boolean filaVazia(){		
		return inicio == null;
	}
	
	public void insereLista(int numeroProcesso,int tempoChegada, int duracaoDoProcesso,int prioridade){
		NodeProcesso novo = new NodeProcesso(numeroProcesso, tempoChegada, duracaoDoProcesso,prioridade);
		
		if(filaVazia()){
			inicio = novo;
			fim = novo;
		}
		else{			
			fim.next = novo;
			fim = novo;
		}
	}
	
//	public int retiraFila(){
//		NodeFila p = inicio;
//		inicio = p.next;
//		return p.tempoDeSurto;
//	}
	

}
