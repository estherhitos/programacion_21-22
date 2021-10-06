/*Ejercicio 1
 * Escribe un programa en el que se declaren las variables enteras x e y.
 * Asígnales los valores 144 y 999 respectivamente. 
 * A continuación, muestra por pantalla el valor de cada variable,
 * la suma, la resta, la división y la multiplicación
 * 
 * Authora:Esther hitos Garcia
 */
 public class Ej1 {
   public static void main (String[] args){
     int x = 144;
     int y = 999;
     
     System.out.println("El valor de x es: "+x+" y El valor de y es: "+y);
     System.out.println("El resultado de x + y es: "+(x+y));
     System.out.println("El resultado de x - y es: "+(x-y));
     System.out.println("El resultado de y - x es: "+(y-x));
     System.out.println("El resultado de x / y es: "+((float)x/y));
     System.out.println("El resultado de y * x es: "+(x*y));
     }
}
