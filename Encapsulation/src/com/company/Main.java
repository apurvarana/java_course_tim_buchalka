package com.company;

public class Main {

    public static void main(String[] args) {
    	//The following code (commented out) is not a good way to approach things
//	    Player player = new Player();
//	    player.name = "Tim";
//	    player.health = 50;
//	    player.weapon = "Sword";
//
//	    int damage = 80;
//	    player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
    	EnhancedPlayer player1 = new EnhancedPlayer("Tim", 50, "Sword");
		System.out.println("Initial health is " + player1.getHealth());
		EnhancedPlayer player2 = new EnhancedPlayer("Tim", 500, "Sword");
		System.out.println("Initial health is " + player2.getHealth());

    }

}
