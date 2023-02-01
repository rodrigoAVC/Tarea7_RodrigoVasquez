package tarea7_rodrigovasquez;

public class Propulsor {

    private int peso, velocidad;
    private String material;

    public Propulsor() {
    }

    public Propulsor(int peso, int velocidad, String material) {
        this.peso = peso;
        this.velocidad = velocidad;
        this.material = material;
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

    public int getVelocidad() {
        return velocidad;
    }

    public int setVelocidad(int velocidad) {
        if (velocidad > 0) {
            this.velocidad = velocidad;
            return 0;
        } else {
            return -1;
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

//    public int numPropulsor(int num, int acum) {
//        if (acum + num <= 4) {
//            acum += num; 
//            return 0; 
//        } else {
//            return -1;
//        }
//    }
    @Override
    public String toString() {
        return "Propulsor - " + "[Peso: " + peso + " kg]" + ", [Velocidad: " + velocidad + " m/s]" + ", [Material: " + material + "]\n";
    }

}
