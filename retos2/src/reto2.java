import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de competidores: ");
        int numCompetidores = leer.nextInt();
        
        String[] nombres = new String[numCompetidores];
        double[] tiempos = new double[numCompetidores];
        
        for (int i = 0; i < numCompetidores; i++) {
            System.out.print("Ingrese el nombre del nadador " + (i+1) + ": ");
            nombres[i] = leer.next();
            
            System.out.print("Ingrese el tiempo del nadador " + (i+1) + " (segundos): ");
            tiempos[i] = leer.nextDouble();
        }
        
        System.out.println("Resultados de la competencia:");
        
        for (int i = 0; i < numCompetidores; i++) {
            System.out.println(nombres[i] + ": " + tiempos[i] + " segundos");
        }
        
        double menorTiempo = tiempos[0];
        String ganador = nombres[0];
        
        for (int i = 1; i < numCompetidores; i++) {
            if (tiempos[i] < menorTiempo) {
                menorTiempo = tiempos[i];
                ganador = nombres[i];
            }
        }
        
        System.out.println("El ganador de la competencia es: " + ganador + " con un tiempo de " + menorTiempo + " segundos");
        
        leer.close();
    }
}
 