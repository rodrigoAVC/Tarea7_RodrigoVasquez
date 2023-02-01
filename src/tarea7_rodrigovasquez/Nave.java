package tarea7_rodrigovasquez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

public class Nave {
    private String serie, nombre;
    private Cabina cabina;
    ArrayList<Ala> alas = new ArrayList();
    ArrayList<Propulsor> propulsor = new ArrayList();
    private int num;
    private Color color;
    private Date fechaCreacion;

    public Nave() {
    }

    public Nave(String serie, String nombre, Cabina cabina, int num, Color color, Date fechaCreacion) {
        this.serie = serie;
        this.nombre = nombre;
        this.cabina = cabina;
        this.num = num;
        this.color = color;
        this.fechaCreacion = fechaCreacion;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cabina getCabina() {
        return cabina;
    }

    public void setCabina(Cabina cabina) {
        this.cabina = cabina;
    }

    public ArrayList<Ala> getAlas() {
        return alas;
    }

    public void setAlas(ArrayList<Ala> alas) {
        this.alas = alas;
    }

    public ArrayList<Propulsor> getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(ArrayList<Propulsor> propulsor) {
        this.propulsor = propulsor;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Nave - " + "[Serie: " + serie + "]" + ", [Nombre: " + nombre + "]" + ", " + cabina + ", " + alas + ", " + propulsor + ", [Numero: " + num + "]" + ", [Color: " + color + "]" + ", [Fecha de Creacion: " + fechaCreacion + ']';
    }
    
    
    
}
