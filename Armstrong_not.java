import java.util.Scanner;
public class Armstrong_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0,d,t,t1;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		t1=t=n;
		while(n!=0) {
			n=n/10;
			count++;
		}
		while(t!=0) {
			d=t%10;
			sum=sum+Math.pow(d,count);
			t/=10;
		}
		if(t1==sum) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}

}
