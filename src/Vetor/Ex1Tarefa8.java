package Vetor;

import javax.swing.JOptionPane;

public class Ex1Tarefa8 {
   
	public static void main(String[] args) {
		//Declaração das variaveis
		double [] qtd = new double[5];
		double [] preco = new double[5];
		double tot_geral=0, tot_vend=0,comissao=0;
		
		
		//Processamento de dados
		for (int i = 0; i<=4; ++i) {
		 qtd[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade vendida do produto "+ (i+1) + ":","Insira um dado",JOptionPane.QUESTION_MESSAGE));
		 preco[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço  do produto " + (i+1) + ":","Insira um dado",JOptionPane.QUESTION_MESSAGE));
		}
		for(int i = 0; i<=4; ++i) {
			tot_vend= qtd[i]*preco[i];
			JOptionPane.showMessageDialog(null, "Quantidade vendida do produto " + (i+1)+ ": " + qtd[i] + "\nValor do produto "+ (i+1)+ ": " + preco[i] + "\nTotal geral da venda:" + tot_vend , "Resultado", JOptionPane.INFORMATION_MESSAGE);
		    tot_geral = tot_geral+tot_vend;
		}
	comissao = (tot_geral*0.05);
		JOptionPane.showMessageDialog(null, "Valor total das vendas: " + tot_geral + "\nValor da Comissão: " + comissao, "Resultado",JOptionPane.INFORMATION_MESSAGE);
		
		
	}
}
