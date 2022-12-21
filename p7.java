import java.util.Scanner;

public class LuasPersegi {
  // Fungsi untuk menghitung luas persegi
  public static float hitungLuasPersegi(float panjang, float lebar) {
    return panjang * lebar;
  }

  public static void main(String[] args) {
    // Deklarasi variabel panjang dan lebar
    float panjang, lebar;
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan panjang persegi: ");
    panjang = input.nextFloat();
    System.out.print("Masukkan lebar persegi: ");
    lebar = input.nextFloat();

    // Hitung luas persegi
    float luas = hitungLuasPersegi(panjang, lebar);

    // Tampilkan hasil
    System.out.println("Luas persegi: " + luas);
  }
}
