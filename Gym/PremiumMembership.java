package Gym;

public class PremiumMembership extends GymMembership //subclass
{
    boolean personalTrainerAvaiable;
    boolean spaAccess;

    public PremiumMembership(String name, String membershipType,int duration, boolean personalTrainerAvaiable, boolean spaAccess)
    {
        //important to explicitly call the super class constructor 
        //first statement has to be of super class.
        super(name, membershipType, duration);
        this.personalTrainerAvaiable=personalTrainerAvaiable;
        this.spaAccess=spaAccess;
    }

    @Override
    public double calculateFees()
    {
        double baseFees=super.calculateFees();
        double additional=0.0;

        if(personalTrainerAvaiable)
        {
            additional+=30.0*duration;
        }
        if(spaAccess)
        {
            additional+=20.0*duration;
        }

        return (baseFees+additional);
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Personal Trainer Available: " + (personalTrainerAvaiable ? "Yes" : "No"));
        System.out.println("Spa Access: " + (spaAccess ? "Yes" : "No"));
    }
    
}
