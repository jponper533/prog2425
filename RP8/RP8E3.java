package RP8;
public class RP8E3 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //le pregunta al usuario un numero
        System.out.print("Escribe primer numero: ");
        //Guardamos la variable
        int numero1 = leer.nextInt();
        System.out.println("");

        //le pregunta al usuario un numero
        System.out.print("Escribe segundo numero: ");
        //Guardamos la variable
        int numero2 = leer.nextInt();
        System.out.println("");

        // int i;
        // for (i = numero1; i <=numero2; i++){
        //     if(i%2 == 0){
        //         System.out.print(i+",");
        //     }
        // }

        int i = numero1;
        while (i<=numero2) {
            if(i%2 == 0){
                System.out.print(i + ",");
            }
            i++;
        }
    }
}