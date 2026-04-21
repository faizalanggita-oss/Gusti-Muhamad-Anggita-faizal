import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        System.out.println("nama:Gusti Muhamad A.F 04TPLP005 NIM:241011402467\n");

        Scanner scanner = new Scanner(System.in);
        int totalPertemuan = 21;
        double batasKehadiran = totalPertemuan * 0.75; 

        System.out.println("=========================================");
        System.out.println("       SISTEM PENGECEKAN KEHADIRAN       ");
        System.out.println("=========================================");
        System.out.println("[1] Cek Status Kehadiran Kelulusan");
        System.out.println("[0] Keluar dari Program");
        System.out.println("=========================================");
        
        // S1: input pilihan
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        // Kondisi IF
        if (pilihan == 1) {
            System.out.println("\n>>> Memulai Analisis Data Kehadiran...");
            
            // S2: input kehadiran awal
            System.out.print("Masukkan total kehadiran Anda (Max 21): ");
            int kehadiran = scanner.nextInt();

            // Diamond "for": Loop jika kehadiran di bawah 75%
            while (kehadiran < batasKehadiran) {
                double persentase = ((double) kehadiran / totalPertemuan) * 100;
                
                System.out.println("\n-----------------------------------------");
                System.out.println(" ❌ STATUS: GAGAL (TIDAK MEMENUHI SYARAT)");
                System.out.printf(" Persentase saat ini: %.2f%%\n", persentase);
                System.out.println(" Syarat minimal kehadiran adalah 75%");
                System.out.println("-----------------------------------------");
                
                // S3: Meminta input data lagi karena masih "stuck" di kondisi kurang dari 75%
                System.out.print("Silakan masukkan ulang data kehadiran: ");
                kehadiran = scanner.nextInt();
            }

            // S4: Cetak kehadiran (Arah panah False, keluar dari loop)
            double persentaseAkhir = ((double) kehadiran / totalPertemuan) * 100;
            
            System.out.println("\n=========================================");
            System.out.println("  ✅ STATUS: BERHASIL MEMENUHI SYARAT  ");
            System.out.println("=========================================");
            System.out.println(" Total Kehadiran : " + kehadiran + " dari " + totalPertemuan + " pertemuan");
            System.out.printf(" Persentase Akhir: %.2f%%\n", persentaseAkhir);
            System.out.println(" Data berhasil divalidasi.");
            System.out.println("=========================================");
            
        } else {
            System.out.println("\nProgram dihentikan. Sampai jumpa!");
        }

        scanner.close();
    }
}