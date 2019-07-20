import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      String s2=s.nextLine();
      String s3=s.nextLine();
      String s4=s1.replaceAll(s2,s3);
      System.out.print(s4);
    }
}