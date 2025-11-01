import java.util.Scanner;

public class kdvHesaplama {
    static void main() {

        double tutar , kdvOran, kdvTutar, toplamTutar ;

        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz:");
        tutar = input.nextDouble();

        if (tutar < 1000)
        {
            kdvOran = 0.18;
            kdvTutar = tutar * kdvOran;
            toplamTutar = tutar + kdvTutar;
            System.out.println("KDV Oranı: \t%"+kdvOran*100 );
            System.out.println("Kdv Tutarı:\t"+kdvTutar + "\t₺");
            System.out.println("Top. Tutar:\t"+toplamTutar + "\t₺");
        }
        else if (tutar >= 1000)
        {
            kdvOran = 0.8;
            kdvTutar = tutar * kdvOran;
            toplamTutar = tutar + kdvTutar;
            System.out.println("KDV Oranı: \t%"+ kdvOran*100 );
            System.out.println("Kdv Tutarı:\t"+kdvTutar + "\t₺");
            System.out.println("Top. Tutar:\t"+toplamTutar + "\t₺");
        }
    }
}
