
/**
 * ISC 2020
 *Q2.
 * To calculate decimal equivalent for each row and display the matrix
 * as per the given format.
 * 
 */
import java.util.Scanner;
class octMatrix
{
    
    int [][]mat;
    int m,n;
    
    
    void getData()
    {
        Scanner sc=new Scanner(System.in);
         System.out.print("M= ");//Accept a range of numbers between m and n
        m=sc.nextInt();
        System.out.print("N= ");
         n=sc.nextInt();
         if(m<1||m>9||n<3||n>5){//condition to check whether matrix is out of range
            System.out.println("Out of range.");
        System. exit(0);}
            
        
           mat=new int[m][n];//initialize matrix
         
          for(int i=0;i<m;i++)
        {
           System.out.print("ENTER ELEMENTS FOR ROW "+(1+i)+":");
            for(int j=0;j<n;j++)
            {
              mat[i][j]=sc.nextInt();// accept elements from user
                
              if(mat[i][j]>7){
              System.out.println("INVALID INPUT");//checks if no. entered is smaller than 7
               System.exit(0); }
            }
        }
        System.out.println();
    }
    void displayMatrix()
    {
               System.out.println("FILLED Matrix \tDEMCIMAL EQUIVALENT");
                        for(int i=0;i<=m-1;i++)
                        {
                            int deci=0;
                                    for(int j=0, k=n-1;j<=n-1 && k>=0;j++,k--)
                                    {
                                                System.out.print(" "+mat[i][j]+" ");
                                                deci+=mat[i][j]*Math.pow(8,k);//calculate decimal equivalent
                                    }
                                    System.out.print("\t"+deci);//print the value
                                    System.out.println();
                        }
                    
                    }
      public static void main () //main method
    {
       octMatrix obj=new octMatrix();
       obj.getData();
       obj.displayMatrix();
    }              
}
