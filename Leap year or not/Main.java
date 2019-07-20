import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int n=in.nextInt();
      int r=n%4;
      int s=n%100;
      int t=n%400;
    
      
      if(r==0 && s==0 && t==0)
        System.out.println("Leap year");
      else
        System.out.println("Non Leap year");
    }
}