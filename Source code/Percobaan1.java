class Mahasiswa {
    String nama;
    String nim;
    String prodi;
}

public class Percobaan1 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.nama = "Mandanta Gurusinga"; 
        mhs.nim = "124140147";          
        mhs.prodi = "Teknik Informatika";

        System.out.println("Nama  : " + mhs.nama);
        System.out.println("NIM   : " + mhs.nim);
        System.out.println("Prodi : " + mhs.prodi);
    }
}