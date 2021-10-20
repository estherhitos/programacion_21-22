/*
 * ejrcico 5 | tema 3.java
 * 
Escribe un programa que calcule el área de un rectángulo.
* 
* s = base * altura 
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej5 {
	
	public static void main (String[] args) {
		
		float base;
		float altura;
		
		System.out.println("Calculamos el área de un triaungulo");
		System.out.println("Introduce la base: ");
		 base = Float.parseFloat(System.console().readLine());
		System.out.println("Introduce la altura: ");
		 altura = Float.parseFloat(System.console().readLine());
		 
		 float area = (base*altura);
		 
		 System.out.printf("El area del triangulo es %.2f",area);
		
	}
}

