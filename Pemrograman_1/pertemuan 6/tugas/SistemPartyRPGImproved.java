/*
 * Nama : Gusti Muhamad A.F
 * NIM  : 241011402467
 * Kelas: 04TPLP005
 */

import java.util.Scanner;

public class SistemPartyRPGImproved {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data party kita
        String[] namaKarakter = {"Dan Heng", "March 7th", "Trailblazer", "Himeko"};
        String[] elemen = {"Wind", "Ice", "Physical", "Fire"};
        int[] baseDamage = {1200, 800, 1500, 2000};

        int hpBoss = 10000; // HP boss sengaja digedein biar pertarungannya panjang
        int turn = 1; // Penghitung giliran (Turn)

        // Nampilin header identitas
        System.out.println("======================================");
        System.out.println("Nama : Gusti Muhamad A.F");
        System.out.println("NIM  : 241011402467");
        System.out.println("Kelas: 03TPLP005");
        System.out.println("======================================\n");

        System.out.println("🚨 WARNING: BOSS MUNCUL DENGAN HP: " + hpBoss + " 🚨\n");

        // Perulangan bakal terus jalan selama Boss masih hidup (HP > 0)
        while (hpBoss > 0) {
            System.out.println("--- Turn " + turn + " ---");
            System.out.println("Pilih Karakter untuk Serang Boss:");
            
            // Looping buat nampilin menu karakter
            for (int i = 0; i < namaKarakter.length; i++) {
                System.out.println((i + 1) + ". " + namaKarakter[i] + " (" + elemen[i] + ")");
            }

            System.out.print("Masukkan nomor (1-4): ");
            int pilihan = input.nextInt();
            int index = pilihan - 1; // Disesuaikan ke index array

            if (index >= 0 && index < namaKarakter.length) {
                System.out.println("\n>>> " + namaKarakter[index] + " maju menyerang!");

                int damageAkhir = baseDamage[index];
                
                // Sistem gacha peluang Critical Hit (peluang 30%)
                double gachaCrit = Math.random(); 
                if (gachaCrit <= 0.30) {
                    System.out.println("💥 CRITICAL HIT! Serangan super telak!");
                    damageAkhir = (int) (baseDamage[index] * 1.5); // Damage dikali 1.5 (naik 50%)
                }

                hpBoss -= damageAkhir;
                
                // Cegah HP boss nampilin angka minus pas mati
                if (hpBoss < 0) {
                    hpBoss = 0;
                }

                System.out.println("Damage yang masuk : " + damageAkhir);
                System.out.println("Sisa HP Boss      : " + hpBoss + "\n");
                turn++;

            } else {
                System.out.println("\n❌ Pilihan ngasal! Karakter nggak nemu, giliran lu kebuang sia-sia!\n");
            }
        }

        System.out.println("🎉 GGEZ! Boss berhasil ditumbangkan dalam " + (turn - 1) + " giliran! 🎉");

        input.close();
    }
}