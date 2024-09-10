package HackerRankQuestions;

interface AdvancedArithmetic 
{
    int divisorSum(int n);   
}

class MyCalculator implements AdvancedArithmetic
{
    // you need to give it visiblitiy so the public keyword is added to it
    public int divisorSum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}

public class Qn4 
{
    public static void main(String[] args) {
        MyCalculator cal1 = new MyCalculator();
        Class<?>[] interfaces = cal1.getClass().getInterfaces();
        System.out.print("I implemented: ");
        for (Class<?> iface : interfaces) {
            System.out.print(iface.getSimpleName());
        }
        System.out.println(cal1.divisorSum(6));
    }
}
