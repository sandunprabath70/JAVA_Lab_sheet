

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
       
        Item item = new Item(1452398, "Example one of the Item");

        
        int currentLocation = item.getLocation();
        String currentDescription = item.getDescription();

        System.out.println("Current of Location: " + currentLocation);
        System.out.println("Current of  Description: " + currentDescription);

        
        item.setLocation(456786);
        item.setDescription("Updated Item is Description");

        
        item.displayItemInfo();
    }
}

