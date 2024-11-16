/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author manel
 */
import playerClasses.Necromancer;
import playerClasses.Religious;
import playerClasses.Pyromantic;
import java.util.*;

public class RPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definition of variables
        Scanner scan = new Scanner(System.in);
        String name = "Baltasar";
        int chosen = 0;

        name = CharacterSelect.SelectionName();
        chosen = CharacterSelect.SelectionRole();

        switch (chosen) {
            case 1:
                Religious thunder = new Religious();
                System.out.println("Welcome so, to the CLERO you are oficially what we call a thunder, the lowest of all the levels");
                break;
            case 2:
                Necromancer bone = new Necromancer();
                System.out.println("Welcome so, to the CLERO you are oficially what we call a thunder, the lowest of all the levels");
                break;
            case 3:
                Pyromantic spark = new Pyromantic();
                System.out.println("Welcome so, to the CLERO you are oficially what we call a thunder, the lowest of all the levels");
                break;
        }

    }
}
