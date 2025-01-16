package ejerciciosProfe;
import java.util.Random;

public class penaltisV2 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    
    public static void main(String[] args) {

        Random random = new Random();
        int direccion = random.nextInt(3) + 1;
        int opcionUsu = 0; 
        int opcionUsuparada = 0;
        int golesUsu = 0;
        int golesPC = 0;
        int tirosUsu = 5;
        int tirosPc = 5;
        String marcadorUsu = "";
        String marcadorPc = "";
        
        

        do{
            direccion = random.nextInt(3) + 1;
            
           System.out.println("Hacia que direccion quieres tirar el disparo?");
           System.out.println("1. izquierda");
           System.out.println("2. centro");
           System.out.println("3. derecha");
           System.out.println();
           opcionUsu = leer.nextInt();
           tirosUsu--;

                if (opcionUsu == direccion) {
                        System.out.println();
                        System.out.println("El portero rival a parado el tiro");
                        marcadorUsu = marcadorUsu + "X ";
                    System.out.println("El marcador va: ");
                    System.out.println("Equipo usuario: " + marcadorUsu);
                    System.out.println("Equipo maquina: " + marcadorPc);
                    System.out.println();
                } else {
                        System.out.println();
                        System.out.println("Has marcado un golazo!");
                        marcadorUsu = marcadorUsu + "O ";
                        golesUsu++;
                    System.out.println("El marcador va: ");
                    System.out.println("Equipo usuario: " + marcadorUsu);
                    System.out.println("Equipo maquina: " + marcadorPc);
                    System.out.println();
                }

           System.out.println("Hacia que direccion quieres parar el disparo?");
           System.out.println("1. izquierda");
           System.out.println("2. centro");
           System.out.println("3. derecha");
           opcionUsuparada = leer.nextInt();
           tirosPc--;

                if (opcionUsuparada == direccion) {
                        System.out.println();
                        System.out.println("Has parado el tiro");
                        marcadorPc = marcadorPc + "X ";
                    System.out.println("El marcador va: ");
                    System.out.println("Equipo usuario: " + marcadorUsu);
                    System.out.println("Equipo maquina: " + marcadorPc);
                    System.out.println();
                } else {
                        System.out.println();
                        System.out.println("Te han marcado un gol");
                        marcadorPc = marcadorPc + "O ";
                        golesPC++;
                    System.out.println("El marcador va: ");
                    System.out.println("Equipo usuario: " + marcadorUsu);
                    System.out.println("Equipo maquina: " + marcadorPc);
                    System.out.println();
                }
                
        } while (tirosPc < 5 && tirosUsu < 5);
    }
}


