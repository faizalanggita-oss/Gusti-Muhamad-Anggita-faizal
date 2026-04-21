public class latihan_3 {
    public static void main(String[] args) {
        System.out.println("nama:Gusti Muhamad A.F 04TPLP005 NIM:241011402467\n");
        
        System.out.println("3. Contoh Struktur do-while");
        int a = 5;
        
        // Lakukan statement minimal 1 kali, baru cek kondisi
        do {
            System.out.println("nilai : " + a);
            a++;
        } while (a == 1); 
        // Karena a sekarang 6 dan bukan 1, perulangan langsung berhenti
    }
}