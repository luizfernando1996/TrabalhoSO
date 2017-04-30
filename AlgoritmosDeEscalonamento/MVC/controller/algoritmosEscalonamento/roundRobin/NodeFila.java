package controller.algoritmosEscalonamento.roundRobin;

public class NodeFila {
	NodeFila next;
	int tempoDeSurto;
	int numeroProcesso;
	
	public NodeFila(){
		tempoDeSurto = null;
		next = null;
	}
	
	public NodeFila(int numeroProcesso, int tempoDeSurto, NodeFila next){
		this.tempoDeSurto = tempoDeSurto;
		this.next = next;
		this.numeroProcesso = numeroProcesso;
	}
	
}
