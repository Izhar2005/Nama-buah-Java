import java.util.Scanner;

public class pilihBuah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Silahkan pilih buah kesukaan kamu dari daftar berikut:");
        System.out.println("1. Apel");
        System.out.println("2. Pisang");
        System.out.println("3. Jeruk");
        System.out.println("4. Mangga");
        System.out.println("5. Semangka");
        System.out.print("Masukkan nama buah (Apel/Pisang/Jeruk/Mangga/Semangka): ");

        String buah = scanner.nextLine();

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
        scanner.close();
    }
}
