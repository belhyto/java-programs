
/**
 * ISC 2016 Q3
 *
 * write a program to find the number words beginning and ending with a vowel.
 * place the words which begin and end with a vowel at the beginning followed by 
 * the remaining words as they occur in the sentence.
 */
import java.util.Scanner;
public class vowelSort
{
    // instance variables - replace the example below with your own
    private int x;
    String []words;
     String  Vword,Cword; 
      
    String sen;
     int counter=0;
    /**
     * Constructor for objects of class vowelSort
     */
    public vowelSort()
    {
        // initialise instance variables
        x = 0;
        Vword="";
        Cword="";
    }
void getData()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sen=in.nextLine();
        sen=sen.toUpperCase();
    }
boolean isVowel(String w) // Function to check if a word begins and ends with a vowel or not
    {
        int l = w.length();
        char ch1 = w.charAt(0); // Storing the first character
        char ch2 = w.charAt(l-1); // Storing the last character
        if((ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U') && 
        (ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U'))
        return true;
        else
        return false;
    }
void findVowel()
    {
        words = sen.split(" ");
        for(String word:words )
         {
             if(isVowel(word))
       { Vword+=word+" ";
           counter++;// count no of words beginning and ending with a vowel
        }
       else
         Cword+=word+" "; // words beginning and ending with a consonant               
      }
       }
       void printSen()
       {
           System.out.println("Number of words beginning and ending with a vowel="+counter);

     System.out.println(Vword+Cword);//printing words beginning and ending with a vowel followed
     //by words beginning and ending with a consonant  
    }
    public static void main()//main method
{
    vowelSort obj=new vowelSort();
    obj.getData();
    obj.findVowel();
    obj.printSen();
    
} 
}    
   