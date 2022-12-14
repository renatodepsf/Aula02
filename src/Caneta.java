public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    void rabiscar() {
        if (tampada == true) {
            System.out.println("Caneta tampada!");
        }
        else if (carga == 0) {
            System.out.println("Caneta com " + carga + "% de carga.");
        }
        else {
            System.out.println("Rabiscando!");
        }
    }

    void tampar() {
        if (tampada == true) {
            System.out.println("A caneta já está tampada.");
        }
        else {
            System.out.println("Tampando!");
            this.tampada = true;
        }
    }

    void destampar() {
        if (tampada == true) {
            System.out.println("Destampando!");
            this.tampada = false;
        } else {
            System.out.println("A caneta já destampada.");
        }
    }

    void status() {
        System.out.println();
        System.out.printf("Cor: %s\nPonta: %.2f\nCarga: %d\nTampada: %b\nModelo: %s", this.cor, this.ponta, this.carga, this.tampada, this.modelo);
    }
}
