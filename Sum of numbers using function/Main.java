import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
	  Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      System.out.println(sum_num(n));
    }
  public static int sum_num(int n)
  {
    int sum=0;
    for(int i=1;i<=n;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
}