package HackerRankQuestions;

import java.util.ArrayList;
import java.util.Scanner;

class Student{}
class Rockstar{}
class Hacker{}

public class Qn7 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Object> list = new ArrayList<>();

        for(int i=0; i<n;i++)
        {
            String classname = sc.next();
            switch (classname) {
                case "Student":
                    list.add(new Student());
                    break;
                case "Rockstar":
                    list.add(new Rockstar());
                    break;
                case "Hacker":
                    list.add(new Hacker());
                    break;
                default:
                    break;
            }
        }
        count(list);
    }

    public static void count(ArrayList<Object> list)
    {
        int sCount=0, rCount=0, hCount=0;

        for(Object obj : list)
        {
            if(obj instanceof Student)
            {
                sCount++;
            }
            else if (obj instanceof Rockstar) 
            {
                rCount++;
            } 
            else if (obj instanceof Hacker) 
            {
                hCount++;
            }
        }

        System.out.println(sCount + " " + rCount + " " + hCount);
    }

}
