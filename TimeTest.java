
/**
 * Write a description of class TimeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class TimeTest
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        
        System.out.print ("Enter a Time:  Hour = ");
        int hour = keyboard.nextInt ();
        System.out.print ("             Minute = ");
        int min = keyboard.nextInt();
        System.out.print ("             Second = ");
        int sec = keyboard.nextInt();
        
        if (Time.isValidTime(hour, min, sec))
        {
            Time myTime = new Time (hour, min, sec);
            System.out.println ("Time created: " + myTime);
        }
        else
        {
            System.out.println ("Your entry was invalid.\nPlease try again.");
        }
        
        
        Time t1 = new Time (11, 0);       // 11:00 AM
        Time t2 = new Time (8, 54, 42);   // 8:54:42 AM
        Time t3 = new Time (27000);       // 7:30 AM
        
        System.out.println ("\n\nCreated three times: \n" + 
            t1 + "\n" +
            t2 + "\n" +
            t3);
    }
}
