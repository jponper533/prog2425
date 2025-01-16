package RP4;
public class RP4E12 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //recogemos los datos
        System.out.print("introduce las horas: ");
        int tiempo = leer.nextInt();

        System.out.print("introduce el costo: ");
        int costo = leer.nextInt();

        System.out.print("introduce la complejidad del 1 al 10: ");
        int complejidad = leer.nextInt();

        //hacemos condicionale con dos condiciones, si los datos recogen alguna de estas condiciones o las dos
        //se metera dentro de ese if
        if (costo > 5000 && complejidad > 8) {
            if (tiempo < 200) {
                System.out.print("proyecto de alto riesgo ");
            } 

            else if (tiempo >= 200 && tiempo <= 400) {
                System.out.print("proyecto riesgoso");
            }
        }

        else if (costo > 3000 && costo < 5000) {

            if (complejidad > 5) {
                System.out.print("proyecto moderado ");
            } 

            else {
                System.out.print("proyecto economico");
            }
        }
       
        else if (costo < 3000) {

            if (tiempo < 100) {
                System.out.print("proyecto ideal ");
            } 

            else if (tiempo > 100 && tiempo < 300) {
                System.out.print("proyecto asequible");
            }

            else 
                System.out.print("proyecto demasiado largo");
            }
        

        leer.close();
        }
    }