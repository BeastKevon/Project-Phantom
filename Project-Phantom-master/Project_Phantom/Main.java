import java.io.*;
import java.util.*;
/**
 * Main function that runs the menu and connects all classes together
 * 
 * @author (Kevin Sweitzer) 
 * @version (3/21/18)
 */
public class Main
{
    //Defining objects
    private Scanner user;
    private Clear cls;
    private Stats stats;

    //Instance Variables
    private int menuAns;

    //Stat Variables
    protected int tact;
    protected int prec;
    protected int surv;
    protected int stea;
    protected int reso;

    public Main()
    {
        user = new Scanner(System.in);
        cls = new Clear();
        stats = new Stats();

        tact = 0;
        prec = 0;
        surv = 0;
        stea = 0;
        reso = 0;

        menuAns = 0;
    }//end method

    public int getMenuAns()
    {
        menuAns();
        return menuAns;
    }//end method

    private void menuAns()
    {
        while(true)
        {
            System.out.println("1. Start Solo Game");
            System.out.print("Menu Answer: ");
            menuAns = user.nextInt();

            if(menuAns == 1)
            {
                break;
            }//end if
            else
            {
                clear();
            }//end else
        }//end while
    }//end method

    public boolean getStats()
    {
        rollStats();

        return true;
    }

    private void rollStats()
    {
        stats.setTact();
        stats.setPrec();
        stats.setSurv();
        stats.setStea();
        stats.setReso();

        tact = stats.getTact();
        prec = stats.getPrec();
        surv = stats.getSurv();
        stea = stats.getStea();
        reso = stats.getReso();

        clear();
        
        //prints out descriptions of the stats
        System.out.println("                    STATS (1 to 10)");
        System.out.println("");
        System.out.println("TACTICS         - skill and efficiency in CQC and ambushing");
        System.out.println("PRECISION       - accuracy at distance");
        System.out.println("SURVIVABILITY   - skills in self care and staying alive");
        System.out.println("STEALTH         - effective at avoiding others and more aware of surroundings");
        System.out.println("RESOURCEFULNESS - scavenge better and faster");
        
        System.out.println("");
        
        System.out.println("       YOUR STATS");
        System.out.println("");
        System.out.println("TACTICS         - " + tact);
        System.out.println("PRECISION       - " + prec);
        System.out.println("SURVIVABILITY   - " + surv);
        System.out.println("STEALTH         - " + stea);
        System.out.println("RESOURCEFULNESS - " + reso);
    }

    private void clear()
    {

        try 
        {
            try
            {
                cls.clear();
            }//end try
            catch (IOException e)
            {
                System.out.println(e);
            }//end catch
        }//end try
        catch (InterruptedException e) 
        {
            System.out.println(e);
        }//end catch
    }
}//end class