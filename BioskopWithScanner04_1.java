import java.util.Scanner;

public class BioskopWithScanner04_1 {
    public static void main(String[] args) {
        Scanner scan04 = new Scanner(System.in);
        String [][] penonton = new String[4][2];
        
        while (true) {
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan anda : ");
            int inputMenu = scan04.nextInt();
            scan04.nextLine();

            switch (inputMenu) {
                case 1:
                    System.out.println("1. Input data penonton"); 
                    break;
                case 2:
                    System.out.println("2. Tampilan daftar penonton"); 
                    break;
                case 3:
                     System.out.println("Terimakasih telah berkunjung!");  
                     scan04.close();
                     System.exit(0);
                     break;

                default:
                System.out.println("Pilihan menu invalid, silahkan coba lagi");
                    break;
            }
        } 

    }
    } 
    