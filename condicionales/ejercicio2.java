class ejercicio2 {
    private static java.util.Scanner lectura = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //crea un programa que a partir de un nombre de usuario y un dominio
        //imprima una cuenta de correo electronico

        String texto1 = "di un nombre ";
        System.out.print(texto1);
        String nombre = lectura.nextLine();

          String texto2 = "Di un dominio ";
        System.out.print(texto2);
        String dominio = lectura.nextLine();
            //ahora repite el proceso anterior, es decir, pide otro nonmbre de usuario
            // y otro dominio


            System.out.print("di un nombre ");
            String nombre1 = lectura.nextLine();
    
             
            System.out.print("Di un dominio ");
            String dominio1 = lectura.nextLine();

            //si el nombre coincide entonces dice "el usuario tiene dos cuenta"
            //si los dominios coinciden entonces indica "hay dos cuentas en el mismo dominio"
            //si los nombres y los dominion coinciden entonces indica "la cuenta es la misma"
            //en otro caso no hacer nada

            if ( nombre.equals(nombre1)) {
                if (dominio.equals(dominio1)) {
                 System.out.println("la cuenta es la misma");
                }
                 else {
                 System.out.println("El el usuario tiene dos cuentas");
                    }
             }
            
             else if (dominio.equals(dominio1)) {
                System.out.println("hay dos cuentas en el mismo dominio");
            }
    
            

        System.out.println();
        lectura.close();
    }
}