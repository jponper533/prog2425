package RP8;
public class RP8E1 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        
        //le pregunta al usuario un numero
        System.out.print("Escribe un numero: ");
        //Guardamos la variable
        int numerousuario = leer.nextInt();
        System.out.println("");

        int i = 1;

        int resultado = 0;
        while(i <= numerousuario){
            resultado = resultado + i; 
            i++;
        }
        System.out.println("Resultado: " + resultado);

    }
}    