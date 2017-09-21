package git;
import java.util.*;
public class rect {

	public static void main(String[] args) {
		int r;
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		r=(x * y * (x+1) * (y+1)/4);
		
		System.out.println(r);
				
	}

}
