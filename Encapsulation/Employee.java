package Encapsulation;

public class Employee 
{
    private String Name;;
    private int Age;
    private double Salary;

    //this essentially is just helping with object creation part
    public Employee(String name, int age, double salary)
    {
        this.Name=name;
        this.Age=age;
        this.Salary=salary;
    }

    //any changes that you are going to make has to be through getter and setter methods only
    public void setName(String name)
    {
        this.Name=name;
    }
    public String getName()
    {
        return Name;
    }

    public void setAge(int age)
    {
        this.Age=age;
    }
    public int getAge()
    {
        return Age;
    }
    public void setSalary(double salary)
    {
        this.Salary=salary;
    }
    public double getSalary()
    {
        return Salary;
    }

    public static void main(String[] args)
    {
        Employee emp = new Employee("rachel", 23, 2100000);

        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getSalary());

        emp.setAge(25);
        emp.setSalary(250000);

    }
    
}
