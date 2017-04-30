package controller.algoritmosEscalonamento.roundRobin;

public class FilaDePronto {
	public NodeFila inicio, fim;
	
	public Boolean filaVazia(){		
		return inicio == null;
	}
	
	public void insereLista(int numeroProcesso, int tempoDeSurto){
		NodeFila novo = new NodeFila(numeroProcesso, tempoDeSurto, null);
		
		if(filaVazia()){
			inicio = novo;
			fim = novo;
		}
		else{			
			fim.next = novo;
			fim = novo;
		}
	}
	
	public int retiraFila(){
		NodeFila p = inicio;
		inicio = p.next;
		return p.tempoDeSurto;
	}
	

}
