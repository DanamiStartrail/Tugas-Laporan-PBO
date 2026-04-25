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
    public Kucing(String nama, int umur) {
        super(nama, umur);
    }
}



public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Kucing", 3);
        Hewan anjing = new Hewan("Anjing", 5);

        kucing.makan();
        kucing.tidur();

        anjing.makan();
        anjing.tidur();
    }
}