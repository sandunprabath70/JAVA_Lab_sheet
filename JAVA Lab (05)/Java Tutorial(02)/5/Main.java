
package com.mycompany.item;


public class Main
{
    public static void main(String[] args) 
    {
        
        Item item = new Item(12333, "Example  is the Item");

        
        int currentLocation = item.getLocation();
        String currentDescription = item.getDescription();

        System.out.println("Current Location: " + currentLocation);
        System.out.println("Current Description: " + currentDescription);

       
        item.setLocation(567);
        item.setDescription("Updated Item is Description");

        
        item.displayItemInfo();

        System.out.println("-----");

      
        Monster monster = new Monster(234, "Example Monster", 100);

        
        int monsterLocation = monster.getLocation();
        String monsterDescription = monster.getDescription();
        int monsterStrength = monster.getStrength();

        System.out.println("Monster is Location: " + monsterLocation);
        System.out.println("Monster is Description: " + monsterDescription);
        System.out.println("Monster is Strength: " + monsterStrength);

      
        monster.setLocation(7829);
        monster.setDescription("Updated Monster is Description");
        monster.setStrength(2020);

        
        monster.displayMonsterInfo();
    }
}

