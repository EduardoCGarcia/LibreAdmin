/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilerias;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 *
 *
 * int base, altura, dos; float área; short s = Short.parseShort("23"); byte b =
 * Byte.parseByte("23");
 *
 * @author Gonzalo CH
 */
public class Lectura {

    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader t = new BufferedReader(isr);

    //Validacion y lectura en consola de un numero entero (la validacion solo acepta formatos numericos)
    public static int leerEntero(String mensaje) throws IOException {
        int dato = 0;
        boolean error = false;

        do {
            try {
                System.out.println(mensaje);
                dato = Integer.parseInt(t.readLine());
                error = true;

            } catch (NumberFormatException nfe) {
                System.out.println("Error...");
            }

        } while (!error);
        return dato;
    }

    //Validacion y lectura en consola de un numero float (la validacion solo acepta formatos numericos)
    public static float leerFloat(String mensaje) throws IOException {
        float dato = 0;
        boolean error = false;

        do {
            try {
                System.out.println(mensaje);
                dato = Float.parseFloat(t.readLine());
                error = true;

            } catch (NumberFormatException nfe) {
                System.out.println("Error...");
            }

        } while (!error);
        return dato;
    }

    //Validacion y lectura en consola de un numero double (la validacion solo acepta formatos numericos)
    public static double leerDouble(String mensaje) throws IOException {
        double dato = 0;
        boolean error = false;

        do {
            try {
                System.out.println(mensaje);
                dato = Double.parseDouble(t.readLine());
                error = true;

            } catch (NumberFormatException nfe) {
                System.out.println("Error...");
            }

        } while (!error);
        return dato;
    }

    //Lectura de una cadena usando Bufferedreader
    public static String leerString(String mensaje) throws IOException {
        System.out.println(mensaje);
        String dato = t.readLine();
        return dato;
    }

    //Validacion y lectura en consola de un numero byte (la validacion solo acepta formatos numericos)
    public static byte leerByte(String mensaje) throws IOException {
        byte dato = 0;
        boolean error = false;

        do {
            try {
                System.out.println(mensaje);
                dato = Byte.parseByte(t.readLine());
                error = true;

            } catch (NumberFormatException nfe) {
                System.out.println("Error...");
            }

        } while (!error);
        return dato;
    }

    //Validacion y lectura en consola de un numero entero dentro de un rango (menor,mayor,mensaje de solicitud) (la validacion solo acepta formatos numericos)
    public static int leerEntero(int min, int max, String solicitud) throws IOException {
        int dato = 0;
        boolean error = false;

        do {
            try {
                System.out.println(solicitud);
                dato = Integer.parseInt(t.readLine());
                if (dato >= min && dato <= max) {
                    error = true;
                } else {
                    System.out.println("Valor fuera de rango");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Error...");
            }

        } while (!error);
        return dato;
    }

    //Validacion y lectura en consola de un numero Float dentro de un rango (menor,mayor,mensaje de solicitud) (la validacion solo acepta formatos numericos)
    public static float leerFloat(int min, int max, String solicitud) throws IOException {
        float dato = 0;
        boolean error = false;

        do {
            try {
                System.out.println(solicitud);
                dato = Float.parseFloat(t.readLine());
                if (dato >= min && dato <= max) {
                    error = true;
                } else {
                    System.out.println("Valor fuera de rango");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Error...");
            }

        } while (!error);
        return dato;
    }

    //Validacion y lectura en consola de un numero Double dentro de un rango (menor,mayor,mensaje de solicitud) (la validacion solo acepta formatos numericos)
    public static double leerDouble(int min, int max, String solicitud) throws IOException {
        double dato = 0;
        boolean error = false;

        do {
            try {
                System.out.println(solicitud);
                dato = Double.parseDouble(t.readLine());
                if (dato >= min && dato <= max) {
                    error = true;
                } else {
                    System.out.println("Valor fuera de rango");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Error...");
            }

        } while (!error);
        return dato;
    }

    //Validacion y lectura en consola de un numero Byte dentro de un rango (menor,mayor,mensaje de solicitud) (la validacion solo acepta formatos numericos)
    public static byte leerByte(int min, int max, String solicitud) throws IOException {
        byte dato = 0;
        boolean error = false;

        do {
            try {
                System.out.println(solicitud);
                dato = Byte.parseByte(t.readLine());
                if (dato >= min && dato <= max) {
                    error = true;
                } else {
                    System.out.println("Valor fuera de rango");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Error...");
            }

        } while (!error);
        return dato;
    }
}
