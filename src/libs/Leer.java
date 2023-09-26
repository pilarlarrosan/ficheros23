package libs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.PatternSyntaxException;

public class Leer {
    /**
     * Método para imprimir mensaje que se repite
     */
    static public void mostrarEnPantalla(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @return dato - cadena introducida por teclado
     */
    static public String pedirCadena(final String texto) {
        String dato = "";
        boolean error = true;
        try(BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in))) {

            while (error) {
                try {
                    dato = "";
                    mostrarEnPantalla(texto);
                    dato = dataIn.readLine();
                    error = false;
                } catch (IOException e) {
                    mostrarEnPantalla("Vuelve a introducir el dato, por favor. ");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dato;
    }

    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @param regex - expresi�n regular a aplicar. Si es null no aplica ninguna
     * @return dato - cadena introducida por teclado
     */
    static public String pedirCadena(final String texto, String regex) {
        String dato = "";
        boolean error = true;
        while (error) {
            try (BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in))){
                dato = "";
                mostrarEnPantalla(texto);
                dato = dataIn.readLine();
                if (regex == null) {
                    error = false;
                } else {
                    error = !dato.matches(regex);
                    if (error) {
                        mostrarEnPantalla("Por favor, vuelve a introducir el dato, no es un valor posible. ");
                    }
                }
            } catch (IOException e) {
                mostrarEnPantalla("Vuelve a introducir el dato, por favor. ");
                error = true;
            } catch (PatternSyntaxException e) {
                mostrarEnPantalla("La expresi�n regular no es correcta.");
                System.exit(0);
            }
        }
        return dato;
    }

    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @return dato - Entero tecleado
     */
    static public int pedirEntero(final String texto) {
        int dato = 0;
        boolean error = true;
        while (error) {
            try (BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in))){
                mostrarEnPantalla(texto);
                dato = Integer.parseInt(dataIn.readLine());
                error = false;
            } catch (IOException e) {
                mostrarEnPantalla("Vuelve a introducir el dato, por favor.");
            } catch (NumberFormatException e) {
                mostrarEnPantalla("El dato introducido no es entero.");
            }
        }
        return dato;
    }

    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @param regex - expresi�n regular a aplicar. Si es null se aplica un entero gen�rico
     * @return dato - Entero tecleado
     */
    static public Integer pedirEntero(final String texto, String regex) {
        Integer dato = null;
        boolean error = true;
        String datoT = "";
        if (regex == null) {
            regex = "^-?\\d+$";
        }
        while (error) {
            try (BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in))){
                datoT = "";
                mostrarEnPantalla(texto);
                datoT = dataIn.readLine();
                dato = Integer.parseInt(datoT);
                if (datoT.matches(regex)) {
                    error = false;
                } else {
                    mostrarEnPantalla("Por favor, vuelve a introducir el dato, no es un valor posible. ");
                }
            } catch (IOException e) {
                mostrarEnPantalla("Vuelve a introducir el dato, por favor. ");
            } catch (NumberFormatException e) {
                mostrarEnPantalla("El dato introducido no es entero.");
            } catch (PatternSyntaxException e) {
                mostrarEnPantalla("La expresi�n regular no es correcta.");
                System.exit(0);
            }
        }
        return dato;
    }

    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @return dato - Double tecleado
     */
    static public double pedirDouble(final String texto) {
        double dato = 0;
        boolean error = true;
        while (error) {
            try(BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in))) {
                mostrarEnPantalla(texto);
                dato = Double.parseDouble(dataIn.readLine());
                error = false;
            } catch (IOException e) {
                mostrarEnPantalla("Vuelve a introducir el dato, por favor. ");
            } catch (NumberFormatException e) {
                mostrarEnPantalla("El dato introducido no es decimal.");
            }
        }
        return dato;
    }

    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @param regex - expresi�n regular a aplicar. Si es null se aplica un double gen�rico
     * @return dato - Double tecleado
     */
    static public Double pedirDouble(final String texto, String regex) {
        Double dato = null;
        boolean error = true;
        String datoT = "";
        if (regex == null) {
            regex = "^-?\\d+([.]\\d*)?$";
        }
        while (error) {
            try (BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in))) {
                datoT = "";
                mostrarEnPantalla(texto);
                datoT = dataIn.readLine();
                dato = Double.parseDouble(datoT);
                if (datoT.matches(regex)) {
                    error = false;
                } else {
                    mostrarEnPantalla("Por favor, vuelve a introducir el dato, no es un valor posible. ");
                }
            } catch (IOException e) {
                mostrarEnPantalla("Vuelve a introducir el dato, por favor. ");
            } catch (NumberFormatException e) {
                mostrarEnPantalla("El dato introducido no es decimal.");
            } catch (PatternSyntaxException e) {
                mostrarEnPantalla("La expresi�n regular no es correcta.");
                System.exit(0);
            }
        }
        return dato;
    }

    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @return dato - Float tecleado
     */
    static public float pedirFloat(final String texto) {
        float dato = 0;
        boolean error = true;
        while (error) {
            try (BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in))){
                mostrarEnPantalla(texto);
                dato = Float.parseFloat(dataIn.readLine());
                error = false;
            } catch (IOException e) {
                mostrarEnPantalla("Vuelve a introducir el dato, por favor. ");
            } catch (NumberFormatException e) {
                mostrarEnPantalla("El dato introducido no es decimal.");
            }
        }
        return dato;
    }

    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @param regex - expresi�n regular a aplicar. Si es null se aplica un float gen�rico
     * @return dato - Float tecleado
     */
    static public Float pedirFloat(final String texto, String regex) {
        Float dato = null;
        boolean error = true;
        String datoT = "";
        if (regex == null) {
            regex = "^-?\\d+([.]\\d*)?$";
        }
        while (error) {
            try (BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in))){
                datoT = "";
                mostrarEnPantalla(texto);
                datoT = dataIn.readLine();
                dato = Float.parseFloat(datoT);
                if (datoT.matches(regex)) {
                    error = false;
                } else {
                    mostrarEnPantalla("Por favor, vuelve a introducir el dato, no es un valor posible. ");
                }
            } catch (IOException e) {
                mostrarEnPantalla("Vuelve a introducir el dato, por favor. ");
                error = true;
            } catch (NumberFormatException e) {
                mostrarEnPantalla("El dato introducido no es decimal.");
                error = true;
            } catch (PatternSyntaxException e) {
                mostrarEnPantalla("La expresi�n regular no es correcta.");
                System.exit(0);
            }
        }
        return dato;
    }
}
