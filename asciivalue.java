// A-DSA experiment to implement hash function
import java.util.*;
public class asciivalue{
    public static void main(String [] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = reader.next().charAt(0);
        int asciivalue = (int) c;
        System.err.println("The ASCII value for "+c+" is:"+asciivalue);
    }
}