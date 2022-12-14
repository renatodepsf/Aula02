public class Caderno {

    private int qtdfolha;
    private int qtdlinhas;
    private int pagina;
    private String ladoFolha = "lado esquerdo";
    private boolean prontoParaUso = false;

    public Caderno() {
        this.qtdlinhas = qtdlinhas;
    }

    public int getQtdlinhas() {
        return qtdlinhas;
    }

    public void setQtdlinhas(int qtdlinhas) {
        this.qtdlinhas = qtdlinhas;
    }

    public void abrirCaderno() {
        if (prontoParaUso == false) {
            this.pagina = 1;
            this.qtdlinhas = 30;
            this.qtdfolha = 50;
            this.prontoParaUso = true;
            System.out.println("Caderno aberto na página " + this.pagina + ", " + this.ladoFolha + " com "
            + this.qtdlinhas + " linhas.");
        }
        else {
            System.out.println("O caderno já está aberto!");
        }
    }
    public void mudarLadoFolha() {
        this.ladoFolha = "Lado direito";
        this.pagina++;
        this.qtdlinhas = 30;
        System.out.println(this.ladoFolha + " na página " + this.pagina + " com " + this.qtdlinhas + " linhas.");
    }
    public void virarFolha() {
        if (qtdlinhas == 0) {
            this.qtdfolha--;
            this.qtdlinhas = 30;
            this.pagina++;
            this.ladoFolha = "Usando lado esquerdo do caderno.";
            System.out.println("Página: "+ this.pagina + "\nLado: " + this.ladoFolha);
        }
        else {
            System.out.println("ERRO! Ainda existem linhas vazias na página!");
        }
    }
    public void voltarFolha() {
        if (this.pagina > 1) {
            System.out.println("Você voltou a folha para a página " + this.pagina);
        }
        else {
            System.out.println("ERRO! Você está na 1ª página");
        }
    }
    public void fecharCaderno() {
        if (prontoParaUso) {
            prontoParaUso = false;
            System.out.println("O foi caderno fechado.");
        }
        else {
            System.out.println("ERRO! O caderno já está fechado.");
        }
    }
}
