class Mahasiswa {
    String nama, nim, prodi;

    // Menambahkan method untuk menampilkan data
    void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Prodi : " + prodi);
    }
}

public class Percobaan2 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Mandanta Gurusinga";
        mhs.nim = "124140147";
        mhs.prodi = "Teknik Informatika";

        // Memanggil method untuk menampilkan hasil
        mhs.tampilkanData();
    }
}