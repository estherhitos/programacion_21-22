/*
 * Ejercicio 7 | Tema 5.java
 * 
Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia 
 */


public class Ej7CajaFuerte {
	
	public static void main (String[] args) {

		int numeroIntroducido;
		final int codigo = 1234;
		final int intentos = 4;
		boolean salida= false;
		
		System.out.println("Control de acceso a una caja fuerte ");
		
		
		for (int i=1; i<=intentos && salida == false;i++){
			System.out.println("Introduce los 4 digitos para abrirla:");
			numeroIntroducido = Integer.parseInt(System.console().readLine());
			if (numeroIntroducido == codigo ){
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				salida = true;
				}else{
					System.out.println("Lo siento, esa no es la combinación");
					
					}
				
			
		
	}
}

}
