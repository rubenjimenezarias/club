import java.util.ArrayList;
import java.util.Iterator;

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
        // a�adimos el miembro member a la Arraylist
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
    * El a�o no nos importa. En caso de que el parametro contenga un valor 
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

    /** 
    * Todos los socios que se han dado de alta un determinado mes de un determinado a�o se
    * dan de baja. En caso de que el parametro month contenga un valor no valido se muestra 
    * por pantalla el error.
    * @param month El mes en el que estamos interesados
    * @param year El a�o en el que estamos interesados
    * @return Una coleccion con los socios que se han dado de baja del club
    */
    public ArrayList<Membership> purge(int month, int year)
    {
       int count = 0;
       if (month <= 12 && month >= 1)
       {
           while (count < memberships.size())
           {
               if (memberships.get(count).getMonth() == month && memberships.get(count).getYear() == year)
               {
                        memberships.remove(count);
               }
               else
               {
                   count++;
               }
           }
       }
       else 
       {
           System.out.println("Error!! el numero que has indicado no es un mes");
       }
       return memberships;
    }
    /** 
    * REALIZADO EN CLASE
    * Todos los socios que se han dado de alta un determinado mes de un determinado a�o se
    * dan de baja. En caso de que el parametro month contenga un valor no valido se muestra 
    * por pantalla el error.
    * @param month El mes en el que estamos interesados
    * @param year El a�o en el que estamos interesados
    * @return Una coleccion con los socios que se han dado de baja del club
    */
    
    public ArrayList<Membership> purgeIt(int month, int year)
    {
        ArrayList<Membership> eliminados = new ArrayList<>();
        
        if ((month >= 1) && (month <= 12))
        {
            // bucle que elimina del atributo miembros y a�ade a eliminados
            Iterator<Membership> it = memberships.iterator();
            while (it.hasNext())
            {
                Membership miembro = it.next();
                if(miembro.getMonth() == month && miembro.getYear() == year)
                {
                    eliminados.add(miembro);
                    it.remove();
                }
            }
        }
        else
        {
            System.out.println("El mes introducido no es valido");
        }

        
        return eliminados;
    }
}
