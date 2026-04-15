// 1. DEFINISI CLASS (Blueprint) [cite: 208, 219]
public class Mobil {

    // 2. ATRIBUT OBJEK / Instance Variable (Milik tiap objek) [cite: 229, 233, 238]
    String merk;        // Menyimpan data merk mobil [cite: 243]
    String warna;       // Menyimpan data warna mobil [cite: 243]
    int tahunProduksi;  // Menyimpan data tahun mobil [cite: 243]

    // 3. ATRIBUT KELAS / Class Variable (Milik bersama, pakai 'static') [cite: 231, 262]
    static String jenisBahanBakar = "Bensin"; // Semua objek mobil berbagi data ini [cite: 263]

    // 4. CONSTRUCTOR (Dijalankan saat 'new' dipanggil) [cite: 270]
    // Namanya harus sama persis dengan nama class [cite: 274]
    public Mobil(String merkBaru, String warnaBaru, int tahunBaru) {
        this.merk = merkBaru;           // Mengisi nilai awal merk [cite: 276, 293]
        this.warna = warnaBaru;         // Mengisi nilai awal warna [cite: 276, 293]
        this.tahunProduksi = tahunBaru; // Mengisi nilai awal tahun [cite: 276, 293]
    }

    // 5. METHOD (Perilaku/Aksi yang bisa dilakukan objek) [cite: 277, 301]
    public void tampilkanInfo() {
        System.out.println("--- Informasi Mobil ---"); 
        System.out.println("Merk    : " + merk); 
        System.out.println("Warna   : " + warna); 
        System.out.println("Tahun   : " + tahunProduksi); 
        System.out.println("BBM     : " + jenisBahanBakar); // Mengakses atribut kelas 
        System.out.println("-----------------------");
    }

    // 6. MAIN METHOD (Tempat menjalankan program) [cite: 321, 328]
    public static void main(String[] args) {
        
        // 7. INSTANSIASI OBJEK (Membuat wujud nyata dari cetakan) [cite: 210, 319]
        // Menggunakan keyword 'new' dan Parameterized Instantiation [cite: 321, 323, 325]
        Mobil mobilKu = new Mobil("Toyota GR Yaris", "Putih", 2024); 
        Mobil mobilTeman = new Mobil("Honda Civic Type R", "Merah", 2023); 

        // Memanggil method dari objek yang sudah dibuat [cite: 331]
        mobilKu.tampilkanInfo();
        mobilTeman.tampilkanInfo();
    }
}