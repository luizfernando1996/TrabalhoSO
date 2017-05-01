//package view.frames.Home;
//
//import javax.swing.table.DefaultTableModel;
//
//import controller.processo.NodeProcesso;
//import controller.processo.algoritmosEscalonamento.roundRobin.FilaDePronto;
//import controller.processo.algoritmosEscalonamento.roundRobin.RoundRobin;
//
//public class OperacoesFrameHome {
//
//
//	public int obterIdProcesso() {
//		//embora este atributos se repita milhares de vezes se ele estiver fora
//		//o construtor A não poderá ser executado.
//		//Ocorre um loop..constructA-->constructB,constructB-->constructC,constructC-->ConstructA
//		JFrameHome objHome = new JFrameHome();
//
//		int id = ((DefaultTableModel) objHome.table.getModel()).getRowCount();
//		++id;
//		return id;
//		// JOptionPane.showMessageDialog(null,id);
//	}
//
//	public NodeProcesso criarProcesso() {
//		JFrameHome objHome = new JFrameHome();
//
//		NodeProcesso objProcesso = new NodeProcesso();
//		NodeProcesso.setContador(obterIdProcesso());
//		objProcesso.setTempoChegada(Integer.parseInt(objHome.txtFieldTempoChegada.getText()));
//		objProcesso.setDuracaoSurto(Integer.parseInt(objHome.txtFieldDuracSurto.getText()));
//		objProcesso.setPrioridade(Integer.parseInt(objHome.txtFieldPrioridade.getText()));
//		return objProcesso;
//	}
//
//	public void adicionarNaTabela(NodeProcesso processo) {
//		JFrameHome objHome = new JFrameHome();
//
//		int numCols = objHome.table.getModel().getColumnCount();
//
//		Object[] fila = new Object[numCols];
//
//		fila[0] = NodeProcesso.getContador();
//		fila[1] = processo.getTempoChegada();
//		fila[2] = processo.getDuracaoSurto();
//		fila[3] = processo.getPrioridade();
//
//		((DefaultTableModel) objHome.table.getModel()).addRow(fila);
//	}
//
//	protected void limparCampos() {
//		JFrameHome objHome = new JFrameHome();
//
//		objHome.txtFieldNumeroProcesso.setText(Integer.toString(obterIdProcesso()));
//		objHome.txtFieldPrioridade.setText(null);
//		objHome.txtFieldDuracSurto.setText(null);
//		objHome.txtFieldTempoChegada.setText(null);
//	}
//
//	protected void obterDadosTabela() {
//		JFrameHome objHome = new JFrameHome();
//
//		// pega o numero de linhas da tabela
//
//		int quantProcessos = ((DefaultTableModel) objHome.table.getModel()).getRowCount();
//
//		FilaDePronto objFilaDePronto = new FilaDePronto();
//
//		// percorre todas as linhas dos processos
//
//		for (int i = 0; i < quantProcessos; i++) {
//			Integer[] a = obterColunasProcesso(i);
//
//			objFilaDePronto.InserirProcessoOrdenado(a[0], a[1], a[2], a[3]);
//		}
//		RoundRobin objQuantum = new RoundRobin(Integer.parseInt(objHome.txtFieldQuantum.getText()));
//		objHome.txtFieldQuantum.setText(null);
//	}
//
//	protected void atualizarIdNumeroProcesso() {
//		JFrameHome objHome = new JFrameHome();
//
//		int numeroLinhas =objHome.modelo.getRowCount();
//		for (int i = 0; i < numeroLinhas; i++) {
//			objHome.modelo.setValueAt(i + 1, i, 0);
//			// table.getValueAt(i, 0);
//		}
//
//	}
//
//	// Aqui se obtêm a linha da tabela
//	private Integer[] obterColunasProcesso(int i) {
//		JFrameHome objHome = new JFrameHome();
//
//		DefaultTableModel dtm = (DefaultTableModel) objHome.table.getModel();
//		// int quantProcessos =
//		// ((DefaultTableModel)table.getModel()).getRowCount();
//		Integer[] a = new Integer[4];
//		for (int x = 0; x < 4; x++) {
//			a[x] = Integer.parseInt(dtm.getValueAt(i, x).toString());
//		}
//		return a;
//	}
//
//}
