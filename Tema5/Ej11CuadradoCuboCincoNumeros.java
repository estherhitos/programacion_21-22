/*
 * Ej11CuadradoCuboCincoNumeros.java
 * 
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia  
 */


public class Ej11CuadradoCuboCincoNumeros {
	
	public static void main (String[] args) {
		
		int numeroIntroducido;
		
		System.out.println("Programa que muestra el cuadrado y el cubo de los 5 primeros números introducidos");
		System.out.print("Porfabor introduzca minimo 5 numeros:");
		numeroIntroducido=Integer.parseInt(System.console().readLine());
		
		for ( int i=numeroIntroducido; i<numeroIntroducido+5;i++){
			System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
			}
			
//esta forma es con graficos y sin formatear e iniciando a uno 			
		int cont=0, num1=1;

				System.out.print("ingrese un numero:  ");

					num1=Integer.parseInt(System.console().readLine());
				System.out.println("numero-----cuadrado-------cubo");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				for (cont=num1; cont<=num1+5; cont++){
					
				
				System.out.println(" "+cont+" →→→→→→→→→→ "+cont*cont+" →→→→→→→→→ "+cont*cont*cont);}
	}
}

