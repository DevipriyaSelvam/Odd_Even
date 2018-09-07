import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class If {



  
    

    public static void main(String[] args) {
       System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        if(N%2!=0)   
         {
          System.out.println("Weird");
         }
        if(N%2==0)
         {
            if(N>=2 && N<=5)
            {
            System.out.println("Not Weird");
            }
            else if(N>=6 && N<=20)
            {
                System.out.println("Weird");
            }
            else
            {
                System.out.println("Not Weird");
            }
         }
        


    }
}
