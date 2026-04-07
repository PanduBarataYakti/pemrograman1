import java.util.Scanner;

public class latihan1 {
    public static void main(String args[]) {

        try (Scanner input = new Scanner(System.in)) {
            float Kehadiran;
            float Realisasi;
            float Tugas;
            float Nilai_Uts;
            float Nilai_Uas;

            float Relasi_Tugas = 20f / 100;
            float Relasi_Uts = 30f / 100;
            float Relasi_Uas = 40f / 100;

            System.out.println("------------------------");

            // Input kehadiran & realisasi
            System.out.print("Input Jumlah Kehadiran : ");
            Kehadiran = input.nextFloat();

            System.out.print("Input Total Realisasi  : ");
            Realisasi = input.nextFloat();

            System.out.print("Input Tugas : ");
            Tugas = input.nextFloat();

            System.out.print("Input Nilai UTS : ");
            Nilai_Uts = input.nextFloat();

            System.out.print("Input Nilai UAS : ");
            Nilai_Uas = input.nextFloat();

            // Perhitungan
            float nilaiKehadiran = (Kehadiran / Realisasi) * 10;
            float totalTugas = Tugas * Relasi_Tugas;
            float totalUTS = Nilai_Uts * Relasi_Uts;
            float totalUAS = Nilai_Uas * Relasi_Uas;

            float totalAkhir = nilaiKehadiran + totalTugas + totalUTS + totalUAS;

            System.out.println("\n===== HASIL =====");
            System.out.println("Nilai Kehadiran : " + nilaiKehadiran);
            System.out.println("Nilai Tugas     : " + totalTugas);
            System.out.println("Nilai UTS       : " + totalUTS);
            System.out.println("Nilai UAS       : " + totalUAS);

            System.out.println("------------------------");
            System.out.println("TOTAL AKHIR     : " + totalAkhir);
        }
    }
}