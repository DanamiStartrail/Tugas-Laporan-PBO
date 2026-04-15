class Mahasiswa {
    private String nama, nim, prodi;

    Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    Mahasiswa(String nama, String nim, String prodi, int semester) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        setSemester(semester);
    }
    public void setNama(String nama) {this.nama = nama;}
    public void setNim(String nim) {this.nim = nim;}
    public void setProdi(String prodi) {this.prodi = prodi;}

    public String getNama() {return this.nama;}
    public String getNim() {return this.nim;}
    public String getProdi() {return this.prodi;}

    void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Prodi: " + this.prodi);
        System.out.println("Semester: " + this.semester);
    }

    private int semester;
    public void setSemester(int semester) {
        if (semester < 1) {
            System.out.println("Semester tidak valid!");
        } else {
            this.semester = semester;
        }
    }
    public int getSemester() {return this.semester;}
    
}

class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public String getKodeMK() { return kodeMK; }
    public void setKodeMK(String kodeMK) { this.kodeMK = kodeMK; }

    public String getNamaMK() { return namaMK; }
    public void setNamaMK(String namaMK) { this.namaMK = namaMK; }

    public int getSks() { return sks; }
    public void setSks(int sks) { this.sks = sks; }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Mandanta", "121140147", "Teknik Informatika", 4);
        Mahasiswa mhs2 = new Mahasiswa("Budi Utomo", "121140001", "Teknik Elektro", 2);
        Mahasiswa mhs3 = new Mahasiswa("Siti Aminah", "121140099", "Sains Data", 0);

        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
        mhs3.tampilkanInfo();
        
        MataKuliah mk1 = new MataKuliah("IF2123", "Struktur Data", 3);
        System.out.println("Mata Kuliah: " + mk1.getNamaMK() + " (" + mk1.getSks() + " SKS)");
    }
}