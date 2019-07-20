import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int g=n%100;
      int h=g/10;
      System.out.println(h);
	}
}