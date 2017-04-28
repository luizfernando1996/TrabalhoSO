package view.frames;

import view.frames.JAdicionarProcesso;
import view.frames.JFrameResultado;

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

import controller.processo.Processo;


public class JFrameHome extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel modelo;
	private JScrollPane scrollPane;
	
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
		setBounds(100, 100, 601, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnAdicionarProcesso = new JButton("Adicionar Processos");
		btnAdicionarProcesso.setBounds(448, 61, 129, 23);
		btnAdicionarProcesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JAdicionarProcesso objView = new JAdicionarProcesso();
				objView.setVisible(true);

				// Em Eclipse se fecha a janela...em visual studio isto não
				// existe porque o direcionamento do codigo ja vai para outro
				// lugar
				// JFrameHome.this.dispose();
			}
		});

		//You should to selection a process for be remove
		JButton btnRemoverProcesso = new JButton("Remover Processo");
		btnRemoverProcesso.setBounds(448, 95, 129, 23);
		btnRemoverProcesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					modelo=(DefaultTableModel)table.getModel();
					modelo.removeRow(table.getSelectedRow());
			}
		});

		JButton btnLimparTudo = new JButton("Limpar Tudo");
		btnLimparTudo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo=(DefaultTableModel)table.getModel();
				
			}
		});
		btnLimparTudo.setBounds(448, 129, 129, 23);

		JButton btnNewButton = new JButton("Executar");
		btnNewButton.setBounds(448, 163, 129, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrameResultado viewResul = new JFrameResultado();
				viewResul.setVisible(true);
				JFrameHome.this.dispose();
			}
		});

		JButton btnTeste = new JButton("TESTE");
		btnTeste.setBounds(469, 197, 89, 23);
		btnTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarNaTabela(null);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnAdicionarProcesso);
		contentPane.add(btnRemoverProcesso);
		contentPane.add(btnLimparTudo);
		contentPane.add(btnNewButton);
		contentPane.add(btnTeste);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 412, 260);
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

	}

	public void adicionarNaTabela(Processo process) {
		int numCols = table.getModel().getColumnCount();

		Object[] fila = new Object[numCols];
		fila[0]="a";
		fila[1]=process.getTempoChegada();
		fila[2]=process.getDuracaoSurto();
		fila[3]=process.getPrioridade();
		
		((DefaultTableModel)table.getModel()).addRow(fila);

	}
}


