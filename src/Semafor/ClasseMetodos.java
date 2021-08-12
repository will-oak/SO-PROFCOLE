package Semafor;
import java.io.*;


import javax.swing.JOptionPane;
	// CLASSE DE METODOS
	
	public class ClasseMetodos {
	   // FUNÇÃO RECEBENDO REGISTRO e GRAVANDO O OUTPUT    
	  public void FCadastraEstatistica(Estat[] estat) throws IOException{
	  int i;

	  for (i = 0 ; i < 10 ; i++)
	   {
	    estat[i].codcidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com o código da cidade"));
	    estat[i].nomecidade = JOptionPane.showInputDialog("Entre com o nome da Cidade:");
	    estat[i].qtdacidentes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de acidentes:"));
	   }
	  
	  System.out.println("COLETA FEITA COM SUCESSO ");	
	  
	   
	  gravaEstatistica(estat); } 
	   
	// PROCEDIMENTO RECEBENDO REGISTRO aluno TIPO ALUNO[]    
	  public void PQtdAcidentes()throws IOException	  {
		  Estat[] estat = lerEstatistica();
        int i;
	    for (i = 0 ; i < 10; i++) 
	       {
	    	if((estat[i].qtdacidentes > 100) & (estat[i].qtdacidentes < 500)){
	    		System.out.println(estat[i].qtdacidentes + " " + estat[i].nomecidade); 
	    		     	
	         
	       }
	    	else {
	    		System.out.println("Nenhuma cidade está dentro do requisitos."); 
	    	}
	   }           

	 }

	  public void PMaiorMenor() throws IOException	  {
		  Estat[] estat = lerEstatistica();
		  int aux = 0;
		  int auxiliar = 0; 
		  for (int i = 0; i<10; i++) 
		  {
			   for (int x=1; x<10; x++) 
			   {   	   
				  
	    	if((estat[i].qtdacidentes > estat[x].qtdacidentes) & (estat[i].qtdacidentes > estat[aux].qtdacidentes)) 
	    	            {
	    		aux = i;
	          	
	    	           }  			
			   }
		  }
		 
		  for (int a = 0; a<10; a++) 
		  {
			   for (int b=1; b<10; b++) 
			   {   	   
				                                                    
	    	if((estat[a].qtdacidentes < estat[b].qtdacidentes ) & (estat[a].qtdacidentes < estat[auxiliar].qtdacidentes)) 
	    	         {                  
	    		          
	    		auxiliar = a;
	          	
	    		
            }
	
		  
	  }
			   
		  }
		  System.out.println("A cidade com maior número de acidentes é: "+ estat[aux].nomecidade + " " + estat[aux].qtdacidentes); 
		  System.out.println("A cidade com menor número de acidentes é: "+ estat[auxiliar].nomecidade + " " + estat[auxiliar].qtdacidentes); 
		  
	  }
	  
		  
		public void PAcima() throws IOException	  	  {
			Estat[] estat = lerEstatistica();
			int soma = 0;
			int media = 0;

					for (int i=0; i< 10; i++) 
                    {
					soma += estat[i].qtdacidentes;
					media = soma/10;
				   					
					}
					   for(int x =0; x<10; x++) 
					   {
						   if(estat[x].qtdacidentes > media) 
						     {
						    	System.out.println("A média de acidentes é:" + media + "As cidades acima da média são:" + estat[x].nomecidade );
						    	
						    	
						     }
					
					   }			
			
	    		
	  	  }
	  	  
		public void gravaEstatistica(Estat[] estat) throws IOException {
			String nomeArquivo = "Estatisticas.log";
			BufferedWriter gravar = new BufferedWriter(new FileWriter(nomeArquivo));
			
			for (int i = 0; i < 10; i++) {
				gravar.write(Integer.toString(estat[i].codcidade)); gravar.newLine();
				gravar.write(estat[i].nomecidade); gravar.newLine();
				gravar.write(Integer.toString(estat[i].qtdacidentes)); gravar.newLine();
			}
			
			System.out.println("Gravacao feita com sucesso.");	
	        gravar.close();
		}
		
		
		
		
		
		
		
		
		public Estat[] lerEstatistica() throws IOException {
			Estat[] estatistica = new Estat[10];
			String nomeArquivo = "Estatisticas.log";	
		    BufferedReader ler = new BufferedReader(new FileReader(nomeArquivo));
		    
		    for (int i = 0; i < 10; i++) {
				estatistica[i] = new Estat();
			}
		    
			for (int i = 0; i < 10; i++) {
				estatistica[i].codcidade = Integer.parseInt(ler.readLine());  	
				estatistica[i].nomecidade = ler.readLine();	
				estatistica[i].qtdacidentes = Integer.parseInt(ler.readLine()); 
			}
			
			ler.close();
			
			return estatistica;
		}
	  
	}
	  
	  
	
	

