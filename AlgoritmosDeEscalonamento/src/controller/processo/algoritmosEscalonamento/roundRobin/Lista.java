package controller.processo.algoritmosEscalonamento.roundRobin;

import controller.processo.NodeProcesso;

public class Lista {
	
	NodeProcesso sentinela;
	
	public Lista(){
		sentinela = new NodeProcesso();
	}
	
	public Boolean listaVazia(){
		return sentinela.next == null;
	}
	
	public void insereLista(int numeroProcesso,int tempoChegada, int duracaoDoProcesso,int prioridade){
		NodeProcesso novo = new NodeProcesso(numeroProcesso, tempoChegada, duracaoDoProcesso,prioridade);
		NodeProcesso p = sentinela;
		if(listaVazia()){
			sentinela.next = novo;
		}
		else{			
			while(p.next != null){
				p = p.next;
			}
			p.next = novo;
		}
	}

}
