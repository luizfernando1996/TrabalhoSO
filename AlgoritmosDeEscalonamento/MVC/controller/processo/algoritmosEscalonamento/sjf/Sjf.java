package controller.processo.algoritmosEscalonamento.sjf;

import controller.processo.ListaTempoChegada;
import controller.processo.NodeProcesso;
import controller.processo.algoritmosEscalonamento.sjf.ListaOrdenadaPeloSjf;
//import controller.processo.Processo;

public class Sjf {
	// private int tempoProcess;

	// private String mensagem;
	private NodeProcesso inicio;
	private String mensagem;
	private NodeResultadoSjf first;
	public Sjf() {
	}
	
	public boolean listaVazia(){
		return first==null;
	}

	public void executarProcessos() {

		ListaOrdenadaPeloSjf objListaProcessoCurto = new ListaOrdenadaPeloSjf();

		// ordenar
		objListaProcessoCurto.ordenarListaPorSjf(ListaTempoChegada.sentinela);
		// obtem a lista ordenada por sjf
		inicio = objListaProcessoCurto.primeiro;
		informarTempoDeEspera();
	}

	public void informarTempoDeEspera() {
		NodeProcesso p = inicio;
		//o primeiro processo ele ja é executado..não existe tempo para ele ser executado
		int tempoDecorrido = 0;
		int tempoDeEspera=0;
		mensagem="O processo a executar foi o processo com identificador:" +p.getContadorObjeto();
		p=p.next;
		while (p != null) {
			mensagem+="\nO processo a executar foi o processo com identificador:" +p.getContadorObjeto();
			if(p.getTempoChegada()<tempoDecorrido){
				tempoDeEspera+=(tempoDecorrido-p.getTempoChegada());
				tempoDecorrido+=p.getDuracaoSurto();
			}
			else
			{
				insereNaListaDeResultados(mensagem,Integer.toString(tempoDeEspera));
				mensagem=null;
				tempoDeEspera=0;
			}
			p=p.next;
		}
	}
	public void insereNaListaDeResultados(String mensagem,String tempoDeEspera){
		NodeResultadoSjf obj=new NodeResultadoSjf(mensagem,tempoDeEspera);
		
		if(listaVazia())
			first=obj;
		else{
			NodeResultadoSjf p=first;
			while(p.next!=null)
				p=p.next;
			p.next = obj;
		}
	}
	public NodeResultadoSjf resultadosPedidos(){
		return first;
	}

}
