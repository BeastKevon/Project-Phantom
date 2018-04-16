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
    private int tact;
    private int prec;
    private int surv;
    private int stea;
    private int reso;

    Main()
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
                String[] arr = {""};
                try 
                {
                    try
                    {
                        cls.main(arr);
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
    }
}//end class