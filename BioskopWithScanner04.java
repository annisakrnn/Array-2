import java.util.Scanner;
public class BioskopWithScanner04 {

    public static void main (String[] args) {
        Scanner scan04 = new Scanner(System.in);

        

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

    while (true) {
        System.out.println("Masukkan nama: ");
        nama = scan04.nextLine();
        System.out.println("Masukkan baris: ");
        baris = scan04.nextInt();
        System.out.println("Masukkan kolom: ");
        kolom = scan04.nextInt();

        scan04.nextLine();

        penonton[baris-1][kolom-1] = nama;

        System.out.println("Input penonton lainya? (y/n): ");
        next = scan04.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;

            
        }
    }
    }
}