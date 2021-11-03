/*
 * Ejercicio 7v2 | Tema 5.java
 * 
Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
* 
* 
 *  <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia
 * 
 */


public class Ej7v2 {
	
	public static void main (String[] args) {
		
		int intentos = 4;
    int clave;
    boolean acertado = false;
    
    do {
      System.out.print("Introduce los 4 digitos para abrir la caja fuerte: ");
      clave = Integer.parseInt(System.console().readLine());
      
      if (clave == 1234) {
        acertado = true;
      } else {
        System.out.println("Clave incorrecta");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("Has abierto la caja fuerte.");
    } else {
      System.out.println("Lo siento, has agotado las 4 oportunidades.");
    }
		
	}
}

