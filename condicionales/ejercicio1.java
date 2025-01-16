    class ejercicio1 {
            private static java.util.Scanner lectura = new java.util.Scanner(System.in);
            public static void main(String[] args) {
        
                  String texto1 = "Dime una pañabra. . . ";
                System.out.print(texto1);
                String palabra = lectura.nextLine();
        
        
                if (palabra.equals("hola")) {
                    System.out.println("adios");
                }

                else {
                    System.out.println("no entiendo");
                }
        
        System.out.println();
        
        
        lectura.close();
            }
        }
