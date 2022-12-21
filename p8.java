import java.util.Scanner;

public class LuasLingkaran {
  // Fungsi untuk menghitung luas lingkaran
  public static float hitungLuasLingkaran(float r) {
    float pi = 3.14;
    return pi * Math.pow(r, 2);
  }

  public static void main(String[] args) {
    // Deklarasi variabel jari-jari
    float r = 7;

    // Hitung luas lingkaran
    float luas = hitungLuasLingkaran(r);

    // Tampilkan hasil
    System.out.println("Luas lingkaran: " + luas);
  }
}
