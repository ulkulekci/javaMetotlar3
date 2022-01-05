import java.util.Scanner;
public class Main {
static int carp(int a,int b) {
           int x=1;
          if (b > 1) {
               if(b>x&&b%2==1){
              x=a;
               }
              b=b-2;
               a=a*a;
               return x*carp(a, b);
     }
   return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban degeri giriniz:");
        int a= input.nextInt();
        System.out.print("Us degerini giriniz:");
        int b= input.nextInt();
System.out.println(carp(a,b));

    }
}
