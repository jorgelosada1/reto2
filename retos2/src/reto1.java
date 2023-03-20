import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        int cantidadNotas = leer.nextInt();
        
        
        double[] notas = new double[cantidadNotas];
        
        
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese el valor de la nota " + (i+1) + ": ");
            notas[i] = leer.nextDouble();
        }
        
       
        double promedio = 0;
        for (int i = 0; i < cantidadNotas; i++) {
            promedio += notas[i];
        }
        promedio /= cantidadNotas;
        
       
        if (promedio < 3) {
            System.out.println("Tu nota final es " + promedio + ". Reprobaste.");
        } else if (promedio >= 3 && promedio < 4) {
            System.out.println("Tu nota final es " + promedio + ". Pasaste Raspando.");
        } else {
            System.out.println("Tu nota final es " + promedio + ". Aprobaste con buenos resultados.");
        }
        
       
        leer.close();
    }
}
