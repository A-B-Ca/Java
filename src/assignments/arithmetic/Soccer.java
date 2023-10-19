package assignments.arithmetic;

public class Soccer extends Sports{
    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in "+ getName());
    }

    public static void main(String[] args) {
        Sports s1= new Sports();
        System.out.println(s1.getName());
        s1.getNumberOfTeamMembers();
        Sports s= new Soccer();
        System.out.println(s.getName());
        s.getNumberOfTeamMembers();

    }
}
