package RP4;
public class RP4E9 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Introduce la temperatura: ");
        int temperatura = leer.nextInt();

        //dependiendo de la temperatura saldra un mensaje u otro, pero si tiene mas de 40 le saldran los dos primeros mensajes
        if (temperatura >= 30) {
            System.out.print("clima caliente ");

            if (temperatura >= 40) {
                System.out.print("¡Hace mucha calor!");
            }
        }

        else if (temperatura >= 20 && temperatura <= 29.9) {
            System.out.print("clima templado");
        }

        else if (temperatura >= 10 && temperatura <= 19.9) {
            System.out.print("clima fresco");
        }

        else {
            System.out.print("clima frio");
        }
       


        leer.close();
        }
    }