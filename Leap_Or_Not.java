import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    if(n%4==0){
       System.out.println("yes");
    }
    else{
      System.out.println("no");
    }
    
  }
}
