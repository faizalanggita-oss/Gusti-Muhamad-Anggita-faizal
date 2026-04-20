import java.util.Scanner;

public class latihan_1 {
    public static void main(String[] args) {
        Scanner simpan = new Scanner(System.in);
        
        System.out.println("=== Program 1: Kondisi If-Else ===");
        System.out.print("Masukkan Pilihan (1/2): ");
        int pilihan = simpan.nextInt();
        simpan.nextLine(); // Membersihkan sisa baris baru (enter) dari nextInt

        // Logika IF sesuai di papan tulis
        if (pilihan == 1) {
            System.out.println("Kamu pilih Ayam Goreng");
            System.out.print("Masukkan Rasa: ");
            String rasa = simpan.nextLine();
            
            String menu = "Ayam Goreng";
            System.out.println("Pesanan dicatat: " + menu + " rasa " + rasa);
        } else {
            // Ini adalah blok S4 di flowchart jika pilihan bukan 1
            System.out.println("Kamu tidak memilih Ayam Goreng (Blok S4).");
        }
        
        simpan.close();
    }
}