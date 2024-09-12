public class Run {

    public static void main(String[] args) {
        Filosofo[] filosofos = new Filosofo[5];
        Garfo[] garfos = new Garfo[5];

        // Inicializando os garfos (cada filósofo começa com um garfo)
        for (int i = 0; i < garfos.length; i++) {
            garfos[i] = new Garfo(i);
        }

        // Inicializando os filósofos
        for (int i = 0; i < filosofos.length; i++) {
            Garfo garfoEsquerdo = garfos[i];
            Garfo garfoDireito = garfos[(i + 1) % garfos.length];
            filosofos[i] = new Filosofo(i, garfoEsquerdo, garfoDireito);
        }

        // O jantar ocorre até todos os filósofos terem comido
        boolean jantar = true;
        while (jantar) {
            jantar = false; // Se ninguém comeu, o jantar acaba

            System.out.println("\n=== Rodada ===");
            for (Filosofo filosofo : filosofos) {
                if (!filosofo.comeu()) { // Checa se o filósofo ainda precisa comer
                    jantar = true; // Continua o jantar
                    filosofo.rodada();
                }
            }
        }

        System.out.println("\nTodos os filósofos comeram. O jantar acabou.");
    }
}