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
	private static NodeResultadoSjf first;
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
		int contProcessos=1;
		//o primeiro processo ele ja é executado..não existe tempo para ele ser executado
		double tempoDeEspera=0;
		mensagem="O processo a executar foi o processo com identificador:" +p.getContadorObjeto();
		double tempoDecorrido = p.getDuracaoSurto();
		p=p.next;
		while (p != null) {
			mensagem+="\nO processo a executar foi o processo com identificador:" +p.getContadorObjeto();
			if(p.getTempoChegada()<=tempoDecorrido){
				tempoDeEspera+=(tempoDecorrido-p.getTempoChegada());
			}
			else
			{
				tempoDeEspera=tempoDeEspera/contProcessos;
				insereNaListaDeResultados(mensagem,Double.toString(tempoDeEspera));
				mensagem=null;
				tempoDeEspera=0;
			}
			contProcessos++;
			tempoDecorrido+=p.getDuracaoSurto();
			p=p.next;
		}
		tempoDeEspera=tempoDeEspera/contProcessos;
		insereNaListaDeResultados(mensagem,Double.toString(tempoDeEspera));
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
