
import java.util.Scanner;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class gaya {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Nilai Massa Benda (m) ");
        System.out.println(" *************************************************************");

        double m = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai Percepatan (a) ");
        System.out.println(" ************************************************************* ");

        double a = sc.nextInt();

        double f = m * a;

        System.out.println(" *********************************************************** ");
        System.out.println(" *Maka Nilai Gaya = " + f);
        System.out.println(" ********************************************************** ");
    }
}
