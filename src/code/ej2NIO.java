package code;

import libs.Leer;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

/*programa Java que muestre los ficheros de un directorio pasado
    al programa desde la línea de comandos con java.NIO.
 */
public class ej2NIO {

    public static void listDirNIO(){

        //solicitamos el directorio a consultar
        String ruta = Leer.pedirCadena("Introduce la ruta del directorio a listar");
        //creamos nuestra variable Path para usar NIO
        Path dir = Path.of(ruta);
        //comprobamos que la ruta exista y que sea un directorio
        if (Files.exists(dir)){
            if (Files.isDirectory(dir)){
                //recorremos las rutas dentro del directorio
                try (DirectoryStream<Path> contenido = Files.newDirectoryStream(dir)) {
                    for (Path p : contenido) {
                        System.out.println(p.getFileName());
                    }
                //aseguramos que se capturan todas las posibles excepciones que no se han gestionado
                }catch (SecurityException e){
                    System.out.println("No tiene permiso de lectura de este directorio.");
                }catch (IOException e) {
                    System.out.println("No se ha podido leer el directorio.");
                }
            }else{
                System.out.println("La ruta no corresponde a un directorio.");
            }
        }
        System.out.println("La ruta no existe.");

    }

}
