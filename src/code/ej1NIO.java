
/*
    Programa que detecta si una ruta específica existe y,
    de ser así, analiza si apunta a un fichero o un directorio
    haciendo uso de la librería java.nio
 */

package code;

import java.nio.file.Files;
import java.nio.file.Path;

public class ej1NIO {
    public static void checkFilesNIO(){
        Path p1 = Path.of("src/resources/fileEj1.txt");
        Path p2 = Path.of("src/resources/fileEj2.txt");
        Path p3 = Path.of("src/resources/ej1");
        Path p4 = Path.of("src/resources/ej2");

        checkIfExist(p1);
        checkIfExist(p2);
        checkIfExist(p3);
        checkIfExist(p4);

    }
    static void checkIfExist(Path p){
        if (Files.exists(p)) {
            System.out.print(p.getFileName() + " existe");
            if (Files.isDirectory(p)){
                System.out.println(" y es un directorio.");
            }else{
                System.out.println(" y es un archivo.");
            }
        }else{
            System.out.println(p.getFileName() + " no existe");
        }
    }
}
