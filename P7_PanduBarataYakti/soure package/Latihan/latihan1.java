
import java.util.Scanner;

public class latihan1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        String nama = "";
        String jurusan = "Teknik Informatika";

        System.out.println("Masukan pilihan:");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Jurusan lain");
        System.out.print("Input pilihan: ");
        
        pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            System.out.print("Input Nama: ");
            nama = input.nextLine();
        } else {
            System.out.println("Jurusan tidak di temukan");
        }

        if (pilihan == 1) {
            System.out.println("\n=== HASIL ===");
            System.out.println("Nama: " + nama);
            System.out.println("Jurusan: " + jurusan);
        }
    }
}