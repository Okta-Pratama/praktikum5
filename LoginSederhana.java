import java.util.Scanner;

public class LoginSederhana {
    public static void main(String[] args) {
        String storedUsername = "admin";
        String storedPassword = "12345";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();
        
        if (inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword)) {
            System.out.println("Login berhasil, selamat datang!");
        } else {
            System.out.println("User dan password salah");
        }
        
        scanner.close();
    }
}
