//si
//si2

import java.util.Scanner;

public class huellaDeCarbono {
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        final double carbon = 0.9;
        final double gas = 0.4;
        final double energiaRenovable = 0.0;
        final double gasolina = 2.31;
        final double diesel = 2.68;
        double combustibleTotal = 0;
        double electricidadTotal = 0;
        boolean prueba = true;
        int tipoElectricidad = 0;
        int tipoCombustible = 0;
        double electricidad = 0;
        double combustible = 0;

        System.out.println("¿Cuanta electricidad en kWh consumes al mes?");
        electricidad = leer.nextDouble();

        while (prueba) {
            System.out.println();
            System.out.println("¿Que tipo de electricidad usas?");
            System.out.println("1. Carbon");
            System.out.println("2. Gas natural");
            System.out.println("3. Energia Renovable");
            tipoElectricidad = leer.nextInt();

            if (tipoElectricidad == 1 || tipoElectricidad == 2 || tipoElectricidad == 3) {
                prueba = false;
            }

            if (tipoElectricidad != 1 || tipoElectricidad != 2 || tipoElectricidad != 3) {
                System.out.println("Elije un valor correcto");
            }
        }
        switch (tipoElectricidad) {
            case 1:
                System.out.println();
                System.out.println("Tu huella de carbono por electricidad es:");
                electricidadTotal = electricidad * carbon;
                System.out.println(electricidadTotal + " kg CO2/kWh");
                break;

            case 2:
                System.out.println();
                System.out.println("Tu huella de carbono por electricidad es:");
                electricidadTotal = electricidad * gas;
                System.out.println(electricidadTotal + " kg CO2/kWh");
                break;

            case 3:
                System.out.println();
                System.out.println("Tu huella de carbono por electricidad es:");
                electricidadTotal = electricidad * energiaRenovable;
                System.out.println(electricidadTotal + " kg CO2/kWh");
                break;

            default:
                System.out.println();
                System.out.println("Seleccione un numero valido");
                break;
        }

        System.out.println();
        System.out.println("¿Cuanto consumo de combustible en litros haces al mes?");
        combustible = leer.nextDouble();
        prueba = true;

        while (prueba) {

            System.out.println();
            System.out.println("¿Que tipo de combustible usas?");
            System.out.println("1. Gasolina");
            System.out.println("2. Diesel");
            tipoCombustible = leer.nextInt();

            if (tipoCombustible == 1 || tipoCombustible == 2) {
                prueba = false;
            }

            if (tipoElectricidad != 1 || tipoElectricidad != 2 || tipoElectricidad != 3) {
                System.out.println("Elije un valor correcto");
            }
        }
        switch (tipoCombustible) {
            case 1:
                System.out.println();
                System.out.println("Tu huella de carbono por combustible es:");
                combustibleTotal = combustible * gasolina;
                System.out.println(combustibleTotal + " kg CO2/litro");
                break;

            case 2:
                System.out.println();
                System.out.println("Tu huella de carbono por combustible es:");
                combustibleTotal = combustible * diesel;
                System.out.println(combustibleTotal + " kg CO2/litro");
                break;

            default:
                System.out.println("Seleccione un numero valido");
                break;
        }

        double total = combustibleTotal + electricidadTotal;
        System.out.println();
        System.out.println("Tu huella de carbono es de: " + total + " kg/CO2");
        leer.close();
    }
}
