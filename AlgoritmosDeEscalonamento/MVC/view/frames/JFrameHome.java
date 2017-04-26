package view.frames;

import view.frames.JAdicionarProcesso;
import view.frames.JFrameResultado;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class JFrameHome extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTable table;

	
	
//ISTO AQUI EM BAIXO SERVE PARA QUE???
	/**
	 * Launch the application.
	 */
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
//ISTO AQUI EM CIMA SERVE PARA QUE???

	/**
	 * Create the frame.
	 */
	public JFrameHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable();
		table.setBounds(10, 11, 285, 239);
		contentPane.add(table);

		JButton btnAdicionarProcesso = new JButton("Adicionar Processo");
		btnAdicionarProcesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JAdicionarProcesso objView = new JAdicionarProcesso();
				objView.setVisible(true);
				JFrameHome.this.dispose();
			}
		});
		btnAdicionarProcesso.setBounds(305, 69, 129, 23);
		contentPane.add(btnAdicionarProcesso);

		JButton btnRemoverProcesso = new JButton("Remover Processo");
		btnRemoverProcesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnRemoverProcesso.setBounds(305, 103, 129, 23);
		contentPane.add(btnRemoverProcesso);

		JButton btnLimparTudo = new JButton("Limpar Tudo");
		btnLimparTudo.setBounds(305, 137, 129, 23);
		contentPane.add(btnLimparTudo);

		JButton btnNewButton = new JButton("Executar");
		btnNewButton.setBounds(305, 171, 129, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrameResultado viewResul = new JFrameResultado();
				viewResul.setVisible(true);
				JFrameHome.this.dispose();
			}
		});
	}
}
