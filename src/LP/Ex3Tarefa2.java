package LP;

import javax.swing.JOptionPane;

public class Ex3Tarefa2 {

	public static void main(final String[] args) {

		// Variaveis
		
        int num, sal;
        float reajuste,salarionovo;        
        //Entrada de Dados
        
    num = Integer.parseInt(JOptionPane.showInputDialog(null,"\nInsira o código"+ ".\n1 - Escriturário" + ".\n2 - Secretário" + ".\n3 - Caixa" + ".\n4 - Gerente","Entrada",JOptionPane.QUESTION_MESSAGE));
    
       // Processamento de Dados 
        switch (num) {
            case 1:
            	sal = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira seu salário atual:","Entrada",JOptionPane.QUESTION_MESSAGE)); 
            reajuste = (sal*50/100);
            salarionovo = (sal+reajuste); 
            JOptionPane.showMessageDialog(null,"Cargo: Escriturário"+"\nSalário Antigo:"+sal+".\nSalário Novo:"+salarionovo+".\nReajuste:"+reajuste+".","Reajuste 50%",JOptionPane.PLAIN_MESSAGE);
              break;
            case 2:
            	sal = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira seu salário atual:","Entrada",JOptionPane.QUESTION_MESSAGE)); 
            reajuste = (sal*35/100);
            salarionovo = (sal+reajuste); 
            JOptionPane.showMessageDialog(null,"Cargo: Secretário"+"\nSalário Antigo:"+sal+".\nSalário Novo:"+salarionovo+".\nReajuste:"+reajuste+".","Reajuste 35%",JOptionPane.PLAIN_MESSAGE);
              break;
            case 3:
            	sal = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira seu salário atual:","Entrada",JOptionPane.QUESTION_MESSAGE)); 
            reajuste = (sal*20/100);
            salarionovo = (sal+reajuste); 
            JOptionPane.showMessageDialog(null,"Cargo: Caixa"+"\nSalário Antigo:"+sal+".\nSalário Novo:"+salarionovo+".\nReajuste:"+reajuste+".","Reajuste 20%",JOptionPane.PLAIN_MESSAGE);
              break;
              case 4:
            	  sal = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira seu salário atual:","Entrada",JOptionPane.QUESTION_MESSAGE)); 
              reajuste = (sal*10/100);
            salarionovo = (sal+reajuste); 
            JOptionPane.showMessageDialog(null,"Cargo: Gerente"+"\nSalário Antigo:"+sal+".\nSalário Novo:"+salarionovo+".\nReajuste:"+reajuste+".","Reajuste 10%",JOptionPane.PLAIN_MESSAGE);
              break;
            default:
            JOptionPane.showMessageDialog(null,"Código não encontrado, verifique com o RH","Resposta",JOptionPane.ERROR_MESSAGE);
          }
        }
}


