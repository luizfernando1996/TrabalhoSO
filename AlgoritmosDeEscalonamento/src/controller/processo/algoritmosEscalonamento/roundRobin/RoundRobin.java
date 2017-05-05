package controller.processo.algoritmosEscalonamento.roundRobin;

public class RoundRobin {
	public int quantum;
	Fila filaProcessos = new Fila();
	
	public void executar(){
		filaProcessos.criarFila();
		System.out.println("POG");
		//qualquer coisa
	}

}
