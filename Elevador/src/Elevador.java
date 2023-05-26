public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private boolean[] andaresAtendidos;
    private int capacidade;
    private int pessoasPresentes;

    private int TotalpesoKg;

    public Elevador(int totalAndares, int capacidade, int TotalpesoKg) {
        this.andarAtual = 0;
        this.totalAndares =  totalAndares;
        this.andaresAtendidos = new boolean[totalAndares];
        this.capacidade = capacidade;
        this.pessoasPresentes = 0;
        this.TotalpesoKg = 0;
    }

    public void entra() {
        if(pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador.");
        } else {
            System.out.println("O elevador está cheio. Não é possivel entrar mais pessoas.");
        }
    }

    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador.");
        } else {
            System.out.println("Não há ninguém no elevador.");
        }
    }

    public void sobe() {
        if(andarAtual < totalAndares - 1) {
            andarAtual++;
            System.out.println("O elevador subiu para o andar " + andarAtual + ".");
        } else {
            System.out.println("O elevador já está no último andar atendido.");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("O elevador desceu para o andar " + andarAtual + ".");
        } else {
            System.out.println("O elevador já está no térreo.");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public int getTotalpesoKg() { return TotalpesoKg; }
}