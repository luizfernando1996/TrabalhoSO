//package view.frames.Home;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.table.DefaultTableModel;
//
//import controller.processo.NodeProcesso;
//import view.frames.JFrameResultado;
//
////A classe abaixo não pode herdar da classe JFrameHome porque para herdar ocorre top-down 
////e esta classe serve de base para a JFrameHome em seu construtor.
//public class ButoesDaView {
//
//	/**
//	 * 
//	 */
////	private JFrameHome objHome;
//	private OperacoesFrameHome objOperacoes=new OperacoesFrameHome();
//	private JButton btnAdicionarProcesso;
//	
//	private static final long serialVersionUID = 1L;
//
//	public ButoesDaView() {
//	}
//
//	public JButton botaoRemover() {
//		// You should to selection a process for be remove
//		JButton btnRemoverProcesso = new JButton("Remover Processo");
//		btnRemoverProcesso.setBounds(223, 64, 129, 23);
//		btnRemoverProcesso.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				objHome.modelo = (DefaultTableModel) objHome.table.getModel();
//				// int linha = table.getSelectedRow();
//				// table.getValueAt(linha, 0);
//				objHome.modelo.removeRow(objHome.table.getSelectedRow());
//				objOperacoes.atualizarIdNumeroProcesso();
//				// decrementa txtFieldNumeroProcesso
//				int num = Integer.parseInt(objHome.txtFieldNumeroProcesso.getText());
//				--num;
//				objHome.txtFieldNumeroProcesso.setText(Integer.toString(num));
//			}
//		});
//		return btnRemoverProcesso;
//	}
//
//	public JButton botaoLimpar() {
//		JButton btnLimparTudo = new JButton("Limpar Tudo");
//		btnLimparTudo.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				objHome.modelo = (DefaultTableModel) objHome.table.getModel();
//			}
//		});
//		btnLimparTudo.setBounds(57, 403, 129, 23);
//		return btnLimparTudo;
//	}
//
//	public JButton botaoExecutar() {
//		JButton btnNewButton = new JButton("Executar");
//		btnNewButton.setBounds(223, 403, 129, 23);
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				objOperacoes.obterDadosTabela();
//				JFrameResultado viewResul = new JFrameResultado();
//				viewResul.setVisible(true);
//				objHome.fecharEstaView();
//			}
//		});
//		return btnNewButton;
//	}
//
//	public JButton botaoAdicionarProcesso() {
//		btnAdicionarProcesso = new JButton("Adicionar Processos");
//		btnAdicionarProcesso.setBounds(84, 64, 129, 23);
//		return btnAdicionarProcesso;
//	}
//
//
//
//	public JButton botaoTeste() {
//		JButton btnTeste = new JButton("TESTE");
//		btnTeste.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				objOperacoes.obterDadosTabela();
//			}
//		});
//		btnTeste.setBounds(374, 403, 89, 23);
//		return btnTeste;
//	}
//
//}
