package br.com.alura.challenger.conversor.geral;

import javax.swing.JOptionPane;

public class Continuar {
	
    public int opcaoContinuar() {
    	
        Object[] opcoes = {"Sim", "Não", "Cancelar"};
        int opcaoSelecionada = JOptionPane.showOptionDialog
        (null,
        "Deseja continuar?",
        "Continuar",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE ,
        null, opcoes, opcoes);

        if (opcaoSelecionada == 1) {
        	
            JOptionPane.showMessageDialog(null, "Programa Finalizando, Volter sempre", null, opcaoSelecionada);
        }
        return opcaoSelecionada;
    }
}
