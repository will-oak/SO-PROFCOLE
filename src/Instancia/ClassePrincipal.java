package Instancia;

import javax.swing.JOptionPane;

public class ClassePrincipal {
	
	public static void main(String[] args) {
		int [][] notas = new int [3][2];
		double [] media = new double [3];
		int opcao = 0;
		
		
		ClasseMetodos metodos = new ClasseMetodos();
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Carrega notas \n 2.Calcula Media \n 3.Mostra Media \n Fim", "", JOptionPane.INFORMATION_MESSAGE));
			switch (opcao) {
				case 1:
					notas = metodos.completaVetor(notas);
					break;
				case 2:
					media = metodos.calcularMedia(notas);
					break;
				case 3:
					metodos.resultadoMedia(media);
					break;
				case 9: 
					JOptionPane.showMessageDialog(null, "Obrigado!!", "Menu", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcaoo invalida!", "Menu", JOptionPane.INFORMATION_MESSAGE);
			}
			
		} while (opcao != 9);
		
		
		
	}

}
