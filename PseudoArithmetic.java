
/**
 * Write a description of class pseudoarithmetic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
class PseudoArithmetic{
    private int n;
    private int a[];
    private boolean flag;
    private boolean ans;
    private int sum;
    private int r;
    public PseudoArithmetic(){
        n = 0;
        flag = true;
        ans = false;
        sum = 0;
        r = 0;
    }
    public void accept(int num)throws IOException{
        n = num;
        a = new int[n];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(br.readLine());
    }
    public boolean check(){
        int i = 0;
        int j = n - 1;
        r = a[i] + a[j];
        int count = 0;
        do{
            int temp = a[i] + a[j];
            if(temp != r){
                flag = false;
                break;
            }
            if(i == j)
                sum += a[i] * 2;
            else
                sum += a[i] + a[j];
            i++;
            j--;
            count++;
        }while(i <= j);
        ans = (sum == r * count);
        return (flag && ans);
    }
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("N = ");
        int num = Integer.parseInt(br.readLine());
        PseudoArithmetic obj = new PseudoArithmetic();
        obj.accept(num);
        if(obj.check())
            System.out.println("Pseuso arithmetic sequence.");
        else
            System.out.println("Not a pseudo arithmetic sequence.");
    }
}