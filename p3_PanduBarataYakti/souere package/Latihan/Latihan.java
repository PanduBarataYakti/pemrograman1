import javax.swing.JOptionPane;

public class Latihan {
    public static void main(String[] args) {

        String nama = "";

        // Input nama
        nama = JOptionPane.showInputDialog("Ketik nama anda : ");

        // Pesan output
        String msg = "Hello " + nama + 
                     "\nLanjutkan belajarnya pasti menjadi programmer Java!";

        // Tampilkan pesan
        JOptionPane.showMessageDialog(null, msg);
    }
}