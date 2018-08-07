
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author ESFOT
 */
public class Arreglos {

    public static void main(String[] args) {
        
        System.out.println("\t--ARREGLO DE ENTEROS (Exception)--\n");
        int n =0;
        boolean validar = false;
        
        do{
            try{
                Scanner scan = new Scanner(System.in);
                System.out.print("Tamaño de arreglo: ");
                n = scan.nextInt ();
                validar = false;
            } catch (InputMismatchException ime){
                System.out.print("\nSe ha introducido caracteres no numericos:\n"
                        + "Error: " + ime.getMessage());
                validar = true;
            }
        } while (validar);
        
        arregloEnteros(n);
    }
    
    public static void arregloEnteros(int n){
        
        int enteros [] = new int [n];
        int pos=0;
        boolean validar = false;
        int i=0;
        
        System.out.println("Ingrese: ");
        do{
            try{
                Scanner scan = new Scanner(System.in);
                
                for (i=i; i < enteros.length; i++){
                    System.out.print("Numero" + "[" + (i+1) + "]: ");
                    enteros[i] = scan.nextInt();
                }
                
                System.out.println("\nTiene " + n + "numeros. " + "Ingrese una posicion de (1 a " + n +"):");
                System.out.print("Posicion: ");
                pos = scan.nextInt();
                
                System.out.println("En la posicion " + pos + "Tiene el numero: "
                        + enteros[pos - 1]+"\n");
                validar = false;
                
            } catch (InputMismatchException ime){
                System.err.println("Se ha introducido caracteres no numericos:\n"
                        + "Error: " + ime.getMessage());
                validar = false;
            } catch (ArrayIndexOutOfBoundsException a){
                System.err.println("Se ha introducido numero fuera del rango: " + "(1 a " + n + ")\n"
                        + "Error: " + a.getMessage());
                validar = true;
            }
        } while (validar);
    }        
}
