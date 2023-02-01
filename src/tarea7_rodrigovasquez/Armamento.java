package tarea7_rodrigovasquez;

public class Armamento {

    private String nombre;
    private int peso, poder;

    public Armamento() {
    }

    public Armamento(String nombre, int peso, int poder) {
        this.nombre = nombre;
        this.peso = peso;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public int setPeso(int peso, int pesoTot) {
        if (peso > 0 && pesoTot <= 200) {
            this.peso = peso;
            return 0;
        } else {
            return -1;
        }
    }

    public int getPoder() {
        return poder;
    }

    public int setPoder(int poder) {
        if (poder > 0 && poder < 11) {
            this.poder = poder;
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Armamento - " + "[Nombre del arma:" + nombre + ", [Peso: " + peso + " kg]" + ", [Poder: " + poder + "]";
    }

}
