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

    /**
     * El método principal que sirve como punto de entrada a la aplicación.
     * 
     * @param args los argumentos de la línea de comandos. Actualmente no se utilizan.
     */
    public static void main(String[] args) {
        JFMain jfmain = new JFMain();
        jfmain.setVisible(true);
    }
}
