package controller.processo.algoritmosEscalonamento.roundRobin;

import javax.swing.JOptionPane;

public class RoundRobin {
	public int quantum;
	Fila filaProcessos = new Fila();
	// não sei se tem que ser static
	public String tempoDeEspera;
	public String ordemDeExecucao;

	public void executar() {
		filaProcessos.criarFila();
		// JOptionPane.showMessageDialog(null, "Adicione pelo menos um
		// processo");
		// contadorObjeto;
		// ordemDeExecucao="Executou processo ; }

	}
}
