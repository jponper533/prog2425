package RP4;
public class RP4E10 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("introduce los años del vehiculo: ");
        int edad = leer.nextInt();

        leer.nextLine(); //limpiamos el buffer

        System.out.print("introduce el tipo del vehiculo: ");
        String tipo = leer.nextLine();

        //dependiendo de la edad del vehiculo saldra un mensaje u otro,
        //pero si tiene mas de 15 y es una coche o una moto les saldra uno de los dos mensajes correspondientes
        if (edad > 15) {
            System.out.println("vehiculo clasico ");

            if (tipo.equals("coche")) {
                System.out.println("cobertura especial para coches clasicos");
            }

            if (tipo.equals("moto")) {
                System.out.println("cobertura especial para motos clasicos");
            }
        }

        else if (edad >= 5 && edad <= 15) {
            System.out.print("vehiculo moderno");
        }

        else {
            System.out.print("vehiculo nuevo");
        }

        leer.close();
        }
    }