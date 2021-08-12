package Votacao;

import java.io.*;
import java.util.Random;

public class ClasseMetodos {
	
	int qtdTeste = 200;
	int qtdSecoes = 10;
	int qtdCandidatos = 300;
	String nomeArquivo = "votacao2021.txt";
	
	public Votacao[] cadastraVotacao(Votacao[] votacoes) {
		Random aleatorize = new Random();
		
		for (int i = 0; i < qtdTeste; i++) {
			votacoes[i].numeroSecao = aleatorize.nextInt(qtdSecoes);
			votacoes[i].numeroCandidato = aleatorize.nextInt(qtdCandidatos);
		}
		
		return votacoes;
	}
	
	public Votacao[] classificaSecao(Votacao[] votacoes) {
	    Votacao aux;
	    
	    for(int i = 0; i < (qtdTeste - 1); i++) {
	        for(int j = i + 1; j < qtdTeste; j++) {
	            if(votacoes[i].numeroSecao > votacoes[j].numeroSecao) {
	                aux = votacoes[j];
	                votacoes[j] = votacoes[i];
	                votacoes[i] = aux;
	            }
	        }
	    }
		
		
		return votacoes;
	}
	
	
	public void gravaVotacao(Votacao[] votacoes) throws IOException {
		BufferedWriter gravar = new BufferedWriter(new FileWriter(nomeArquivo));
		
		for (int i = 0; i < qtdTeste; i++) {
			gravar.write(Integer.toString(votacoes[i].numeroSecao)); gravar.newLine();
			gravar.write(Integer.toString(votacoes[i].numeroCandidato)); gravar.newLine();
		}
		
		System.out.println("Gravação feita com sucesso.");	
        gravar.close();
	}
	
	

}
