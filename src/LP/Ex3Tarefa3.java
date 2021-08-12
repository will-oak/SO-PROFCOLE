package LP;

import javax.swing.JOptionPane;

public class Ex3Tarefa3 {
 public static void main(String[] args) {
	
	//Entrada de Dados
	 int a=1, b=6, result=0;
	 
	 //Processamento
	 
	 while (a < 7){
		 if(a+b == 7) {
			 ++result;
		 }
		     --b;
		     ++a;
	          
                   }
	 //Saida
	 JOptionPane.showMessageDialog(null, "As possibilidades de soma entre dois dados dar 7 é: "+result,"Resposta", JOptionPane.PLAIN_MESSAGE);
}
}
