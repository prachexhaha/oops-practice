package studocu;

//only one class can be public, if the others are public you will need to give it different files.
public abstract class Student
{
    //public keyowrd is necessary here
    //if abstract keyword is not given then need to provide it with a body
    public abstract void takeExam();

}

class PhDStudent extends Student
{
    @Override
    public void takeExam()
    {
        System.out.println("giving defense presentation");
    }
}

class GradStudent extends Student
{
    @Override
    public void takeExam()
    {
        System.out.println("is giving written exam");
    }
}

