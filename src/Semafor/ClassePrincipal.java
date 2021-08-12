package Semafor;
import java.io.*;

import javax.swing.*;
public class ClassePrincipal { //  CLASSE PRINCIPAL
     public static void main ( String[] args ) throws IOException{
    	 
	   // INSTÂNCIA DA CLASSE ABSTRATA COM 10 REGISTROS TIPO VETOR 
	   Estat[ ] estat = new Estat[10]; 
	   
	   // INSTÂNCIA DA CLASSE MÉTODOS
	   ClasseMetodos m = new ClasseMetodos();
	   
	   
	    int i;

	  // EXECUÇÃO DO MÉTODO CONSTRUTOR
	  for (i = 0 ; i < 10 ; i++){
	       estat[i] = new Estat (); }
	 
	  int opc = 0 ;
	  while (opc!=9){
	     opc = Integer.parseInt(JOptionPane.showInputDialog
	              ("1 -  Cadastro Estatística  \n 2 - Consulta por quantidade de acidentes \n 3 - Consulta por estatísticas de acidentes \n 4 - Acidentes acima da média das 10 cidades \n 9 - Finaliza"));
	     switch (opc) {
	            case 1: m.FCadastraEstatistica(estat); // CHAMADA FUNÇÃO
	                    break;
	            case 2: m.PQtdAcidentes(); // CHAMADA PROCEDIMENTO
	                    break;
	            case 3: m.PMaiorMenor(); // CHAMADA PROCEDIMENTO
                        break;
	            case 4: m.PAcima(); // CHAMADA PROCEDIMENTO
                        break;
	            case 9:  JOptionPane.showMessageDialog(null,"Programa finalizado");
	                    break;
	            default: JOptionPane.showMessageDialog(null,"Opção Inválida");
	         } // FECHA SWITCH
	  }  // FECHA WHILE
	 }   // FECHA METODO PRINCIPAL
	}   // FECHA CLASSE PRINCIPAL

