// 

import java.util.Scanner;

public class KehadiranMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan;
        int hadir = 0;
        int total = 0;
        double nilaiKehadiran;

        while (true) { 

            System.out.println("\n=== MENU ===");
            System.out.println("1. Input Kehadiran");
            System.out.println("2. Hitung Nilai Kehadiran");
            System.out.println("3. Cetak Hasil");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan total pertemuan: ");
                    total = input.nextInt();

                    hadir = 0;
                    for (int i = 1; i <= total; i++) {
                        System.out.print("Pertemuan ke-" + i + " (1=hadir, 0=tidak): ");
                        int status = input.nextInt();
                        if (status == 1) {
                            hadir++;
                        }
                    }
                    break;

                case 2:
                    if (total != 0) {
                        nilaiKehadiran = ((double) hadir / total) * 10;
                        System.out.println("Nilai Kehadiran: " + nilaiKehadiran);
                    } else {
                        System.out.println("Data belum diinput!");
                    }
                    break;

                case 3:
                    nilaiKehadiran = ((double) hadir / total) * 10;
                    System.out.println("\n=== HASIL ===");
                    System.out.println("Hadir: " + hadir);
                    System.out.println("Total: " + total);
                    System.out.println("Nilai Kehadiran: " + nilaiKehadiran);
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    return; 

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}