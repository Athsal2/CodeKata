import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int st,en;
		Scanner sc=new Scanner(System.in);
		st=sc.nextInt();
		en=sc.nextInt();
		for(int i=st+1;i<en;i++) {
			  if(i%2==0) {
				  System.out.print(i+" ");
			  }
			  
		}
		

	}

}
