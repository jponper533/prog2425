package RP4;
public class RP4E7 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //pedimos los dos datos
        System.out.print("Introduce el titulo del libro: ");
        leer.nextLine();

        System.out.print("Introduce el numero de paginas: ");
        int paginas = leer.nextInt();

        // dependiendo de las paginas nos dira una frase u otra
        if (paginas > 500) {
            System.out.print("libro extenso");
        }

        else if (paginas > 300) {
            System.out.print("libro largo");
        }

        else if (paginas > 100) {
            System.out.print("libro corto");
        }
    
        else {
            System.out.print("libro breve");
        }


        leer.close();
        }
    }