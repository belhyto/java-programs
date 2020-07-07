/**
 * Journal Program 18
 * zigzagMat 
 * To print all elements of the given 2D matrix in diagonal order.
 *
 */
import java.util.*;
public class zigzagMat
{
    // instance variables 
    
    private int r,c;
    int [][]mat;
    /**
     * Constructor for objects of class zigzagMat
     */
     zigzagMat(int mm, int nn)
    {
        // initialise instance variables
         r=mm;
         c=nn;
    }
    void getData()
{
    mat=new int[r][c];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<r;i++)
        {
           
            for(int j=0;j<c;j++)
            
              mat[i][j]=sc.nextInt();// accept elements from user
       
}
}
     
     void findTraversal()
     {
         for (int i=1;i<=(r+c-1);i++)//
         {
             int col1= Math.max(0,i-r);
             int count =Math.min(Math.min(i,(c-col1)),r); 
  
   
    for (int j=0;j<count;j++) 
        System.out.print(mat[Math.min(r,i)-j-1] 
                            [col1+j]+ " "); 
  
   
    System.out.println(); 
    } 
}

public static void main() 
{ 
     Scanner sc=new Scanner(System.in);
          System.out.print("Enter number of rows:");
         int x =sc.nextInt();
          System.out.print("Enter number of columns:");
         int y =sc.nextInt();
         zigzagMat obj=new zigzagMat(x,y);
          System.out.println("Enter elements of matrix:");
          
          obj.getData();
          System.out.println("zigzag Matrix: ");
           obj.findTraversal(); 
       
    }
}