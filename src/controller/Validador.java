package controller;

import javax.swing.JOptionPane;

public class Validador {
	public static Double recebeStringRetornaDouble(String numero){
		double retorno;
		try {
			if(numero.equals("")){
				return 0.0;
			}
			retorno = Double.parseDouble(numero);
		} catch (NullPointerException e) {
			return 0.0;
		} return retorno;
	}

	public static boolean validaPessoaFisica(PessoaFisica pf) {
		if(pf.getContribuicaoPrevidenciaraOficial() > pf.getTotalDeRendimentos()){
			JOptionPane.showMessageDialog(null, "A sua contribuição não pode ser maior que o total de seus rendimentos. Verifique.");
			return false;
		};
		if (pf.getNome().equals("") || pf.getCpf().equals("")){
			JOptionPane.showMessageDialog(null, "Você precisa preencher seu nome e CPF adequadamente. Verifique.");
			return false;
		}
		return true;
	}
}
