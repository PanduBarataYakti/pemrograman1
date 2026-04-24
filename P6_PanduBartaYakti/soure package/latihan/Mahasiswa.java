import javax.swing.JOptionPane;

public class Mahasiswa {

    private String nama;

    
    public void setNama(String nama) {
        this.nama = nama;
    }

    
    public String getNama() {
        return nama;
    }

    
    public String getPesan() {
        return "Hello " + nama +
               "\nLanjutkan belajarnya pasti menjadi programmer Java!";
    }

    public static void main(String[] args) {

        Mahasiswa M[] = new Mahasiswa[2];

        
        M[0] = new Mahasiswa();
        M[1] = new Mahasiswa();

        
        for (int i = 0; i < 2; i++) {
            String inputNama = JOptionPane.showInputDialog("Masukkan nama ke-" + (i + 1) + " : ");
            M[i].setNama(inputNama);
        }

        
        for (int i = 0; i < 2; i++) {
            JOptionPane.showMessageDialog(null,
                    "Data Mahasiswa ke-" + (i + 1) + "\n" +
                    "Nama : " + M[i].getNama() + "\n" +
                    M[i].getPesan());
        }
    }
}