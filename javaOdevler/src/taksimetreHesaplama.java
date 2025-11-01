import java.util.Scanner;

public class taksimetreHesaplama {
    static void main() {
        int gidilenKm;
        double anlikTutar,
                toplamTutar,
                kmBasiTutar = 2.20,
                minTutar = 20.0,
                acilisTutar = 10.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Taksi İle Gidilen KM yi giriniz: ");
        gidilenKm = input.nextInt();

        anlikTutar = (kmBasiTutar * gidilenKm) + acilisTutar;

        toplamTutar = (anlikTutar < 20) ? 20 : anlikTutar;
        System.out.println("Toplam Tutar:" + toplamTutar);
    }
}
