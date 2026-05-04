/*
 * Nama : Gusti Muhamad A.F
 * NIM  : 241011402467
 * Kelas: 04TPLP005
 */

import java.util.Scanner;

public class SistemPartyRPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data karakter pakai array (ada 3 array yang saling berhubungan)
        String[] namaKarakter = {"Dan Heng", "March 7th", "Trailblazer", "Himeko"};
        String[] elemen = {"Wind", "Ice", "Physical", "Fire"};
        int[] damage = {1200, 800, 1500, 2000};

        System.out.println("=== DAFTAR KARAKTER PARTY ===");
        // Looping buat nampilin semua karakter dari array
        for (int i = 0; i < namaKarakter.length; i++) {
            System.out.println((i + 1) + ". " + namaKarakter[i] + " | Elemen: " + elemen[i] + " | Base DMG: " + damage[i]);
        }

        // Simulasi darah musuh
        int hpBoss = 5000;
        System.out.println("\n[!] PERINGATAN: Boss muncul dengan HP: " + hpBoss);

        // User disuruh milih siapa yang mau nyerang
        System.out.print("\nPilih nomor karakter untuk menyerang Boss (1-4): ");
        int pilihan = input.nextInt(); 

        // Index array itu mulai dari 0, jadi inputan user harus dikurangin 1
        int indexKarakter = pilihan - 1;

        // Validasi simpel biar program gak crash (Out of Bounds) kalau user masukin angka ngasal
        if (indexKarakter >= 0 && indexKarakter < namaKarakter.length) {
            System.out.println("\n>>> " + namaKarakter[indexKarakter] + " melancarkan serangan elemen " + elemen[indexKarakter] + "!");
            
            // Ngurangin darah boss sesuai damage karakter yang dipilih
            hpBoss -= damage[indexKarakter];

            System.out.println("Sisa HP Boss sekarang: " + hpBoss);
            
            // Cek status musuhnya
            if (hpBoss <= 0) {
                System.out.println("MANTAP! Boss berhasil dikalahkan!");
            } else {
                System.out.println("Boss masih berdiri, butuh serangan lagi nih!");
            }
        } else {
            System.out.println("\nKarakter nggak ada di daftar! Lu nyerang angin, Bossnya ngetawain.");
        }

        input.close();
    }
}