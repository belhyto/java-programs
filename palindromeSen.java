
/**
 * ISC 2019 Q3
 * 
 * write a program to word the non palindrome words of the sentence into palindrome words.
 */
import java.util.Scanner;
public class palindromeSen
{
    // instance variables - replace the example below with your own
    private int x;
    String sen;
    String []words;
    int counter;
    char last;
    /**
     * Constructor for objects of class palindromeSen
     */
    public palindromeSen()
    {
        // initialise instance variables
        x = 0;
    }

    void getData()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sen=in.nextLine();
        sen=sen.toUpperCase();
        last = sen.charAt(sen.length()-1);   
        if(last!='.'&&last!='!'&&last!='?'){
        //check for terminating character
         System.out.println("INVALID INPUT");
         System.exit(0);
       }
        sen=sen.substring(0,sen.length()-1);
    }
    void extractWords()
    {
        
         words = sen.split(" ");
        
         for(String word:words )
         {
             String rev="",str="",first="";
              
              rev=reverseSen(word);
              if(isPalindrome(word))              
              str=word;
              
              else{
                   rev=rev.substring(1);//reversing string
                   while(word.length() > 1 && word.charAt(word.length() - 1) == word.charAt(word.length() - 2))
                   //loop checks if the last letters are repeated 
                   word = word.substring(0, word.length() - 1);
                     str=word+rev;//concatenate word with the reverse 
                     }
                
                System.out.print(str+" ");
            }
                }
              boolean isPalindrome(String s)//method to checck if string is palindrome
          {
              StringBuffer reversed=(new StringBuffer(s)).reverse();
              return s.equalsIgnoreCase(reversed.toString());
           }
         
        
             String reverseSen(String s)//method that return
          {
              StringBuffer reversed=(new StringBuffer(s)).reverse();
              return reversed.toString();
           }
   public static void main(String[] args)//main method
{
    palindromeSen obj=new palindromeSen();
    obj.getData();
    obj.extractWords();
}
}      
