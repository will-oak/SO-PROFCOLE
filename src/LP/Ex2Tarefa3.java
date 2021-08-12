package LP;

import javax.swing.JOptionPane;

/*Receba 2 números inteiros, verifique qual o maior entre eles.
Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
*/

public class Ex2Tarefa3 {
    public static void main(String[] args) {
	    int a, b, aux=0;
	    
	    //Entrada de dados
	    a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número para A", "Insira os dados", JOptionPane.PLAIN_MESSAGE));
	    b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número para B", "Insira os dados", JOptionPane.PLAIN_MESSAGE));
	  
	    //Processamento
	    if(b<a) {
	    	JOptionPane.showMessageDialog(null, "Os valores impares vão ser entre B e A", "Aviso", JOptionPane.WARNING_MESSAGE);
	    	
	    }
	    else {
	    	JOptionPane.showMessageDialog(null, "Os valores impares vão ser entre A e B", "Aviso", JOptionPane.WARNING_MESSAGE);
	    }
	    
	    
	    
	    	while(b < a) {
	    		if(b % 2 == 0 ){
	    		     }
	    		
	    		else { 
	    			aux = b+aux;	
	    		}
	    	++b;
	    	}
	    	
	    	while(a < b) {
	    		if(a % 2 == 0 ){
	                 }
	    		
	    		else {
	    			aux = a+aux;
	    		     }
	        ++a;
}
	    	//Saida
	    	JOptionPane.showMessageDialog(null, "O resultado da somatória dos números ímpares entre esses valores é: "+ aux , "Resposta", JOptionPane.PLAIN_MESSAGE);
}
}
    
