
/**
 * Program to find if a word is funny.
 *Difference between the letters of a word and the reverse are
 *equal then it is a funny word.
 */
import java.util.Scanner;
import java.util.Arrays; 
public class funnyWord
{
    // instance variables 
    
        String str;
        int diff1[];
        int diff2[];
        String rev="";
        void getData()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string:");
        str=in.nextLine();
   }
   void reverse()
   {
       
        char ch[]=str.toCharArray();  
      
    for(int i=ch.length-1;i>=0;i--){  //reverse string
        rev+=ch[i];  
    }  
    
    }  
   
    void findDiff()
    {
        int k=0;
       
        diff1=new int[str.length()];
         diff2=new int[rev.length()];
         
        for(int i=1;i<str.length()-1;i++){
        
        diff1[k]=Math.abs(str.charAt(i)-str.charAt(i-1));//array to store diff b/w char of str
        
        diff2[k]=Math.abs(rev.charAt(i)-rev.charAt(i-1));//array to store diff b/w char of rev
        
        k++;
      }
    }
   
    void findFunny()
    {
        
            if(Arrays.equals(diff1,diff2))//
            System.out.println(str+ " is a funny word");
            else System.out.println(str+ " is not funny word");  
        }
          public static void main ()//main method
    {
       funnyWord obj=new funnyWord();
       obj.getData();
       obj.reverse();
       obj.findDiff();
       obj.findFunny();
    }
}
            
       
        


