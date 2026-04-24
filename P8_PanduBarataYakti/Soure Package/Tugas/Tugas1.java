
import java.util.Scanner;

public class Tugas1{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan;
        int hadir = 0;
        int total = 0;
        double nilaiKehadiran = 0;
        final double BATAS = 7.0;

        while (true) {

            System.out.println("\n=== MENU KEHADIRAN MAHASISWA ===");
            System.out.println("1. Input Kehadiran");
            System.out.println("2. Hitung Nilai Kehadiran");
            System.out.println("3. Cetak Hasil");
            System.out.println("4. Reset Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan total pertemuan: ");
                    total = input.nextInt();

                    if (total <= 0) {
                        System.out.println("Total tidak boleh 0 atau negatif!");
                        break;
                    }

                    hadir = 0;
                    for (int i = 1; i <= total; i++) {
                        int status;
                        do {
                            System.out.print("Pertemuan ke-" + i + " (1=hadir, 0=tidak): ");
                            status = input.nextInt();
                        } while (status != 0 && status != 1);

                        if (status == 1) {
                            hadir++;
                        }
                    }

                    System.out.println("Data kehadiran berhasil disimpan!");
                    break;

                case 2:
                    if (total == 0) {
                        System.out.println("Silakan input data terlebih dahulu!");
                        break;
                    }

                    nilaiKehadiran = ((double) hadir / total) * 10;
                    System.out.println("Nilai Kehadiran: " + nilaiKehadiran);

                    if (nilaiKehadiran < BATAS) {
                        System.out.println("⚠️ Nilai kehadiran tidak mencukupi!");
                        continue;
                    }
                    break;

                case 3:
                    if (total == 0) {
                        System.out.println("Data belum tersedia!");
                        break;
                    }

                    nilaiKehadiran = ((double) hadir / total) * 10;

                    if (nilaiKehadiran < BATAS) {
                        System.out.println("⚠️ Tidak memenuhi syarat kehadiran!");
                        continue;
                    }

                    System.out.println("\n=== HASIL ===");
                    System.out.println("Total Pertemuan : " + total);
                    System.out.println("Jumlah Hadir    : " + hadir);
                    System.out.println("Nilai Kehadiran : " + nilaiKehadiran);
                    System.out.println("Status          : LULUS");
                    break;

                case 4:
                    hadir = 0;
                    total = 0;
                    nilaiKehadiran = 0;
                    System.out.println("Data berhasil direset!");
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}