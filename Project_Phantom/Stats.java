import java.util.*;
/**
 * Write a description of class Stats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stats //extends Main
{
    private Random rand;
    
    private int rNum;
    
    private int myTact;
    private int myPrec;
    private int mySurv;
    private int myStea;
    private int myReso;
    public Stats()
    {
        rand = new Random();
        
        myTact = 0;
        myPrec = 0;
        mySurv = 0;
        myStea = 0;
        myReso = 0;
    }
    
    public void rollStats()
    {
        setTact();
        setPrec();
        setSurv();
        setStea();
        setReso();
    }
    
    private void setTact()
    {
        myTact = getRand();
    }
    
    private void setPrec()
    {
        myPrec = getRand();
    }
    
    public int getTact()
    {
        return myTact;
    }
    
    private void setSurv()
    {
        mySurv = getRand();
    }
    
    private void setStea()
    {
        myStea = getRand();
    }
    
    private void setReso()
    {
        myReso = getRand();
    }
    
    public int getPrec()
    {
        return myPrec;
    }
    
    public int getSurv()
    {
        return mySurv;
    }
    
    public int getStea()
    {
        return myStea;
    }
    
    public int getReso()
    {
        return myReso;
    }
    
    private int getRand()
    {
        rNum = rand.nextInt(10) + 1;
        
        return rNum;
    }
    
    public void displayStats()
    {
        
    }
}
