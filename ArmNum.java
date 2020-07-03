import java.util.*;
 class ArmNum
{
    // instance variables
    private int n,l,x,sum;
    
  
     ArmNum(int nn)
    {
        // initialise instance variables
         n=nn;
         sum=0;
    }

   
     int sum_pow(int n,int sum, int l)
    {
        // put your code here
        if (n!=0)
        {
        x=n%10;
         sum+=Math.pow(n,l);
         n/=10;
        return sum_pow(n,sum,l);
    }
        else 
        
        return sum;
    }
    
  
 public static void main()//main method
{
    
    Scanner sc=new Scanner(System.in);
        System.out.print("Number=");
       int n = sc.nextInt();
       int length=String.valueOf(n).length();
       ArmNum obj=new ArmNum(n);
       int arm=obj.sum_pow(n,0,length);
       if(arm==n)
        System.out.println("It is a Armstrong number.");
        else
            System.out.println("It is a Armstrong number.");
     
} 
}
