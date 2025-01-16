import java.util.Scanner;

public class autocar {
    private static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) { 
  
        int plazas = 0;
        int plazasTotales = 0;
        int plazasClientes = 0;
        boolean salida = true;
        String ticket = " ";
        String nombreCliente = " ";

        System.out.println("Cuantas plazas tiene el autocar?");
        plazas = leer.nextInt();
        leer.nextLine();

    while (salida) {
    System.out.println("Ingrese el nombre del cliente");
     nombreCliente = leer.nextLine();

    
        System.out.println("Cuantos tickets desea el cliente?");
        plazasClientes = leer.nextInt();
        leer.nextLine();
        if (plazasClientes >= plazas / 2) {
            System.out.println();
            System.out.println("Ha elegido mas de la mitad de plazas");

        }else {
            System.out.println("Se añadio un cliente");
            plazasTotales = plazas - plazasClientes;
            System.out.println("Quedan " + plazasTotales);
        }

        System.out.println("Deseas añadir otro cliente? s/n");
        String siOno = leer.nextLine();
        if (siOno.equalsIgnoreCase("S")) {
            salida = true;
        } else {
            salida = false;
        }
    }

    System.out.println("Plazas " + plazasTotales);
    System.out.println("Nombre " + nombreCliente);
    
    }
}