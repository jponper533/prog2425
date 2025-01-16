package RP4;
public class RP4E5 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //pedimos los dos datos
        System.out.print("Introduce el nombre del estudiante: ");
        leer.nextLine();

        System.out.print("Introduce la nota final: ");
        double notas = leer.nextDouble();

        //dependiendo de la nota nos dira una respuesta u otra, a la vez q si nos dice 1 o 0
        if (notas >= 5.0) {
            System.out.print("¿has participado en actividades ectracurriculares? (1 para si, 0 para no) ");
        double respuesta = leer.nextDouble();

            if (respuesta == 1) {
                System.out.print("estudiante activo y aprobado");
            } else {
                System.out.print("estudiante aprobado");
            }
        }

        else {
            System.out.print("estudiante suspenso");
        }


        leer.close();
        }
    }