import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String s;
    char c;
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();
    c=s.charAt(0);
    if((c>='a' && c<='z') || (c>='A' && c<='Z')){
       System.out.println("Alphabet");
    }
    else {
      System.out.println("No");
    }
   }
}
