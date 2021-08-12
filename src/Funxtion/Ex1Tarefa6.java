package Funxtion;

import javax.swing.JOptionPane;

public class Ex1Tarefa6 {

	//Modulo 
	static int maiorNum(int a, int b) {
		
		//Declaração das variaveis   
		int result=0;
		   
		// Processamento   
		    if (a > b) 
		    {
		    	for (int i = b ; a != i ; i++ ){
		    		 if(i % 2 != 0) {
		    				 result = i+result;
		    	
		    			 }
		    		          
		    	                   }	  
		    	  
		    	  
		      }   	
		    else {
		    	for (int d = a ; b != d ; d++ ){
		    		 if(d % 2 != 0)
		    		 {
		    				 result = d+result;
		    
		    	    
		    		 }
		    		 
		    		 
		    	
		    	}
		    	
		    	
		    }
		    
		    //Saida
		    
		 return result;
		    
	}
	
	
	// Modulo Principal
	
	public static void main(String[] args) {
		
		//Declaração das variaveis   
		int a = 0, b=0;
		int res = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número para A", "Insira um dado",JOptionPane.QUESTION_MESSAGE));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número para B", "Insira um dado",JOptionPane.QUESTION_MESSAGE));
		
		res = maiorNum(a,b);		
		
		JOptionPane.showConfirmDialog(null, "O resultado da soma dos numeros ímpares do intervalo é: " + res, "Resultado",JOptionPane.PLAIN_MESSAGE ); 
	}
	
}
