package Funxtion;
import javax.swing.JOptionPane;

public class Teste {
    public static void main (String args[]){
    	
    	
      int n1=0, n2=0, resultado=0;
      n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor sendo ele inteiro"));
      n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor sendo ele inteiro"));
      resultado=Valida��o(n1,n2);
      //JOptionPane.showMessageDialog(null,"o valor da soma dos impares �:" +resultado);
      
      //JOptionPane.showMessageDialog(null, "O valor da soma �:"+resultado,"resultado",JOptionPane.PLAIN_MESSAGE);
         
      JOptionPane.showMessageDialog(null, "O valor �: "+resultado, "Resultado", JOptionPane.PLAIN_MESSAGE);
    
    }
    

    static int Valida��o(int n1, int n2){
		int result=0;
		   
		// Processamento   
		    if (n1 > n2) 
		    {
		    	for (int i = n2 ; n1 != i ; i++ ){
		    		 if(i % 2 != 0) {
		    				 result = i+result;
		    				
		    			 }
		    		          
		    	                   }	  
		    	  
		    	  
		      }   	
		    else {
		    	for (int d = n1 ; n2 != d ; d++ ){
		    		 if(d % 2 != 0)
		    		 {
		    				 result = d+result;
		    	/* Teste de MESA
		    				 JOptionPane.showConfirmDialog(null, "O n�mero de result �: "+result, "Resultado",JOptionPane.PLAIN_MESSAGE);
		    	    */
		    		 }
		    		 
		    		 
		    	
		    	}
		    	
		    	
		    }
		    
		    //Saida
		    
		 return result;

    }
}