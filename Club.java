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
}
