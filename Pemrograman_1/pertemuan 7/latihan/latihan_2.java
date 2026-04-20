import java.util.Scanner;

public class latihan_2 {
    public static void main(String[] args) {
        Scanner simpan = new Scanner(System.in);
        
        // --- Bagian Switch (Pilih Hewan) ---
        System.out.println("=== Program 2: Kondisi Switch ===");
        System.out.print("Masukkan Huruf (a/b): ");
        String huruf = simpan.nextLine();
        String hewan = "";

        // Logika Switch sesuai di papan tulis
        switch (huruf) {
            case "a":
                hewan = "Ayam";
                break;
            case "b":
                hewan = "Beruang";
                break;
            default:
                hewan = "Pilihan tidak valid";
        }
        System.out.println("Hewan terpilih: " + hewan);

        System.out.println("\n---------------------------------\n");

        // --- Bagian Logika OR (Cek Status Diterima/Ditolak) ---
        System.out.println("=== Operator Logika OR (||) ===");
        System.out.print("Masukkan nilai f: ");
        String f = simpan.nextLine();
        
        System.out.print("Masukkan nilai m: ");
        String m = simpan.nextLine();

        // Logika IF dengan OR sesuai coretan kanan papan tulis
        if (f.equals("g") || m.equals("k")) {
            System.out.println("Status: Diterima");
        } else {
            System.out.println("Status: Tolak");
        }
        
        simpan.close();
    }
}