// Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.

public class Employee 
{
    private String name;
    private String job;
    private double salary;

    public Employee(String name, String job, double salary)
    {
        this.name=name;
        this.job=job;
        this.salary=salary;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getJob()
    {
        return job;
    }
    public void setJob(String job)
    {
        this.job=job;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }

    public void raiseSalary(double percentage) 
    {
        salary = salary + salary * percentage / 100;
    }

    public void printEmployeeDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + job);
        System.out.println("Salary: " + salary);
    }
    
}
