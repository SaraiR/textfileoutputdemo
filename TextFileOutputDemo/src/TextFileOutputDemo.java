import java.io.PrintWriter;          
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;
public class TextFileOutputDemo
{
    public static void main (String [] args)
    {
    	Date d = new Date();
       String fileName = d.toString().replace(':', '_'); //The name could be read from
//    	fileName.replace('a','b');
    	String test = "mesquite in your cellar".replace('e', 'o');
    	 System.out.println(test);
 
    	//System.out.println("Value:"+fileName.charAt(8));
    	System.out.println(fileName);
       //String fileName = "test.txt";
    	 
    	
        PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter (fileName);
        }
        catch (FileNotFoundException e)
        {
            System.out.println ("Error opening the file " +
                    fileName);
            System.exit (0);
        }
        System.out.println ("Enter three lines of text:");
        Scanner keyboard = new Scanner (System.in);
        for (int count = 1 ; count <= 3 ; count++)
        {
            String line = keyboard.nextLine ();
            outputStream.println (count + " " + line);
        }
        outputStream.close ();
        System.out.println ("Those lines were written to " +
                fileName);
    }
}