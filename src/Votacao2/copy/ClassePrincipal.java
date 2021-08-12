package Votacao2.copy;

import java.io.IOException;
import javax.swing.JOptionPane;

public class ClassePrincipal {

	public static void main(String[] args) throws IOException {
		ClasseMetodos metodos = new ClasseMetodos();
		Votacao[] votacao = new Votacao[metodos.qtdTeste];
		String opcoesMenu = "";
		
		int opcao = 0;
		
		for (int i = 0; i < metodos.qtdTeste; i++) {
			votacao[i] = new Votacao();
		}
		
		opcoesMenu += "1 -  Carregar Sessão/Número Eleitor \n";	
		opcoesMenu += "2 - Classificar por sessão \n";		
		opcoesMenu += "3 - Gravar Registros \n";		
		opcoesMenu += "4 -  Mostrar Indicadores \n";		
		opcoesMenu += "9 - Finalizar \n";
		
		do {
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null, opcoesMenu, "", JOptionPane.INFORMATION_MESSAGE));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Obrigado!!", "Menu", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			switch (opcao) {
				case 1:
					votacao = metodos.cadastraVotacao(votacao);
					break;
				case 2:
					metodos.classificaSecao(votacao);
					break;
				case 3:
					metodos.gravaVotacao(votacao);
					break;
				case 4:
					exibeMenuIndicadores();
					break;
				case 9: 
					JOptionPane.showMessageDialog(null, "Obrigado!!", "Menu", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!", "Menu", JOptionPane.INFORMATION_MESSAGE);
			}
			
		} while (opcao != 9);
	}
	
	public static void exibeMenuIndicadores() throws IOException {
		ClasseIndicadores indicadores = new ClasseIndicadores();
		String opcoesMenu = "";
		
		opcoesMenu += "1 - Quantidade de Eleitores por Sessão \n";	
		opcoesMenu += "2 - Sessão com Maior e Menor Número de Eleitores \n";		
		opcoesMenu += "3 - Quantidade de votos por candidato \n";		
		opcoesMenu += "4 - 10 Primeiros Colocados (Nro. Cand. e Qtd. Votos) \n";		
		opcoesMenu += "9 -  Voltar \n";
		
		int opcao = 0;
		
		do {
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null, opcoesMenu, "", JOptionPane.INFORMATION_MESSAGE));
			} catch (Exception e) {
				break;
			}
			
			switch (opcao) {
				case 1:
					indicadores.qtdEleitoresPorSecao();
					break;
				case 2:
					indicadores.maiorMenorEleitores();
					break;
				case 3:
					indicadores.qtdVotosPorCandidato(true);
					break;
				case 4:
					indicadores.maisVotados(indicadores.qtdVotosPorCandidato(false));
					break;
				case 9: 
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!", "Menu", JOptionPane.INFORMATION_MESSAGE);
			}
			
		} while (opcao != 9);	
	}
}
