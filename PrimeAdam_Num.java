
/**
 * Write a description of class PrimeAdam_Num here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
class PrimeAdam_Num
{
    // instance variables - replace the example below with your own
     int n;
   
    public PrimeAdam_Num()
    {
        // initialise instance variables
        n= 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    void getData()
   {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter a no: ");
        n=in.nextInt();
    }
    boolean isPrime(int x)
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
    int Square(int y)
    {
        y=y*y;
        return y;
    }
    int Rev(int z)
    {
        while(z!=0)
        {
            int dig=0,rev=0;
        dig=z%10;
        rev=rev*10+dig;
        z/=10;
    }
    return z;
    }
    void result()
    {
        
    if(isPrime(n))
    {
        if(Rev(Square(n))==Square(Rev(n)))
        System.out.println("The number is a prime adam number.");
        else System.out.println("The number is not a prime adam number.");
    }
    else System.out.println("The number is not a prime number.");
    
}
 public static void main ()
    {
       PrimeAdam_Num obj=new PrimeAdam_Num();
       obj.getData();
       obj.result();
    }
}
        
