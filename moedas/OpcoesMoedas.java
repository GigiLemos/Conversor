package br.com.alura.challenger.conversor.moedas;

import javax.swing.JOptionPane;

public class OpcoesMoedas {
	
    public String showOptions() {

        String opcao = JOptionPane.showInputDialog(
            null,
            "Escolha a moeda quwe você deseja converter: ",
            "Menu",
            JOptionPane.PLAIN_MESSAGE,
            null,
            new Object[] {
            "De Reais a Dólares",
            "De Reais a Euros",
            "De Reais a Libras",
            "De Dólares a Reais",
            "De Euros a Reais",
            "De Libras a Reais",}, 
            "Escolha").toString();
         return opcao;
    } 
}
