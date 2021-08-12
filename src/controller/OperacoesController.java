package controller;

public class OperacoesController {

    public OperacoesController() {
        super();
    }
    //Concatenar 32768 caracteres em uma unica variável String
    //Medir o tempo que leva para realizar essa operacao

    public void concatenaString() {
        String sequencia = "";
        double tempoInicial = System.nanoTime();
                for (int i = 0 ; i < 100000 ; i++ ) {
                    sequencia = sequencia + "x";
                }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;


            //Converter de nano segundos para segundos (dividir tempoTotal / 10^9
        tempoTotal = tempoTotal / Math.pow (10, 9);

        System.out.println("String ==> "+tempoTotal+"s.");

    }

    public void concatenaBuffer() {
        StringBuffer buffer = new StringBuffer();
        double tempoInicial = System.nanoTime();
                for (int i = 0 ; i < 100000 ; i++ ) {
                    buffer.append("x");
                }
                double tempoFinal = System.nanoTime();
                double tempoTotal = tempoFinal - tempoInicial;
                tempoTotal = tempoTotal / Math.pow (10, 9);

        System.out.println("Buffer ==> "+tempoTotal+"s.");
    }

}