package view;
import controller.OperacoesController;

public class Principal {

    public static void main(String[] args) {
        OperacoesController opCont = new OperacoesController();
        opCont.concatenaString();
        opCont.concatenaBuffer();
    }

}