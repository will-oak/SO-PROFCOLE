package Votacao;

public class Votacao {
	
	int numeroSecao, numeroCandidato;
	
	Votacao () {
		this(0, 0);
	}
	
	Votacao(int secao, int candidato) {
		numeroSecao = secao;
		numeroCandidato = candidato;
	}

}
