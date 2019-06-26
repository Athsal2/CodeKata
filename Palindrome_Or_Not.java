import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n,t,d,sum=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    t=n;
    while(t!=0){
       d=t%10;
       sum=(sum*10)+d;
       t/=10;
    }
    if(sum==n){
     System.out.println("yes");
    }
    else{
       System.out.println("no");
    }
    
  
  }
}
