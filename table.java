import java.io.*;
import java.util.*;
public class table
{
    public static void main(String[] args)
    {  
    	int num,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print table");
        num = sc.nextInt();
        for (a = 1; a<=10; a++)
        { 
         System.out.println(num*a);
         }  
    }
}