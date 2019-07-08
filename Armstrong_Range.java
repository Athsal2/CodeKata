import java.util.Scanner;

public class Armstrong_Bet_Inte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count,t,n,d,st,en;
	      double sum=0;
	    Scanner sc=new Scanner(System.in);
		//System.out.println("Enter start number");
		st=sc.nextInt();
		//System.out.println("Enter end number");
		en=sc.nextInt();
		for(int i=st+1;i<en;i++) {
		count=t=n=0;
		 n=t=i;
		 while(n!=0) {
			n/=10;
			count++;}
		while(t!=0) {
			d=t%10;
			sum=sum+Math.pow(d,count);
			t/=10;
		}
		//System.out.println(sum);
		if(i==sum) {
			System.out.println(i+" ");
		}
		}}}
