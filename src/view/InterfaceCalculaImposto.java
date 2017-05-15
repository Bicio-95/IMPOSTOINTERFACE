package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.CalculaImposto;
import controller.PessoaFisica;
import controller.Validador;

public class InterfaceCalculaImposto extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JTextField textFieldContribuicaoPrevidenciaria;
	private JTextField textFieldTotalRendimentos;
	private CalculaImposto calculaImposto = new CalculaImposto();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCalculaImposto frame = new InterfaceCalculaImposto();
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
	public InterfaceCalculaImposto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome: *");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(12, 13, 65, 16);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF: *");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCpf.setBounds(12, 42, 56, 16);
		contentPane.add(lblCpf);
		
		JLabel lblIdade = new JLabel("Idade: **");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdade.setBounds(12, 71, 77, 16);
		contentPane.add(lblIdade);
		
		JLabel lblNrDependentes = new JLabel("N\u00FAmero de dependentes: **");
		lblNrDependentes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNrDependentes.setBounds(12, 100, 205, 16);
		contentPane.add(lblNrDependentes);
		
		JLabel lblContribuicaoPrevidenciaria = new JLabel("Contribui\u00E7\u00E3o previdenci\u00E1ria oficial: ***");
		lblContribuicaoPrevidenciaria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContribuicaoPrevidenciaria.setBounds(12, 129, 249, 16);
		contentPane.add(lblContribuicaoPrevidenciaria);
		
		JLabel lblTotalRendimentos = new JLabel("Total de rendimentos: ***");
		lblTotalRendimentos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotalRendimentos.setBounds(12, 158, 183, 16);
		contentPane.add(lblTotalRendimentos);
		
		JLabel lblcamposObrigatriosPara = new JLabel("*Campos obrigat\u00F3rios para todos os contribuintes.");
		lblcamposObrigatriosPara.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblcamposObrigatriosPara.setBounds(12, 185, 386, 19);
		contentPane.add(lblcamposObrigatriosPara);
		
		JLabel lblTodosOsContribuintes = new JLabel("**Campos obrigat\u00F3rios para os contribuintes que fazem");
		lblTodosOsContribuintes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTodosOsContribuintes.setBounds(12, 205, 386, 16);
		contentPane.add(lblTodosOsContribuintes);
		
		JLabel lblRiosParaOs = new JLabel("declara\u00E7\u00E3o completa.");
		lblRiosParaOs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRiosParaOs.setBounds(12, 225, 386, 16);
		contentPane.add(lblRiosParaOs);
		
		JLabel lblDeclaraoCompleta = new JLabel("***Campos obrigat\u00F3rios para permitir o c\u00E1lculo do imposto ");
		lblDeclaraoCompleta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeclaraoCompleta.setBounds(12, 245, 386, 16);
		contentPane.add(lblDeclaraoCompleta);
		
		JLabel lblObrigatriosParaPermitir = new JLabel("(qualquer modalidade).");
		lblObrigatriosParaPermitir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblObrigatriosParaPermitir.setBounds(12, 265, 275, 16);
		contentPane.add(lblObrigatriosParaPermitir);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(89, 11, 309, 22);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(79, 40, 116, 22);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		JComboBox comboBoxIdade = new JComboBox();
		for (int i = 0; i < 100; i++) 
			comboBoxIdade.addItem(String.valueOf(i));
		comboBoxIdade.addItem("100+");
		comboBoxIdade.setBounds(89, 69, 65, 22);
		contentPane.add(comboBoxIdade);
		
		JComboBox comboBoxNrDependentes = new JComboBox<String>();
		for (int i = 0; i < 5; i++) 
			comboBoxNrDependentes.addItem(String.valueOf(i));
		comboBoxNrDependentes.addItem("5+");
		comboBoxNrDependentes.setBounds(229, 98, 65, 22);
		contentPane.add(comboBoxNrDependentes);
		
		textFieldContribuicaoPrevidenciaria = new JTextField();
		textFieldContribuicaoPrevidenciaria.setBounds(273, 127, 116, 22);
		contentPane.add(textFieldContribuicaoPrevidenciaria);
		textFieldContribuicaoPrevidenciaria.setColumns(10);
		
		textFieldTotalRendimentos = new JTextField();
		textFieldTotalRendimentos.setBounds(207, 156, 116, 22);
		contentPane.add(textFieldTotalRendimentos);
		textFieldTotalRendimentos.setColumns(10);
		
		JLabel lblImpostoAPagar = new JLabel("Imposto a pagar:");
		lblImpostoAPagar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblImpostoAPagar.setBounds(60, 316, 135, 16);
		contentPane.add(lblImpostoAPagar);
		
		JLabel labelResultado = new JLabel("0,00");
		labelResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelResultado.setBounds(229, 316, 169, 16);
		contentPane.add(labelResultado);
		
		JButton btnLimparCampos = new JButton("Limpar campos");
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldContribuicaoPrevidenciaria.setText("");
				textFieldCPF.setText("");
				textFieldNome.setText("");
				textFieldTotalRendimentos.setText("");
				comboBoxIdade.setSelectedIndex(0);
				comboBoxNrDependentes.setSelectedIndex(0);
			}
		});
		btnLimparCampos.setBounds(152, 285, 135, 25);
		contentPane.add(btnLimparCampos);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PessoaFisica pf = new PessoaFisica(textFieldNome.getText(), textFieldCPF.getText());
				pf.setContribuicaoPrevidenciaraOficial(Validador.recebeStringRetornaDouble(textFieldContribuicaoPrevidenciaria.getText()));
				pf.setNumeroDependetes(comboBoxNrDependentes.getSelectedIndex());
				pf.setTotalDeRendimentos(Validador.recebeStringRetornaDouble(textFieldTotalRendimentos.getText()));
				pf.setIdade(comboBoxIdade.getSelectedIndex());
				if (Validador.validaPessoaFisica(pf)){
					labelResultado.setText(String.valueOf(calculaImposto.calculaImpostoAPagar(pf)));
				}
			}

		});
		btnCalcular.setBounds(301, 285, 97, 25);
		contentPane.add(btnCalcular);
		
		JLabel lblR = new JLabel("R$");
		lblR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblR.setBounds(207, 317, 29, 16);
		contentPane.add(lblR);
	}
}
