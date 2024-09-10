package HackerRankQuestions;


class Sports
{
    String getName()
    {
        return "GenericSports";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has n players in "+getName());
    }
}

class Soccer extends Sports
{
    @Override
    String getName()
    {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has 11 players in "+ getName());
    }
}

public class Qn5 
{
    public static void main(String[] args) {
        Sports s = new Sports();
        Soccer s1 = new Soccer();
        s.getNumberOfTeamMembers();
        s1.getNumberOfTeamMembers();
    }
}
