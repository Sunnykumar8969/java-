import java.io.*;
import java.util.*;
public class A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char a=sc.next().charAt(0);
        if (a>='A' && a<='Z')
            System.out.println("1");
        else if (a>='a' && a<='z')
            System.out.println("0");
        else
            System.out.println("-1");  
    }
}