package RP4;
public class RP4E13 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //recogemos los datos
        System.out.print("introduce los años de antiguedad: ");
        int antiguedad = leer.nextInt();

        System.out.print("introduce el gasto total: ");
        int gasto = leer.nextInt();

        leer.nextLine();

        System.out.print("introduce el tipo de cliente: ");
        String tipo = leer.nextLine();

        //dependiendo del tipo de cliente que sea se le metera en un if distinto y con los otros datos
        // se completara la condicion y saldra el texto correspondiente
        if (tipo.equals("vip") && antiguedad > 5) {
            if (gasto > 10000) {
                System.out.print("cliente VIP preferencial ");
            } 

            else if (gasto >= 5000 && gasto <= 10000) {
                System.out.print("cliente VIP estandar");
            }
        }

        if (tipo.equals("regular")) {
            if (antiguedad > 3) {
                System.out.print("cliente regular ");
            } 

            else {
                System.out.print("cliente regular nuevo");
            }
        }
       
        if (tipo.equals("potencial")) {
            if (gasto > 2000) {
                System.out.print("cliente potencial interesado ");
            } 

            else {
                System.out.print("cliente potencial por evaluar");
            }
        }

        leer.close();
        }
    }