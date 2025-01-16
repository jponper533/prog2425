package sustituto;
public class RP6E2 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        // Pedir un mes en numero al usuario
        System.out.print("ingresa un mes en numero: ");
        int dia = leer.nextInt();

        //hacemos un switch case para que dependiendo del numero que elija
        //sera un mes u otro
        switch (dia) {
            case 1:
            System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                    break;
            case 3:
                System.out.println("marzo");
                    break;
            case 4:
                System.out.println("abril");
                   break;
            case 5:
            System.out.println("mayo");
                break;
            case 6:
            System.out.println("junio");
                break;
            case 7:
            System.out.println("julio");
                break;
            case 8:
            System.out.println("agosto");
                break;
            case 9:
            System.out.println("septiembre");
                    break;
            case 10:
            System.out.println("octubre");
                    break;
            case 11:
            System.out.println("noviembre");
                   break;
            case 12:
            System.out.println("diciembre");
                break;
            default:
            System.out.println("tu numero no corresponde a un mes");
                break;
            }
        }
    }