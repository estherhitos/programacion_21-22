/*Modifica el programa anterior añadiendo colores. Puedes mostrar cada asigna-tura de un color diferente
*/
/*Authora: Esther hitos Garcia*/
public class Ej5{
  public static void main (String[] args){
    
    String r= "\033[31m";//amarillo/rojo
    String v = "\u001B[32m";//verde
    String m = "\033[33m";//amarillo
    String z = "\u001B[34m";//azul
    String p = "\u001B[35m";//purpura
    String c ="\033[36m";//cyan 
    String w ="\033[37m";//white
    
    
  System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",r+"Lunes",r+"Martes",r+"Miecoles",r+"Jueves",r+"Viernes\n");
  System.out.printf("%-10s %-11s %-13s %-11s %-10s\n",m+"LM",p+"ED",m+"LM",p+"ED",c+"FOL");
  System.out.printf("%-10s %-11s %-13s %-11s %-10s\n",m+"LM",z+"BBDD",m+"LM",p+"ED",c+"FOL");
  System.out.printf("%-10s %-11s %-13s %-11s %-10s\n",v+"PROG",z+"BBDD",v+"PROG",v+"PROG",c+"FOL");
  System.out.printf("%-5s %-6s %-8s %-6s %-5s\n","P","A","T","I","O");
  System.out.printf("%-10s %-11s %-13s %-11s %-10s\n",v+"PROG",v+"PROG",v+"PROG",v+"PROG",w+"SINF");
  System.out.printf("%-10s %-11s %-13s %-11s %-10s\n",z+"BBDD",v+"PROG",z+"BBDD",w+"SINF",w+"SINF");
  System.out.printf("%-10s %-11s %-13s %-11s %-10s\n",z+"BBDD",w+"SINF",z+"BBDD",w+"SINF",w+"SINF");
  
  }
}

