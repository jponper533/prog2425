class ejercicio3 {
    private static java.util.Scanner lectura = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        // crea un programa que reciba un numero entero por teclado
        // indica si el numero es par o impar y ademas si es multiplo de 5
        //debes imprimir un mensaje en cualquier caso
        //para calcular el resto de una division:
        //7 % 5 = 2
        System.out.print("di un numero ");
            int numero1 = lectura.nextInt();

            if (numero1 % 2 == 0) {
                System.out.println("es par");
            }
                else {
                    System.out.println("Es impar");
                     
                }
        

             if (numero1 % 5 == 0) {
                System.out.println("multiplo de 5");
            }
            
            else {
                System.out.println("no es multiplo de 5");
            }

            



        System.out.println();
        lectura.close();
    }
}
