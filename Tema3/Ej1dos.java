/*
 * Tema3|Ej1dos.java
 * 
 * Realiza un programa que pida dos números y 
 * que luego muestre el resultado de su multiplicación.
 * 
 * Authora: Esther Hitos Garcia
 * 
 * 
 */


public class Ej1dos {
	
	public static void main (String[] args) {
		   
    int num1;
    int num2;
   
   
    System.out.println("Programa de multiplicacion entre dos numeros enteros");
    System.out.print("Introduce el primer numero porfabor: ");
    num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo numero porfabor: ");
    num2 = Integer.parseInt(System.console().readLine());
    int total = num1*num2;
    System.out.println(+num1+" * "+num2+ " = " +total);
   

  }
}

