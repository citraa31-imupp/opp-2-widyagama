class Barang {
    String nama;
    int harga;
    int stok;

    // Constructor untuk isi ketiganya
    public Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Method beli
    public void beli(int jumlah) {
        if (jumlah > stok) {
            System.out.println("Stok tidak cukup!");
        } else {
            stok = stok - jumlah;
            System.out.println(jumlah + " " + nama + " berhasil dibeli");
        }
    }

    // Method info
    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok);
        System.out.println("--------------------");
    }
}

public class soaldpk5 {
    public static void main(String[] args) {

        Barang b1 = new Barang("Kopi Susu", 15000, 10);
        Barang b2 = new Barang("Roti Bakar", 12000, 5);

        b1.info();
        b2.info();

        b1.beli(3);  // berhasil, stok jadi 7
        b2.beli(10); // gagal, stok cuma 5 -> Stok tidak cukup!

        System.out.println("\nSetelah pembelian:");
        b1.info();
        b2.info();
    }
}