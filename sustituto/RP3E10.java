package sustituto;
public class RP3E10 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {
//le pedimos al usuario que ingrese su nombre
    System.out.println("Ingresa tu nombre: ");
    leer.nextLine();

    //hacemos unas variables para cada nota que ponga el usuario
    System.out.println("Ingresa tu primera nota ");
    float nota1 = leer.nextFloat();

    System.out.println("Ingresa tu segunda nota ");
    float nota2 = leer.nextFloat();

    System.out.println("Ingresa tu tercera nota ");
    float nota3 = leer.nextFloat();

    //hacemos el promedio de las notas
    float notatotal = (nota1 + nota2 + nota3)/3;

    //ponemos el mensaje si esta aprobado o suspenso
    System.out.println("tu nota promedia es: " + notatotal);

        if (notatotal>=5) {
            System.out.println("Estas aprobado");
            }

            else {
                System.out.println("no estas aprobado");
            }

            leer.close();

        }
    }