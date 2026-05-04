import java.util.Scanner;

public class HitungNilai {
    public static void main(String[] args) {
        // Bikin scanner biar bisa ngetik inputan di terminal
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PENILAIAN MAHASISWA ===");
        
        // 1. Cek SKS buat nentuin total pertemuan
        System.out.print("Mata kuliah ini berapa SKS? (2 atau 3): ");
        int sks = input.nextInt();

        int totalPertemuan = 0;
        if (sks == 3) {
            totalPertemuan = 21;
        } else if (sks == 2) {
            totalPertemuan = 14;
        } else {
            System.out.println("SKS yang didukung cuma 2 atau 3 bro. Ulangi programnya ya.");
            return; // Program langsung berhenti kalau SKS ngasal
        }

        // 2. Input data nilai
        System.out.print("Total kehadiran (dari maksimal " + totalPertemuan + " pertemuan): ");
        int hadir = input.nextInt();

        System.out.print("Masukkan nilai Tugas (0-100): ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS (0-100)  : ");
        double uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS (0-100)  : ");
        double uas = input.nextDouble();

        // 3. Proses hitung-hitungan
        // Ngitung persentase kehadiran dulu (dibikin (double) biar hasilnya bisa koma)
        double persenHadir = ((double) hadir / totalPertemuan) * 100;
        
        // Ngitung nilai akhir sesuai bobot
        double nilaiAkhir = (uts * 0.25) + (uas * 0.45) + (tugas * 0.20) + (persenHadir * 0.10);

        // 4. Penentuan Grade (A, B, C, D, E)
        String grade = "";
        
        // Ini rule sadisnya: kalau absen di bawah 70%, nilainya langsung nyungsep
        if (persenHadir < 70) {
            // Gue set default ke E aja ya, karena biasanya kalau kurang absen ya gagal/ngulang
            grade = "E (Auto-Lulus Tertunda karena kehadiran cuma " + String.format("%.1f", persenHadir) + "%)";
        } else {
            // Kalau absen aman, baru dicek nilai akhirnya dapet grade apa
            if (nilaiAkhir >= 80) {
                grade = "A";
            } else if (nilaiAkhir >= 70) {
                grade = "B";
            } else if (nilaiAkhir >= 60) {
                grade = "C";
            } else if (nilaiAkhir >= 50) {
                grade = "D";
            } else {
                grade = "E";
            }
        }

        // 5. Tampilin hasilnya
        System.out.println("\n=== REKAP HASIL AKHIR ===");
        System.out.println("Nilai Akhir (Angka) : " + String.format("%.2f", nilaiAkhir));
        System.out.println("Grade Mahasiswa     : " + grade);

        // Tutup scannernya biar memory-nya nggak bocor
        input.close();
    }
}