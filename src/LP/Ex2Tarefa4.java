package LP;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex2Tarefa4 {

	public static void main(String[] args) {
		double hi = 0, mi = 0, hf = 0, mf = 0;
		

		JOptionPane.showMessageDialog(null,
				"\nVamos descobrir quantas horas o jogo durou?" + "\nDigite só o número de horas, exemplo: 15 "
						+ "\nDigite só o número de minutos, exemplo: 25 " + "\nLogo 15h:25m, obrigado :)");
		hi = Double.parseDouble(JOptionPane.showInputDialog(null, "Que horas o jogo começou?", "insira o dado",
				JOptionPane.QUESTION_MESSAGE));
		mi = Double.parseDouble(JOptionPane.showInputDialog(null, "e quantos minutos o jogo começou?", "insira o dado",
				JOptionPane.QUESTION_MESSAGE));
		hf = Double.parseDouble(JOptionPane.showInputDialog(null, "Que horas o jogo terminou?", "insira o dado",
				JOptionPane.QUESTION_MESSAGE));
		mf = Double.parseDouble(JOptionPane.showInputDialog(null, "e quantos minutos o jogo terminou?", "insira o dado",
				JOptionPane.QUESTION_MESSAGE));

		calcHoras(hi, mi, hf, mf);

		
		// Escreval ("A duração do jogo foi de:",hf2:1," horas e ",mf2:1," minutos")

	}

	public static void calcHoras(double hi, double mi, double hf, double mf) {

		double hf2 = 0, mf2 = 0;

		if (hf < hi) {
			hf = hf + 24;

		}
		mi = mi / 60;
		mf = mf / 60;

		if (mi > mf) {
			mf2 = mi - mf;
		} else {
			mf2 = mf - mi;
		}
		if (hi > hf) {
			hf2 = hi - hf;

		} else {
			hf2 = hf - hi;
		}
		mf2 = mf2 * 60;

		// return mf2;
		//return new main(mf2,hf2);
		DecimalFormat deci = new DecimalFormat("0");
		JOptionPane.showMessageDialog(null, "A duração do jogo foi de:" + deci.format(hf2) + " horas e " + deci.format(mf2) + " minutos");
        		
	}

}
