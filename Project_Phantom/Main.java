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
    private Stats stats;
    private Menu menu;
    private Game game;

    //Instance Variables
    //Class Menu Variables
    private int menuAns;

    //Class Stat Variables
    protected int tact;
    protected int prec;
    protected int surv;
    protected int stea;
    protected int reso;

    public Main()
    {
        user = new Scanner(System.in);
        stats = new Stats();
        menu = new Menu();
        game = new Game();

        tact = 0;
        prec = 0;
        surv = 0;
        stea = 0;
        reso = 0;

        menuAns = 0;
    }//end method

    public void runMenu()
    {
        menuAns = menu.getMenuAns();
    }//end method

    public void runStats()
    {
        stats.rollStats();
        
        tact = stats.getTact();
        prec = stats.getPrec();
        surv = stats.getSurv();
        stea = stats.getStea();
        reso = stats.getReso();
        
        stats.displayStats();
    }
    
    public void runGame()
    {
        
    }
}//end class