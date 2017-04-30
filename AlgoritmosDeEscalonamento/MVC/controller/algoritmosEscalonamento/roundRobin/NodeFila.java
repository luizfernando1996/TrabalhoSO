package controller.algoritmosEscalonamento.roundRobin;

public class NodeFila {
	NodeFila next;
	int tempoDeSurto;
	int numeroProcesso;
	
	public NodeFila(){
		//inteiro não pode ser nulo-->coloque o valor 0
		//tempoDeSurto=0;
		tempoDeSurto = null;
		next = null;
	}
	
	public NodeFila(int numeroProcesso, int tempoDeSurto, NodeFila next){
		this.tempoDeSurto = tempoDeSurto;
		this.next = next;
		this.numeroProcesso = numeroProcesso;
	}
	
}
