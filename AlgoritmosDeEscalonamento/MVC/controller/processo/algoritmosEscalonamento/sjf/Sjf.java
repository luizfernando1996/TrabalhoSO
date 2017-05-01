package controller.processo.algoritmosEscalonamento.sjf;

import controller.processo.ListaTempoChegada;
import controller.processo.NodeProcesso;
import controller.processo.algoritmosEscalonamento.sjf.ListaProcessoPorTempoChegadaEMaisCurto;
//import controller.processo.Processo;

public class Sjf {
	// private int tempoProcess;

	// private String mensagem;
	private NodeProcesso inicio;

	public Sjf() {
	}

	// private int primeiraExecucao = 0;

	public void executarProcessos() {

		ListaProcessoPorTempoChegadaEMaisCurto objListaProcessoCurto = new ListaProcessoPorTempoChegadaEMaisCurto();
		NodeProcesso objLista;
		inicio = ListaTempoChegada.inicio;
		// int numeroDeProcessoQueJaPodemSerExecutados =
		// obterContagemProcessosPodemSerExecutados();
		objLista = objListaProcessoCurto.ordenarListaPorSjf(inicio);
	}

}
