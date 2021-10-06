/*
 * Ej4|Tema3.java
 * 
 * Escribe un programa que sume, reste, multiplique y divida 
 * dos números introducidos por teclado.
 * 
 * 
 */

import java.util.Scanner;
public class Ej4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    
    System.out.println("programa que suma, resta, multipliqua y divide");
    System.out.print("Introduce 2 números (pueden contener decimales) separados por espacios: ");
    double num1 = s.nextFloat();
    double num2 = s.nextFloat();
    
    double suma = num1 + num2;
    double resta = num1 - num2;
    double mult = num1 * num2;
    double div = num1 / num2;
    
    System.out.println("El resultado de la suma es: "+suma);
    System.out.println("El resultado de la reta es: "+resta);
    System.out.println("El resultado de la multipicacion es: "+mult);
    System.out.println("El resultado de la division es: "+div);
	}
}

