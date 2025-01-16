package RP4;
public class RP4E1 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //pedimos los dos datos
        System.out.print("Introduce tu nombre: ");
        String nombre = leer.nextLine();

        System.out.print("Introduce tu calificacion del 1 al 10: ");
        int calificacion = leer.nextInt();
        //cogemos el dato que nos dieron anteriormente y hacemos la condicional para que nos ponga el resultado q nos pide segun los años en la empresa
        if (calificacion >= 5) {
            System.out.println(nombre + " " + "¿cuantos años llevas en la empresa?");
            int tiempo = leer.nextInt();
            
        if (tiempo > 5) {
                System.out.println("empleado valioso");
            } else {
                System.out.println("empleado regular");
            }
       } else {
         System.out.println("empleado deficiente");
             }


             leer.close();
                }
        }