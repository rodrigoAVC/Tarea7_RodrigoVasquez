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

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Armamento - " + "[Nombre del arma:" + nombre + ", [Peso: " + peso + " Tn]" + ", poder=" + poder + '}';
    }

}
