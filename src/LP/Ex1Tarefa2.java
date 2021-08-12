package LP;

//1. Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
import javax.swing.JOptionPane;


public class Ex1Tarefa2 {
 
	public static void main(String[] args) {
		int a =  0, b = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para o valor de A", "Entrada",JOptionPane.QUESTION_MESSAGE));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para o valor de B", "Entrada",JOptionPane.QUESTION_MESSAGE));
		
		if (a > b) { 
			JOptionPane.showMessageDialog(null, "A é maior que B e diferença dos valores é de: " + (a - b), "Resposta", JOptionPane.PLAIN_MESSAGE );
		}
		
		else if (a < b){ 
			JOptionPane.showConfirmDialog(null, "A é maior que B e diferença dos valores é de: " + (b - a), "Resposta", JOptionPane.PLAIN_MESSAGE );
			
		}
		
		else if (a == b){
			JOptionPane.showConfirmDialog(null, "Os valores são iguais", "Resposta", JOptionPane.PLAIN_MESSAGE );
		
		
	}
}
}