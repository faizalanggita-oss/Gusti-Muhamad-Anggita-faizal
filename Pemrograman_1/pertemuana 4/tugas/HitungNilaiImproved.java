/*
 * Nama : Gusti Muhamad A.F
 * NIM  : 241011402467
 * Kelas: 04TPLP005
 */

import java.util.Scanner;

public class HitungNilaiImproved {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;

        // Nampilin header identitas di console
        System.out.println("======================================");
        System.out.println("Nama : Gusti Muhamad A.F");
        System.out.println("NIM  : 241011402467");
        System.out.println("Kelas: 03TPLP005");
        System.out.println("======================================");

        // Pakai do-while biar program bisa diulang
        do {
            System.out.println("\n--- INPUT DATA NILAI ---");
            
            // Validasi SKS
            int sks = 0;
            while (sks != 2 && sks != 3) {
                System.out.print("Mata kuliah berapa SKS? (2 atau 3): ");
                sks = input.nextInt();
                if (sks != 2 && sks != 3) {
                    System.out.println("Bro, SKS pilih 2 atau 3 aja ya. Coba lagi.");
                }
            }

            int totalPertemuan = (sks == 3) ? 21 : 14;

            // Validasi Kehadiran
            int hadir = -1;
            while (hadir < 0 || hadir > totalPertemuan) {
                System.out.print("Total kehadiran (0 - " + totalPertemuan + "): ");
                hadir = input.nextInt();
                if (hadir < 0 || hadir > totalPertemuan) {
                    System.out.println("Input nggak valid, masa kehadirannya lebih dari total pertemuan? Ulang ya.");
                }
            }

            // Fungsi buat ngambil input nilai biar kodenya nggak kepanjangan (DRY - Don't Repeat Yourself)
            double tugas = inputNilai(input, "Tugas");
            double uts = inputNilai(input, "UTS");
            double uas = inputNilai(input, "UAS");

            // Proses hitung-hitungan
            double persenHadir = ((double) hadir / totalPertemuan) * 100;
            double nilaiAkhir = (uts * 0.25) + (uas * 0.45) + (tugas * 0.20) + (persenHadir * 0.10);
            String grade = "";
            
            // Logika absen < 70% langsung nyungsep
            if (persenHadir < 70) {
                grade = "E (Tidak Lulus: Kehadiran cuma " + String.format("%.1f", persenHadir) + "%)";
            } else {
                if (nilaiAkhir >= 80) grade = "A";
                else if (nilaiAkhir >= 70) grade = "B";
                else if (nilaiAkhir >= 60) grade = "C";
                else if (nilaiAkhir >= 50) grade = "D";
                else grade = "E";
            }

            // Tampilin hasil
            System.out.println("\n=== REKAP HASIL AKHIR ===");
            System.out.println("Nilai Akhir : " + String.format("%.2f", nilaiAkhir));
            System.out.println("Grade       : " + grade);
            System.out.println("=========================");

            // Nanya mau ngulang atau udahan
            System.out.print("\nMau hitung nilai lagi? (y/n): ");
            ulang = input.next();

        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("\nSip, program selesai. Thank you!");
        input.close();
    }

    // Method khusus buat validasi input nilai (0-100) biar bersih kodenya di atas
    public static double inputNilai(Scanner scanner, String jenis) {
        double nilai = -1;
        while (nilai < 0 || nilai > 100) {
            System.out.print("Masukkan nilai " + jenis + " (0-100): ");
            nilai = scanner.nextDouble();
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai harus di antara 0 sampai 100 bro. Masukin yang bener.");
            }
        }
        return nilai;
    }
}