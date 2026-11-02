import java.util.Scanner;

public class Tugas3_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Toko : ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.print("Masukkan jumlah toko dengan benar");
        } else {
            int maksimalBarang = -1;
            int totalBarangSeluruhToko = 0;
            int tokoBarangTerbanyak = 0;

            // luar
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("Toko " + i);
                System.out.print("Masukkan jumlah Pelanggan : ");
                int jumlahPelanggan = sc.nextInt();

                // Dalam
                int totalPelangganToko = jumlahPelanggan;
                int totalBarangToko = 0;

                for (int j = 1; j <= jumlahPelanggan; j++) {
                    int jumlahBarang;
                    do {
                        System.out.print("  Jumlah barang yang dibeli pelanggan " + j + ": ");
                        jumlahBarang = sc.nextInt();
                        if (jumlahBarang < 0) {
                            System.out.println(" Jumlah barang tidak boleh negatif. Masukkan dengan benar! ");
                        }
                    } while (jumlahBarang < 0);

                    totalBarangToko += jumlahBarang;
                }
                totalBarangSeluruhToko += totalBarangToko;

                System.out.println("Toko " + i + " - pelanggan: " + totalPelangganToko + ", total barang: " + totalBarangToko);

                if (totalBarangToko > maksimalBarang) {
                    maksimalBarang = totalBarangToko;
                    tokoBarangTerbanyak = i;
                }

            }
            System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoBarangTerbanyak);
        }
        sc.close();
    }
}