import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    //Arraylist con miembros llamada Memberships;
        private ArrayList<Membership> memberships;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        memberships = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        // añadimos el miembro member a la Arraylist
        memberships.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return memberships.size();
    }
    
    /** 
    * Calcula el numero de socios que se dieron de alta en un mes determinado. 
    * El año no nos importa. En caso de que el parametro contenga un valor 
    * no valido se muestra por pantalla el error.
    * @param month El mes en el que estamos interesados
    * @return El numero de socios que se dieron de alta dicho mes
    */
    public int joinedMonth (int month)
    {
        int count = 0;
        if (month <= 12 && month >= 1)
        {
            for (Membership member: memberships)
            {
                if (member.getMonth() == month)
                {
                    count++;
                }
            }
        }
        else 
        {
            System.out.println("Error!! el numero que has indicado no es un mes");
        }
        return count;
    }

}
