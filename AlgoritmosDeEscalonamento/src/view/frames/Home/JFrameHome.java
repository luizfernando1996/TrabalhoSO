//package view.frames.Home;
//
////import view.frames.JFrameResultado;
//import controller.processo.NodeProcesso;
//import controller.processo.algoritmosEscalonamento.roundRobin.FilaDePronto;
//import controller.processo.algoritmosEscalonamento.roundRobin.RoundRobin;
//import view.frames.Home.ButoesDaView;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JButton;
////import java.awt.event.ActionListener;
//import java.awt.EventQueue;
////import java.awt.event.ActionEvent;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;
//
//import javax.swing.JTextField;
//import javax.swing.JLabel;
//
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JCheckBox;
//
//public class JFrameHome extends JFrame {
//
//	// o atributo abaixo é necessario devido ao frame JFrame-->desabilitei a
//	// correção das palavras para ingles
//	private static final long serialVersionUID = 1L;
//	
//	protected JPanel contentPane;
//	protected JTable table;
//	protected DefaultTableModel modelo;
//	protected JScrollPane scrollPane;
//	protected JTextField txtFieldNumeroProcesso;
//	protected JTextField txtFieldTempoChegada;
//	protected JTextField txtFieldDuracSurto;
//	protected JTextField txtFieldPrioridade;
//	protected JTextField txtFieldQuantum;
//
//	/**
//	 * Launch the application.
//	 */
//
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					JFrameHome frame = new JFrameHome();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public JFrameHome() {
//
//
//
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 633, 491);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//
//
//		// O atributo abaixo deve estar neste construtor porque se estiver fora
//		// não será criado e assim não poderá ser acessado.
//		// Deve se criar o objeto por completo...não pode nem criar uma
//		// referencia la em cima e instanciar aqui embaixo
//		// porque o construtor não verá nada em cima.
//		ButoesDaView objButView = new ButoesDaView();
//		JButton btnAdicionarProcesso = objButView.botaoAdicionarProcesso();
//		JButton btnRemoverProcesso = objButView.botaoRemover();
//		JButton btnLimparTudo = objButView.botaoLimpar();
//		JButton btnNewButton = objButView.botaoExecutar();
//		JButton btnTeste = objButView.botaoTeste();
//
//		contentPane.setLayout(null);
//		contentPane.add(btnAdicionarProcesso);
//		contentPane.add(btnRemoverProcesso);
//		contentPane.add(btnLimparTudo);
//		contentPane.add(btnNewButton);
//		contentPane.add(btnTeste);
//
//		EventosDosButoes objEventos= new EventosDosButoes();
//		btnAdicionarProcesso.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				objEventos.botaoAdicionarProcessoEvento();
//			}
//		});
//		
//		
//		scrollPane = new JScrollPane();
//		scrollPane.setBounds(73, 109, 492, 283);
//		contentPane.add(scrollPane);
//
//		modelo = new DefaultTableModel();
//		table = new JTable(modelo);
//		table.setModel(new DefaultTableModel(new Object[][] {},
//				new String[] { "Numero do Processo", "Tempo de Chegada", "Duração do Surto", "Prioridade" }));
//		table.getColumnModel().getColumn(0).setPreferredWidth(110);
//		table.getColumnModel().getColumn(0).setMinWidth(110);
//		table.getColumnModel().getColumn(1).setMinWidth(104);
//		table.getColumnModel().getColumn(2).setMinWidth(100);
//		scrollPane.setViewportView(table);
//
//		txtFieldNumeroProcesso = new JTextField();
//		txtFieldNumeroProcesso.setEditable(false);
//		txtFieldNumeroProcesso.setText(Integer.toString(1));
//		txtFieldNumeroProcesso.setColumns(10);
//		txtFieldNumeroProcesso.setBounds(10, 26, 126, 20);
//		contentPane.add(txtFieldNumeroProcesso);
//
//		JLabel label = new JLabel("Numero do Processo:");
//		label.setFont(new Font("Tahoma", Font.BOLD, 12));
//		label.setBounds(10, 11, 139, 14);
//		contentPane.add(label);
//
//		txtFieldTempoChegada = new JTextField();
//		txtFieldTempoChegada.setColumns(10);
//		txtFieldTempoChegada.setBounds(146, 26, 126, 20);
//		contentPane.add(txtFieldTempoChegada);
//
//		JLabel label_1 = new JLabel("Tempo de chegada:");
//		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
//		label_1.setBounds(148, 11, 126, 14);
//		contentPane.add(label_1);
//
//		txtFieldDuracSurto = new JTextField();
//		txtFieldDuracSurto.setColumns(10);
//		txtFieldDuracSurto.setBounds(282, 26, 126, 20);
//		contentPane.add(txtFieldDuracSurto);
//
//		JLabel label_2 = new JLabel("Duracação do Surto:");
//		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
//		label_2.setBounds(282, 11, 139, 14);
//		contentPane.add(label_2);
//
//		txtFieldPrioridade = new JTextField();
//		txtFieldPrioridade.setColumns(10);
//		txtFieldPrioridade.setBounds(422, 26, 74, 20);
//		contentPane.add(txtFieldPrioridade);
//
//		JLabel label_3 = new JLabel("Prioridade:");
//		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
//		label_3.setBounds(422, 11, 74, 14);
//		contentPane.add(label_3);
//
//		JLabel lblQuantum = new JLabel("Quantum");
//		lblQuantum.setFont(new Font("Tahoma", Font.BOLD, 12));
//		lblQuantum.setBounds(506, 11, 74, 14);
//		contentPane.add(lblQuantum);
//
//		txtFieldQuantum = new JTextField();
//		txtFieldQuantum.setColumns(10);
//		txtFieldQuantum.setBounds(506, 26, 74, 20);
//		contentPane.add(txtFieldQuantum);
//
//		JCheckBox chckbxRoundRobin = new JCheckBox("Round Robin");
//		chckbxRoundRobin.setBounds(439, 64, 97, 23);
//		contentPane.add(chckbxRoundRobin);
//
//		JCheckBox chckbxSjf = new JCheckBox("SJF");
//		chckbxSjf.setBounds(538, 64, 50, 23);
//		contentPane.add(chckbxSjf);
//
//	}
//	protected void fecharEstaView() {
//		JFrameHome.this.dispose();
//	}
//}
