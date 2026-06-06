class MataKuliah {
    String kode;
    String nama;

    MataKuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    void tampilkanMataKuliah() {
        System.out.println("Mata Kuliah: " + kode + " - " + nama);
    }
}

class Mahasiswa {
    String nama;
    String nim;

    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Association: menggunakan object MataKuliah
    void ambilMataKuliah(MataKuliah mk) {
        System.out.println(nama + " mengambil mata kuliah " + mk.nama);
    }

    void tampilkanData() {
        System.out.println(nim + " - " + nama);
    }
}

class RuangKelas {
    String namaRuang;

    RuangKelas(String namaRuang) {
        this.namaRuang = namaRuang;
    }

    void tampilkanRuang() {
        System.out.println("Ruang Kelas: " + namaRuang);
    }
}

class Gedung {
    String namaGedung;
    RuangKelas ruang1;
    RuangKelas ruang2;

    Gedung(String namaGedung) {
        this.namaGedung = namaGedung;
        // Composition: Object dibuat di dalam pemiliknya
        this.ruang1 = new RuangKelas("Ruang 101");
        this.ruang2 = new RuangKelas("Ruang 102");
    }

    void tampilkanDataGedung() {
        System.out.println("Gedung: " + namaGedung);
        ruang1.tampilkanRuang();
        ruang2.tampilkanRuang();
    }
}

class JadwalPraktikum {
    String hari;
    String jam;

    JadwalPraktikum(String hari, String jam) {
        this.hari = hari;
        this.jam = jam;
    }

    void tampilkanJadwal() {
        System.out.println("Hari Praktikum : " + hari);
        System.out.println("Jam Praktikum  : " + jam);
    }
}

class KelasPraktikum {
    String namaKelas;
    MataKuliah mataKuliah;
    Mahasiswa[] daftarMahasiswa;
    JadwalPraktikum jadwal;

    // Aggregation: menerima array daftarMahasiswa dari luar
    KelasPraktikum(String namaKelas, MataKuliah mataKuliah, Mahasiswa[] daftarMahasiswa) {
        this.namaKelas = namaKelas;
        this.mataKuliah = mataKuliah;
        this.daftarMahasiswa = daftarMahasiswa;
        // Composition: Jadwal dibuat langsung di dalam class ini
        this.jadwal = new JadwalPraktikum("Rabu", "13.00 - 15.00");
    }

    void tampilkanInfoKelas() {
        System.out.println("Nama Kelas: " + namaKelas);
        mataKuliah.tampilkanMataKuliah();
        jadwal.tampilkanJadwal();
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilkanData();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Eksekusi Percobaan 1: Association ===");
        Mahasiswa mhs1 = new Mahasiswa("Andi", "123140001");
        MataKuliah mkPBO = new MataKuliah("IF221", "Pemrograman Berorientasi Objek");
        mhs1.ambilMataKuliah(mkPBO);

        System.out.println("\n=== Eksekusi Percobaan 2: Aggregation ===");
        Mahasiswa mhs2 = new Mahasiswa("Budi", "123140002");
        Mahasiswa mhs3 = new Mahasiswa("Citra", "123140003");
        Mahasiswa[] daftar = {mhs1, mhs2, mhs3};
        
        // Mahasiswa dimasukkan ke Kelas Praktikum (Aggregation)
        System.out.println("Daftar mahasiswa berhasil dibuat secara mandiri dan siap digabungkan ke kelas.");
        System.out.println("Jumlah mahasiswa terdaftar: " + daftar.length);

        System.out.println("\n=== Eksekusi Percobaan 3: Composition ===");
        Gedung gedungLab = new Gedung("Gedung Laboratorium OZT");
        gedungLab.tampilkanDataGedung();

        System.out.println("\n=== Eksekusi Percobaan 4: Studi Kasus Mini ===");
        // Menggabungkan semua relasi
        KelasPraktikum kelasPBO = new KelasPraktikum("PBO IF-01", mkPBO, daftar);
        kelasPBO.tampilkanInfoKelas();
    }
}