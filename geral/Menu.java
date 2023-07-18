package br.com.alura.challenger.conversor.geral;

import javax.swing.JOptionPane;

public class Menu {
	
  public String opcoesMenu() {  
	  
    String escolha = JOptionPane.showInputDialog(
      null, 
      "Tipos de conversores",
      "Conversor ONE T5 :D",
      JOptionPane.PLAIN_MESSAGE,
      null,
      new Object[] {
        "Conversor de Moeda",
        "Conversor de Temperatura",
        "Conversor de Quilometragem", 
       
      },
      
      "Escolha"
    ).toString();
    

    return escolha;
                
   }
}
