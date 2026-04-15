class Mahasiswa {
    String nama, nim, prodi;
    int semester;

    // Constructor untuk mengisi data secara instan
    Mahasiswa(String nama, String nim, String prodi, int semester) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.semester = semester;
    }

    // Method untuk menampilkan data secara rapi
    void tampilkanData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Prodi    : " + prodi);
        System.out.println("Semester : " + semester);
        System.out.println("-----------------------------");
    }
}

public class Percobaan5 {
    public static void main(String[] args) {
        // Membuat minimal 3 objek mahasiswa ITERA
        Mahasiswa mhs1 = new Mahasiswa("Mandanta Gurusinga", "124140147", "Informatika", 2);
        Mahasiswa mhs2 = new Mahasiswa("Gathan Mahendra", "124140201", "Informatika", 4);
        Mahasiswa mhs3 = new Mahasiswa("Baginda Parulian Siregar", "124140135", "Sains Data", 2);

        System.out.println("=== DATA MAHASISWA ITERA ===");
        mhs1.tampilkanData();
        mhs2.tampilkanData();
        mhs3.tampilkanData();
    }
}