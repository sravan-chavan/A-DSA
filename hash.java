// This code is a hashing of a string and displaying in a hash table

import java.util.*;

public class hash
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        //taking string input from the user
        System.out.print("Enter a string:");
        String name = sc.nextLine();
        int sl = name.length();
        int x=0;
        for(int i = 0; i<sl; i++)
        {
            x=x+ascii(name.charAt(i));
        }
        hashfunc(name,x);
    }
    public static char ascii(char a)
    {
        int ascvalue=a;
        return a;
    }
    public static void hashfunc(String name, int x)
    {
       Scanner sq = new Scanner(System.in);
       System.out.println("Enter the value of hashtable");
       int n = sq.nextInt();

       int j=x%n;
       String[] hash = new String[n];
       hash[j]=name;
       for(int i = 0; i<n; i++)
       {
        System.out.println(i+"->"+hash[i]);
       }
    }
}