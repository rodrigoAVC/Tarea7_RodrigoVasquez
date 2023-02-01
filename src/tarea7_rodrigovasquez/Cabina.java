package tarea7_rodrigovasquez;

public class Cabina {

    private int peso, pilots;

    public Cabina() {
    }

    public Cabina(int peso, int pilots) {
        this.peso = peso;
        this.pilots = pilots;
    }

    public int getPeso() {
        return peso;
    }

    public int setPeso(int peso) {
        if (peso > 0) {
            this.peso = peso;
            return 0;
        } else {
            return -1;
        }
    }

    public int getPilots() {
        return pilots;
    }

    public int setPilots(int pilots) {
        if (pilots <= 4 && pilots > 0) {
            this.pilots = pilots;
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Cabina - " + "[Peso: " + peso + " kg]" + ", [Tripulantes: " + pilots + ']';
    }

}
