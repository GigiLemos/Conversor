package br.com.alura.challenger.conversor.quilometragem;

import br.com.alura.challenger.conversor.geral.Menu;

public class InputsQuilometragem {
	
    public String menu() {
        Menu menu = new Menu();
        String resposta = menu.opcoesMenu();
        return resposta;
    }

    public String opcaoQuilometragem(){
        OpcaoQuilometragem opcaoQuilometragem = new OpcaoQuilometragem();
        String opcoes = opcaoQuilometragem.showOptions();
        return opcoes;
    }

    public double RecebeQuilometragem(String opcaoQuilometragem) {
        RecebeQuilometragem entrada = new RecebeQuilometragem();
        double valor = entrada.entradaDoValor(opcaoQuilometragem);
        return valor;

    }
        
}
