
package code;
/*
    Programa que detecta si una ruta específica existe y,
    de ser así, analiza si apunta a un fichero o un directorio
    haciendo uso de la librería java.io
 */
import java.io.File;

public class ej1 {

    public static void checkFiles(){

        File f1 = new File("src/resources/fileEj1.txt");
        File f2 = new File("src/resources/fileEj2.txt");
        File dir1 = new File("src/resources/ej1");
        File dir2 = new File("src/resources/ej2");

        checkIfExist(f1);
        checkIfExist(f2);
        checkIfExist(dir1);
        checkIfExist(dir2);

    }

    static void checkIfExist(File f){
        if (f.exists()) {
            System.out.print(f.getName() + " existe");
            if (f.isDirectory()){
                System.out.println(" y es un directorio.");
            }else{
                System.out.println(" y es un archivo.");
            }
        }else{
            System.out.println(f.getName() + " no existe");
        }
    }

}
