
/**
 * Write a description of class pendulumArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
class Pendulum_Array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter number of elements: ");
        // Inputting the number of elements
        int n = Integer.parseInt(br.readLine());
        int A[]=new int[n]; //original array
        int B[]=new int[n]; //array for storing the result /*Inputting the Array*/
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter Element "+(i+1)+": ");
            A[i] = Integer.parseInt(br.readLine());
        }
        /*Sorting the Inputted Array in Ascending Order*/
        int t=0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(A[i]>A[j])
                {
                    t=A[i];
                    A[i]=A[j];
                    A[j]=t;
                }
            }
        }
        /*Printing the Sorted Array*/
        System.out.println("\nThe Sorted Array Is");
        for(int i=0; i<n; i++)
        {
            System.out.print(A[i]+" ");
        }
        int mid = (n-1)/2;
        //finding index of middle cell
        int x = 1, lim = n-1-mid;
        /*'x' is for accessing elements of array A[] and 'lim' is
         * for the number of times we have to make this to-and-fro movement*/
        /* Pendulum Arrangement Starts Here */
        B[mid]=A[0]; //putting the minimum element in the middle cell
        for(int i=1; i<=lim; i++)
        {
            if((mid+i)<n) //going to the right side
            {
                B[mid+i]=A[x++];
            }
            if((mid-i)>=0) //going to the left side
            {
                B[mid-i]=A[x++];
            }
        }
        /*Printing the Result*/
        System.out.println("\n\nThe Result Is");
        for(int i=0; i<n; i++)
        {
            System.out.print(B[i]+" ");
        }
    }
}

