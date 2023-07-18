package br.com.alura.challenger.conversor.temperatura;

public class Temperatura {
	
    InputsTemperatura inputsTemperatura = new InputsTemperatura();
    ConversaoTemperatura conversor = new ConversaoTemperatura();

    public void executa(){
    	
        String opcaoTemperatura = inputsTemperatura.opcaoTemperatura();
        double recebe = inputsTemperatura.recebeTemperatura(opcaoTemperatura);
        double valorConvertido = conversor.verificarEExecutarConversao(opcaoTemperatura, recebe);
        String result = String.format("%.2f", valorConvertido);
        conversor.valorDaConversao(result);         
    }
}
