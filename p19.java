public class Main {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    for (int i = 1; i <= 1000000; i++) {
      // Do nothing
    }
    long end = System.currentTimeMillis();

    double elapsed = (end - start) / 1000.0;
    System.out.println("Waktu yang dibutuhkan adalah " + elapsed + " detik");
  }
}
