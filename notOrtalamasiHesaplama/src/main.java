import java.util.Scanner;

public class main {
    static void main()
    {
        int Kimya,Biyoloji, Matematik, Fizik;

        Scanner input = new Scanner(System.in);

        System.out.println("Kimya Notunuzu Giriniz: ");
        Kimya = input.nextInt();

        System.out.println("Biyoloji Notunuzu Giriniz: ");
        Biyoloji = input.nextInt();

        System.out.println("Matematik Notunuzu Giriniz: ");
        Matematik = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz: ");
        Fizik = input.nextInt();

        int ortalama = (Kimya + Biyoloji + Matematik + Fizik) / 4 ;

        String sonuc = (ortalama < 60) ? "Sınıfta Kaldı" : "Sınıfı Geçti";
        System.out.println(sonuc);

    }
}
