import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n,g,h,f;
      n=s.nextInt();
      g=n/10;
      h=n%10;
      f=g+h;
      System.out.println(f);
	}
}