
package com.mycompany.item;



public class Monster extends Item
{
    private int strength;

    
    public Monster(int location, String description, int strength)
    {
        super(location, description); 
        this.strength = strength;
    }

    
    public int getStrength() 
    {
        return strength;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }

   
    public void displayMonsterInfo()
    {
        System.out.println("Monster Info:");
        displayItemInfo(); 
        System.out.println("Strength: " + strength);
    }
}
