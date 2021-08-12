package Instancia;

import javax.swing.JOptionPane;

public class ClasseMetodos {

	public int[][] completaVetor(int v[][]) {
		for (int i=0; i<3; i++) {
		   for (int x=0; x<2; x++) {
	            v[i][x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a nota "+(x+1)+"para o aluno "+(i+1)+" :",JOptionPane.QUESTION_MESSAGE));
		   }
		}
		 return v;
	}	
   
	public double [] calcularMedia(int v [][]) {
	   double [] media = new double [3];
	   
	   
	   for (int i = 0; i<3; i++) {
		   double soma = 0;
		   for (int x=0; x<2; x++) {
			soma += v[i][x];   
		   }
		   media[i] = soma/2;
	   }
	return media;
	}
    
	public void resultadoMedia(double v[]) {
		String resultado = "";
		
		for (int i = 0; i < 3; i++) {
			resultado += "Aluno " + (i + 1) + ", media: " + v[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, resultado, "Media", JOptionPane.INFORMATION_MESSAGE);
	}
}
