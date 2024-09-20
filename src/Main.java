/*
Menú para ejecutar los ejercicios de manejo de sistemas de ficheros
de la UD1 (Acceso a ficheros) del módulo Acceso a Datos.
 */

import menu.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        String opcion = "";
        do {
            new MenuPrincipal().mostrarMenuPrincipal();

            opcion = libs.Leer.pedirCadena("Introduce una opción");
            switch (opcion) {
                case "0" -> {
                    salir = true;
                }
                case "1" -> {
                    code.ej1.checkFiles();
                }
                case "2" -> {
                    code.ej1NIO.checkFilesNIO();
                }
                case "3" -> {
                    code.ej2.listarDir();
                }
                case "4" -> {

                }
                default -> {
                    System.out.println("Opción incorrecta");
                }
            }
        }while (!salir);
    }
}