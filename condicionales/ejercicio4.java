class ejercicio4 {
    private static java.util.Scanner lectura = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //crea un programa q calcule el indice de masa corporal
        // IMC = peso / altura² (metros) y pesso en kilos
        // si el IMC esta por debajo de 18.5 indica IMC por debajo 
        // si el IMC esta entre de 18.5 y 24.9 indica IMC normal 
        // si el IMC esta entre de 25 y 29.9 indica sobrepeso 
        // en otro caso indica obesidad 

        System.out.print("di tu peso ");
        float peso = lectura.nextFloat();

        System.out.print("Di tu altura ");
        float altura = lectura.nextFloat();

        float imc = peso/(altura * altura);
        System.out.println("Su IMC es " + imc);

        if (imc < 18.5) {
            System.out.println("indice IMC por debajo");
        }
        
        else if (imc > 18.5 && imc < 24.9) {
            System.out.println("indice IMC normal");
        }

        else if (imc > 25 && imc <= 29.9) {
            System.out.println("sobrepeso");
        }

        else {
            System.out.println("obesidad");
        }


        System.out.println();
        lectura.close();


            }
    }