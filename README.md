Program Java ini adalah sebuah aplikasi sederhana yang meminta pengguna untuk memilih buah favorit mereka dari daftar yang disediakan, lalu memberikan informasi mengenai manfaat buah yang dipilih. Berikut adalah penjelasan dari program tersebut:

### Struktur Program

1. **Import Scanner:**
    ```java
    import java.util.Scanner;
    ```
    Scanner digunakan untuk mengambil input dari pengguna melalui keyboard.

2. **Deklarasi Kelas dan Metode `main`:**
    ```java
    public class pilihBuah {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // ... kode lainnya
        }
    }
    ```
    `pilihBuah` adalah nama kelas, dan `main` adalah metode utama yang dieksekusi saat program berjalan.

3. **Menampilkan Pilihan Buah:**
    ```java
    System.out.println("Silahkan pilih buah kesukaan kamu dari daftar berikut:");
    System.out.println("1. Apel");
    System.out.println("2. Pisang");
    System.out.println("3. Jeruk");
    System.out.println("4. Mangga");
    System.out.println("5. Semangka");
    System.out.print("Masukkan nama buah (Apel/Pisang/Jeruk/Mangga/Semangka): ");
    ```
    Program menampilkan daftar buah yang tersedia dan meminta pengguna untuk memasukkan nama buah yang dipilih.

4. **Membaca Input Pengguna:**
    ```java
    String buah = scanner.nextLine();
    ```
    Input pengguna dibaca sebagai sebuah string dan disimpan dalam variabel `buah`.

5. **Menggunakan Switch untuk Menentukan Pesan yang Ditampilkan:**
    ```java
    switch (buah) {
        case "Apel":
            System.out.println("Apel adalah buah yang kaya akan serat dan baik untuk pencernaan.");
            break;
        case "Pisang":
            System.out.println("Pisang adalah buah yang kaya akan kalium dan baik untuk otot.");
            break;
        case "Jeruk":
            System.out.println("Jeruk adalah buah yang kaya akan vitamin C dan baik untuk imunitas.");
            break;
        case "Mangga":
            System.out.println("Mangga adalah buah yang kaya akan vitamin A dan baik untuk kesehatan mata.");
            break;
        case "Semangka":
            System.out.println("Semangka adalah buah yang kaya akan air dan baik untuk hidrasi.");
            break;
        default:
            System.out.println("Buah yang kamu pilih gak ada di daftar.");
            break;
    }
    ```
    Bergantung pada input pengguna, sebuah pesan yang sesuai dengan buah yang dipilih akan ditampilkan. Jika input tidak sesuai dengan pilihan yang ada, program akan menampilkan pesan default.

6. **Menutup Scanner:**
    ```java
    scanner.close();
    ```
    Scanner ditutup untuk menghindari kebocoran sumber daya.

### Penjelasan Tambahan
- **Switch Statement:**
  Switch statement digunakan untuk membandingkan nilai `buah` dengan beberapa nilai kemungkinan. Ini adalah cara yang lebih efisien dibandingkan menggunakan banyak `if-else` statements.
- **Break:**
  Setiap `break` digunakan untuk mengakhiri eksekusi dari kasus saat ini di dalam switch statement dan mencegah eksekusi berlanjut ke kasus berikutnya.

### Kesimpulan
Program ini memberikan contoh bagaimana menggunakan input pengguna dalam program Java dan bagaimana menggunakan struktur kontrol switch untuk memberikan respon yang berbeda berdasarkan input tersebut.
