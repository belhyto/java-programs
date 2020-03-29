
/**
 *ISC 2018 Q3
 *
 * Write a program to accept names of and themes and display them in 
 * vertical order side-by-side with the horizontal tab.

 */
import java.util.Scanner;
public class verticalWords 
{
    // instance vnameiables 
    private int len,n;
    String []name;
    
    /**
     * Constructor for objects of class verticalWords
     */
    public verticalWords()
    {
        // initialise instance vnameiables
        
        len = 0;
    }

  void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("N=");
        n = sc.nextInt();
        n=n+1;
        name = new String[n];
        
        for(int i=0;i<n;i++)
        {
           if(i>0) 
           System.out.print("Team "+i+":");
            name[i] = sc.nextLine();//accept the names of the teams
            
        }
}
 void findLength()
 {
      for(int i=0;i<n;i++)
        {
            if(len<name[i].length())
            len = name[i].length();       //Finding the length of the string
        }
    }
  void printResult()
  {
      for(int i=0;i<len;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                if(i<name[j].length())
                    System.out.print(name[j].charAt(i)+"\t");//printing the strings row-wise
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
             public static void main()//main method
{
    verticalWords obj=new verticalWords();
    obj.getData();
    obj.findLength();
    obj.printResult();
} 
}
    
    
     
