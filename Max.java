import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,max;
		Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
		int a[]=new int[n];
    for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
    }
    max=a[0];
     for(int i=1;i<n;i++){
        if(a[i]>max){
           max=a[i];
        }
    }
 System.out.println(max);	}}
