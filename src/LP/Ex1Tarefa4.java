package LP;

import javax.swing.JOptionPane;

public class Ex1Tarefa4 {

	public static void main(String[] args) 
	   
	    {
		int n1=0,n2=0,n3=0,n4=0;
		double resultado=0;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a 1º nota", "Insira o dado", JOptionPane.QUESTION_MESSAGE));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a 2º nota", "Insira o dado", JOptionPane.QUESTION_MESSAGE));
		n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a 3º nota", "Insira o dado", JOptionPane.QUESTION_MESSAGE));
		n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a 4º nota", "Insira o dado", JOptionPane.QUESTION_MESSAGE));
				resultado = obterMedia(n1,n2, n3, n4);
				
				
				if(resultado>=6.0){
					JOptionPane.showMessageDialog(null, "Aprovado","Resultado", JOptionPane.PLAIN_MESSAGE);
					
				}
				if((resultado < 6.0) & (resultado >= 3.0)){
					JOptionPane.showMessageDialog(null, "Exame","Resultado", JOptionPane.PLAIN_MESSAGE);
					
				}
				if (resultado < 3.0){
					JOptionPane.showMessageDialog(null, "Reprovado","Resultado", JOptionPane.PLAIN_MESSAGE);
				}
				
				
				
	    }
	    public static int obterMedia(int n1, int n2, int n3, int n4){
	    		    	
	    	return  (n1+n2+n3+n4)/4;
	    	
            }
}