public class fibo {

	public static void main(String[] args) {
		int t1=0, t2=1,c=20,nxt;
		System.out.println(t1+" "+t2);
		for(int i=2;i<c;i++)
		{
			nxt=t1+t2;
			System.out.println(nxt);
			t1=t2;
			t2=nxt;
		}
	}

}
