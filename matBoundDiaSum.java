
/**
 * Write a description of class matBoundDaiSum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class matBoundDiaSum
{
    // instance variables - replace the example below with your own
    private int x;
     int [][]mat;
    int m,n,dsum,sum;
    
    /**
     * Constructor for objects of class matBoundDaiSum
     */
    public matBoundDiaSum()
    {
        // initialise instance variables
        x = 0;
    }
void getData()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("N= ");//accept matrix size
         n=sc.nextInt();
        System.out.print("Enter elements of the matrix ");
          mat=new int[n][n];//initialize matrix
         
          for(int i=0;i<n;i++)
        {
           
            for(int j=0;j<n;j++)
            
              mat[i][j]=sc.nextInt();// accept elements from user
                
                     
        }
        System.out.println();
    }
      void findDiaSum()
    {
    for(int i=0;i<n;i++)
            if(i!=0&&i!=n-1){//condition to avoid adding corner numbers twice
             dsum+=mat[i][i];//add all numbers of the 1st diagonal
            }
    for(int i=0;i<n;i++)
    {
     int j=mat.length-1-i;
     if(i!=j){
         if(i!=0&&i!=n-1){//condition to avoid adding corner numbers twice
       
      dsum+=mat[i][j];//add all numbers of the 2nd diagonal
    }
    }
   }
   System.out.println("Sum of diagonal elements="+dsum);
}
   void findBoundSum()
   {
       for(int i=0;i<n;i++){
       sum+=mat[i][0];//add all numbers of the 1st column
       sum+=mat[i][n-1];//add all numbers of the last column
       if(i!=0&&i!=n-1){//condition to avoid adding corner numbers twice
       sum+=mat[0][i];//add all numbers of the 1st row
       sum+=mat[n-1][i];//add all numbers of the last row
    }
   }
   System.out.println("Sum of boundary elements="+sum);
}

 void display()
   {
       int totalSum=sum+dsum;//add sum of boundary and diagonals numbers
       System.out.println("Sum of boundary and diagonal numbers= "+totalSum);
    }
    public static void main ()//main method
    {
       matBoundDiaSum obj=new matBoundDiaSum();
       obj.getData();
       obj.findBoundSum();
       obj.findDiaSum();
       obj.display();
     
    }
}