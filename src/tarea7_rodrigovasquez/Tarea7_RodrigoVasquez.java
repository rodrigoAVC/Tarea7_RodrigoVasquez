package tarea7_rodrigovasquez;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Tarea7_RodrigoVasquez {

    public static void main(String[] args) throws ParseException {
        Scanner scMain = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("----------------------------------");
            System.out.println("          < M E N U >");
            System.out.println("----------------------------------");
            System.out.print("""
                             [1] Agregar Nave
                             [2] Modificar Nave
                             [3] Salir
                             """);
            System.out.println("----------------------------------");
            System.out.print("¿Que desea ejecutar? ");
            opcion = scMain.nextInt();
            switch (opcion) {
                case 1:
                    agregarNave();
            }
        } while (opcion != 1 && opcion != 2 && opcion != 3);
    }

    public static void agregarNave() throws ParseException {
        Nave nave = new Nave();
        Scanner scNave = new Scanner(System.in);
        boolean naveTerminada = false;
        int numNave = 1;
        do {
            System.out.println("          < P R O P U L S O R >");
            System.out.print("Ingrese cuantos propulsores tiene la nave: ");
            int numPropulsor = scNave.nextInt();
            if (numPropulsor <= 4 && numPropulsor > 0) {
                for (int i = 1; i <= numPropulsor; i++) {
                    nave.getPropulsor().add(new Propulsor());
                    System.out.print("Ingrese el peso del propulsor #" + i + ": ");
                    int pesoPropulsor = scNave.nextInt();
                    nave.getPropulsor().get(i - 1).setPeso(pesoPropulsor);
                    if (nave.getPropulsor().get(i - 1).setPeso(pesoPropulsor) == 0) {
                        System.out.print("Ingrese la velocidad de ese propulsor: ");
                        int velocidad = scNave.nextInt();
                        nave.getPropulsor().get(i - 1).setVelocidad(velocidad);
                        if (nave.getPropulsor().get(i - 1).setVelocidad(velocidad) == 0) {
                            System.out.print("Ingrese el material del cual esta hecho el propulsor: ");
                            String material = scNave.nextLine();
                            material = scNave.nextLine();
                            nave.getPropulsor().get(i - 1).setMaterial(material);
                            System.out.println("Se ha agregado el propulsor");
                        } else {
                            System.out.println("La velocidad no puede ser negativa");
                            nave.getPropulsor().remove(i - 1);
                            i--;
                        }
                    } else {
                        System.out.println("El peso no puede ser negativo");
                        nave.getPropulsor().remove(i - 1);
                        i--;
                    }
                    int pesoAlas = 0;
                    System.out.print("Ingrese el numero de alas que quiere agregar: ");
                    int numAlas = scNave.nextInt();
                    if (numAlas <= 4 && numAlas > 0) {
                        for (int j = 1; j <= numAlas; j++) {
                            nave.getAlas().add(new Ala());
                            System.out.print("Ingrese el peso del ala #" + j + ": ");
                            int pesoAla = scNave.nextInt();
                            pesoAlas += pesoAla;
                            nave.getAlas().get(j - 1).setPeso(pesoAla, pesoAlas);
                            if (nave.getAlas().get(j - 1).setPeso(pesoAla, pesoAlas) == 0) {
                                System.out.print("Ingrese la longitud del ala: ");
                                int longitud = scNave.nextInt();
                                nave.getAlas().get(j - 1).setLongitud(longitud);
                                if (nave.getAlas().get(j - 1).setLongitud(longitud) == 0) {
                                    char choice = 's';
                                    int contArmas = 0;
                                    do {
                                        System.out.print("¿Desea agregarle armamento a las alas? [S/N]: ");
                                        choice = scNave.next().charAt(0);
                                        if (pesoAla == 200) {
                                            System.out.println("No puede añadir armas ya que el ala alcanza el peso maximo");
                                            choice = 'n';
                                        } else {
                                            if (choice == 'S' || choice == 's' || choice == 'Y' || choice == 'y') {
                                                nave.getAlas().get(j - 1).getArmamento().add(new Armamento());
                                                System.out.print("Ingrese el nombre del armamento: ");
                                                String nombreArma = scNave.nextLine();
                                                nombreArma = scNave.nextLine();
                                                nave.getAlas().get(j - 1).getArmamento().get(contArmas).setNombre(nombreArma);
                                                System.out.print("Ingrese el peso del arma: ");
                                                int pesoArma = scNave.nextInt();
                                                pesoAlas += pesoArma;
                                                nave.getAlas().get(j - 1).getArmamento().get(contArmas).setPeso(pesoArma, pesoAlas);
                                                if (nave.getAlas().get(j - 1).getArmamento().get(contArmas).setPeso(pesoArma, pesoAlas) == 0) {
                                                    System.out.print("Ingrese el poder del arma: ");
                                                    int poder = scNave.nextInt();
                                                    nave.getAlas().get(j - 1).getArmamento().get(contArmas).setPoder(poder);
                                                    if (nave.getAlas().get(j - 1).getArmamento().get(contArmas).setPoder(poder) == 0) {
                                                        System.out.println("Se ha agregado el arma");
                                                        contArmas++;
                                                        pesoAlas = 0;
                                                    } else {
                                                        System.out.println("Solo acceptan numeros del 1 al 10");
                                                        nave.getAlas().get(j - 1).getArmamento().remove(contArmas);
                                                    }
                                                } else {
                                                    if (pesoAlas > 200) {
                                                        System.out.println("El ala no soporta tanto peso");
                                                    } else {
                                                        System.out.println("No se permiten numeros negativos");
                                                    }
                                                    nave.getAlas().get(j - 1).getArmamento().remove(contArmas);
                                                }
                                            }
                                        }
                                    } while ((choice == 'S' || choice == 's' || choice == 'Y' || choice == 'y') && (choice != 'n' && choice != 'N'));
                                } else {
                                    System.out.println("La longitud del ala no puede ser negativa");
                                    nave.getAlas().remove(j - 1);
                                    j--;
                                }
                            } else {
                                if (pesoAla < 0) {
                                    System.out.println("El peso del ala no puede ser negativo");
                                } else {
                                    System.out.println("El peso del ala no puede ser mayor que 200");
                                }
                                nave.getAlas().remove(j - 1);
                                j--;
                            }
                        }
                        boolean cabina = false;
                        do {
                            System.out.print("Ingrese el peso de la cabina: ");
                            int pesoCabina = scNave.nextInt();
                            nave.getCabina().setPeso(pesoCabina);
                            if (nave.getCabina().setPeso(pesoCabina) == 0) {
                                System.out.print("Ingrese el numero de tripulantes: ");
                                int pilots = scNave.nextInt();
                                nave.getCabina().setPilots(pilots);
                                if (nave.getCabina().setPilots(pilots) == 0) {
                                    System.out.println("Se ha agregado la cabina");
                                    cabina = true;
                                } else {
                                    if (pilots > 4) {
                                        System.out.println("No pueden haber mas de 4 personas en cabina");
                                    } else {
                                        System.out.println("No se aceptan numeros negativos");
                                    }
                                }
                            } else {
                                System.out.println("El peso de la cabina no puede ser negativo");
                            }
                        } while (cabina == false);
                        String numSerie = codigoSerie();
                        nave.setSerie(numSerie);
                        System.out.print("Ingrese el nombre de la nave: ");
                        String nombre = scNave.nextLine();
                        nave.setNombre(nombre);
                        nave.setNum(numNave);
                        numNave++;
                        System.out.print("Seleccione el color de la nave: ");
                        Color color = JColorChooser.showDialog(null, "Eliga el color de la nave", Color.black);
                        nave.setColor(color);
                        System.out.print("Ingrese la fecha de vencimiento [dd/MM/yyyy]: ");
                        String fecha = scNave.next();
                        fecha = scNave.next();
                        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                        Date fechaCreacion = format.parse(fecha);
                        nave.setFechaCreacion(fechaCreacion);
                        naveTerminada = true;
                        System.out.println("Nave agregada");
                    } else {
                        if (numAlas > 4) {
                            System.out.println("No se puede tener mas de 4 alas");
                        } else {
                            System.out.println("No se puede tener numeros negativos");
                        }
                    }
                }
            } else {
                if (numPropulsor > 4) {
                    System.out.println("No se puede tener mas de 4 propulsores");
                } else {
                    System.out.println("No se puede tener numeros negativos");
                }
            }
        } while (naveTerminada == false);
    }

    public static String codigoSerie() {
        Random random = new Random();
        String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cadena = "";
        int num;
        int forma;
        forma = (int) (random.nextDouble() * alfa.length() - 1 + 0);
        num = (int) (random.nextDouble() * 99 + 100);
        return cadena = cadena + alfa.charAt(forma) + num;
    }
}
