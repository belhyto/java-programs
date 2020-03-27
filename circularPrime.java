
/**
 * ISC 2016 Q1
 *
 * write a program to accept a positive number and check whether the number
 * is circular prime or not. The new numbers formed after shifting the digits is 
 * also displayed.

 */
import java.util.Scanner;
class circularPrime 
{
int num; 
int  div=1, newNum=0; 
        boolean allPrime = true; 
        void getData( )
       { 
        
        Scanner sc = new Scanner( System.in ); 
        System.out.print("Input a number: "); 
        num = sc.nextInt(); //accepting a no. from the user
         newNum = num;//copy of no.
    }
    void findCircular()
    {
        
        do{
            System.out.println(newNum);
            if( !isPrime( newNum ) ) //check if every rotated no. is prime
            allPrime=false;
            newNum = circulate( newNum);//printing new numbers formed after shifting the digits
        }
        while( newNum != num );
        
    }
void printResult()
{
    if( allPrime ) System.out.println(num+" is Circular Prime number." );
        else System.out.println(num+" is not a Circular Prime number." );
    }

 boolean isPrime(int x)//function to check if the no. is prime
    {
        int f=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            f++;
        }
        if(f==2)
        return true;
        else return false;
    }
   int circulate(int n) //Function for circulating the digits to form new number
    {
        String str = Integer.toString(n);
        String cir = str.substring(1)+str.charAt(0);
        int num = Integer.parseInt(cir);
        return num;
    }
  public static void main() //main method
{ 
	 circularPrime obj=new circularPrime();
	obj.getData();
	obj.findCircular();
	obj.printResult();
	
} 
}
