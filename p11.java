public class DeretFibonacci {
  public static void main(String[] args) {
    // Deklarasi suku pertama dan suku kedua
    int suku1 = 6;
    int suku2 = 9;

    // Tampilkan suku pertama dan kedua
    System.out.println(suku1);
    System.out.println(suku2);

    // Perulangan untuk menghitung bilangan fibonacci selanjutnya
    for (int i = 1; i <= 3; i++) {
      // Hitung suku selanjutnya
      int sukuSelanjutnya = suku1 + suku2;

      // Tampilkan suku selanjutnya
      System.out.println(sukuSelanjutnya);

      // Set suku1 menjadi suku2 dan suku2 menjadi suku selanjutnya
      suku1 = suku2;
      suku2 = sukuSelanjutnya;
    }
  }
}
