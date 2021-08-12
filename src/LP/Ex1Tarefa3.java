package LP;

import javax.swing.JOptionPane;

//1. Calcule e mostre o quadrado dos números entre 10 e 150.

public class Ex1Tarefa3 {
    public static void main(String[] args) {
	 int i=10, resultado=0;
    	while (i<=150) {
    		resultado = i*i;
    		JOptionPane.showMessageDialog(null, "O quadrado de "+ i +" é: "+ resultado, "Resposta", JOptionPane.PLAIN_MESSAGE);
    		i++;
    	}
}
}
