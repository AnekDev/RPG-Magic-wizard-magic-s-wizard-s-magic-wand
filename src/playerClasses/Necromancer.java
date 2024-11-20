package playerClasses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manel
 */
public class Necromancer {
    /*
        GAME RULES:
        The combat starts with the player at full hp,
        Each invocation costs a number of souls, and when one dies you get the souls back, 
        You start with 2 souls 
    
        Player actions:
            1. A weak atack made for quick slashes
            2. Heal you character a bit
            3. Empower your invocations (first empower is 2x hp, second is 2x damage, third is 2x magic)
            4. Invoce a undead using souls
    
        Invocations:
        The minions obey the actions of the necromancer, there are 4 possible movements for each invocation, they are:
            1. Attack the chossen enemy
            2. Defend the player
            3. Use singular magic power of the invocation
            4. Skip the turn
    */
    
    // the way a necromancer works is so it loses when he ends up with no hp, they tend to be 
    int hp; 
    int souls;
    int atack;
    int defense;
    
    
    public Necromancer(){
	this.hp = 40;
	this.souls = 2;
        
    }
}




