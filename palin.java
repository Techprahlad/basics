package git;
import java.util.*;

public class palin {

	public static void main(String[] args) 
	{
		int r,sum = 0;
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int tmp=x;
		while(x>0)
		{
			r=x%10;		
			sum=(sum*10)+r;
			x=x/10;
		}
		if(sum == tmp)
		{
		System.out.println("it is palindrome");	
		}
		else
		{
			System.out.println("it is not palindrome");
		}
		
	}

}
