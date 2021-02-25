/*
 UNIVERSIDAD AUTÓNOMA DE CAMPECHE
 Facultad de Ingeniería
 Ingeniería en Sistemas Computacionales
 */
package ejercicio1selección66659;
import java.util.Scanner;
/**
 *
 * @author Johnny Reveles
 */
public class Ejercicio1Selección66659 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Elabore un programa que lea tres números enteros e imprima el mayor de ellos
        
        
        Scanner sc = new Scanner(System.in);
        
        int numero1, numero2, numero3;
        
        System.out.println("Escriba el primer número: ");
        numero1 = sc.nextInt();
        
        System.out.println("Escriba el segundo número: ");
        numero2 = sc.nextInt();
        
        System.out.println("Escriba el tercer número: ");
        numero3 = sc.nextInt();
        
        if (numero1 > numero2) {
        if (numero1 > numero3) {
                System.out.println("El numero mayor es: " + numero1);
        } else {
                System.out.println("El numero mayor es: " + numero3);
        }
        } else if (numero2 > numero3) {
                System.out.println("El numero mayor es: " + numero2);
        } else {
                System.out.println("El mayor es: " + numero3);
         }
            
        }
        
     }
    

