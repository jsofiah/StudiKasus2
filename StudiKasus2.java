import java.util.Scanner;

public class StudiKasus2 {
    static String []namaPelanggan;
    static int []meja;
    static int index;

    static void inputMenu() {

        Scanner kel4 = new Scanner(System.in);
        
        System.out.println("Masukkan Nama Pelanggan: ");
        namaPelanggan[index] = kel4.nextLine();
        System.out.println("Masukkan Nomor Meja: ");
        meja[index] = kel4.nextInt();

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Latte      - Rp 22,000");
        System.out.println("3. Teh Tarik  - Rp 12,000");
        System.out.println("4. Mie Goreng - Rp 18,000");

        for
    }

    public static void main(String[] args) {
        
        Scanner kel4 = new Scanner(System.in);
        int menu;

        System.out.println("===== Menu Utama =====");
        System.out.println("1. Tambahkan Pesanan");
        System.out.println("2. Tampilkan Daftar Pesanan");
        System.out.println("3. Keluar");
        System.out.print("Pilih Menu: ");
        menu = kel14.nextInt();        

        if (menu == 1){
            tambahPesanan();
        } else if (menu == 2){
            tampilPesanan();
        } else if (menu == 3){
            break;
        } else {
            System.out.println("Pilihan tidak valid, masukkan lagi");
        }
    }
}