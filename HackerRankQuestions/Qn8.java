package HackerRankQuestions;
import java.util.*;

public class Qn8 
{

    public static void func(ArrayList<String> mylist) {
        Iterator<String> it = mylist.iterator();
        
        // Skip elements until "###" is found
        while (it.hasNext()) {
            if (it.next().equals("###")) {
                break;
            }
        }
        
        // Print remaining elements
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
    public static void main(String []args){
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("42");
        mylist.add("10");
        mylist.add("###");
        mylist.add("Hello");
        mylist.add("Java");
        
        func(mylist);
    }
}

