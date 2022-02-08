import java.util.Scanner;
 class exchange 
{
String str;
    String []words;
    int num=0,key=13;char ch, chlast;
    String sen, newword;
    void getData()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sen=in.nextLine();
    }
     String extractWords(String sen)
    {
         words = sen.split(" ");//extracting words into an array
         
         for(String word:words )
         {
             char ch1= word.charAt(0);
             int n=word.length();
             chlast= word. charAt(n-1);
             String mid= word.substring(1, n-1);
             newword=chlast+mid+ch1;
            }
            return " ";
        }
        void display()
        {
            System.out.println("The exchanged sentence is");
            sen=extractWords(sen);
            System.out.println(sen+ " ");
        }
        public static void main(String[] args)//main method
        {
            exchange obj=new exchange();
            obj.getData();
            obj.display();
       }
       }
       
    