import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    if(n<0){
       System.out.println("invalid");
    }

     else if(n%2==0){
        System.out.println("Even");
    }
    else if(n%2!=0){
        System.out.println("Odd");
    }
     

  }
}
