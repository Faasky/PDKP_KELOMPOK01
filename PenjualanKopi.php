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
