
/**
 * Journal program 17
 * Write a program to display a message as a combination of phone keys and 
 * diplay the frequeny of every key.
 */
import java.util.*;
public class SMS
{
    // instance variables 
   
    String message;
       char []letter={' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n'
        ,'o','p','q','r','s','t','u','v','w','x','y','z'};
       int []num={0,2,22,222,3,33,333,4,44,444,5,55,555,6,66,666,7,77,777,7777,
           8,88,888,9,99,999,9999};
       String key="";
       int []freq;
    
       char []ch= key.toCharArray();  
    /**
     * Constructor for objects of class SMS
     */
    public SMS()
    {
        // initialise instance variables
        message="";
        
    }
     void getData()
     {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message: ");//accept message from user
        message = sc.nextLine();
}
     void getKeys()
     {
         
         
         for(int i=0; i<message.length(); i++)
         {
            for(int j=0; j<letter.length; j++) 
         if(message.charAt(i)==letter[j]){// finds combination of phone keys
             
         key+=num[j];
        }
    }
}
void frequency()
{
    
   freq=new int[key.length()];
    ch= key.toCharArray();  //convert string to char array    
        for(int i = 0; i <key.length(); i++) {  
            freq[i] = 1;  
            for(int j = i+1; j <key.length(); j++) {  
                if(ch[i] == ch[j]) {  
                    freq[i]++; //count frequency of each char
                    ch[j] = ' '; //replaces already counted char with space 
                }  
}
}
}
void display()
{
     System.out.print("Key combination: ");
     System.out.print(key);// display key combination
     System.out.println();
              System.out.println("Number         Frequency ");
                for(int i = 0; i <freq.length; i++) {  
                if(ch[i]!=' ') //char condition
                System.out.println(  ch[i] + "         " + freq[i]);  
            }
                   
        }

  public static void main(String[] args) //main method
    {
       SMS obj=new SMS();
       obj.getData();
        obj.getKeys();
        obj.frequency();
        obj.display();
}
}
