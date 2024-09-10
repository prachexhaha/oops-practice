package HackerRankQuestions;

abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }
}

class MyBook extends Book
{
    void setTitle(String s)
    {
        this.title=s;
    }
}

public class Qn3 
{
    public static void main(String[] args) {
        MyBook book1 = new MyBook();
        String s="A tale of two cities";
        book1.setTitle(s);
        book1.getTitle();
    }
}
