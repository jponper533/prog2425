package sustituto;
public class E1 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        // Pedir al usuario su nombre
        System.out.print("ingresa un dia de la semana del 1 al 7: ");
        int dia = leer.nextInt();

        switch (dia) {
            case 1:
            System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                    break;
            case 3:
                System.out.println("Miercoles");
                    break;
            case 4:
                System.out.println("Jueves");
                   break;
            case 5:
            System.out.println("viernes");
                break;
            case 6:
            System.out.println("sabado");
                break;
            case 7:
            System.out.println("domingo");
                break;
            default:
                break;
        }
        leer.close();
    }
}