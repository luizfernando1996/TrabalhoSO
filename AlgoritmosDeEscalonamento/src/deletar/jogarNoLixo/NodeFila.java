package deletar.jogarNoLixo;

import controller.processo.NodeProcesso;

public class NodeFila {
	
	NodeFila next;
	// EU COMENTEI ISTO AI
	// int tempoDeSurto;
	// int numeroProcesso;

//	public NodeFila() {
//		
//		// NÃO ENTENDI A PARTE ABAIXO
//		// tempoDeSurto = 0;
//		next = null;
//	}

	public NodeFila(NodeProcesso process, NodeFila next) {
		
		// this.tempoDeSurto = tempoDeSurto;
		this.next = next;
		// this.numeroProcesso = numeroProcesso;
	}

}
