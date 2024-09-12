class Garfo {
    private final int id;
    private boolean emUso = false;

    public Garfo(int id) {
        this.id = id;
    }

    public void pegar() {
        emUso = true;
        System.out.println("Garfo " + id + " foi pego.");
    }

    public void soltar() {
        emUso = false;
        System.out.println("Garfo " + id + " foi solto.");
    }

    public boolean estaEmUso() {
        return emUso;
    }
}