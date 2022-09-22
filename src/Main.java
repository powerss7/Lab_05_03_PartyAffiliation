public class Main
{
    public static void main(String[] args)
    {
        System.out.println("what is your party affiliation Democrat, Republican, Independent, or other ");
        String PartyAffiliation = "O";

        if(PartyAffiliation.equalsIgnoreCase("R"))
        {
            System.out.println("you are a Republican Elephant");
        }
        else if(PartyAffiliation.equalsIgnoreCase("D"))
        {
            System.out.println("you are a Democrat Donkey");
        }
        else if(PartyAffiliation.equalsIgnoreCase("I"))
        {
            System.out.println("you are a Independent Person");
        }
        else
        {
            System.out.println("you are another party");
        }
    }
}