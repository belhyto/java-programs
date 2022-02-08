
/**
 *ISC 2018 Q2 
 *
 *write a program to sort each row of the matrix in ascending order using any 
 *standard sorting technique.

 */
import java.util.Scanner;
public class asc_rowMatrix
{
    // instance variables - replace the example below with your own
    private int x;
    int [][]mat;
    int m,n;
    
    /**
     * Constructor for objects of class asc_rowMatrix
     */
    public asc_rowMatrix()
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
         if(m<1||m>10||n<1||n>10){//condition to check whether matrix is out of range
            System.out.println("Out of range.");
        System. exit(0);}
          mat=new int[m][n];//initialize matrix
         
          for(int i=0;i<m;i++)
        {
           
            for(int j=0;j<n;j++)
            
              mat[i][j]=sc.nextInt();// accept elements from user
                
                     
        }
        System.out.println();
    }
    void displayMatrix()
    {
               System.out.println("Original Matrix ");//displays the matrix 
                        for(int i=0;i<=m-1;i++){
                        for(int j=0;j<=n-1;j++)
                                          System.out.print(" "+mat[i][j]+" ");
                                          System.out.println();
                        }
                    }
     void printMatrix()
{
      System.out.println("Matrix after sorting");          
                        
    for (int i = 0; i <m; i++){
                        sortArray(mat[i]);//sorts every row of the matrix

            for (int j=0; j <n;j++){
                
                  System.out.print(" "+mat[i][j]+" ");//prints the sorted matrix                 
            }
                 System.out.println();    
                    }
                }
              int[] sortArray(int mat[])//method to sort an arraay
{
                
              int i;         
    for ( i = 0; i <n; i++){
            for (int j=0; j <n-1-i;j++){
                if (mat[j] >mat[j+1])
                {
                    // swap temp and arr[i]
                    int temp = mat[j];
                    mat[j] = mat[j+1];
                    mat[j+1] = temp;
                }
            
            }
                 
                    }
                 return mat;   
                }  
            public static void main (String[] args)//main method
    {
       asc_rowMatrix obj=new asc_rowMatrix();
       obj.getData();
       obj.displayMatrix();
       obj.printMatrix();
       
    }          
    }
