/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilerias;

import java.io.IOException;

/**
 *
 * @author Gonzalo CH
 */
public class Validacion {

    public static int validEntRango(int min, int max,String solicitud) {
        int num = 0;
        boolean error = false;

        do {
            try {
                num = LecturaPanel.leerEntero(solicitud);
                if (num >= min && num <= max) {
                    error = true;
                } else {
                    Mostrar.Mensaje("Valor fuera de rango");
                }

            } catch (NumberFormatException nfe) {
                Mostrar.Mensaje("Error...");
            }

        } while (!error);
        return num;
    }
    public static float validFloatRango(float min, float max,String solicitud) {
        float num = 0;
        boolean error = false;

        do {
            try {
                num = LecturaPanel.leerFloat(solicitud);
                if (num >= min && num <= max) {
                    error = true;
                } else {
                    Mostrar.Mensaje("Valor fuera de rango");
                }

            } catch (NumberFormatException nfe) {
                Mostrar.Mensaje("Error...");
            }

        } while (!error);
        return num;
    }
    public static byte validByteRango(int min, int max,String solicitud) {
        byte num = 0;
        boolean error = false;

        do {
            try {
                num = LecturaPanel.leerByte(solicitud);
                if (num >= min && num <= max) {
                    error = true;
                } else {
                    Mostrar.Mensaje("Valor fuera de rango");
                }

            } catch (NumberFormatException nfe) {
                Mostrar.Mensaje("Error...");
            }

        } while (!error);
        return num;
    }
    public static int validEnt(String mensaje) {
        int num = 0;
        boolean error = false;

        do {
            try {
                num = LecturaPanel.leerEntero(mensaje);
                    error = true;

            } catch (NumberFormatException nfe) {
                Mostrar.Mensaje("Error...");
            }

        } while (!error);
        return num;
    }

}
