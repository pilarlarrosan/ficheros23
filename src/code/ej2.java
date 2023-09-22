package code;
/*programa Java que muestre los ficheros de un directorio pasado
    al programa desde la línea de comandos.
 */

import libs.Leer;

import java.io.File;

public class ej2 {
    public static void listarDir() {
        //solicitamos el directorio a consultar
        String ruta = Leer.pedirCadena("Introduce la ruta del directorio a listar");

        //creamos el objeto File para manejarlo
        File dir = new File(ruta);
        //comprobamos que la ruta exista y que sea un directorio que se pueda listar
        if (dir.exists()) {
            if (dir.isDirectory()) {
                //creamos un array de files para meter el contenido de dir
                File[] contenido = dir.listFiles();
                for (File f : contenido)
                    System.out.println(f.getName());
            } else {
                System.out.println("La ruta indicada no es un directorio");
            }
        }else{
            System.out.println("La ruta indicada no existe");
        }
    }
}
