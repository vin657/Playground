import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println(square_num(n));
	} 
  
  public static int square_num(int n)
  {
    int m=n*n;
    return m;
  }

}