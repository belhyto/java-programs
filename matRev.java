
/**
 * Program to reverse the elements of a matrix.
 *
 *
 */
import java.util.*;
public class matRev
{
    // instance variables - replace the example below with your own
    private int m,n,rev;
    int [][]arr;
    /**
     * Constructor for objects of class matRev
     */
    public matRev(int mm, int nn)
    {
        // initialise instance variables
        m=mm;
        n=nn;
    }
void fillarray()
{
    Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter elements of matrix:");
        for(int i=0;i<m;i++)
        {
           
            for(int j=0;j<n;j++)
            
              arr[i][j]=sc.nextInt();// accept elements from user
       
}
}
    
    
    public int reverse(int x)
    {
        
        while(x!=0)
        {
            int dig=x%10;
            rev=rev *10+dig;
            x/=10;
        }
        return rev;
        
    }
    
    void show()
    {
        for(int i=0;i<m;i++)
        {
           
            for(int j=0;j<n;j++)
            
              System.out.println(reverse(arr[i][j]));// accept elements from user
    }
    
}
public static void main (String[] args)//main method
    {
         Scanner sc=new Scanner(System.in);
          System.out.print("Enter number of rows:");
         int x =sc.nextInt();
          System.out.print("Enter number of columns:");
         int y =sc.nextInt();
         
       matRev obj=new matRev(x,y);
       
       obj.fillarray();
       System.out.print("Matrix with reversed elements");
       obj.show();
    }
    }          
