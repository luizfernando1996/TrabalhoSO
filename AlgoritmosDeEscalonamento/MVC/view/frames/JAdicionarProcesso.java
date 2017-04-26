package view.frames;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class JAdicionarProcesso extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField txtFieldNumeroProcesso;
	private JTextField txtFieldTempoChegada;
	private JTextField txtFieldDuracSurto;
	private JTextField txtFieldPrioridade;
	
	
	/**
	 * Create the frame.
	 */
	public JAdicionarProcesso() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroDoProcesso = new JLabel("Numero do Processo:");
		lblNumeroDoProcesso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumeroDoProcesso.setBounds(10, 11, 139, 14);
		contentPane.add(lblNumeroDoProcesso);
		
		txtFieldNumeroProcesso = new JTextField();
		txtFieldNumeroProcesso.setEditable(false);
		txtFieldNumeroProcesso.setBounds(10, 26, 126, 20);
		contentPane.add(txtFieldNumeroProcesso);
		txtFieldNumeroProcesso.setColumns(10);
		
		txtFieldTempoChegada = new JTextField();
		txtFieldTempoChegada.setColumns(10);
		txtFieldTempoChegada.setBounds(10, 63, 126, 20);
		contentPane.add(txtFieldTempoChegada);
		
		JLabel lblTempoDeChegada = new JLabel("Tempo de chegada:");
		lblTempoDeChegada.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTempoDeChegada.setBounds(10, 48, 126, 14);
		contentPane.add(lblTempoDeChegada);
		
		txtFieldDuracSurto = new JTextField();
		txtFieldDuracSurto.setColumns(10);
		txtFieldDuracSurto.setBounds(10, 106, 126, 20);
		contentPane.add(txtFieldDuracSurto);
		
		JLabel lblDuracaoDoSurto = new JLabel("Duraca\u00E7\u00E3o do Surto:");
		lblDuracaoDoSurto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDuracaoDoSurto.setBounds(10, 91, 139, 14);
		contentPane.add(lblDuracaoDoSurto);
		
		txtFieldPrioridade = new JTextField();
		txtFieldPrioridade.setColumns(10);
		txtFieldPrioridade.setBounds(10, 144, 126, 20);
		contentPane.add(txtFieldPrioridade);
		
		JLabel lblPrioridade = new JLabel("Prioridade:");
		lblPrioridade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrioridade.setBounds(10, 129, 74, 14);
		contentPane.add(lblPrioridade);
		
		JLabel lbAdicionarProcesso = new JLabel("");
		lbAdicionarProcesso.setBounds(172, 26, 157, 20);
		contentPane.add(lbAdicionarProcesso);
		
		JLabel lbLimparCampos = new JLabel("");
		lbLimparCampos.setBounds(172, 63, 157, 20);
		contentPane.add(lbLimparCampos);
	}
}
