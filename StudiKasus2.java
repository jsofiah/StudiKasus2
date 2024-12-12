import java.util.Scanner;

public class StudiKasus2 {
    static String[] namaPelanggan = new String[100];
    static int[] meja = new int[100];
    static double[] totalPesanan = new double[100];
    static String[] namaMenu = {"Kopi Hitam", "Latte", "Teh Tarik", "Mie Goreng"};
    static double[] hargaMenu = {15000, 22000, 12000, 18000};
    static String[][] detailPesanan = new String[100][100];
    static double[] totalPesananItem = new double[100];
    static int indexPelanggan = 0;

    static void inputMenu() {
        Scanner kel4 = new Scanner(System.in);
        System.out.print("Masukkan Nama Pelanggan: ");
        namaPelanggan[indexPelanggan] = kel4.nextLine();
        System.out.print("Masukkan Nomor Meja: ");
        meja[indexPelanggan] = kel4.nextInt();

        int pilihMenu;
        int jumlahItem;
        int indexItem = 0;

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Latte      - Rp 22,000");
        System.out.println("3. Teh Tarik  - Rp 12,000");
        System.out.println("4. Mie Goreng - Rp 18,000");

        while (true) {
            System.out.print("Pilih menu (masukkan nomor menu, atau 0 untuk selesai): ");
            pilihMenu = kel4.nextInt();

            if(pilihMenu == 0){
                break;
            } else if (pilihMenu < 1 || pilihMenu > 4) {
                System.out.println("Menu tidak valid. Silakan masukkan lagi");
                continue;
            }

            while (true) {
                System.out.print("Masukkan jumlah item untuk " + namaMenu[pilihMenu - 1] + " : ");
                jumlahItem = kel4.nextInt();
                if (jumlahItem > 0) {
                    break;
                } else {
                    System.out.println("Jumlah item harus lebih dari 0. Silakan masukkan lagi.");
                }
            }

            double totalHargaItem = hargaMenu[pilihMenu - 1] * jumlahItem;
            totalPesananItem[indexPelanggan] = totalHargaItem;
            totalPesanan[indexPelanggan] += totalHargaItem;

            detailPesanan[indexPelanggan][indexItem] = namaMenu[pilihMenu - 1] + " x " + jumlahItem + " = Rp " + (int) totalHargaItem;
            indexItem++;
        }
        
        System.out.println("Pesanan berhasil di tambahkan");
        System.out.println("Total harga pesanan: Rp " + totalPesanan[indexPelanggan]);

        indexPelanggan++;
        
    }

    static void tampilPesanan() {
        for (int i = 0; i < indexPelanggan; i++) {
            System.out.println("===== DAFTAR PESANAN =====");
            System.out.println("Nama Pelanggan: " + namaPelanggan[i]);
            System.out.println("Nomor Meja: " + meja[i]);
            System.out.println("Detail Pesanan:");

            for (String item : detailPesanan[i]) {
                if (item != null) {
                    System.out.println("- " + item);
                }
            }

            System.out.println("Total Harga Pesanan: Rp " + (int) totalPesanan[i]);
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        
        Scanner kel4 = new Scanner(System.in);
        int menu;

        do{
            System.out.println("===== Menu Utama =====");
            System.out.println("1. Tambahkan Pesanan");
            System.out.println("2. Tampilkan Daftar Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu: ");
            menu = kel4.nextInt();        
    
            if (menu == 1){
                inputMenu();
            } else if (menu == 2){
                tampilPesanan();
            } else if (menu == 3){
                break;
            } else {
                System.out.println("Pilihan tidak valid, masukkan lagi");
            }
        } while(true);

        System.out.println("Terima kasih telah menggunakan sistem ini!");
    }
}