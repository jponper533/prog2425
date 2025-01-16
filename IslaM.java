public class IslaM {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\r\n" + //
                    "                        _                                  _         _     _       \r\n" + //
                    "                       | |                                | |       (_)   | |      \r\n" + //
                    "   __ ___   _____ _ __ | |_ _   _ _ __ __ _    ___ _ __   | | __ _   _ ___| | __ _ \r\n" + //
                    "  / _` \\ \\ / / _ \\ '_ \\| __| | | | '__/ _` |  / _ \\ '_ \\  | |/ _` | | / __| |/ _` |\r\n" + //
                    " | (_| |\\ V /  __/ | | | |_| |_| | | | (_| | |  __/ | | | | | (_| | | \\__ \\ | (_| |\r\n" + //
                    "  \\__,_| \\_/ \\___|_| |_|\\__|\\__,_|_|  \\__,_|  \\___|_| |_| |_|\\__,_| |_|___/_|\\__,_|\r\n" + //
                    "                                                                                   \r\n" + //
                    "                                                                                   \r\n" + //
                    "");

            System.out.println("1. comenzar el juego");
            System.out.println("2. salir");
            int eleccionmenu = leer.nextInt();

            if (eleccionmenu == 2) {
                System.out.println("Saliendo del juego");
                System.exit(1);
            }

            switch (eleccionmenu) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    // hacemos la primera situacion
                    int eleccion1;

                    do {
                        System.out.println(
                                "Situacion 1. Te despiertas en la playa y no sabes donde estas, elige uno de estos numeros para pasar de situacion");
                        System.out.println("");
                        System.out.println("1.  Explorar la selva (encuentras recursos, pero es muy peligroso)");
                        System.out.println("2.  Caminar por la costa (encuentras recursos, pero es mas seguro)");
                        System.out.println(
                                "3.  Intentar hacer una barca (Super seguro, pero no garantiza supervivencia)");
                        System.out.println("");
                        System.out.print("tu eleccion es:");
                        eleccion1 = leer.nextInt();

                        if (eleccion1 < 1 || eleccion1 > 3) {
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("elige una opcion valida (1) (2) (3)");
                        }
                    } while (eleccion1 < 1 || eleccion1 > 3);

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    if (eleccion1 == 1) {
                        System.out.println(
                                "Encuentras comida y materiales utiles, pero te encuentras con un animal salvaje que acaba matandote. Mueres");
                    }

                    else if (eleccion1 == 2) {

                        // hacemos la segunda situacion
                        int eleccion2;
                        do {
                            System.out.println(
                                    "situacion 2. Encuentras comida de un cocotero y palos sueltos que logras hacerlos herramientas junto a las hojas que usas como nudos");
                            System.out.println("");
                            System.out.println("Tienes nuevas elecciones a seguir: ");
                            System.out.println(
                                    "1. Con las herramientas y comida conseguidas, decides ir a la selva a talar madera ");
                            System.out.println(
                                    "2. Decides pasar la noche donde estas y hacerte una tienda de campaña provicional");
                            System.out.println(
                                    "3. Crees que seria buena idea conseguir mas comida para futuros dias en la isla");

                            System.out.println("");

                            System.out.print("tu eleccion es:");
                            eleccion2 = leer.nextInt();

                            if (eleccion2 < 1 || eleccion2 > 3) {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                System.out.println("elige una opcion valida (1) (2) (3)");
                            }
                        } while (eleccion2 < 1 || eleccion2 > 3);

                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        if (eleccion2 == 1) {

                            // hacemos la tercera situacion
                            int eleccion3;
                            do {
                                System.out.println(
                                        "situacion 3. Al entrar a la selva, notas que algo te asecha, ves que es un tigre y corres de el hasta entrar en una cueva. El tigre te pierde de vista");
                                System.out.println("");
                                System.out.println("Tienes nuevas elecciones a seguir: ");
                                System.out.println("1. Sigues hacia dentro de la cueva ");
                                System.out.println(
                                        "2. Decides salir de la cueva e ir a la zona donde estabas antes en la playa y dejar la madera conseguida ahi");
                                System.out.println(
                                        "3. Decides hacer fuego un poco mas adentro de la cueva para que el tigre no lo vea");

                                System.out.println("");

                                System.out.print("tu eleccion es:");
                                eleccion3 = leer.nextInt();

                                if (eleccion3 < 1 || eleccion3 > 3) {
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    System.out.println("elige una opcion valida (1) (2) (3)");
                                }
                            } while (eleccion3 < 1 || eleccion3 > 3);

                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            if (eleccion3 == 1) {
                                System.out.println(
                                        "Acabas adentrandote dentro de la cueva, pero sin visibilidad alguna caes por un precipicio y acabas muriendo empalado por unos pinchos rocosos");
                            }

                            else if (eleccion3 == 2) {
                                System.out.println(
                                        "Esperas 5 minutos antes de salir de la cueva. Pero el tigre tambien sabe esperar, te ve saliendo de la cueva y decide atacarte hasta matarte. Te conviertes en su cena");
                            }

                            else {

                                // hacemos la cuarta situacion
                                int eleccion4;
                                do {
                                    System.out.println(
                                            "situacion 4. Al hacer fuego un poco mas adentro de la cueva el tigre no te ve, calientas comida (la cual acabas comiendo) y haces una antorcha al ser de noche para poder ver.");
                                    System.out.println("");
                                    System.out.println("Tienes nuevas elecciones a seguir: ");
                                    System.out.println(
                                            "1. Te adentras a la cueva con la antorcha, ves todo a tu alrededor");
                                    System.out.println(
                                            "2. Ves que afuera esta lloviendo, pero puedes ir con la antorcha para que ilumine el camino, debido a que los grandes arboles impiden que caigan suficientes gotas para apagarla");
                                    System.out.println("3. decides pasar la noche en la cueva");

                                    System.out.println("");

                                    System.out.print("tu eleccion es:");
                                    eleccion4 = leer.nextInt();

                                    if (eleccion4 < 1 || eleccion4 > 3) {
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        System.out.println("elige una opcion valida (1) (2) (3)");
                                    }
                                } while (eleccion4 < 1 || eleccion4 > 3);

                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                if (eleccion4 == 1) {
                                    // hacemos la quinta situacion

                                    int eleccion5;
                                    do {
                                        System.out.println(
                                                "situacion 5. Al adentrarte en la cueva ves un precipicio, ves que hay una pasarela al borde del precipicio");
                                        System.out.println("");
                                        System.out.println("Tienes nuevas elecciones a seguir: ");
                                        System.out.println(
                                                "1. Volver hacia atras, recorriendo de nuevo todo lo que ya hiciste");
                                        System.out.println("2. Pasas por la pasarela al lado del precipicio");
                                        System.out.println(
                                                "3. decides mirar el fondo del precipicio por si pudieras bajar");

                                        System.out.println("");

                                        System.out.print("tu eleccion es:");
                                        eleccion5 = leer.nextInt();

                                        if (eleccion5 < 1 || eleccion5 > 3) {
                                            System.out.print("\033[H\033[2J");
                                            System.out.flush();
                                            System.out.println("elige una opcion valida (1) (2) (3)");
                                        }
                                    } while (eleccion5 < 1 || eleccion5 > 3);

                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();

                                    if (eleccion5 == 1) {
                                        System.out.println(
                                                "Al volver hacia atras se acaba la potencia de la antorcha debido a todo lo recorrido. No acabas encontrando la salida y mueres.");
                                    }

                                    else if (eleccion5 == 2) {
                                        System.out.println(
                                                "Al pasar la pasarela sales de la cueva, ves que estaba conectada al otro lado de la isla");
                                        System.out.println(
                                                "Al explorar un poco mas adelante ves a unos pescadores que te acaban viendo y resatando de ese lugar");
                                        System.out.println("");
                                        System.out.println("Enhorabuena, pasaste el juego");
                                    }

                                    else {
                                        System.out.println(
                                                "Al mirar al fondo ves que hay pinchos, rompes el borde del precipicio y caes hacia ellos. Mueres");
                                    }
                                }

                                else if (eleccion4 == 2) {
                                    System.out.println(
                                            "al mojarte, desprendes mas olor junto al fuego de la antorcha, el tigre estaba rondando por ahi y llega a verte. Te mata");
                                }

                                else {
                                    System.out.println(
                                            "pasas la noche en la cueva, la hoguera se apaga. Tras apagarse deja olor a las cenizas de la madera. El tigre las huele y no vuelves a despertarte.");
                                }
                            }
                        }

                        else if (eleccion2 == 2) {
                            System.out.println(
                                    "Al hacer tu refugio acabas dañandote la mano con una piedra afilada que usabas para romper cuerdas, al no saber de primeros auxilios mueres desangrado");
                        }

                        else {
                            System.out.println(
                                    "Consigues la comida, pero no logras refugiarte en ningun sitio, una fuerte tormenta acaba llevandose tu comida y mueres de hipotermia");
                        }
                    }

                    else {
                        System.out.println(
                                "intentas hacer una barca, pero no consigues ni comida, ni materiales por la zona en la que estabas. Mueres");
                    }

            }
        }
    }
}
