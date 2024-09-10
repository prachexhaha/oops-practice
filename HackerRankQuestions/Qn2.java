package HackerRankQuestions;
//Java Inheritance 
class Arithmetic 
{
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic 
{
    // No additional methods are required here
}

public class Qn2 
{
    public static void main(String[] args) {
        Adder obj = new Adder();
        
        // Print the superclass name
        System.out.println("My superclass is: " + obj.getClass().getSuperclass().getSimpleName());
        
        // Test the add method
        System.out.print(obj.add(42, 13) + " "); // Output: 55 
        System.out.print(obj.add(10, 10));
        
    }
    
}


