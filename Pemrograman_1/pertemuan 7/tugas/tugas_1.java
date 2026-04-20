import java.util.Scanner;

public class tugas_1 {
    public static void main(String[] args) {
        Scanner simpan = new Scanner(System.in);
        
        int harga = 0;
        String menuUtama = "";
        
        System.out.println("=======================================");
        System.out.println("      KEDAI SUKA AYAM     ");
        System.out.println("=======================================");
        System.out.println("1. Paket Ayam Goreng Krispi");
        System.out.println("2. Paket Ayam Bakar Madu");
        System.out.println("3. Paket Burger Ayam");
        System.out.println("=======================================");
        System.out.print("Pilih Menu (1-3): ");
        int pilihan = simpan.nextInt();
        simpan.nextLine(); // Membersihkan sisa enter

        // Menggunakan IF - ELSE IF - ELSE untuk variasi pilihan
        if (pilihan == 1) {
            harga = 25000;
            System.out.print("Pilih Bagian (Dada/Paha): ");
            String bagian = simpan.nextLine();
            System.out.print("Pilih Rasa (Original/Spicy): ");
            String rasa = simpan.nextLine();
            menuUtama = "Ayam Goreng " + bagian + " (" + rasa + ")";
            
        } else if (pilihan == 2) {
            harga = 30000;
            System.out.print("Tingkat Kepedasan (Sedang/Pedas): ");
            String pedas = simpan.nextLine();
            menuUtama = "Ayam Bakar Madu level " + pedas;
            
        } else if (pilihan == 3) {
            harga = 20000;
            menuUtama = "Burger Ayam";
            System.out.print("Tambah Keju Rp5.000? (y/n): ");
            String keju = simpan.nextLine();
            
            // Nested IF (IF di dalam IF) untuk tambahan topping
            if (keju.equalsIgnoreCase("y")) {
                harga += 5000; 
                menuUtama += " (+Keju)";
            }
            
        } else {
            System.out.println("\n[!] Maaf, pilihan menu tidak tersedia.");
            System.exit(0); // Menghentikan program jika input salah
        }

        // Meminta jumlah porsi dan menghitung total biaya
        System.out.print("\nBerapa porsi yang dipesan? ");
        int porsi = simpan.nextInt();
        int totalHarga = harga * porsi;

        // Mencetak Struk Kasir
        System.out.println("\n=======================================");
        System.out.println("             STRUK PESANAN             ");
        System.out.println("=======================================");
        System.out.println("Menu       : " + menuUtama);
        System.out.println("Harga/Item : Rp " + harga);
        System.out.println("Jumlah     : " + porsi + " porsi");
        System.out.println("---------------------------------------");
        System.out.println("TOTAL BAYAR: Rp " + totalHarga);
        System.out.println("=======================================");
        
        simpan.close();
    }
}