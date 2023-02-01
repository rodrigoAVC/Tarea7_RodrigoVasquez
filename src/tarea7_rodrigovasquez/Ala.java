package tarea7_rodrigovasquez;

import java.util.ArrayList;

public class Ala {

    private int peso, longitud;
    private ArrayList<Armamento> armamento = new ArrayList();

    public Ala() {
    }

    public Ala(int peso, int longitud) {
        this.peso = peso;
        this.longitud = longitud;
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

    public int getLongitud() {
        return longitud;
    }

    public int setLongitud(int longitud) {
        if (longitud > 0) {
            this.longitud = longitud;
            return 0;
        } else {
            return -1;
        }
    }

    public ArrayList<Armamento> getArmamento() {
        return armamento;
    }

    public void setArmamento(ArrayList<Armamento> armamento) {
        this.armamento = armamento;
    }

    @Override
    public String toString() {
        return "Ala - " + "[Peso: " + peso + " kg]" + ", [Longitud: " + longitud + " m]" + ", [Armamento: " + armamento + "]\n";
    }

}
