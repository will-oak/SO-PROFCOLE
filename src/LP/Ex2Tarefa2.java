package LP;

import javax.swing.JOptionPane;

public class Ex2Tarefa2 {

	public static void main(String[] args) {
		
		//Declaração de variaveis
		int x=0, a=0, b=0, c=0;
		
		
		//Entrada de dados
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A", "Entrada",JOptionPane.QUESTION_MESSAGE));
		
		while (a == 0) {
			JOptionPane.showConfirmDialog(null, "A é igual a 0, digite novamente: ", "Resultado",JOptionPane.WARNING_MESSAGE);
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A, digite novamente:", "Entrada",JOptionPane.QUESTION_MESSAGE));
		                }
		
		b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de B: ", "Entrada",JOptionPane.QUESTION_MESSAGE));
		while (b <= a ) {
			JOptionPane.showConfirmDialog(null, "B é menor que A, digite novamente:", "Resultado",JOptionPane.WARNING_MESSAGE);
			b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de B, digite novamente:", "Entrada",JOptionPane.QUESTION_MESSAGE));
		               }
		
		c = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de C:", "Entrada",JOptionPane.QUESTION_MESSAGE));
		while (c <= b ) {
			JOptionPane.showConfirmDialog(null, "C é menor que B, digite novamente: ", "Resultado",JOptionPane.WARNING_MESSAGE);
			c = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de C:", "Entrada",JOptionPane.QUESTION_MESSAGE));
		               }
		
			x = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o quarto valor:", "Entrada",JOptionPane.QUESTION_MESSAGE));	
	
		
		
		
		//Processamento de dados e saída
		
		if (x < a)
		   {
			JOptionPane.showConfirmDialog(null, (x) + "," + (a)+ "," + (b) + "," + (c), "Resultado",JOptionPane.PLAIN_MESSAGE);
		    }
		
		
			if (b > x) {
				JOptionPane.showConfirmDialog(null, (a) + "," + (x)+ "," + (b) + "," + (c), "Resultado",JOptionPane.PLAIN_MESSAGE);
	                    }
			
			  if (c > x){
				  JOptionPane.showConfirmDialog(null, (a) + "," + (b)+ "," + (x) + "," + (c), "Resultado",JOptionPane.PLAIN_MESSAGE);
			            }
			  
			  else { 
				  JOptionPane.showConfirmDialog(null, (a) + "," + (b)+ "," + (c) + "," + (x), "Resultado",JOptionPane.PLAIN_MESSAGE);
                    }
}
}


