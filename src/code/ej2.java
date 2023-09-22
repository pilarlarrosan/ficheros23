package code;
/*programa Java que muestre los ficheros de un directorio pasado
    al programa desde la línea de comandos.
 */

import libs.Leer;

import java.nio.file.Path;

public class ej2 {
    public static void listarDir() {
        String ruta = Leer.pedirCadena("Introduce la ruta del directorio a listar");
    }
}
