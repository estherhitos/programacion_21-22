/*
 * EjEXB3.java
 * 
Implemente un programa que presente por pantalla el horario de acceso a internet de un router de
un ISP. Para cada día de la semana, se mostrará si hay acceso a internet o no durante cada una de las 24
horas. El programa solicitará interactivamente el día de la semana donde comienza el acceso a internet, la
hora a la que comenzar y cuántas horas se va a restringir el acceso. Las horas en las que se limitará el acceso
serán consecutivas. En caso de rebasarse el domingo, esas horas “se pierden”. Observe los ejemplos:
 *  
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia
 * 
 */


public class EjEXB3 {
	
	public static void main (String[] args) {
		
		
   String diaSemana;
    int diaSemanaNum=0;
    
    int horaInicio;
    int numHoras;
    

    System.out.print("Indique el día de la semana (en minúscula): ");
    diaSemana = System.console().readLine();
    
    System.out.print("Indique la hora de inicio (0-23): ");
    horaInicio = Integer.parseInt(System.console().readLine());
    
    System.out.print("Indique el n.o de horas: ");
    numHoras= Integer.parseInt(System.console().readLine());

    
    switch (diaSemana) {
      case "lunes":
        diaSemanaNum=0;
        break;
      case "martes":
        diaSemanaNum=1;
        break;
      case "miércoles":
        diaSemanaNum=2;
        break;
      case "jueves":
        diaSemanaNum=3;
        break;
      case "viernes":
        diaSemanaNum=4;
        break;
      case "sábado":
        diaSemanaNum=5;
        break;
      case "domingo":
        diaSemanaNum=6;
        break;
      default:
    }
    
    System.out.println();
        
    System.out.print("┌───");
    for (int i=0; i<24; i++) {
      System.out.print("┬──");
    }
    System.out.println("┐");
    
    System.out.print("│   ");
    for (int i=0; i<24; i++) {
      System.out.printf("│%2d",i);
    }
    System.out.println("│");
    
    for (int i=0; i<7; i++) {
      System.out.print("├───");
      for (int j=0; j<24; j++) {
        System.out.print("┼──");
      }
      System.out.println("┤");
      
      String diaCorto="";
      switch (i) {
        case 0:
          diaCorto = "L";
          break;
        case 1:
          diaCorto = "M";
          break;
        case 2:
          diaCorto = "X";
          break;
        case 3:
          diaCorto = "J";
          break;
        case 4:
          diaCorto = "V";
          break;
        case 5:
          diaCorto = "S";
          break;
        case 6:
          diaCorto = "D";
          break;
        default:
      }
    
      
      System.out.printf("│%2s ",diaCorto);
      for (int j=0; j<24; j++) {
        String marca="";
        if (numHoras>0) {
          if ((i==diaSemanaNum) && (j>=horaInicio)) {
            marca = "X";
            numHoras--;
          } else if (i>diaSemanaNum) {
            marca = "X";
            numHoras--;
          }
        }
        System.out.printf("│%2s",marca);
      }
      System.out.println("│");
    }
    
    System.out.print("└───");
    for (int i=0; i<24; i++) {
      System.out.print("┴──");
    }
    System.out.println("┘");
}

}
