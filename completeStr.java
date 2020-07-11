
/**
 * Java Program to display concatenated strings with all english alphabets
 *
  */
import java.util.*;
public class completeStr
{
    // instance variables - replace the example below with your own
    private int x;
    char []letter={' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n'
        ,'o','p','q','r','s','t','u','v','w','x','y','z'};
    String []arr1;
    String []arr2; 
    String str;
    
    /**
     * Constructor for objects of class completeStr
     */
    public completeStr()
    {
        // initialise instance variables
       str="";
    }

    void getData()
     {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 strings for 1st array:");
        //accept str from user
         arr1 = new String[3];//initialize array
         for(int i=0;i<3;i++)
        {
        arr1[i]= sc.nextLine();//accecpt string
}
 System.out.println("Enter 3 strings for 2nd array:");
        //accept str from user
        arr2 = new String[3];//initialize array
         for(int i=0;i<3;i++)
        {
        arr2[i]= sc.nextLine();//accecpt string
}
}
void concatStr()
{
    for(int i=0;i<3;i++)
    for(int j=0;j<3;j++){
    str=arr1[i]+arr2[j];//concatenate Strings 
    if(checkAlpha(str))//check if string contains all letters
     System.out.println(str);
}
}
   boolean checkAlpha(String str)//method counts if all the alphabets are present in str
   {
       int count=0;
       for(int i=0;i<letter.length;i++)
       for(int j=0;j<str.length();j++){
       if(letter[i]==str.charAt(j)){//verifies if the letter is the same as the corresponding char
       count ++;
       break;//moves one to the next letter once counted
    }
    }
    if(count==26)//condition to verify that all 26 letters are present
    return true;
    else return false;
    
    }
  
   public static void main()// main method
   {
       completeStr obj=new completeStr();
       obj.getData();
       System.out.println("Completed Strings");
       obj.concatStr();
    }

}
