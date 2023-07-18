package br.com.alura.challenger.conversor.moedas;

import javax.swing.JOptionPane;

public class ConversorMoeda {
	
    private String simbolo;

    public double executaConversao(String opcaoMoeda, double valor) {
        double valorConvertido = 0;

        if (opcaoMoeda == "De Reais a Dólares") {
            valorConvertido = valor / 4.81;
            simbolo = "U$ ";
        } else if (opcaoMoeda == "De Reais a Euros") {
            valorConvertido = valor / 5.40;
            simbolo = "€";
        } else if (opcaoMoeda == "De Reais a Libras") {
            valorConvertido = valor / 6.27;
            simbolo = "£";
        } else if (opcaoMoeda == "De Reais a Ienes") {
            valorConvertido = valor / 0.035;
            simbolo = "¥";
        } else if (opcaoMoeda == "De Dólares a Reais") {
            valorConvertido = valor * 4.81;
            simbolo = "R$";
        } else if (opcaoMoeda == "De Euros a Reais") {
            valorConvertido = valor * 5.40;
            simbolo = "R$";
        } else if (opcaoMoeda == "De Libras a Reais") {
            valorConvertido = valor * 6.27;
            simbolo = "R$";
        } else if (opcaoMoeda == "De Yene a Reais") {
            valorConvertido = valor * 0.035;
            simbolo = "R$";
        } 
        
        return valorConvertido;
    }

    public  void valorDaConversao (String valor) {
        JOptionPane.showMessageDialog(null, "O valor de: " + simbolo + valor );
    }
}
