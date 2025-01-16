class ejemplo3 {
    private static java.util.Scanner lectura = new java.util.Scanner(System.in);
    public static void main(String[] args) {

          String texto1 = "Di el primer numero: ";
        System.out.print(texto1);
        int numero1 = lectura.nextInt();

          String texto2 = "Di el segundo numero: ";
        System.out.print(texto2);
        int numero2 = lectura.nextInt();

          String texto3 = "Di el tercer numero: ";
        System.out.print(texto3);
        int numero3 = lectura.nextInt();
        
        String Resultado = "El resultado es: ";
        System.out.print(Resultado);
        int numeroSuma = numero1 + numero2 + numero3;
        System.out.println(numeroSuma);

        if (numeroSuma>10) {
            System.out.println("la suma es mayor que 10");

        }

        else if (numeroSuma<10) {
            System.out.println("la suma es menor que 10");

        }

        else {
            System.out.println("la suma es igual que 10");

        }



lectura.close();
    }
}