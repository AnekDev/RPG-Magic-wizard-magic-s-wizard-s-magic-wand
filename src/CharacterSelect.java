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
        Scanner scan = new Scanner(System.in);
        int chosen = 0;
        String shure = "n";
        System.out.println("So be it, now choose, what is your magic, who do you want to become, what magic path would you choose...");
        
        while (chosen < 1 || chosen > 3) {
            System.out.println("1. Religious warrior");
            System.out.println("2. Necromancer");
            System.out.println("3. Pyromantic");
            
            chosen = scan.nextInt();
            if(chosen < 3 && chosen > 1){
                System.out.println("Are you SHURE? y/n");
                scan.nextLine();
                shure = scan.nextLine();
                if(shure.equals("y") || shure.equals("Y")){
                    System.out.println("Then so be it.");
                }else{
                    chosen = 0;
                }
                
            }
            
        }
        
        return chosen;
    }
}
