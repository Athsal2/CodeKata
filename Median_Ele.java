import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
		int a[]=new int[n];
    for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
    }
   System.out.println(a[(n/2)-1]);
  	}}
