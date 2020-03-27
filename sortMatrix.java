

/**
 *  ISC 2019 Q2
 *
 *to accept an single dimensional array a and a square Matrix b of size n 
 *where n is greater than 2 and less than 10 short the way in ascending order 
 *and fill the Matrix b in the given format.
 */
import java.util.Scanner;
public class sortMatrix
{
    // instance variables - replace the example below with your own
     ;
    int b[][],a[],N;
      
        
    /**
     * Constructor for objects of class sortMatrix
     */
    public sortMatrix()
    {
        // initialise instance variables
       
    }
    void getData()
    {
    Scanner sc=new Scanner(System.in);
         System.out.print("N=");//Accept size of array 
        N=sc.nextInt();
        a= new int[N]; //initialize array
        if(N <3||N>9){
            System.out.println("Matrix size out of range.");//condition to check whether matrix is out of range
            System.exit(0);
        }
        
        System.out.println("Enter elements of single dimensional array:");
        for(int i=0;i<N;i++)       
            a[i]=sc.nextInt();// accept elements from user
        
        
    }
void sortArray()
{
    for (int i = 0; i <N; i++){
            for (int j = i+1; j < N; j++){
                if (a[i] > a[j])
                {
                    // swap temp and arr[i]
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }}
           
        }  
 void printArray()
{
    System.out.println("Sorted array:");
         for(int i=0;i<N;i++)
          System.out.print(a[i]+" ");//prints the sorted array
           System.out.println();
                }
void matrix()
{
    int len=N;
     b= new int[N][N];
    for(int i=0;i <N; i++){
            int j = 0;
            for(j = 0; j <len; j++)
                b[i][j] = a[j];
            int k = 0;
            while(j < N){//arranges matrix according to format
                b[i][j] = a[k];
                j++;
                k++;
            }
            len--;
        }
    }
void displayMatrix()
{
    System.out.println("Filled matrix");
        for(int i = 0; i < N; i++){
            for(int j = 0; j <N; j++){
                System.out.print(b[i][j] + "\t");//displays the matrix 
            }
            System.out.println();
        }
    }
     public static void main ()//main method
    {
       sortMatrix obj=new sortMatrix();
       obj.getData();
       obj.sortArray();
       obj.printArray();
       obj.matrix();
       obj.displayMatrix();
    }             
}
    
            
       
        
            
