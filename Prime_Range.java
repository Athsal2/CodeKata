import java.util.Scanner;
public class Prime_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int st,en,count=1;
		Scanner sc=new Scanner(System.in);
		//System.out.println("Get the Starting Number");
		st=sc.nextInt();
		//System.out.println("Get the Ending Number");
		en=sc.nextInt();
		for(int i=st+1;i<en;i++) {
			if(i==0||i==1) {
				
			}
		
			else {
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						count++;
						
					}
				}
				
				 if(count<2) {
					System.out.print(i+" ");
				}
				
				}
			count=1;
				
				
			}
		
			}


	

}
