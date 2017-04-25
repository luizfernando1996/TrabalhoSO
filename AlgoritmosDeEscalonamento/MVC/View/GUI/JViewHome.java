import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;

public class JViewHome extends JFrame {
	private JTextField txtFieldTempCheg;
	private JTextField txtFieldNameProcesso;
	private JTextField txtFieldPrioridade;
	private JTextField txtFieldDuraSurto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JViewHome frame = new JViewHome();
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
	public JViewHome() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		txtFieldTempCheg = new JTextField();
		txtFieldTempCheg.setBounds(10, 76, 176, 20);
		getContentPane().add(txtFieldTempCheg);
		txtFieldTempCheg.setColumns(10);

		JLabel lbTempChegada = new JLabel("Informe o tempo de chegada:");
		lbTempChegada.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbTempChegada.setBounds(10, 59, 194, 14);
		getContentPane().add(lbTempChegada);

		JLabel lblNomeDoProcesso = new JLabel("Nome do Processo:");
		lblNomeDoProcesso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoProcesso.setBounds(10, 11, 194, 14);
		getContentPane().add(lblNomeDoProcesso);

		txtFieldNameProcesso = new JTextField();
		txtFieldNameProcesso.setEditable(false);
		txtFieldNameProcesso.setColumns(10);
		txtFieldNameProcesso.setBounds(10, 28, 176, 20);
		getContentPane().add(txtFieldNameProcesso);

		JLabel lblInformeADurao = new JLabel("Informe a dura\u00E7\u00E3o do surto:");
		lblInformeADurao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInformeADurao.setBounds(10, 107, 194, 14);
		getContentPane().add(lblInformeADurao);

		txtFieldDuraSurto = new JTextField();
		txtFieldDuraSurto.setColumns(10);
		txtFieldDuraSurto.setBounds(10, 124, 176, 20);
		getContentPane().add(txtFieldDuraSurto);

		JLabel lblInformeAPrioridade = new JLabel("Informe a prioridade:");
		lblInformeAPrioridade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInformeAPrioridade.setBounds(10, 155, 194, 14);
		getContentPane().add(lblInformeAPrioridade);

		txtFieldPrioridade = new JTextField();
		txtFieldPrioridade.setColumns(10);
		txtFieldPrioridade.setBounds(10, 172, 176, 20);
		getContentPane().add(txtFieldPrioridade);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 204, 261);
		getContentPane().add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(203, 0, 231, 261);
		getContentPane().add(panel_1);

		ImageIcon imagem = new ImagemIcon(Main);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JViewHome.class.getResource("/Resources/Play.ico")));
		panel_1.add(lblNewLabel);
	}
}
