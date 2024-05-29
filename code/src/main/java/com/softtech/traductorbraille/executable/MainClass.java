package com.softtech.traductorbraille.executable;

import com.softtech.traductorbraille.GUI.JFMain;

/**
 * La clase principal que inicia la aplicación.
 * 
 * <p>
 * Esta clase contiene el método {@code main} que inicia la interfaz gráfica del traductor Braille.
 * </p>
 * 
 * @author Isma2
 */
public class MainClass {

    //ESTA ES UNA SECUENCIA DE PRUEBAS
    //PRUEBA PUSH #1
    /**
     * El método principal que sirve como punto de entrada a la aplicación.
     * Prueba de CI #2
     * Prueba de CI #3
     * Prueba de CI #4
     * Prueba de CI #5
     * Este es un cambio grande dentro del contexto de toda la construcción
     * Este es el cambio penultimo para comprobar el pipeline
     * @param args los argumentos de la línea de comandos. Actualmente no se utilizan.
     */
    public static void main(String[] args) {
        JFMain jfmain = new JFMain();
        jfmain.setVisible(true);
        System.out.println("Hola como te va");
        System.out.println("Traductor de braille");
    }
}
