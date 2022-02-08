
/**
 *  ISC 2017 Q3
 *
 * Write a program to accept a plane text of length l and encrypt the text if valid 
 * as per Caesar cypher.

 */
import java.util.Scanner;
 class caesarCipher
{
    // instance variables
    private int x;
String sen,str;
    String []words;
    int num=0,key=13;char ch;
    void getData()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sen=in.nextLine();
    }
     void extractWords()
    {
         words = sen.split(" ");//extracting words into an array
         
         for(String word:words )
         {
             
             word=findCipher(word);//encryption of message
             System.out.print(word+" ");
            }
            
        }
    String findCipher(String str)
    {
        String newword="";
    for(int i=0;i<=str.length()-1;i++)
     {
         
         ch=str.charAt(i);
         if(ch=='!'||ch=='?'||ch==','||ch=='.'){
         newword+=ch;
         continue;}
         
         num=(int)ch+key;
          if (Character.isUpperCase(ch)) {//condition to check if the string is uppercase
         if(num>90)    //cyclic feature
         {
         num=num-26;
        }}
        else{
        if(num>122)   //when the letter is lowercase
         {
         num=num-26;
        }}
        ch=(char)num;
        newword+=ch;
        
    }
    return newword;
}
 public static void main(String[] args)//main method
{
    caesarCipher obj=new caesarCipher();
    obj.getData();
    obj.extractWords();

}
}

