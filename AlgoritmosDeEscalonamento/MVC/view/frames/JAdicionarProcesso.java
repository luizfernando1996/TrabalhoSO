package view.frames;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.processo.Processo;

import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.awt.event.ActionEvent;
import view.frames.JFrameHome;

import javax.swing.JTextField;
import javax.swing.JButton;

//Show message in form
//import java.io.*;
//PrintWriter writer = new PrintWriter("debuggerOutput.txt", "UTF-8");
//in your class constructor, you will need to add some exception throws
//writer.println("I used to be in the debugger, but now I go in the file!!")

public class JAdicionarProcesso extends JFrame {

	// Attributes
	private static final long serialVersionUID = 1L;

	// Attributes of view<-------Ele corrige as palavras escritas em portugues
	private JPanel contentPane;
	private JTextField txtFieldNumeroProcesso;
	private JTextField txtFieldTempoChegada;
	private JTextField txtFieldDuracSurto;
	private JTextField txtFieldPrioridade;
	
	// Objects of classes
	public Processo objProcesso= new Processo();
	/**
	 * Create the frame.
	 * 
	 * @throws UnsupportedEncodingException
	 * @throws FileNotFoundException
	 */

	public JAdicionarProcesso() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 346, 219);
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

		JButton btnNewButton = new JButton("Adicionar Processo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarCamposAoController();
				limparCampos();
			}
		});
		btnNewButton.setBounds(186, 45, 126, 23);
		contentPane.add(btnNewButton);

		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			limparCampos();
			}
		});
		btnLimparCampos.setBounds(186, 79, 126, 23);
		contentPane.add(btnLimparCampos);

		JButton btnRetornar = new JButton("Retornar");
		btnRetornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JAdicionarProcesso.this.dispose();
			}
		});
		btnRetornar.setBounds(186, 120, 126, 23);

		contentPane.add(btnRetornar);
	}

	public void adicionarCamposAoController() {
		Processo.setContador(0);
		objProcesso.setTempoChegada(Integer.parseInt(txtFieldTempoChegada.getText()));
		objProcesso.setDuracaoSurto(Integer.parseInt(txtFieldDuracSurto.getText()));
		objProcesso.setPrioridade(Integer.parseInt(txtFieldPrioridade.getText()));
		JFrameHome objHome=new JFrameHome();
		objHome.adicionarNaTabela(objProcesso);
		
//		//Test of insertion
		JOptionPane.showMessageDialog(null,"Adicionado com sucesso");
//				" " + objReceber.getTempoChegada() + " " + objReceber.getDuracaoSurto() + " " + objReceber.getPrioridade());
	}

	private void limparCampos() {
		txtFieldPrioridade.setText(null);
		txtFieldDuracSurto.setText(null);
		txtFieldTempoChegada.setText(null);	
	}

}
