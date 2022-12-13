public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();

        c1.cor = "Vermelha";
        c1.ponta = 0.5;
        c1.carga = 90;
        c1.tampada = false;
        c1.modelo = "Big";

        c1.status();
    }
}