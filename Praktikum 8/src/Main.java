import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Eksekusi Percobaan 1 ===");
        percobaan1(scanner);
        scanner.nextLine(); // Membersihkan buffer enter sebelum lanjut

        System.out.println("\n=== Eksekusi Percobaan 2 ===");
        percobaan2(scanner);
        scanner.nextLine(); // Membersihkan buffer enter sebelum lanjut

        System.out.println("\n=== Eksekusi Percobaan 3 ===");
        percobaan3(scanner);

        System.out.println("\n=== Eksekusi Percobaan 4 ===");
        percobaan4(scanner);

        scanner.close();
        System.out.println("\nSemua percobaan selesai.");
    }

    static void percobaan1(Scanner input) {
        try {
            System.out.print("Masukkan angka pertama: ");
            int angka1 = input.nextInt();
            System.out.print("Masukkan angka pembagi: ");
            int angka2 = input.nextInt();
            System.out.println("Hasil: " + (angka1 / angka2));
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak dapat melakukan pembagian dengan nol.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka.");
        }
    }

    static void percobaan2(Scanner input) {
        try {
            System.out.print("Masukkan nilai mahasiswa (0-100): ");
            int nilai = input.nextInt();
            if (nilai < 0 || nilai > 100) {
                throw new IllegalArgumentException("Nilai harus 0 - 100.");
            }
            System.out.println("Nilai valid: " + nilai);
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void percobaan3(Scanner input) {
        try {
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            FileWriter fw = new FileWriter("mahasiswa.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nama: " + nama);
            pw.println("NIM: " + nim);
            pw.close();
            System.out.println("Data berhasil disimpan ke mahasiswa.txt");

            Scanner bacaFile = new Scanner(new File("mahasiswa.txt"));
            System.out.println("\nIsi file:");
            while (bacaFile.hasNextLine()) {
                System.out.println(bacaFile.nextLine());
            }
            bacaFile.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan I/O saat memproses file.");
        }
    }

    static void percobaan4(Scanner input) {
        try {
            System.out.print("Masukkan prodi: ");
            String prodi = input.nextLine();
            System.out.print("Masukkan semester: ");
            int semester = input.nextInt();

            if (prodi.isEmpty()) throw new IllegalArgumentException("Prodi tidak boleh kosong.");
            if (semester < 1) throw new IllegalArgumentException("Semester minimal 1.");

            FileWriter fw = new FileWriter("data_mahasiswa.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Prodi: " + prodi + ", Semester: " + semester);
            pw.close();
            System.out.println("Data ditambahkan ke data_mahasiswa.txt");

        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan validasi: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data ke file.");
        } catch (InputMismatchException e) {
            System.out.println("Kesalahan input: Semester harus berupa angka.");
        } finally {
            System.out.println("Sesi pembersihan resource (finally) dieksekusi.");
        }
    }
}