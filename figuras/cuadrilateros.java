package figuras;
public class cuadrilateros {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int altura = 3;
        int ancho = 4;
        int i = 0;
        int j = 0;
        Boolean entrar = true;

        //pintar rectangulo hueco 4 ancho y 3 largo
    while (entrar) {
        
        for (i = 0; i < altura; i++) {
                
            for (j = 0; j < ancho; j++) {
                if (i == 0 || j == 0 || j == ancho - 1 || i == altura - 1 )  {
                    System.out.print("*");
                } else {
                System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    
        //menu agrandar, achicar o cambiar orientacion
        System.out.println();
        System.out.println("Elige la opcion que quieras: ");
        System.out.println("agrandar (1)");
        System.out.println("achicar (2)");
        System.out.println("Salir (0)");
        int eleccion = leer.nextInt();

        //se agranda y achica 1 ancho y largo
        switch (eleccion) {
            case 1:
                    altura++;
                    ancho++;
                break;
        
            case 2:
            if (altura <= 2 && ancho <= 3) {
                altura++;
                ancho++;
                System.out.println();
                System.out.println("No puedes hacerlo mas pequeño");
            }
                altura--;
                ancho--;
                break;

            case 0:
                entrar = false;
                break;
            default: 
            System.out.println();
            System.out.println("elije una opcion valida");
                break;
        }
        
        }
    }
}
