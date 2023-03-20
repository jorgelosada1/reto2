import java.util.Scanner;

public class reto3 {
   public static void main(String[] args) {
        
      int dosContador = 0;
      int cant;

      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese la cantidad de numero que va a digitar:");
      cant=leer.nextInt();
      
      int[] numeros = new int[cant];
      
      for (int i = 0; i < numeros.length; i++) {
         numeros[i] = leer.nextInt();
         
         if (numeros[i] == 2) {
            dosContador++;
         }
      }
      
      System.out.println("Se ingresaron " + dosContador + " números iguales a 2.");

      leer.close();
   }
}
