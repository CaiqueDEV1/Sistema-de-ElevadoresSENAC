public class Main {
    public static void main(String[] args) {
        Elevador atrio = new Elevador(7, 15, 1125);

        atrio.entra();  // Uma pessoa entrou no elevador.
        atrio.sobe();   // O elevador subiu para o andar 1.
        atrio.sobe();   // O elevador subiu para o andar 2.
        atrio.sai();    // Uma pessoa saiu do elevador.
        atrio.desce();  // O elevador desceu para o andar 1.

        System.out.println("Andar atual: " + atrio.getAndarAtual());            // Andar atual: 1
        System.out.println("Total de andares: " + atrio.getTotalAndares());     // Total de andares: 7
        System.out.println("Capacidade do elevador: " + atrio.getCapacidade()); // Capacidade do elevador: 15
        System.out.println("Pessoas presentes: " + atrio.getPessoasPresentes()); // Pessoas presentes: 0
        System.out.println("Esse elevador ");


        Elevador biblioteca = new Elevador(7, 15, 1125);

        biblioteca.entra();  // Uma pessoa entrou no elevador.
        biblioteca.sobe();   // O elevador subiu para o andar 1.
        biblioteca.sobe();   // O elevador subiu para o andar 2.
        biblioteca.sai();    // Uma pessoa saiu do elevador.
        biblioteca.desce();  // O elevador desceu para o andar 1.

        System.out.println("Andar atual: " + biblioteca.getAndarAtual());            // Andar atual: 1
        System.out.println("Total de andares: " + biblioteca.getTotalAndares());     // Total de andares: 7
        System.out.println("Capacidade do elevador: " + biblioteca.getCapacidade()); // Capacidade do elevador: 15
        System.out.println("Pessoas presentes: " + biblioteca.getPessoasPresentes()); // Pessoas presentes: 0


        Elevador principal = new Elevador(7, 24, 1800);

        principal.entra();  // Uma pessoa entrou no elevador.
        principal.sobe();   // O elevador subiu para o andar 1.
        principal.sobe();   // O elevador subiu para o andar 2.
        principal.sai();    // Uma pessoa saiu do elevador.
        principal.desce();  // O elevador desceu para o andar 1.

        System.out.println("Andar atual: " + principal.getAndarAtual());            // Andar atual: 1
        System.out.println("Total de andares: " + principal.getTotalAndares());     // Total de andares: 7
        System.out.println("Capacidade do elevador: " + principal.getCapacidade()); // Capacidade do elevador: 24
        System.out.println("Pessoas presentes: " + principal.getPessoasPresentes()); // Pessoas presentes: 0
    }
}