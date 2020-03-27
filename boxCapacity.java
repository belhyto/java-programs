
/**
 *ISC 2017 Q1
 *
 * write a program to accept a number boxes by the user and display the 
 * breakup of the cartons in descending order of capacity.

 */
import java.util.Scanner;
public class boxCapacity
{
    // instance variables - replace the example below with your own
    private int n,nn,cart;
     int []box={48,24,12,6};
    /**
     * Constructor for objects of class boxCapacity
     */
    public boxCapacity()
    {
        // initialise instance variables
        
    }

    void getData()
   {
     Scanner in=new Scanner(System.in);
    
        System.out.println("N= ");
         n=in.nextInt();
         nn=n;
         if(n >1000){//condition to check whether the no. is out of range 
            System.out.println("Invalid input.");
            System.exit(0);
    }
}
void find()
{
     for(int i=0;i<box.length;i++)
     {
         int div=1;
         div=(int)n/box[i];
         if(div!=0)
          System.out.println(box[i]+" X "+div+" = "+box[i]*div);
          n=n%box[i];//no. of boxes
          cart+=div;//no of cartons
        }
        System.out.println("Remaining boxes= "+n);
          
            System.out.println("Total number of boxes= "+nn);
          
            System.out.println("Total number of cartons= "+cart);
        }
        public static void main ()//main method
    {
       boxCapacity obj=new boxCapacity();
       obj.getData();
       obj.find();
    }
    }