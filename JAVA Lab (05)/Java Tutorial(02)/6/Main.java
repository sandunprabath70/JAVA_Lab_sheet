
package com.mycompany.item;


public class Main {
    public static void main(String[] args) {
        
        Item item = new Item(123, "Example Item");

       
        int currentLocation = item.getLocation();
        String currentDescription = item.getDescription();

        System.out.println("Current Location: " + currentLocation);
        System.out.println("Current Description: " + currentDescription);

        
        item.setLocation(567);
        item.setDescription("Updated Item Description");

        
        item.displayItemInfo();

        System.out.println("-----");

        
        Monster monster = new Monster(234, "Example Monster", 100);

       
        int monsterLocation = monster.getLocation();
        String monsterDescription = monster.getDescription();
        int monsterStrength = monster.getStrength();

        System.out.println("Monster Location: " + monsterLocation);
        System.out.println("Monster Description: " + monsterDescription);
        System.out.println("Monster Strength: " + monsterStrength);

       
        monster.setLocation(789);
        monster.setDescription("Updated Monster Description");
        monster.setStrength(200);

        
        monster.displayMonsterInfo();
    }
}

