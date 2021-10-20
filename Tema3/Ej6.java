/*
 * ejercicio 6 | Tema 3.java
 * 
 *Escribe un programa que calcule el área de un triángulo.
 * s = base * altura / 2
 * 
 * @Authora: Esther Hitos Garcia
 * 
 */


public class Ej6 {
	
	public static void main (String[] args) {
		float base;
		float altura;
		
		System.out.println("Calculamos el área de un triaungulo");
		System.out.println("Introduce la base: ");
		 base = Float.parseFloat(System.console().readLine());
		System.out.println("Introduce la altura: ");
		 altura = Float.parseFloat(System.console().readLine());
		 
		 float area = ((base*altura)/2);
		 
		 System.out.printf("El area del triangulo es %.2f",area);
	}
}

