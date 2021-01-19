import java.util.Scanner;
 class exchange 
{
String str;
    String []words;
    int num=0,key=13;char ch;
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
             chlast= word. charAt(n-1);
             String mid= word.substring(1, n-1);
             newword=chLast+mid+ch1;
            }
            
        }
        void display()
        {
            System.out.println("The exchanged sentence is");
            sen=extractWords(sen)
            System.out.println(sen+ " ");