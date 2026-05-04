import java.util.Scanner;

public class latihan_5 {
    public static void main(String[] args) {
        /*
        Nama  : Gusti Muhamad A.F
        NIM   : 241011402467
        Kelas : 04TPLP005
        */

        // Membuat objek Scanner untuk menerima input dari keyboard
        Scanner simpan = new Scanner(System.in);
        
        int pilihan;
        String detail = "";
        String jenisServis = "";

        // Menampilkan pilihan layanan (S1)
        System.out.println("Bengkel Servis Honda Beat");
        System.out.println("1. Ganti Oli");
        System.out.println("2. Ganti Vanbelt");
        System.out.print("Masukkan pilihan servis Anda (1/2): ");
        
        // Membaca input pilihan
        pilihan = simpan.nextInt();
        
        // Membersihkan buffer 'newline'
        simpan.nextLine(); 

        // Kondisi if-else
        if (pilihan == 1) {
            // Blok S2 (jika kondisi true)
            System.out.println("Kamu memilih layanan Ganti Oli.");
            System.out.print("Masukkan tipe oli (Oli Mesin / Oli Gardan): ");
            detail = simpan.nextLine();
            jenisServis = "Ganti Oli";
        } else {
            // Blok S3 (jika kondisi false)
            System.out.println("Kamu memilih layanan Ganti Vanbelt.");
            jenisServis = "Ganti Vanbelt";
            detail = "Pengecekan dan penggantian v-belt standar";
        }

        // Output akhir (S4)
        System.out.println("\n=== Ringkasan Servis ===");
        System.out.println("Jenis Servis : " + jenisServis);
        System.out.println("Keterangan   : " + detail);

        // Menutup scanner
        simpan.close();
    }
}