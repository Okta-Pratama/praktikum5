import java.util.Scanner;

public class indikatorUsia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan usia anda : ");
        int usia = sc.nextInt();

        if ((usia >= 0) && (usia <= 12)) {
            System.out.println("anak");
        } else if ((usia >= 13) && (usia <= 19)) {
            System.out.println("remaja");
        }else if ((usia >= 20) && (usia <= 64)) {
            System.out.println("dewasa");
        }else if (usia >= 65) {
            System.out.println("lansia");
        } else {
            System.out.println("Invalid Number");
        }
        System.out.println("Usia Anda : " + usia);
    }
}
