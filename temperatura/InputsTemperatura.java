package br.com.alura.challenger.conversor.temperatura;

public class InputsTemperatura {

    public String opcaoTemperatura() {
    	
        OpcaoTemperatura opcaoTempe = new OpcaoTemperatura();
        String opcao = opcaoTempe.showOptions();
        return opcao;
    }

    public double recebeTemperatura(String opcaoTemperatura) {
    	
        RecebeTemperatura recebeTemperatura = new RecebeTemperatura();
        double recebe = recebeTemperatura.entradaDoValorTemperatura(opcaoTemperatura);
        return recebe;
    }

    public String conversaoTemperatura() {
    	
        ConversaoTemperatura conversaoTemperatura = new ConversaoTemperatura();
        String conversao = conversaoTemperatura.showOptions();
        return conversao;
    }
}
     