import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String s;
    char c;
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();
    c=s.charAt(0);
    if(!(Character.isLetter(c))) {
       System.out.println("invalid");
    }
    else if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
       System.out.println("Vowel");
    }

     else if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O' && c!='U'){
        System.out.println("Consonant");
    }
   }
}
