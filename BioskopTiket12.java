import java.util.Scanner;

public class BioskopTiket12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        int jumlahTiket;

        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan nilai yang benar.\n");
                continue;
            }
            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double potongan = totalHarga * diskon;
            double totalBayar = totalHarga - potongan;

            System.out.println("Diskon yang didapat: " + (diskon * 100) + "%");
            System.out.println("Total yang harus dibayar: Rp " + totalBayar + "\n");

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalBayar;
        }

        System.out.println("=== HASIL PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total pendapatan    : Rp " + totalPenjualan);
        System.out.println("Program selesai.");

        sc.close();
    }
}
