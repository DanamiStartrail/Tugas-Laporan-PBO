class Hewan{
    String nama;
    int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur.");
    }
}

class Kucing extends Hewan {
    String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }
    public void mengeong() {
        System.out.println(nama + " sedang mengeong.");
    }
    public void berburu() {
        System.out.println(nama + " sedang berburu.");
    }
}

class Anjing extends Hewan {
    String jenisGolongan;

    public Anjing(String nama, int umur, String jenisGolongan) {
        super(nama, umur);
        this.jenisGolongan = jenisGolongan;
    }
    public void menggonggong() {
        System.out.println(nama + " sedang menggonggong.");
    }
    public void bermain() {
        System.out.println(nama + " sedang bermain.");
    }
}

class GoldenRetriever extends Anjing {
    public GoldenRetriever(String nama, int umur) {
        super(nama, umur, "Golden Retriever");
    }
    public void berenang() {
        System.out.println(nama + " sedang berenang.");
    }
    public void mengambil() {
        System.out.println(nama + " sedang mengambil bola.");
    }
}

public class Main {
    public static void main(String[] args) {
        GoldenRetriever anj1 = new GoldenRetriever("Gold Roger", 5);
        anj1.makan();
        anj1.tidur();
        anj1.menggonggong();
        anj1.bermain();
        anj1.berenang();
        anj1.mengambil();
    }
}