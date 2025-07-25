import java.util.*;

public class hash
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to find its ASCII values :");
        String name = sc.next();
        System.out.println("Your give string is : "+name);
        int asciivalue = hashfunc(name);
        System.out.println("The ASCII value of the string" +name+ "is = "+asciivalue);
    }
    public static int hashfunc(String name)
    {
       int hashvalue=0;
       for(int i=0 ; i<name.length() ; i++)
       {
        hashvalue = hashvalue + (int) name.charAt(i);
       } 
       return hashvalue;
    }
}