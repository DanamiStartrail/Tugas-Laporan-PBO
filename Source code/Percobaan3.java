class Dosen {
    String nama, nidn, prodi;

    // Method untuk menampilkan data dosen
    void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIDN  : " + nidn);
        System.out.println("Prodi : " + prodi);
    }
}

public class Percobaan3 {
    public static void main(String[] args) {
        // Membuat object dosen pertama
        Dosen dsn1 = new Dosen();
        dsn1.nama = "Aidil Afriansyah";
        dsn1.nidn = "19870101";
        dsn1.prodi = "Informatika";

        // Membuat object dosen kedua
        Dosen dsn2 = new Dosen();
        dsn2.nama = "Ibu Miranti";
        dsn2.nidn = "19920202";
        dsn2.prodi = "Informatika";

        // Menampilkan data kedua dosen
        System.out.println("Data Dosen 1:");
        dsn1.tampilkanData();

        System.out.println("Data Dosen 2:");
        dsn2.tampilkanData();
    }
}