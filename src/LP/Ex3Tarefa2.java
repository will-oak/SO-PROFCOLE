package LP;

import javax.swing.JOptionPane;

public class Ex3Tarefa2 {

	public static void main(final String[] args) {

		// Variaveis
		
        int num, sal;
        float reajuste,salarionovo;        
        //Entrada de Dados
        
    num = Integer.parseInt(JOptionPane.showInputDialog(null,"\nInsira o c�digo"+ ".\n1 - Escritur�rio" + ".\n2 - Secret�rio" + ".\n3 - Caixa" + ".\n4 - Gerente","Entrada",JOptionPane.QUESTION_MESSAGE));
    
       // Processamento de Dados 
        switch (num) {
            case 1:
            	sal = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira seu sal�rio atual:","Entrada",JOptionPane.QUESTION_MESSAGE)); 
            reajuste = (sal*50/100);
            salarionovo = (sal+reajuste); 
            JOptionPane.showMessageDialog(null,"Cargo: Escritur�rio"+"\nSal�rio Antigo:"+sal+".\nSal�rio Novo:"+salarionovo+".\nReajuste:"+reajuste+".","Reajuste 50%",JOptionPane.PLAIN_MESSAGE);
              break;
            case 2:
            	sal = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira seu sal�rio atual:","Entrada",JOptionPane.QUESTION_MESSAGE)); 
            reajuste = (sal*35/100);
            salarionovo = (sal+reajuste); 
            JOptionPane.showMessageDialog(null,"Cargo: Secret�rio"+"\nSal�rio Antigo:"+sal+".\nSal�rio Novo:"+salarionovo+".\nReajuste:"+reajuste+".","Reajuste 35%",JOptionPane.PLAIN_MESSAGE);
              break;
            case 3:
            	sal = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira seu sal�rio atual:","Entrada",JOptionPane.QUESTION_MESSAGE)); 
            reajuste = (sal*20/100);
            salarionovo = (sal+reajuste); 
            JOptionPane.showMessageDialog(null,"Cargo: Caixa"+"\nSal�rio Antigo:"+sal+".\nSal�rio Novo:"+salarionovo+".\nReajuste:"+reajuste+".","Reajuste 20%",JOptionPane.PLAIN_MESSAGE);
              break;
              case 4:
            	  sal = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira seu sal�rio atual:","Entrada",JOptionPane.QUESTION_MESSAGE)); 
              reajuste = (sal*10/100);
            salarionovo = (sal+reajuste); 
            JOptionPane.showMessageDialog(null,"Cargo: Gerente"+"\nSal�rio Antigo:"+sal+".\nSal�rio Novo:"+salarionovo+".\nReajuste:"+reajuste+".","Reajuste 10%",JOptionPane.PLAIN_MESSAGE);
              break;
            default:
            JOptionPane.showMessageDialog(null,"C�digo n�o encontrado, verifique com o RH","Resposta",JOptionPane.ERROR_MESSAGE);
          }
        }
}


