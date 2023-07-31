
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

    

    int getLocation()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    String getDescription() 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setLocation(int i) 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setDescription(String updated_Item_Description) 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void displayItemInfo()
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

