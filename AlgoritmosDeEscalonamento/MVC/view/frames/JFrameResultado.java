package view.frames;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import controller.processo.algoritmosEscalonamento.sjf.Sjf;
import controller.processo.algoritmosEscalonamento.sjf.NodeResultadoSjf;

public class JFrameResultado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFieldTempoEspera;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public JFrameResultado() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTempoDeEspera = new JLabel("Ordem de execução:");
		lblTempoDeEspera.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTempoDeEspera.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		panel_1.add(textField);
		
		Sjf objSjf=new Sjf();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_1.add(scrollPane_1);
		
		JLabel label = new JLabel("Tempo de espera:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTempoDeEspera, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(69)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblTempoDeEspera)
					.addGap(27)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
		);
		
		txtFieldTempoEspera = new JTextField();
		NodeResultadoSjf inicio=objSjf.resultadosPedidos();
		String mensagem=null;
		String tempoEspera=null;
		NodeResultadoSjf p=inicio;
		while(p!=null){
			mensagem=p.processoExecutado+"\n";
			tempoEspera=p.tempoEspera+"\n";
			p=p.next;
		}
		txtFieldTempoEspera.setText(tempoEspera);
		textField.setText(mensagem);
		
		panel.add(txtFieldTempoEspera);
		txtFieldTempoEspera.setEditable(false);
		txtFieldTempoEspera.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		contentPane.setLayout(gl_contentPane);
	}
}
