
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manel
 */
// Class made for assigning the initial roles
public class CharacterSelect {
    
    // Name
    static String SelectionName(){
        
        String name = "Baltasar";
        Scanner scan = new Scanner(System.in);
        
        //Choose your class
        System.out.println("Hello litle wizard, welcome to the dreamspace of magic, where your soul chooses what type of magic  type of wizard, are you exited to be part of this magic world? Shure you are!");
        System.out.println("But the first part of being a wizard is abandoning your old name and coming up with your new wizard name (remember to make it cool) so go on and tell me!");
        
        name = scan.nextLine();
        
        System.out.println("Such a peculiar name that is... ");
        
        return name;
        
    }
    
    //
    static int SelectionRole(){
        int chosen = 0;
        System.out.println("So be it, now choose, what is your magic, who do you want to become, what magic path would you choose...");
        
        while (chosen < 1 || chosen > 5) {
            System.out.println("1. Religious warrior (Offsprings of lady MOON)");
            System.out.println("2. Blue Wizard (Seekers of truth)");
            System.out.println("3. Pyromantic (All must be destroyed)");
            System.out.println("4. Necromancer (Powers to be carefull with)");
            System.out.println("5. Artifactor (The merge of mechanical and magic)");
            
            chosen = scan.nextInt();
        }
        
        return chosen;
    }
}
