/*
 * Tema3|Ej1.java
 * 
 * Realiza un programa que pida dos números y 
 * que luego muestre el resultado de su multiplicación.
 * 
 * Authora: Esther Hitos Garcia
 * 
 * 
 */


public class Ej1 {
	
	public static void main (String[] args) {
    
    float num1; 
    float num2; 
    
    
    System.out.println("Programa de multiplicacion entre dos numeros con o sin decimales");
    System.out.printf("Introduce el primer numero porfabor: ");
    num1 = Float.parseFloat(System.console().readLine());
    System.out.printf("Introduce el segundo numero porfabor: ");
    num2 = Float.parseFloat(System.console().readLine());
    double total = (num1*num2);
    System.out.printf("%.2f * %.2f = %.2f\n",num1,num2,total);
    
		
	}
}

