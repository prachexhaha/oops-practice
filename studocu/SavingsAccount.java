package studocu;

public class SavingsAccount 
{
    // static keyword is used here to show that this particular variable belongs to the class rather than the instances.
    // such a variable is to be shared among all instances of the class

    //only one copy of the variable annualInterestRate and that is shared across all objects.

    //if one object changes this variable, the change will be seen in all the other objects.

    //static variable improves memory efficiency 
    static float annualInterestRate;
    @SuppressWarnings("unused")
    private double savingsBalance;

    public SavingsAccount(double initialBalance)
    {
        this.savingsBalance=initialBalance;
    }

    public void calculateMonthlyInterest(double savingsBalance, float annualInterestRate)
    {
        double monthlyInterest = (savingsBalance*annualInterestRate)/12;
        savingsBalance+=monthlyInterest;
    }

    //this keyword can not be used inside static methods as they belong to the class itself and not to any specific instance.
    static void modifyInterestRate(float newInterestRate)
    {
        annualInterestRate=newInterestRate;
    }
    
}
