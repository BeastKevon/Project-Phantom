import java.io.IOException;
/**
 * Clears the screen
 * 
 * @author (Kevin Sweitzer) 
 * @version (4/11/18)
 */
public class Clear
{
    public void cls()
    {
        try 
        {
            try
            {
                clear();
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
    
    private void clear() throws IOException, InterruptedException 
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }//end method
}//end class
