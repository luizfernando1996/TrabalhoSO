package view.frames;

import view.frames.JFrameResultado;
import controller.processo.ListaTempoChegada;
import controller.processo.NodeProcesso;
import controller.processo.algoritmosEscalonamento.roundRobin.FilaDePronto;
import controller.processo.algoritmosEscalonamento.roundRobin.RoundRobin;
import controller.processo.algoritmosEscalonamento.sjf.Sjf;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
//import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JTextField;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;

public class JFrameHome extends JFrame {

	// o atributo abaixo é necessario devido ao frame JFrame-->desabilitei a
	// correção das palavras para ingles
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel modelo;
	private JScrollPane scrollPane;
	private JTextField txtFieldNumeroProcesso;
	private JTextField txtFieldTempoChegada;
	private JTextField txtFieldDuracSurto;
	private JTextField txtFieldPrioridade;
	private JTextField txtFieldQuantum;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameHome frame = new JFrameHome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnAdicionarProcesso = new JButton("Adicionar Processos");
		btnAdicionarProcesso.setBounds(84, 64, 129, 23);
		btnAdicionarProcesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NodeProcesso process = criarProcesso();
				adicionarNaTabela(process);
				limparCampos();
			}
		});

		// You should to selection a process for be remove
		JButton btnRemoverProcesso = new JButton("Remover Processo");
		btnRemoverProcesso.setBounds(223, 64, 129, 23);
		btnRemoverProcesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo = (DefaultTableModel) table.getModel();
				// int linha = table.getSelectedRow();
				// table.getValueAt(linha, 0);
				modelo.removeRow(table.getSelectedRow());
				atualizarIdNumeroProcesso();
				// decrementa txtFieldNumeroProcesso
				int num = Integer.parseInt(txtFieldNumeroProcesso.getText());
				--num;
				txtFieldNumeroProcesso.setText(Integer.toString(num));
			}
		});

		JButton btnLimparTudo = new JButton("Limpar Tudo");
		btnLimparTudo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo = (DefaultTableModel) table.getModel();

			}
		});
		btnLimparTudo.setBounds(57, 403, 129, 23);

		JButton btnNewButton = new JButton("Executar");
		btnNewButton.setBounds(223, 403, 129, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obterDadosTabela();
				JFrameResultado viewResul = new JFrameResultado();
				viewResul.setVisible(true);
				JFrameHome.this.dispose();
			}
		});

		JButton btnTeste = new JButton("TESTE");
		btnTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obterDadosTabela();
			}
		});
		btnTeste.setBounds(374, 403, 89, 23);
		contentPane.setLayout(null);
		contentPane.add(btnAdicionarProcesso);
		contentPane.add(btnRemoverProcesso);
		contentPane.add(btnLimparTudo);
		contentPane.add(btnNewButton);
		contentPane.add(btnTeste);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(74, 109, 486, 283);
		contentPane.add(scrollPane);

		modelo = new DefaultTableModel();
		table = new JTable(modelo);
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Numero do Processo", "Tempo de Chegada", "Duração do Surto", "Prioridade" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(110);
		table.getColumnModel().getColumn(0).setMinWidth(110);
		table.getColumnModel().getColumn(1).setMinWidth(104);
		table.getColumnModel().getColumn(2).setMinWidth(100);
		scrollPane.setViewportView(table);

		txtFieldNumeroProcesso = new JTextField();
		txtFieldNumeroProcesso.setEditable(false);
		txtFieldNumeroProcesso.setText(Integer.toString(1));
		txtFieldNumeroProcesso.setColumns(10);
		txtFieldNumeroProcesso.setBounds(10, 26, 126, 20);
		contentPane.add(txtFieldNumeroProcesso);

		JLabel label = new JLabel("Numero do Processo:");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(10, 11, 139, 14);
		contentPane.add(label);

		txtFieldTempoChegada = new JTextField();
		txtFieldTempoChegada.setColumns(10);
		txtFieldTempoChegada.setBounds(146, 26, 126, 20);
		contentPane.add(txtFieldTempoChegada);

		JLabel label_1 = new JLabel("Tempo de chegada:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(148, 11, 126, 14);
		contentPane.add(label_1);

		txtFieldDuracSurto = new JTextField();
		txtFieldDuracSurto.setColumns(10);
		txtFieldDuracSurto.setBounds(282, 26, 126, 20);
		contentPane.add(txtFieldDuracSurto);

		JLabel label_2 = new JLabel("Duracação do Surto:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(282, 11, 139, 14);
		contentPane.add(label_2);

		txtFieldPrioridade = new JTextField();
		txtFieldPrioridade.setColumns(10);
		txtFieldPrioridade.setBounds(422, 26, 74, 20);
		contentPane.add(txtFieldPrioridade);

		JLabel label_3 = new JLabel("Prioridade:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(422, 11, 74, 14);
		contentPane.add(label_3);
		
		JLabel lblQuantum = new JLabel("Quantum");
		lblQuantum.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuantum.setBounds(506, 11, 74, 14);
		contentPane.add(lblQuantum);

		txtFieldQuantum = new JTextField();
		 txtFieldQuantum.setColumns(10);
		 txtFieldQuantum.setBounds(506, 26, 74, 20);
			contentPane.add(txtFieldQuantum);

		JCheckBox chckbxRoundRobin = new JCheckBox("Round Robin");
		chckbxRoundRobin.setBounds(439, 64, 97, 23);
		contentPane.add(chckbxRoundRobin);
		
		JCheckBox chckbxSjf = new JCheckBox("SJF");
		chckbxSjf.setBounds(547, 64, 50, 23);
		contentPane.add(chckbxSjf);

	}

	public int obterIdProcesso() {
		int id = ((DefaultTableModel) table.getModel()).getRowCount();
		++id;
		return id;
		// JOptionPane.showMessageDialog(null,id);
	}

	public NodeProcesso criarProcesso() {
		NodeProcesso objProcesso = new NodeProcesso();
		NodeProcesso.setContador(obterIdProcesso());
		objProcesso.setTempoChegada(Integer.parseInt(txtFieldTempoChegada.getText()));
		objProcesso.setDuracaoSurto(Integer.parseInt(txtFieldDuracSurto.getText()));
		objProcesso.setPrioridade(Integer.parseInt(txtFieldPrioridade.getText()));
		return objProcesso;
	}

	public void adicionarNaTabela(NodeProcesso processo) {
		int numCols = table.getModel().getColumnCount();

		Object[] fila = new Object[numCols];

		fila[0] = NodeProcesso.getContador();
		fila[1] = processo.getTempoChegada();
		fila[2] = processo.getDuracaoSurto();
		fila[3] = processo.getPrioridade();

		((DefaultTableModel) table.getModel()).addRow(fila);
	}

	private void limparCampos() {
		txtFieldNumeroProcesso.setText(Integer.toString(obterIdProcesso()));
		txtFieldPrioridade.setText(null);
		txtFieldDuracSurto.setText(null);
		txtFieldTempoChegada.setText(null);
	}

	private void obterDadosTabela() {
		// pega o numero de linhas da tabela

		int quantProcessos = ((DefaultTableModel) table.getModel()).getRowCount();

		FilaDePronto objFilaDePronto = new FilaDePronto();
		ListaTempoChegada objLista=new ListaTempoChegada();
		// percorre todas as linhas dos processos

		for (int i = 0; i < quantProcessos; i++) {
			Integer[] a = obterColunasProcesso(i);
			objLista.InserirProcessoOrdenado(a[0], a[1],  a[2], a[3]);
		}
		 RoundRobin objQuantum = new RoundRobin(Integer.parseInt(txtFieldQuantum.getText()));
		 Sjf objSjf=new Sjf();
		 objSjf.executarProcessos();
	}

	private void atualizarIdNumeroProcesso() {
		int numeroLinhas = modelo.getRowCount();
		for (int i = 0; i < numeroLinhas; i++) {
			modelo.setValueAt(i + 1, i, 0);
			// table.getValueAt(i, 0);
		}

	}

	// Aqui se obtêm a linha da tabela
	private Integer[] obterColunasProcesso(int i) {

		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		// int quantProcessos =
		// ((DefaultTableModel)table.getModel()).getRowCount();
		Integer[] a = new Integer[4];
		for (int x = 0; x < 4; x++) {
			a[x] = Integer.parseInt(dtm.getValueAt(i, x).toString());
		}
		return a;
	}
}
