
/**
 * ISC 2020 Q3
 *
 * WAP to accept a number from the user to generate and display the corresponding date 
 * and also accept and the user to compute and display the future date corresponding 
 * to n days.
 
 */
import java.util.Scanner;
public class futureDate
{
    // instance variables - replace the example below with your own
    private int day,d,m,year,N,d2,m2;
    String suffix;
    
      int[] mdays={0,31,29,31,30,31,30,31,31,30,31,30,31};
      //the no. of days in every month in the year.
        String month[]={"January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October", "November", "December"};
    //the names of every month
    /**
     * Constructor for objects of class futureDate
     */
    public futureDate()
    {
        // initialise instance variables
        m=0;
        N=0;
        d2=0;
        m2=0;
    }

    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("DAY NUMBER:");
        day=sc.nextInt();
        if(day<1||day>366)//condition to check whether the day is out of range 
        {
         System.out.print("DAY NUMBER OUT OF RANGE");   
        System.exit(0);}
        System.out.print("YEAR:");
                year=sc.nextInt();
        if(year<1000||year>9999){//condition to check whether the year is out of range 
         System.out.print("YEAR OUT OF RANGE");   
        System.exit(0);}
        System.out.print("DATE AFTER (N DAYS):");
        N=sc.nextInt();
        if(N<1||N>100)//condition to check whether the future day is out of range 
        {
         System.out.print("DAY AFTER (N DAYS) OUT OF RANGE");   
        System.exit(0);}
        
    }
    void findMonth()
    {
        d=day;       
        
        for(int i=0;i<mdays.length;i++)
        {
            d-=mdays[i];//the no. of the days in a month is subtrated from the given no.
            
            if(d<mdays[i+1])
            {
                break;
           }
           m++;//counts the no. of months evey time the loop is iterated
        
    }
}
void findFuture()//method to find the date after 'n' days
{
    d2=day+N;
        
        for(int i=0;i<mdays.length;i++)
        {
            
            d2-=mdays[i];
            if(d2<mdays[i+1])
            {
                break;
            }
           m2++;
        
    }
}
   String findSuffix(int d)// method that returns the valid suffix for the date
   {
       if(d%10==1)//no. ending w/ 1 eg:1st,21st
       return "st";
       if((d%10==2)&&(d/10!=1))//no. ending w/ 2 but not staring with 1 eg:2nd,22nd
       return "nd";
       if(d%10==3)//no. ending w/ 3 but not staring with 1  eg:3rd,23rd
       return "rd";
       else
       return "th";// others eg:13th, 25th
    }
   
    void printDate()
    {
       System.out.println("DATE:     "+d+findSuffix(d)+" "+month[m]+" ,"+year); 
       //print the date according to the format
       System.out.println("DATE AFTER "+N+" DAYS:      "+d2+findSuffix(d2)+" "+month[m2]+" ,"+year); 
    }
    void checkLeap()
    {
        if((year%400==0) || ((year%100!=0)&&(year%4==0)))//condition that checks if it is a leap year
                        mdays[2]=29;//changes the no. of days in the month.
                    else
                        mdays[2]=28;
    }
    public static void main()//main method
 {
     futureDate obj=new futureDate();
     obj.getData();
     obj.checkLeap();
     obj.findMonth();
     obj.findFuture();
     obj.printDate();
}
}
