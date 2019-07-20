import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int g=n/100;
    int h=n%100;
    int i=h/10;
    int j=h%10;
    int k=(j*100)+(i*10)+g;
    System.out.println(k);
    
  }
}