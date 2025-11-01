import java.awt.*;
import java.util.Scanner;

public class ucgenAlanHesaplama
{
    static void main() {

        double a , b , c , u, alan;

        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin ilk kenar uzunluğunu giriniz:");
        a = input.nextDouble();
        System.out.println("Üçgenin ikinci kenar uzunluğunu giriniz:");
        b = input.nextDouble();
        System.out.println("Üçgenin üçüncü kenar uzunluğunu giriniz:");
        c = input.nextDouble();

        u = (a+b+c) / 2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı:\t"+alan+"dir.");





    }
}
