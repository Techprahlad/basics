package git;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		int r,flg=0;
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
			{
				System.out.println("not prime");
				flg = 1;
				break;
			}
		}	
			if(flg==0)
			{
				System.out.println("Prime number");
			}
		}
			
		
	}
