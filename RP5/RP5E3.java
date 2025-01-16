package RP5;
public class RP5E3 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        // Solicitar la cantidad de alumnos
        System.out.print("escribe un dia del mes: ");
        int dia = leer.nextInt();

        System.out.print("escribe un mes (en numero): ");
        int mes = leer.nextInt();

        System.out.print("escribe un año: ");
        int año = leer.nextInt();

        
        if (dia > 31) {
            System.out.print("la fecha " + dia + "-" + mes + "-" + año + " es una fecha incorrecta ");
        }

        else if (dia > 28 && mes == 2) {
            System.out.println("la fecha " + dia + "-" + mes + "-" + año + " es una fecha incorrecta ");
        }

        else if (mes > 12) {
            System.out.println("la fecha " + dia + "-" + mes + "-" + año + " es una fecha incorrecta ");
        }

        else if (año < 0) {
            System.out.println("la fecha " + dia + "-" + mes + "-" + año + " es una fecha incorrecta ");
        }

        else{
            System.out.println("la fecha " + dia + "-" + mes + "-" + año + " es una fecha valida");
        }
    }
}
