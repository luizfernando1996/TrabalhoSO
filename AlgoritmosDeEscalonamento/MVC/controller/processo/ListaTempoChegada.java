package controller.processo;

public class ListaTempoChegada {

	public static NodeProcesso inicio;

	public ListaTempoChegada() {
		inicio = null;
	}

	public Boolean listaVazia() {
		return inicio == null;
	}

	public void InserirProcessoOrdenado(int numeroProcesso, int tempoChegada, int duracaoDoProcesso, int prioridade) {
		
		NodeProcesso novo = new NodeProcesso(numeroProcesso, tempoChegada, duracaoDoProcesso, prioridade);
		NodeProcesso ant = null;
		NodeProcesso p = inicio;

		while (p != null && p.getTempoChegada() <= tempoChegada) {
			ant = p;
			p = p.next;
		}

		if (ant == null) {
			novo.next = inicio;
			inicio = novo;
		} else {
			// novo.next aponta para o proximo
			novo.next = ant.next;
			// anterior agora aponta para o objeto
			ant.next = novo;
		}	
	}

}
