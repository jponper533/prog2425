class ejemplo4 {
    private static java.util.Scanner lectura = new java.util.Scanner(System.in);
    public static void main(String[] args) {

          String texto1 = "Di tu nombre: ";
        System.out.print(texto1);
        String nombre = lectura.nextLine();

          String texto2 = "Di tu primer apellido: ";
        System.out.print(texto2);
        String apellido1 = lectura.nextLine();

          String texto3 = "Di tu tercer apellido: ";
        System.out.print(texto3);
        String apellido2 = lectura.nextLine();
        
          String Resultado = "Tu nombre es: ";
        System.out.print(Resultado);
        String nombreC = nombre + " " + apellido1 + " " + apellido2;
        System.out.println(nombreC);





        
        lectura.close();
    }
}