
/**
 * ISC 2020 Q3
 *
 *  Arrange the words for sentence in ascending order of the length. 
 *  If 2 or more words have the same length then sort them alphabetically.
 */
import java.util.Scanner;
public class SenSort
{
    // instance variables - replace the example below with your own
    private int x;
    String []words;
     String  []sort; 
    String sen;
    char last;
    /**
     * Constructor for objects of class SenSort
     */
    public SenSort()
    {
        // initialise instance variables
        x = 0;
    }

    void getData()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sen=in.nextLine();
         last = sen.charAt(sen.length()-1);        
        sen=sen.toUpperCase();
        last = sen.charAt(sen.length()-1);   
        if(last!='.'&&last!='!'&&last!='?'){
        //check for terminating character
         System.out.println("INVALID INPUT");
         System.exit(0);
       }
        sen=sen.substring(0,sen.length()-1);
}
void sortWords()
    {
         words = sen.split(" ");
        for(int i = 0; i <words.length ; i++)
        {
            for(int j=i+1;j<words.length;j++){
            if(words[i].length()>words[j].length())//sorting words length wise
            {
               String temp = words[i];
                    words[i] = words[j];
                   words[j] = temp;
            }
              if(words[i].length()==words[j].length()&&words[i].compareTo(words[j]) > 0){//condition to check whether two words are equally length.
                    String temp = words[i];//sorting words alphabetically
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
    }
    void printResult()
    {for(String str:words)
        //printing final sorted array
            System.out.print(str+" ");
         
        }
        
       
            public static void main()//main method
{
    SenSort obj=new SenSort();
    obj.getData();
    obj.sortWords();
    obj.printResult();
} 
}
 
                           
