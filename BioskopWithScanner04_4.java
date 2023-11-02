import java.util.Scanner;

public class BioskopWithScanner04_4 {
    public static void main(String[] args) {
        Scanner scan04 = new Scanner (System.in);

        int baris, kolom;
        String nama;

        String [][] penonton = new String[4][2];

        while (true) {
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan anda : ");
            int choice = scan04.nextInt();
            scan04.nextLine();

            switch (choice) {
                case 1:  
                        System.out.print("Masukkan nama : ");
                        nama = scan04.nextLine();

                    do {
                        System.out.print("Masukkan baris : ");
                        baris = scan04.nextInt();
                        System.out.print("Masukkan kolom : ");
                        kolom = scan04.nextInt();
                        scan04.nextLine();

                        if (isValidSeat(baris, kolom, penonton)) {
                                System.out.println("Kursi sudah terisi atau nomor baris/kolom tidak tersedia. Silahkan pilih kursi lain");
                            } 
                        } while (isValidSeat(baris, kolom, penonton));
                        
                        penonton[baris -1][kolom -1] = nama;
                        System.out.println("Data penonton berhasil diinput");
                        break;      
                case 2:
                    System.out.println("Daftar Penonton:"); 
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                            System.out.println("Baris " + ( i + 1)+ " Kolom " + (j + 1) + " : "+ penonton [i][j]);
                        }
                    }
                }     
                break;
                case 3:
                    System.out.println("Terimakasih telah berkunjung!"); 
                    scan04.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan menu invalid, silahkan coba lagi");
                        
                }
            } 
        }
    

    public static boolean isValidSeat(int baris, int kolom, String[][] penonton) {
        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
            return penonton[baris - 1][kolom - 1] == null;
        }
        return false;
    }
}