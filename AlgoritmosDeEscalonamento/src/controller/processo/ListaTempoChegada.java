package controller.processo;

public class ListaTempoChegada {

	public static NodeProcesso sentinela;

	public ListaTempoChegada() {
		sentinela = new NodeProcesso();
	}

	public Boolean listaVazia() {
		return sentinela.next == null;
	}

	public void InserirProcessoOrdenado(int numeroProcesso, int tempoChegada, int duracaoDoProcesso, int prioridade) {
		
		NodeProcesso novo = new NodeProcesso(numeroProcesso, tempoChegada, duracaoDoProcesso, prioridade);
		NodeProcesso ant = null;
		NodeProcesso p = sentinela.next;

		while (p != null && p.getTempoChegada() <= tempoChegada) {
			ant = p;
			p = p.next;
		}

		if (ant == null) {
			novo.next = sentinela.next;
			sentinela.next = novo;
		} else {
			// novo.next aponta para o proximo
			novo.next = ant.next;
			// anterior agora aponta para o objeto
			ant.next = novo;
		}	
	}
	public NodeProcesso retonarListaComSentinela(){
		return sentinela;
	}
	
	//O negocio abaixo é uma POG porque vc deveria pegar a lista com sentinela e não ja uma lista sem sentinela
	//Para vc transformar uma lista com sentinela em uma sem é só vc criar uma referencia(chamada inicio) que
	//aponta para o proximo objeto da sentinela. Isto pode ser ilustrado pelo comando abaixo:
	
	//NodeProcesso inicioFila=retornarListaComSentinela();
	//inicioFila=inicioFila.next;
	
	public NodeProcesso retornarListaSemSentinela(){
		return sentinela.next;
	}

}
