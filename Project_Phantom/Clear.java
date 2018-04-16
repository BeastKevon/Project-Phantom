import java.io.IOException;
/**
 * Clears the screen
 * 
 * @author (Kevin Sweitzer) 
 * @version (4/11/18)
 */
public class Clear
{
    public static void main(String arg[]) throws IOException, InterruptedException 
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }//end method
}//end class
