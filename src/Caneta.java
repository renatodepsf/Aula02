public class Caneta {
    private int carga;
    private boolean tampada = true;

    void escrever() {
        if (tampada == true) {
            System.out.println("ERRO! Destampe a caneta.");
        }
        else if (carga == 0) {
            System.out.println("Caneta com " + carga + "% de carga. Recarregue a caneta!");
        }
        else {
            System.out.println("Escrevendo na página!");
            this.carga -= 10;
        }
    }

    void recarregar() {
        if (this.carga == 0) {
            this.carga = 100;
            System.out.println("Caneta com " + this.carga + "% de carga.");
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
            System.out.println("Caneta destampada!");
            this.tampada = false;
        } else {
            System.out.println("A caneta já está destampada.");
        }
    }

    void status() {
        System.out.println();
        System.out.printf("Carga: %d\nTampada: %b", this.carga, this.tampada);
        System.out.println();
    }
}
