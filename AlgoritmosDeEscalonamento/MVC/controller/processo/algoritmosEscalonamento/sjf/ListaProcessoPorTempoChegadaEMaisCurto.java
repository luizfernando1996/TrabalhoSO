package controller.processo.algoritmosEscalonamento.sjf;

import controller.processo.NodeProcesso;

public class ListaProcessoPorTempoChegadaEMaisCurto {

	public NodeProcesso primeiro;
	public int primeiraExecucao;

	public ListaProcessoPorTempoChegadaEMaisCurto() {
		primeiro = null;
	}

	public Boolean listaVazia() {
		return primeiro == null;
	}

	// ordena toda a lista por tempo de duração do surto
	public NodeProcesso ordenarListaPorSjf(NodeProcesso objLista) {

		primeiraExecucao = 0;
		NodeProcesso p = objLista;

		if (primeiraExecucao == 0)
			selecionarJobMaisCurto(p);

		return primeiro;
	}

	public void selecionarJobMaisCurto(NodeProcesso ponteiroInicial) {

		NodeProcesso ponteiro = ponteiroInicial;
		//int minimo = ponteiro.getDuracaoSurto();
		//int posicao = 0;
		int tempoChegada = ponteiroInicial.getTempoChegada();
		// A lista que será percorrida ja está ordenada por tempo de chegada
		// Os valores de tempo de chegada só crescem ou são iguais
		while (ponteiro != null) {

			// O processo só não pode ser se o tempo de chegada dele for menor
			// que o tempoChegada

			// Irá selecionar o processo com o mesmo tempo para ser executado
			if (ponteiro.getTempoChegada() < tempoChegada) {

			}

			ponteiro = ponteiro.next;
		}

	}

	public void insere(NodeProcesso obj) {
		if (listaVazia())
			primeiro = obj;
	}
}
