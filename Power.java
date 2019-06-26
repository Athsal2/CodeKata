import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a,b,res=1;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    for(int i=0;i<b;i++){
      res*=a;
    }
    System.out.println(res);
  
  }
}
