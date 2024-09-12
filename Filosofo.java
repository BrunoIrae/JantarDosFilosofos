class Filosofo {
    private final int id;
    private final Garfo garfoEsquerdo;
    private final Garfo garfoDireito;
    private boolean comeu = false;

    public Filosofo(int id, Garfo garfoEsquerdo, Garfo garfoDireito) {
        this.id = id;
        this.garfoEsquerdo = garfoEsquerdo;
        this.garfoDireito = garfoDireito;
    }

    public void rodada() {
        if (pegarGarfos()) {
            comer();
            soltarGarfos();
        } else {
            System.out.println("Filósofo " + id + " não pode comer agora.");
        }
    }

    private boolean pegarGarfos() {
        if (!garfoEsquerdo.estaEmUso() && !garfoDireito.estaEmUso()) {
            garfoEsquerdo.pegar();
            garfoDireito.pegar();
            System.out.println("Filósofo " + id + " pegou os dois garfos.");
            return true;
        } else {
            if (garfoEsquerdo.estaEmUso()) {
                System.out.println("Filósofo " + id + " está esperando o garfo esquerdo.");
            }
            if (garfoDireito.estaEmUso()) {
                System.out.println("Filósofo " + id + " está esperando o garfo direito.");
            }
            return false;
        }
    }

    private void comer() {
        System.out.println("Filósofo " + id + " está comendo.");
        comeu = true;
    }

    private void soltarGarfos() {
        garfoEsquerdo.soltar();
        garfoDireito.soltar();
        System.out.println("Filósofo " + id + " soltou os garfos.");
    }

    public boolean comeu() {
        return comeu;
    }
}