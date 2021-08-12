package Votacao2.copy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ClasseIndicadores {
	ClasseMetodos metodos = new ClasseMetodos();
	int qtdTopVoted = 10;
	
	public void qtdEleitoresPorSecao() throws IOException {
		Votacao[] votacoes = lerVotacao();
		int[] qtdPorSecao = new int[metodos.qtdSecoes];
		String resultado = "Eleitores por sessão: \n";
		
		for (int j = 0; j < metodos.qtdSecoes; j++) {
			qtdPorSecao[j] = 0;
		}
		
		for (int i = 0; i < metodos.qtdTeste; i++) {
			for(int j = 0; j < metodos.qtdSecoes; j++) {
				if(votacoes[i].numeroSecao == j) {
					qtdPorSecao[j]++;
					break;
				}
			}
		}
		
		for (int j = 0; j < metodos.qtdSecoes; j++) {
			resultado += "Sessão " + j + ": " + qtdPorSecao[j] + "\n"; 
		}
		
		
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public void maiorMenorEleitores() throws IOException {
		Votacao[] votacoes = lerVotacao();
		int[] qtdPorSecao = new int[metodos.qtdSecoes];
		String resultado = "";
		
		for (int j = 0; j < metodos.qtdSecoes; j++) {
			qtdPorSecao[j] = 0;
		}
		
		for (int i = 0; i < metodos.qtdTeste; i++) {
			for(int j = 0; j < metodos.qtdSecoes; j++) {
				if(votacoes[i].numeroSecao == j) {
					qtdPorSecao[j]++;
					break;
				}
			}
		}
		
		int maiorQtd = qtdPorSecao[0], menorQtd = qtdPorSecao[0];
		int maiorIndex = 0, menorIndex = 0;
		
		for (int i = 0; i < metodos.qtdSecoes; i++) {
			if (qtdPorSecao[i] > maiorQtd) {
				maiorQtd = qtdPorSecao[i];
				maiorIndex = i;
			} else if (qtdPorSecao[i] < menorQtd) {
				menorQtd = qtdPorSecao[i];
				menorIndex = i;
			}
		}
		
		resultado += "Maior número de eleitores: (" + maiorIndex + ") " + maiorQtd + "\n";
		resultado += "Menor número de eleitores: (" + menorIndex + ") " + menorQtd + "\n";
		
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public int[] qtdVotosPorCandidato(boolean showMessage) throws IOException {
		Votacao[] votacoes = lerVotacao();
		
		int[] qtdPorCandidato = new int[metodos.qtdCandidatos];
		String resultado = "Votos por candidato: \n";
		
		for (int j = 0; j < metodos.qtdCandidatos; j++) {
			qtdPorCandidato[j] = 0;
		}
		
		for (int i = 0; i < metodos.qtdTeste; i++) {
			for(int j = 0; j < metodos.qtdCandidatos; j++) {
				if(votacoes[i].numeroCandidato == j) {
					qtdPorCandidato[j]++;
					break;
				}
			}
		}
		
		for (int j = 0; j < metodos.qtdCandidatos; j++) {
			resultado += "Candidato " + j + ": " + qtdPorCandidato[j] + "\n"; 
		}
		
		if (showMessage) {
			JOptionPane.showMessageDialog(null, resultado);
		}
		
		return qtdPorCandidato;
	}
	
	
	
	public void maisVotados(int[] qtdPorCandidato) {
		int[] candidatos = new int[metodos.qtdCandidatos];
		String resultado = "Os 10 candidatos mais votados \n";
		
		for (int i = 0; i < metodos.qtdCandidatos; i++) {
			candidatos[i] = i;
		}
		
		for (int i = 0; i < (metodos.qtdCandidatos - 1); i++) {
	        for (int j = i + 1; j < metodos.qtdCandidatos; j++) {
	            if (qtdPorCandidato[i] > qtdPorCandidato[j]) {
	                int[] aux = {qtdPorCandidato[j], candidatos[j]};
	                
	                qtdPorCandidato[j] = qtdPorCandidato[i];
	                candidatos[j] = candidatos[i];
	                
	                qtdPorCandidato[i] = aux[0];
	                candidatos[i] = aux[1];
	            }
	        }
	    }
		
		for (int i = (metodos.qtdCandidatos - 1); i >= (metodos.qtdCandidatos - qtdTopVoted); i--) {
			resultado += "Candidato " + candidatos[i] + ": " + qtdPorCandidato[i] + "\n"; 
		}
		
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public Votacao[] lerVotacao() throws IOException {
		Votacao[] votacoes = new Votacao[metodos.qtdTeste];
	    BufferedReader ler = new BufferedReader(new FileReader(metodos.nomeArquivo));
	    
	    for (int i = 0; i < metodos.qtdTeste; i++) {
			votacoes[i] = new Votacao();
		}
	    
		for (int i = 0; i < metodos.qtdTeste; i++) {
			votacoes[i].numeroSecao = Integer.parseInt(ler.readLine());
			votacoes[i].numeroCandidato = Integer.parseInt(ler.readLine()); 
		}
		
		ler.close();
		
		return votacoes;
	}
}
