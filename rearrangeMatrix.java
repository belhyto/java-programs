
/**
 * ISC 2016 Q2
 *
 * Write a program to sort the non boundary elements of a matrix in ascending order
 * using any standard sorting technique and rearrange them in the matrix.
 * calculate the sum of both diagonals and display the original Matrix, rearranged matrix,
 * and only the diagonal elements of the  rearranged Matrix with their sum.

 */
import java.util.Scanner;

public class rearrangeMatrix
{
    // instance variables - replace the example below with your own
   int [][]mat;
   int []arr;
   int [][]mat2;
    int m,n,sum;
    /**
     * Constructor for objects of class rearrangeMatrix
     */
    public rearrangeMatrix()
    {
        // initialise instance variables
        n= 0;
        sum=0;
    }
  
  void getData()
    {
        Scanner sc=new Scanner(System.in);
         System.out.print("M= ");
        m=sc.nextInt();//Accept no. for order of square matrix
        
        
         if(m < 3 || m > 10){//condition to check whether no. is out of range
            System.out.println("Out of range.");
        System.exit(0);}
          mat=new int[m][m];//initialize matrix
                     System.out.println("Enter elements of matrix");

          for(int i=0;i<m;i++)
        {
           
            for(int j=0;j<m;j++)
            
              mat[i][j]=sc.nextInt();// accept elements from user
                
                     
        }
        System.out.println();
    }
     void displayMatrix()
    {
               System.out.println("Original Matrix ");//displays the matrix 
                        for(int i=0;i<m;i++){
                        for(int j=0;j<m;j++){
                                          System.out.print(" "+mat[i][j]+" ");}
                                          System.out.println();
                        }
                    }
   
    void rearrangeMat()
{   
             
       n=(m-2)*(m-2);
        arr= new int[n]; //Array to store Non-Boundary Elements
       int k=0;                      
    for (int i = 0; i <m; i++){for (int j=0; j <m;j++){
                 if(i!=0&&i!=(m-1)&&j!=0&&j!=(m-1)){
                 arr[k]=mat[i][j];
                 k++;}
                }
            }
            sortArray(arr);//sorts all the non boundary Elements
          
}
void printMat()
{   
     System.out.println("Rearranged matrix ");          
      mat2=new int[m][m];//initialize 2nd matrix
       int k=0;                      
    for (int i = 0; i <m; i++){
                     

            for (int j=0; j <m;j++){
                 if(i!=0&&i!=(m-1)&&j!=0&&j!=(m-1)){//condition to replace all the non boundary Elements
                     mat2[i][j]=arr[k];//replace with the sorted elements
                     System.out.print(" "+mat2[i][j]+" "); //arranges 2nd matrix according to format 
                     k++;
            }
            else{
            mat2[i][j]=mat[i][j];
             System.out.print(" "+mat2[i][j]+" ");}//prints the sorted matrix 
            }
          System.out.println(); 
}
}
  
  int[] sortArray(int a[])//method to sort an arraay
{
                
                    
    for (int i = 0; i <n; i++)
            for (int j=0; j <n-1-i;j++){
                if (a[j] >a[j+1])
                {
                    // swap temp and arr[i]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            
            }
            return a;   
                }
                
     void printDiaMatrix()
    {
               System.out.println("Diagonal elements ");
                        for(int i=0;i<m;i++){
                        for(int j=0;j<m;j++){
                        if(i==j||j==(m-1-i))//prints only the nos. in the diagonals
                                          System.out.print(" "+mat2[i][j]+" ");
                         else
                          System.out.print("   ");
                                        
                        }
                          System.out.println();
                    }  
                }
 void diaginalSum()
 {
      int j=0;
      for(int i=0;i<m;i++)//sum of first diagonal elements
      sum+=mat2[i][i];
      
      for(int i=0;i<m;i++)
      {
          j=m-1-i;
          if(i!=j)//to avoid addition of the element present at the intersection of two diagonals
           sum+=mat2[i][j];
        }
       System.out.println("Sum of the diagonal elements="+sum);
    }  
      public static void main ()//main method
    {
       rearrangeMatrix obj=new rearrangeMatrix();
       obj.getData();
       obj.displayMatrix();
       obj.rearrangeMat();
       obj.printMat();
       obj.printDiaMatrix();
       obj.diaginalSum();
       
    }
    }                   