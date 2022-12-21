public class NamaHari {
  public static void main(String[] args) {
    // Membuat array dengan nama-nama hari
    String[] hari = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};

    // Perulangan untuk menampilkan nama hari
    for (int i = 0; i < 7; i++) {
      System.out.println("Hari ke " + (i+1) + " adalah hari " + hari[i]);
    }
  }
}
