import java.util.Scanner;
    public class PenjualanKopi {

        public static void tampilMenu() {
            System.out.println("======== MENU KOPI ========");
            System.out.println("1. Espresso      Rp. 20.000");
            System.out.println("2. Cappucino     Rp. 25.000");
            System.out.println("3. Latte         Rp. 22.000");
            System.out.println("4. Americano     Rp. 23.000");
            System.out.println("============================");
        }

        public static double hitungHarga(int pilihan, int jumlah) {
            double harga = 0;
            switch (pilihan) {
                case 1:
                    harga = 20000;
                    break;
                case 2:
                    harga = 25000;
                    break;
                case 3:
                    harga = 22000;
                    break;
                case 4:
                    harga = 23000;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            return harga * jumlah;
        }

        public static void pembayaran(double totalHarga) {
            Scanner input = new Scanner(System.in);
            System.out.println("Total Harga: Rp. " + totalHarga);
            System.out.print("Jumlah uang yang dibayarkan: Rp. ");
            double uangBayar = input.nextDouble();
            if (uangBayar < totalHarga) {
                System.out.println("maap duitnya kurang mas/mba.");
                pembayaran(totalHarga);
            } else {
                double kembalian = uangBayar - totalHarga;
                System.out.println("Kembalian: Rp. " + kembalian);
                System.out.println("Terima kasih yaaa sudah beli kopi");
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int pilihan, jumlah;
            char ulang;

            do {
                tampilMenu();

                System.out.print("Pilih kopi (1-4): ");
                pilihan = input.nextInt();
                System.out.print("Jumlah yang ingin dibeli: ");
                jumlah = input.nextInt();

                double totalHarga = hitungHarga(pilihan, jumlah);
                pembayaran(totalHarga);

                System.out.print("Ingin membeli lagi? (y/n): ");
                ulang = input.next().charAt(0);
            } while (ulang == 'y' || ulang == 'Y');
        }
    }
