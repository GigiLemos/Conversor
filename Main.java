package br.com.alura.challenger.conversor.main;

import br.com.alura.challenger.conversor.geral.Cancelar;
import br.com.alura.challenger.conversor.geral.Continuar;
import br.com.alura.challenger.conversor.moedas.Inputs;
import br.com.alura.challenger.conversor.moedas.Moedas;
import br.com.alura.challenger.conversor.quilometragem.Quilometros;
import br.com.alura.challenger.conversor.temperatura.Temperatura;

public class Main {
	
    public static void main(String[] args) {
    	
    	Inputs inputs = new Inputs();
        Moedas moedas = new Moedas();
        Temperatura temperatura = new Temperatura();
        Quilometros quilometros = new Quilometros();
        Continuar continuar = new Continuar();

        try {
            int continua = 0;
            while (continua == 0) {
                String opcao = inputs.menu();
               
                if (opcao == "Conversor de Moeda"){
                    moedas.executa();
                
                } else if (opcao == "Conversor de Temperatura") {
                    temperatura.executa();

                } else if (opcao == "Conversor de Quilometragem") {
                    quilometros.executa();

                } 
                continua = continuar.opcaoContinuar();
            }
            
        } catch (Exception e) {
            Cancelar cancelar = new Cancelar();
            cancelar.opcaoCancelar();
        }
        
    }
}
