
/**
 * ISC 2020
 * Q.1 
 * To display all Prime-Adam integer within a range.  
 * 
 */
import java.util.Scanner;
class PrimeAdam
{
    // instance variables - replace the example below with your own
     public int m,n;
   
    public PrimeAdam()
    {
        // initialise instance variables
        m= 0;
        n= 0;
    }

  
    void getData()
   {
     Scanner in=new Scanner(System.in);
     System.out.println("m= ");
        m=in.nextInt();
        System.out.println("n= ");
         n=in.nextInt();
         if(m >= n){
            System.out.println("Invalid input.");//message displayed when range is not valid
            return;
    }
}
    boolean isPrime(int x)
    {
        int f=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            f++;//count number of factors
        }
        if(f==2)
        return true;
        else return false;
    }
    int Square(int y)
    {
        y=y*y;//find square of the number.
        return y;
    }
    int Rev(int z)
    {
        int dig=0,rev=0;
        while(z!=0)//reverses the digits of the number
        {
            
        dig=z%10;
        rev=rev*10+dig;
        z/=10;
    }
    return rev;
    }
    void result()
    {
        
        int count=0;
      System.out.println("The prime adam numbers are:");   
    for(int i = m; i <= n; i++){
            if(isPrime(i)){// condition to find whether number is prime
        if(Rev(Square(i))==Square(Rev(i)))// condition to find whether number is an adam no.
        {
                System.out.print(i+",");
                count++;// counts no. of prime adam no.
            }
            }
    }
    if (count==0)
    System.out.println("NIL."); //message if there is no prime adam nos.
    else 
    System.out.println();
    System.out.println("The frequency of prime adam numbers="+count);
    
}
 public static void main (String[] args)//main method
    {
       PrimeAdam obj=new PrimeAdam();
       obj.getData();
       obj.result();
    }
}
        
