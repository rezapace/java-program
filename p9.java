public class CekGenap {
  public static void main(String[] args) {
    // Perulangan untuk mengecek setiap bilangan dari 1-75
    for (int i = 1; i <= 75; i++) {
      // Cek apakah bilangan tersebut genap
      if (i%2 == 0) {
        System.out.println(i);
      }
    }
  }
}
