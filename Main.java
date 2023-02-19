import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza hoşgediniz. Faiz oranı %8");

        int anapara,vade;
        System.out.print("Yatırmak istediğiniz miktar : ");
        anapara = scanner.nextInt();
        System.out.print("Kaç yıl vadeli para yatırmak istiyorsunuz : ");
        vade = scanner.nextInt();

        double toplampara = anapara;
        double faizorani = 0.06;

        for (int i = 1; i <= vade ; i++) {

            toplampara = (toplampara * faizorani) + toplampara;

            System.out.println(i + ". yılın sonunda toplam para : " + toplampara);
        }
    }
}
//erdemacar6