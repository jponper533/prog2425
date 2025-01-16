class ejemplo2 {
    private static java.util.Scanner lectura = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        String miNombre = lectura.nextLine();
        System.out.println(miNombre);

        int miEdad = lectura.nextInt();
        System.out.println(miEdad);


        lectura.close();
    }
}
