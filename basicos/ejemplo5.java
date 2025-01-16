class ejemplo5 {
    private static java.util.Scanner lectura = new java.util.Scanner(System.in);
    public static void main(String[] args) {

          String texto1 = "Di el primer numero: ";
        System.out.print(texto1);
        int numero1 = lectura.nextInt();

          String texto2 = "Di el segundo numero: ";
        System.out.print(texto2);
        int numero2 = lectura.nextInt();

        if (numero1>numero2) {
            System.out.println("El mayor es " + numero1);
        }
        
        else if (numero1==numero2) {
            System.out.println("Los numeros son iguales");
        }

        else {
            System.out.println("El mayor es " + numero2);
        }




lectura.close();
    }
}
