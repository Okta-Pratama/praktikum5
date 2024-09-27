import java.util.Scanner;

public class Kafe22 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukkan menu: ");
        menu = sc.nextLine();
        System.out.print("Masukkan ukuran cup (S/M/L): ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();
        
        double hargaMenu = 0;
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 10000;
                break;
            case "coklat":
                hargaMenu = 7000;
                break;
            default:
                hargaMenu = 0;
                break;
        }

        double totalHarga = hargaMenu * jumlah;

        switch (Character.toUpperCase(ukuranCup)) {
            case 'S':
            break;
            case 'M':
            totalHarga += 0.25 * totalHarga;
            break;
            case 'L':
            totalHarga += 0.4 * totalHarga;
                break; 
            default:
                System.out.println("Ukuran cup tidak valid.");
                return;

        }

        double diskon = (keanggotaan) ? 0.1 : 0.0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup: " + ukuranCup);
        System.out.println("Nominal bayar: Rp" + nominalBayar);

        sc.close();
    }
}
