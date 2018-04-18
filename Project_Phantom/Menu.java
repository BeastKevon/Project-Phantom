import java.io.*;
import java.util.*;
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu
{
    private Clear clear;
    private Scanner user;

    private int menuAns;

    public Menu()
    {
        clear = new Clear();
        user = new Scanner(System.in);

        menuAns = 0;
    }

    public int getMenuAns()
    {
        menuDisplay();
        return menuAns;
    }

    private void menuDisplay()
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
                clear.cls();
            }//end else
        }//end while
    }
}
