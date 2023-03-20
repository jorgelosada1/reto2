import java.util.Scanner;
public class reto4 {
   public static void main(String[] args) {

       Scanner leer = new Scanner(System.in);
    
  

    String [] [] producto = new String [4] [4];

    for(int i=0; i<4; i++ ){
        for(int j=0; j<4; j++ ){
        System.out.println("digite su producto con su precio en [" + i + "][" + j + "]");
        producto[i][j]=leer.next();
    }
}

System.out.println("sus productos son: ");
for(int i=0; i<4; i++ ){
    for(int j=0; j<4; j++ ){
    System.out.print( producto[i][j]+ "\t");
}
System.out.println();
}



    leer.close();

   }
}