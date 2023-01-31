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

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Propulsor - " + "[Peso: " + peso + ']' + ", [Velocidad: " + velocidad + " m/s]" + ", [Material: " + material + ']';
    }
    
    
    
}
