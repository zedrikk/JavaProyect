import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaNumericoEntradaScanner {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese un numero entero:");
       //String numeroStr = scanner.nextLine();
       int numeroDecimal = 0;
       try{
           numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
       }//catch (NumberFormatException ex) {
       catch (Exception e) {
           System.out.println("Error debe ingresar un numero entero");
           main(args);
           System.exit(0);
       }
    }
}
