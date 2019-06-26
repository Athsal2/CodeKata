import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n,count=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    while(n!=0){
         n/=10;
         count++;
    } System.out.println(count);
  
  }
}
