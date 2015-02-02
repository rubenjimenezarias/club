import java.util.ArrayList;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public ArrayList test1()
    {
        Club club = new Club();
        
        Membership Membership1 = new Membership("Bea",2,1);
        Membership Membership2 = new Membership("Ruben",1,1);
        Membership Membership3 = new Membership("Pedro",3,1);
        Membership Membership4 = new Membership("Juan",3,1);
        Membership Membership5 = new Membership("Lola",3,1);
        
        club.join(Membership1);
        club.join(Membership2);
        club.join(Membership3);
        club.join(Membership4);
        club.join(Membership5);
        
        return club.purge(3,1);
    }
    
    
}