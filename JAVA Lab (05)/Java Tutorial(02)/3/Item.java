

package com.mycompany.item;


public class Item
{
    protected int location;
    private String description;

    
    public Item(int location, String description)
    {
        this.location = location;
        this.description = description;
    }

    public int getLocation()
    {
        return location;
    }

    public void setLocation(int location)
    {
        this.location = location;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    
    public void displayItemInfo()
    {
        System.out.println("Location: " + location);
        System.out.println("Description: " + description);
    }

    public static void main(String[] args) 
    {
      
        Item item = new Item(126783, "Example of the Item");

        
        item.displayItemInfo();
    }
}
