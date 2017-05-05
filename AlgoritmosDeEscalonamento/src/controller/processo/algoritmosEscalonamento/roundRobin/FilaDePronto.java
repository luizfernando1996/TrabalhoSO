package controller.processo.algoritmosEscalonamento.roundRobin;
import controller.processo.NodeProcesso;

public class FilaDePronto {
	public NodeProcesso inicio, fim;

	

	public Boolean filaVazia(){		
		return inicio == null;
	}	

	
	public void InserirProcessoOrdenado(int numeroProcesso,int tempoChegada, int duracaoDoProcesso) {
		NodeProcesso novo = new NodeProcesso(numeroProcesso, tempoChegada, duracaoDoProcesso);
	NodeProcesso ant = null;
	NodeProcesso p = inicio;

	while(p!=null && p.getTempoChegada()<= tempoChegada)
	{
		ant=p;
		p=p.next;
	}
	
	if(ant==null){
		novo.next = inicio;
		inicio = novo;
	}
	else{
		//novo.next aponta para o proximo
		novo.next=ant.next;
		//anterior agora aponta para o objeto
		ant.next=novo;
	}
	
	p = inicio;
	while(p.next!= null){		
		p = p.next;
		}
	fim = p;
}
	
	public int retiraFila() {
		NodeProcesso p = inicio;
		inicio = p.next;
		return p.getDuracaoSurto();
	}
	

}
