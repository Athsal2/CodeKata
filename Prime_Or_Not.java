import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n,flag=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=2;i<=n/2;i++){
      if(n%i==0){
         flag=1;
         break;
      }}
      if(flag==0){
         System.out.println("yes");

      }
       else{
          System.out.println("no");
       }
    
   
  
  }
}
