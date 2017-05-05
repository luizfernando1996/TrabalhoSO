package controller.processo.algoritmosEscalonamento.roundRobin;

//import javax.swing.JOptionPane;

import controller.processo.NodeProcesso;

public class RoundRobin {
	public int quantum;
	Fila filaProcessos = new Fila();
	// não sei se tem que ser static
	public static int tempoDeEspera, tempoDeExecucao;
	public String ordemDeExecucao;

	public void executar() {
		filaProcessos.criarFila();
		NodeProcesso p = filaProcessos.inicio;

		while (p != null) {
			int tempoDeSurto = p.getDuracaoSurto();
			ordemDeExecucao = ("Processo: " + p.getContadorObjeto());
			if (p.terminoUltimaExecucao == 0) {
				tempoDeEspera += tempoDeExecucao - p.getTempoChegada();
			}
			if (p.terminoUltimaExecucao > 0) {
				tempoDeEspera += tempoDeExecucao - p.terminoUltimaExecucao;

			}
			if (tempoDeSurto >= quantum) {
				p.setDuracaoSurto(p.getDuracaoSurto() - quantum);
				tempoDeExecucao += quantum;
			}
			if (tempoDeSurto < quantum) {
				tempoDeExecucao += p.getDuracaoSurto();
				p.setDuracaoSurto(0);
			}
			if (p.getDuracaoSurto() == 0) {
				retiraProcesso(p);
				p = filaProcessos.inicio;
			} else {
				p = p.next;
			}
			// calculo de média
			double media = tempoDeEspera / NodeProcesso.getContador();

		}

		// JOptionPane.showMessageDialog(null, "Adicione pelo menos um
		// processo");
		// contadorObjeto;
		// ordemDeExecucao="Executou processo ; }

	}

	public void retiraProcesso(NodeProcesso processo) {

	}
}
