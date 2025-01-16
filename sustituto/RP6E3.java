package sustituto;
public class RP6E3 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        // Pedir un mes en numero al usuario
        System.out.print("ingresa la temperatura ambiental actual: ");
        float temperatura = leer.nextFloat();

        //hacemos una condicional para establecer el deporte
        if(temperatura >= 30){
            System.out.println("Te sugerimos realizar natacion");
          }
        else if(temperatura >= 20) {
            System.out.println("Te sugerimos realizar tenis");
          }
        else if(temperatura >= 5) {
            System.out.println("Te sugerimos realizar golf");
          }
        else {
            System.out.println("Te sugerimos realizar esqui");
            }
        }
    }