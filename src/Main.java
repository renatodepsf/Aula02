import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Caderno caderno = new Caderno();
        Caneta caneta = new Caneta();

        caderno.abrirCaderno();
        caneta.escrever();
        caneta.destampar();
        caneta.escrever();
        caneta.recarregar();
        caneta.escrever();
        caderno.mudarLadoFolha();
        caneta.escrever();
        caderno.virarFolha();

    }
}