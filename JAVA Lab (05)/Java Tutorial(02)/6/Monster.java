
package com.mycompany.item;



public class Monster extends Item 
{
    private int strength;

    
    public Monster(int location, String description, int strength)
    {
        super(location, description); 
        this.strength = strength;
    }

   

    int getStrength()
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void displayMonsterInfo()
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setStrength(int i)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

