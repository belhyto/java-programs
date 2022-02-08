
/**
 * ISC 2017 Q2
 *
 * create a double dimensional array to store and search for each participant
 * and calculate the marks for each participant by matching the correct answer
 * stored in a single dimensional array of size 5. display the scores of each
 * participant and also participants having the highest score.

 */
import java.util.*;
public class quizComp
{
    // instance variables 
    
    char Ans[][],Key[];
    int Score[],n,max;
    /**
     * Constructor for objects of class quizComp
     */
    public quizComp()
    {
        // initialise instance variables
        n = 0;
    }

    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N= ");
        n = sc.nextInt();
        if(n<4 || n>10)//condition to check whether no. is out of range
        {
            System.out.println("INPUT SIZE OUT OF RANGE");
            System.exit(0);
        }
        Ans = new char[n][5]; // Array to store the answers of every participants
        Key = new char[5]; // Array to store answer key
        Score = new int[n]; // Array to store score of every participant
        for(int i=0;i<n;i++)
         
        {
           System.out.print("Participant "+(1+i)+" ");
            for(int j=0;j<5;j++)
            {
              Ans[i][j]=sc.next().charAt(0);// accept elements from user
            }
                    System.out.println();

        }
         System.out.print("Key : ");
        for(int i=0;i<5;i++)
         
        {
          
           Key[i]=sc.next().charAt(0);// accept the answer key
        }
        
             
}
void findScore()
{
   for(int i=0;i<n;i++)
         
        {
            Score[i]=0;
            for(int j=0;j<5;j++)
            {
              if(Ans[i][j]==Key[j])// condition that checks if answer is correct
              Score[i]++;
            }
                    System.out.println("Participant "+(1+i)+"= "+Score[i]);

       }
    }
  void findHighest()
  {
      max=Score[0];
      for (int i=1; i<n;i++){
          if(Score[i]>max)//finds the participant with the highest score
          max=Score[i];
        }
       
        
    }
    void printHighest()
    {
        for (int i=0; i<n;i++){
          if(Score[i]==max)//prints the participant with the highest score
           System.out.println("Highest score : Participant "+(1+i));

        }
    }
     public static void main (String[] args)
    {
       quizComp obj=new quizComp();
       obj.getData();
       obj.findScore();
       obj.findHighest();
       obj.printHighest();
       
    }             
}

