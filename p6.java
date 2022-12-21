public class Main {
    // Fungsi untuk menghitung luas segitiga
    public static float hitungLuasSegitiga(float alas, float tinggi) {
        return alas * tinggi / 2;
    }

    public static void main(String[] args) {
        // Deklarasi variabel alas dan tinggi
        float alas, tinggi;
        System.out.print("Masukkan alas segitiga: ");
        Scanner scanner = new Scanner(System.in);
        alas = scanner.nextFloat();
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = scanner.nextFloat();

        // Hitung luas segitiga
        float luas = hitungLuasSegitiga(alas, tinggi);

        // Tampilkan hasil
        System.out.println("Luas segitiga: " + luas);
    }
}
