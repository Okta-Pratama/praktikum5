import java.util.Scanner;

public class SIAKAD22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        System.out.print("Masukkan kelas: ");
        String kelas = sc.nextLine();

        System.out.print("Masukkan nomor absen: ");
        int absen = sc.nextInt();

        System.out.print("Masukkan nilai kuis (0-100): ");
        double nilaiKuis = sc.nextDouble();

        System.out.print("Masukkan nilai tugas (0-100): ");
        double nilaiTugas = sc.nextDouble();

        System.out.print("Masukkan nilai ujian (0-100): ");
        double nilaiUjian = sc.nextDouble();

        if (nilaiKuis < 0 || nilaiKuis > 100 || nilaiTugas < 0 || nilaiTugas > 100 || nilaiUjian < 0 || nilaiUjian > 100) {
            System.out.println("Nilai yang dimasukkan harus berada dalam rentang 0-100.");
            return;
        }

        double nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.3) + (nilaiUjian * 0.5);
        
        String nilaiHuruf;
        String kualifikasi;

        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 40 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.println("\nMahasiswa dengan nama " + nama + " (NIM " + nim + ") dari kelas " + kelas + " dengan nomor absen " + absen);
        System.out.printf("Nilai akhir: %.2f\n", nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);

        sc.close(); 
    }
}
