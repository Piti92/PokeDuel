/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeduel;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nieznosnybahor
 */
public class PokeDuel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Database.createDB();
        Game.start();
        Game.showResults();

    }

}
