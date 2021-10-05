/*
 * Ejercicio 3
Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su
correspondiente traducción al castellano. Las palabras deben estar distribuidas
en dos columnas y alineadas a la izquierda.
 * 
 *  computer  ordenador
    student   alumno\a
    cat       gato
    penguin   pingüino
    machine   máquina
    nature    naturaleza
    light     luz
    green     verde
    book      libro
    pyramid   pirámide
    * 
 * Authora:Esther hitos garcia
 * */

public class Ej1{
  public static void main(String[] args){
    
    
    System.out.printf("%-10s  %-10s\n","Ingles","Castellano");
    System.out.println("-------------------------");
    System.out.printf("%-10s  %-10s\n","computer","Ordenador");
    System.out.printf("%-10s  %-10s\n","student","alumno");
    System.out.printf("%-10s  %-10s\n","cat","gato");
    System.out.printf("%-10s  %-10s\n","penguin","pingüino");
    System.out.printf("%-10s  %-10s\n","machine","máquina");
    System.out.printf("%-10s  %-10s\n","nature","naturaleza");
    System.out.printf("%-10s  %-10s\n","light","luz");
    System.out.printf("%-10s  %-10s\n","green","verde");
    System.out.printf("%-10s  %-10s\n","book","libro");
    System.out.printf("%-10s  %-10s\n","pyramid","pyramid");
  }
}
