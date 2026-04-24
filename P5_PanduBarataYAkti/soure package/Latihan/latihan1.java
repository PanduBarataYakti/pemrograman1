import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String bacaInput = "";
        int jmlData = 0;
        int dataArray[];

        System.out.print("Jumlah data : ");

        try {
            bacaInput = dataIn.readLine();
            jmlData = Integer.parseInt(bacaInput);
        } catch (IOException e) {
            System.out.println("Ada kesalahan!");
        }

        dataArray = new int[jmlData];

        // Input data
        System.out.println();
        for (int i = 0; i < jmlData; i++) {
            System.out.print("DataArray[" + i + "] = ");
            try {
                bacaInput = dataIn.readLine();
                dataArray[i] = Integer.parseInt(bacaInput);
            } catch (IOException e) {
                System.out.println("Ada kesalahan!");
            }
        }

        // Menampilkan data awal
        System.out.println("\nData yang diinput:");
        for (int i = 0; i < jmlData; i++) {
            System.out.println("DataArray[" + i + "] = " + dataArray[i]);
        }

        // Mencari nilai maksimum & minimum
        int max = dataArray[0];
        int min = dataArray[0];

        for (int i = 1; i < jmlData; i++) {
            if (dataArray[i] > max) {
                max = dataArray[i];
            }
            if (dataArray[i] < min) {
                min = dataArray[i];
            }
        }

        System.out.println("\nNilai Maksimum = " + max);
        System.out.println("Nilai Minimum  = " + min);

        // Sorting (Ascending - Bubble Sort)
        for (int i = 0; i < jmlData - 1; i++) {
            for (int j = 0; j < jmlData - i - 1; j++) {
                if (dataArray[j] > dataArray[j + 1]) {
                    int temp = dataArray[j];
                    dataArray[j] = dataArray[j + 1];
                    dataArray[j + 1] = temp;
                }
            }
        }

        // Menampilkan hasil sorting
        System.out.println("\nData setelah diurutkan (Ascending):");
        for (int i = 0; i < jmlData; i++) {
            System.out.println(dataArray[i]);
        }
    }
}