package praktikum5;
import java.util.Scanner;
public class pemilihanBilangan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan sebuah angka : ");
        int angka = sc.nextInt();
        String hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println("Angka " + angka + " termasuk " + hasil);

        sc.close();
    }
}
