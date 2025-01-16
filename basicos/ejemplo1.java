class ejemplo1 {
    public static void main( String args[] ) {
        float miPrimeraVariable = 5.9f;
        float miSegundaVariable = 5.5f;
        float miTerceraVariable = miPrimeraVariable + miSegundaVariable;
        float miCuartaVariable = miPrimeraVariable * miSegundaVariable;
        
        System.out.println( "esta es la linea1" );
        System.out.println( miTerceraVariable );
        System.out.println( miCuartaVariable );

        int numero1 = 2;
        int numero2 = 3;
        int suma = numero1 + numero2;
        int multi = numero1 * numero2;
        System.out.println( suma );
        System.out.println( multi );


        String miPrimeraCadena = "Esta es mi primera cadena string";
        String miSegundaCadena = "y no me gusta";
        String miTerceraCadena = miPrimeraCadena + " " + miSegundaCadena;
        System.out.println( miTerceraCadena );
        
        char miPrimerChar = 'J';
        System.out.println(miPrimerChar);


        
    }

}