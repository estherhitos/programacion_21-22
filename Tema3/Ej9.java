/*
 * Ejercicio 9 | Tema3.java
 * 
 * Escribe un programa que calcule el volumen de un cono según la
 *    fórmula V = (1/3)πr^2h
 * 
 * valor de pi π=3.14
 * 
 * Y  1/3  se multiplica al valor de pi, para saber valor real de radio ((1.0/3.0)*PI)
 * 
 * radio se multiplica por si mismo para sacar 
 * 	el valor de los dos lados de la base r = r*r
 * 
 * Haltura h se multiplica con el resultado del radio (r*r*h)
 * 
 * quedaria asi la formula para java : V =((1.0/3.0)*PI)*r*r*h
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej9 {
	
	public static void main (String[] args) {
		
		final double PI =3.14;
		float r = 0;
		float h = 0;
		
		System.out.println("Calculo del volumen de un cono");
		System.out.println("Vamos a introducir el valor del RADIO: ");
		r = Float.parseFloat(System.console().readLine());
		
		System.out.println("Vamos a introducir el valor de la HALTURA: ");
		h = Float.parseFloat(System.console().readLine());
		
		double volumen = ((1.0/3.0)*PI)*r*r*h;
		
		System.out.printf("El Volumen del cono es: %.2f ",volumen);
	}
}

