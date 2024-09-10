// Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
public class Person
{
    private String name;
    private int age;

    //set initial values when you create an object
    //setter methods can be used to change the values later in the program
    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

    //setter functions - part of encapsulation, you can control how fields of an object are modified.
    //by using setter function you may ensure that the age is not negative, so that helps you set a rule.

    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        if(age>0)
        {
            this.age=age;
        }
        else
        {
            this.age=0;
        }
    }


}