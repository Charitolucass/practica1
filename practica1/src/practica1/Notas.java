                      package practica1;
import java.util.Scanner;

/**
 * @author MariaDelRosario
 * @version 1.0
 * @since 27/03/2025
 * Clase Notas para gestionar las notas de un estudiante.
 */
public class Notas {
    // Declaración de variables para almacenar las notas y sus respectivos acumulados.
    private double notaUnidad1, unidadFormativa2, unidadFormativa3;//cambie unidadFormativa1 por notaUnidad1

    private double acumuladoUF1, acumuladoUF2, acumuladoUF3, notaFinal;
    
    // Scanner para la entrada de datos.
    private Scanner entradaDatos = new Scanner(System.in);

    /**
     * Método para ingresar las notas del estudiante.
     */
    public void ingresarNotas() {
        System.out.println("Ingrese las notas del estudiante");
        
        System.out.print("Ingrese la nota de la primera unidad formativa: ");
        notaUnidad1= entradaDatos.nextDouble();//cambie unidadFormativa1 por notaUnidad1
        
        System.out.print("Ingrese la nota de la segunda unidad formativa: ");
        unidadFormativa2 = entradaDatos.nextDouble();
        
        System.out.print("Ingrese la nota de la tercera unidad formativa: ");
        unidadFormativa3 = entradaDatos.nextDouble();
    }

    /**
     * Método para comprobar si las notas ingresadas están dentro del rango válido (0-10). evaluacioncreada
     */
    public void comprobarNotas() {
        if (notaUnidad1 > 10) {
            System.out.println("Nota 1 incorrecta. Debe ser entre 0 y 10.");
        } else {
            System.out.println("Nota 1 correcta.");
        }

        if (unidadFormativa2 > 10) {
            System.out.println("Nota 2 incorrecta. Debe ser entre 0 y 10.");
        } else {
            System.out.println("Nota 2 correcta.");
        }

        if (unidadFormativa3 > 10) {
            System.out.println("Nota 3 incorrecta. Debe ser entre 0 y 10.");
        } else {
            System.out.println("Nota 3 correcta.");
        }
    }

    /**
     * Método para calcular la nota final del estudiante basándose en los pesos de cada unidad.
     */
    public void calcularNotas() {
        acumuladoUF1 = notaUnidad1 * 0.35;
        acumuladoUF2 = unidadFormativa2 * 0.35;
        acumuladoUF3 = unidadFormativa3 * 0.30;
        notaFinal = acumuladoUF1 + acumuladoUF2 + acumuladoUF3;
    }

    /**
     * Método para mostrar las notas ingresadas, los acumulados y la nota final.
     */
    public void mostrarResultado() {
        System.out.println("Notas introducidas:");
        System.out.println("Unidad Formativa 1 = " + notaUnidad1);
        System.out.println("Unidad Formativa 2 = " + unidadFormativa2);
        System.out.println("Unidad Formativa 3 = " + unidadFormativa3);
        System.out.println("Acumulado UF1 = " + acumuladoUF1);
        System.out.println("Acumulado UF2 = " + acumuladoUF2);
        System.out.println("Acumulado UF3 = " + acumuladoUF3);
        System.out.println("Nota final = " + notaFinal);
    }

    /**
     * Método para determinar si el estudiante ha aprobado o suspendido en función de su nota final.
     */
    public void verificarAprobado() {
        if (notaFinal < 5 && notaFinal >= 0) {
            System.out.println("Suspendió");
        } else if (notaFinal >= 5 && notaFinal <= 10) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Error en las notas");
        }
    }

    /**
     * Método principal que ejecuta el flujo del programa.
     * 
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        // Creación de un objeto para acceder a los métodos de la clase.
        Notas gestionNotas = new Notas();
        
        gestionNotas.ingresarNotas();
        gestionNotas.comprobarNotas();
        gestionNotas.calcularNotas();
        gestionNotas.mostrarResultado();
        gestionNotas.verificarAprobado();
        
        // Cierre del scanner.
        gestionNotas.entradaDatos.close();
    }
}