package OOPSGithubRepo;

public class Item 
{
    protected int location;
    protected String description;

    public Item(int location, String description)
    {
        this.location=location;
        this.description=description;
    }

    public void setLocation(int loc)
    {
        this.location=loc;
    }
    public int getLocation()
    {
        return location;
    }

    public void setDescription(String descp)
    {
        this.description=descp;
    }
    public String getDescription()
    {
        return description;
    }
    
}
