import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
          int sum=0;
      int temp=n;
      
      
      while(n>0)
      {
        int m=n%10;
        int fact=1;
        for(int i=1;i<=m;i++)
     
          
        
        {
          fact=fact*i;
        
        }
        sum=sum+fact;
        n=n/10;
      }
      if(temp==sum)
       System.out.println("Yes");
      else
        System.out.println("No");
    

  
	}
}