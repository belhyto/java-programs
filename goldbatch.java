
/**
 * ISC 2018 Q1
 * 
 * Write a program to accept an even integer n find all the odd prime pairs whose 
 * sum is equal to number n.

 */
import java.util.Scanner;
public class goldbatch
{
    // instance variables - replace the example below with your own
    private int n,a,b;

    /**
     * Constructor for objects of class goldbatch
     */
    public goldbatch()
    {
        // initialise instance variables
        n= 0;
        a=3;
        b=0;
    }

    
    void getData()
   {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter a no: ");//accepting a no. from the user
        n=in.nextInt();
    }
    void findeven()//function to check if no. is even
    {
        if(n%2!=0)
        System.out.println("Number is Invalid.");
    }
    public  boolean isPrime(int x)//function to check if the no. is prime
    {
        int f=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            f++;
        }
        if(f==2)
        return true;
        else return false;
    }
    void findPairs()
    {
        while(a<n)
        {
            b=n-a;
            if(isPrime(a)&&isPrime(b)&&a<=b)//print all odd prime pairs whose 
                // sum is equal to number n.
            System.out.println(a+","+b);
            a+=2;
        }
    }
    public static void main ()//main method
    {
       goldbatch obj=new goldbatch();
       obj.getData();
       obj.findeven();
       obj.findPairs();
    }
}
