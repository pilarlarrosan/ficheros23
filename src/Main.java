/*
Menú para ejecutar los ejercicios de manejo de sistemas de ficheros
de la UD1 (Acceso a ficheros) del módulo Acceso a Datos.
 */

public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        String opcion = "";
        do {
            System.out.println("0. Salir");
            System.out.println("1. Ejercicio1 ficheros");
            System.out.println("2. Ejercicio1 ficheros NIO");
            System.out.println("3. Ejercicio2 ficheros");
            System.out.println("4. Ejercicio2 ficheros NIO");

            opcion = libs.Leer.pedirCadena("Introduce una opción");
            switch (opcion) {
                case "0" -> {
                    salir = true;
                }
                case "1" -> {
                    code.ej1.checkFiles();
                }
                case "2" -> {
                    libs.Leer.clearScreen();
                    code.ej1NIO.checkFilesNIO();
                }
                case "3" -> {
                    code.ej2.listarDir();
                }
                case "4" -> {

                }
                default -> {
                    libs.Leer.clearScreen();
                    System.out.println("Opción incorrecta");
                }
            }
        }while (!salir);
    }
}