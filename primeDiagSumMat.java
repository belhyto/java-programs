
/**
 * Write a description of class primeDiagSumMat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class primeDiagSumMat
{
    // instance variables - replace the example below with your own
    private int x;
     int [][]mat;
    int m,n,dsum;
    
    /**
     * Constructor for objects of class primeDiagSumMat
     */
    public primeDiagSumMat()
    {
        // initialise instance variables
        x = 0;
    }
    void getData()
    {
        Scanner sc=new Scanner(System.in);
         System.out.print("M= ");//Accept a range of numbers between m and n
        m=sc.nextInt();
        
        System.out.print("N= ");
         n=sc.nextInt();
        System.out.print("Enter elements of the matrix ");
          mat=new int[m][n];//initialize matrix
         
          for(int i=0;i<m;i++)
        {
           
            for(int j=0;j<n;j++)
            
              mat[i][j]=sc.nextInt();// accept elements from user
                
                     
        }
        System.out.println();
    }
     boolean isPrime(int x)
    {
        // put your code here
        int count=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            count++;
        }
        if(count==2)
        return true;
        else return false;
    }
    void findSum()
    {
    for(int i=0;i<m;i++)
          if(isPrime(mat[i][i]))
             dsum+=mat[i][i];
   
    for(int i=0;i<n;i++)
    {
     int j=mat.length-1-i;
     if(i!=j){
         if(isPrime(mat[i][j]))
      dsum+=mat[i][j];
    }
    }
   }
   void display()
   {
       System.out.println("The sum of all elements that are in the diagonal which are prime= "+dsum);
    }
       public static void main ()//main method
    {
       primeDiagSumMat obj=new primeDiagSumMat();
       obj.getData();
       obj.findSum();
       obj.display();
    }
}
