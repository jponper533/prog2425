package figuras;
public class triangulos {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);

        public static void main(String[] args) {
            
            System.out.println("Dame un numero: ");
            int numero = leer.nextInt();

            System.out.println("Triangulo ascendente");
            for (int i = 0; i < numero; i++) {
                
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                
                System.out.println();
            
            }
            System.out.println();
            System.out.println("Triangulo descendente");
            for (int i = numero; i > 0; i--) {
                
                for (int j = 1; j < i; j++) {
                    System.out.print("* ");
                }
                
                System.out.println();
            
            }    }      
}