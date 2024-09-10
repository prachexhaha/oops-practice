// Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.

import java.util.ArrayList;

public class Student 
{
    private String name;
    private int grade;
    private ArrayList<String> courses;

    public Student(String name, int grade)
    {
        this.name=name;
        this.grade=grade;
        this.courses= new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }
    public int getGrade()
    {
        return grade;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setGrade(int grade)
    {
        this.grade=grade;
    }
    public ArrayList<String> getCourses()
    {
        return courses;
    }
    public void addCourse(String course)
    {
        courses.add(course);
    }
    public void delCourse(String course)
    {
        courses.remove(course);
    }

    
}
