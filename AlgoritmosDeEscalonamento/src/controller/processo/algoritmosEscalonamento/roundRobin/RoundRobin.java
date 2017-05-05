package controller.processo.algoritmosEscalonamento.roundRobin;

import javax.swing.JOptionPane;

public class RoundRobin {
	public int quantum;
	Fila filaProcessos = new Fila();
	
	public void executar(){
		filaProcessos.criarFila();
		JOptionPane.showMessageDialog(null, "Adicione pelo menos um processo");
	}

}
