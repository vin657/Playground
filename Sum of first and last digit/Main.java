import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int lastDigit=n%10;
      
      while(n>10)
      {
        n=n/10;
      }
      System.out.println(n+lastDigit);
	}
}