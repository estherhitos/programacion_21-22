/*
 * Ej8TablaMultiplicar | tema 5.java
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia 
 */


public class Ej8TablaMultiplicar {
	
	public static void main (String[] args) {
		
		int numerointroducido;
		
		System.out.println("Programa que muestra la Tabla de multiplicar entera");
		System.out.print("Introduce el numero de la tabla que quieras ver: ");
		numerointroducido = Integer.parseInt(System.console().readLine());
		
		for (int i=1; i<=10; i++){
			//System.out.println(numerointroducido+" x "+ i + " = "+numerointroducido*i);
			System.out.printf("%d x %d = %d \n",numerointroducido,i,numerointroducido*i);
		}
		
	}
}

