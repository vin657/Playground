import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner s= new Scanner(System.in);
      int n,f,g,h;
      n=s.nextInt();
      f=n/100;
      g=n%10;
      h=f+g;
      System.out.println(h);
	}
}