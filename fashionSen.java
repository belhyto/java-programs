
/**
 * Journal program 16
 * Fashion sentence- words specified by user in a string are encoded.
 * 
  */
   import java.util.Scanner;
public class fashionSen
{
    // instance variables - replace the example below with your own
    String sen;
    String []words;
    int x,y;char ch;

    /**
     * Constructor for objects of class fashionSen
     */
    public fashionSen()
    {
        // initialise instance variables
        x = 0;
        y=0;
    }



    
    void getData()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sen=in.nextLine();
        words = sen.split(" ");//split the string into an array
        int n=words.length;//count number of words in the array
        
        System.out.println("Enter first no.:");//position of first word
        x=in.nextInt();
        
        System.out.println("Enter second no.:");//position of 2nd word
        y=in.nextInt();
        if(x>n||y>n)//when position of word exceeds the length of the array
       { System.out.println("Invalid output.");
        System.exit(0);}
    }
    
    void extractWords()
    {
         
         x--;y--;
             words[x]=findCyclic(words[x]);//encodes the specified word
           words[y]=findCyclic(words[y]);
              
         for(String word:words )
         {
             
            
             System.out.print(word+" ");//displays the new sentence
            }
        }
        
    String findCyclic(String str)
    {
        String newword="";
        int num=0;
    for(int i=0;i<=str.length()-1;i++)
     {
         ch=str.charAt(i);
        
         if(ch=='z')//cyclic feature
         {
         ch='a';
        }
        if(ch=='Z')
         {
         ch='A';
        }
        else 
        { num=(int)ch+1;
        ch=(char)num;}
        
        newword+=ch;//concatenate char 
        
    }
    return newword;
}
    public static void main() //main method
{
    fashionSen obj=new fashionSen();
    obj.getData();
    obj.extractWords();

}

}
