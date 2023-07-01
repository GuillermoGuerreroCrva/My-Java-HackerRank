import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)  {
            String s1=sc.next();
            int x=sc.nextInt();

            String numeroComoCadena = String.valueOf(x);
            int cantidadDeDigitos = numeroComoCadena.length();

            if (cantidadDeDigitos == 1) {
                System.out.printf("%-15s00%d %n", s1, x);
            } else if (cantidadDeDigitos == 2) {
                System.out.printf("%-15s0%d %n", s1, x);
            } else {
                System.out.printf("%-15s%d %n", s1, x);
            }
        }
        System.out.println("================================");

    }
}
