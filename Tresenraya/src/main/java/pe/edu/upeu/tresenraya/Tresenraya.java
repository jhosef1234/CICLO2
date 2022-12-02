/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pe.edu.upeu.tresenraya;

import pe.edu.upeu.tresenraya.gui.ControllerGame;
import pe.edu.upeu.tresenraya.gui.Inicio;
import pe.edu.upeu.tresenraya.gui.ModelGame;

/**
 *
 * @author USUARIO
 */
public class Tresenraya {

    public static void main(String[] args) {
        ModelGame model = new ModelGame();
        Inicio view = new Inicio();
        ControllerGame controlador = new ControllerGame(view, model);
        view.setLocationRelativeTo(null);
        view.setVisible(true);

    }
}
