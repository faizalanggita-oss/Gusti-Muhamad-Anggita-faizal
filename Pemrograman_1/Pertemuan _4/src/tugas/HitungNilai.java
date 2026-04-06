import java.util.Scanner;

public class HitungNilai {
    public static void main(String[] args) {
        // Identitas
        System.out.println("Nama : Gusti Muhamad A.F");
        System.out.println("NIM  : 241011402467");
        System.out.println("Kelas: 04TPLP005");
        System.out.println("================================");

        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel nilai
        double absen, tugas, uts, uas, total;

        // Input data
        System.out.print("Nilai Absen : ");
        absen = input.nextDouble();

        System.out.print("Nilai Tugas : ");
        tugas = input.nextDouble();

        System.out.print("Nilai UTS   : ");
        uts = input.nextDouble();

        System.out.print("Nilai UAS   : ");
        uas = input.nextDouble();

        // Hitung total sesuai bobot
        total = (absen * 0.1) + (tugas * 0.2) + (uts * 0.3) + (uas * 0.4);

        // Tampilkan hasil
        System.out.println("================================");
        System.out.println("Nilai Akhir Anda: " + total);

        // Cek Grade sederhana
        if (total >= 80) {
            System.out.println("Grade: A");
        } else if (total >= 70) {
            System.out.println("Grade: B");
        } else if (total >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        input.close();
    }
}
