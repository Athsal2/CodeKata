import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n,k,sum=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
       }
       k=sc.nextInt();
    for(int i=0;i<k;i++){     
       sum+=a[i];
       }
       System.out.println(sum);
       
       

    
  }
}
