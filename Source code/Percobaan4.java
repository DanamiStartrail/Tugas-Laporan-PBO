class MataKuliah {
    String namaMk;
    int sks;

    // Constructor untuk mengisi data secara otomatis saat objek dibuat
    MataKuliah(String namaMk, int sks) {
        this.namaMk = namaMk; // Menggunakan keyword this untuk merujuk ke atribut class
        this.sks = sks;
    }

    // Method untuk menampilkan data
    void tampilkanData() {
        System.out.println("Mata Kuliah : " + namaMk);
        System.out.println("SKS         : " + sks);
    }
}

public class Percobaan4 {
    public static void main(String[] args) {
        // Membuat object sekaligus mengisi data melalui constructor
        MataKuliah mk1 = new MataKuliah("Pemrograman Berorientasi Objek", 3);
        MataKuliah mk2 = new MataKuliah("Algoritma Struktur Data", 3);

        System.out.println("Daftar Mata Kuliah:");
        mk1.tampilkanData();
        mk2.tampilkanData();
    }
}