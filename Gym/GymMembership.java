package Gym;

public class GymMembership 
{
    protected String name;
    protected String membershipType;
    protected int duration;

    public GymMembership(String name, String membershipType,int duration)
    {
        this.name=name;
        this.membershipType=membershipType;
        this.duration=duration;
    }

    public double calculateFees()
    {
        return (50*duration);
    }
    public String checkSpecialOffer()
    {
        if(membershipType.equalsIgnoreCase("annual"))
        {
            return "10% discound" ;
        }
        else
        {
            return "no offer available";
        }
    }
    public void display()
    {
        System.out.println("Member Name: " + name);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Membership Fees: $" + calculateFees());
        System.out.println("Special Offers: " + checkSpecialOffer());
    }
}
