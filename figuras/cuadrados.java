package figuras;
public class cuadrados {
        private static java.util.Scanner leer = new java.util.Scanner(System.in);

        public static void main(String[] args) {
            
            System.out.println("Dame un numero: ");
            int numero = leer.nextInt();

            for (int i = 0; i < numero; i++) {
                
                for (int j = 0; j < numero; j++) {
                    System.out.print("* ");
                }
                
                System.out.println("");
            
            }
            System.out.println("");
            
            for (int i = 0; i < numero; i++) {
                
                for (int j = 0; j < numero; j++) {
                    if ((j + i) % 2 == 0)  {
                        System.out.print("*");
                        System.out.print("");
                    } else {
                    System.out.print(" ");
                    System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            System.out.println("");

            //Cuadrado vacio
            for (int i = 0; i < numero; i++) {
                
                for (int j = 0; j < numero; j++) {
                    if (i == 0 || j == 0 || j == numero - 1 || i == numero - 1 )  {
                        System.out.print("*");
                        System.out.print(" ");
                    } else {
                    System.out.print(" ");
                    System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }

        }
}
