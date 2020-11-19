import java.util.Scanner; 
class spiralMatrix {
    int n,m;
    int[][]arr;
    void getData()
    {
        
        Scanner sc=new Scanner(System.in);
         System.out.print("Number of rows= ");//Accept a range of numbers between m and n
        n=sc.nextInt();
        System.out.print("Number of columns= ");
         m=sc.nextInt();
         arr=new int[m][n];
          System.out.print("Enter elements of matrix:");
        for(int i=0;i<m;i++)
        {
           
            for(int j=0;j<n;j++)
            
              arr[i][j]=sc.nextInt();// accept elements from user
       
        }
    }
       
 void spiralMatrixPrint() {

    
  // Defining the boundaries of the matrix.
  int top=0, bottom=n-1, left=0, right=m-1;
  
  // Defining the direction in which the array is to be traversed.
  int k=1;
    while (top <= bottom && left <= right) {

    if (k == 1) {    // moving left->right
      for (int i = left; i <= right; ++i) {
        System.out.print(arr[top][i] + " ");
      }
     top++;
      k=2;
    } 
    else if (k==2) {     // moving top->bottom
      for (int i = top; i <= bottom; ++i) {
          System.out.print(arr[i][right]+ " ");
      }
     
      --right;
      k = 3;
    } 
    else if (k == 3) {     // moving right->left
      for (int i = right; i >= left; --i) {
          System.out.print(arr[bottom][i]+ " ");
      }
      // Since we have traversed the whole last
      // row, move up to the previous row.
      --bottom;
      k = 4;
    } 
    else if (k == 4) {     // moving bottom->up
      for (int i = bottom; i >= top; --i) {
          System.out.print(arr[i][left]+ " ");
      }
      // Since we have traversed the whole first
      // col, move right to the next column.
      ++left;
      k = 1;
    }
  }   
}
public static void main ()//main method
    {
        spiralMatrix obj=new spiralMatrix();
        obj.getData();
        obj.spiralMatrixPrint();
    }
}