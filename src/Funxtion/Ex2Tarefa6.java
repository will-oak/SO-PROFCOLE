package Funxtion;

import javax.swing.JOptionPane;

public class Ex2Tarefa6 {

	static double serieCalc () {
	    double soma2 = 0, serie = 0;
	    double reci = 0;
		
	    serie = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o número para calcular a série", "Insira os dados",JOptionPane.QUESTION_MESSAGE ));
	    for (double cont = 1 ; cont < serie ; cont++ ){ 
	    	    
	    	     reci = 1 / cont;
	    	    
	    	    soma2 = soma2+reci;	 
	             
	    }
		return soma2; 
		
		
	}
	
	
	
	
	public static void main(String[] args) {
	double soma = 0; 	
		
		
    soma = serieCalc();	
	JOptionPane.showConfirmDialog(null,"O valor da série é: " + soma, "Resultado",JOptionPane.PLAIN_MESSAGE);
    	
	
	}
	
	
	
}
