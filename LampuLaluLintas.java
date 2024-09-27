import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan warna lampu lalu lintas (merah/kuning/hijau): ");
        String warnaLampu = scanner.nextLine().toLowerCase();
        
        switch (warnaLampu) {
            case "merah":
                System.out.println("Tindakan: Berhenti");
                break;
            case "kuning":
                System.out.println("Tindakan: Hati-hati");
                break;
            case "hijau":
                System.out.println("Tindakan: Jalan");
                break;
            default:
                System.out.println("Warna lampu tidak valid");
                break;
        }
        
        scanner.close();
    }
}
