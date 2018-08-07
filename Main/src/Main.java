import java.util.InputMismatchException;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.Infinity;

/**
 *
 * @author bayon
 */
public class Main {

    
    public static void main(String[] args) {
        
        System.out.println("\t--PRIMER CASO: DIVISION 1--\n");
        operacion1();
        
        System.out.println("\t--SEGUNDO CASO: DIVISION 2--\n");
        operacion2();
    }
    
    public static void operacion1 (){
        
        double num1 = 0;
        double den1 = 0;
        double res1 = 0;
        boolean validar = false;
        
        do{
            try{
                Scanner scan = new Scanner(System.in);
                System.out.print("Ingrese Numerador1: ");
                num1 = scan.nextDouble();
                System.out.print("Ingrese Denominador1: ");
                den1 = scan.nextDouble();
                res1 = (num1 / den1);
                
                if(res1 == Infinity){
                    System.err.println("Usted esta dividiendo para cero:"+
                            "\nResultado1: "+ res1);
                    validar = true;
                }else{
                    System.out.println("Resultado1: "+ res1 + "\n");
                    validar = false;
                }
                
            }catch (InputMismatchException ime){
                System.err.println("\nSe ha introducido caracteres no numericos: \n"
                + "Error: " + ime.getMessage());
                validar = true;
            }
        }while(validar);
    }
    
    
    public static void operacion2 (){
        double num2 = 0;
        double den2 = 0;
        double res2 = 0;
        boolean validar = false;
        String identificador = "";
        
        do{
          
          try{
          
           Scanner scan = new Scanner(System.in);
           
           if(num2 == 0){
               
               identificador = "Numerador";
               System.out.print("Ingrese numerador2: ");
               num2 = scan.nextDouble();
               
               identificador = "Denominador";
               System.out.print("Ingrese denominador2: ");
               den2 = scan.nextDouble();
           }else{
               System.out.print("Ingrese denominador2: ");
               den2 = scan.nextDouble();
           }
           res2 = (num2 / den2);
           if (res2 == Infinity){
               System.err.println("\nUsted esta diviendo para cero: "
                        + "\nResultado2: " + res2);
               validar = true;
           }else{
               System.out.println("Resultado2: " + res2 + "\n");
               validar = false;
           }
           
        }catch (InputMismatchException ime){
                System.err.println("\nSe ha introducido caracteres no numericos: \n"
                + "Error: " + ime.getMessage());
                validar = true;
            }
    }while  (validar);
  }
