import java.util.Scanner;
public class Tugas205 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        int jumlah, j, k, h;
        String nama;

        System.out.print("Masukkan berapa jumlah Politeknik yang mendaftar: ");
        jumlah = input05.nextInt();
        System.out.println();

            for (j=1;j<=jumlah;j++) {
                System.out.println("================ POLITEKNIK KE " + j + " =================");
                if (j==1) {
                input05.nextLine();
                }
                for (k=0;k<=5;k++) {
                    if (k==0 && j>=1 && j<=jumlah) {
                        System.out.println("---- Masukkan nama atlet pada cabor Badminton ----");
                        for (h=1;h<=5;h++) {
                            System.out.print("Nama atlet ke-" + h + ": ");
                            nama = input05.nextLine();
                        }
                    } 
                    if (k==1 && j>=1 && j<=jumlah) {
                        System.out.println("---- Masukkan Nama Atlet Pada Cabor Tenis Meja ----");
                        for (h=1;h<=5;h++) {
                            System.out.print("Nama atlet ke-" + h + ": ");
                            nama = input05.nextLine();
                        }
                    } 
                    if (k==2 && j>=1 && j<=jumlah) {
                        System.out.println("---- Masukkan nama atlet pada cabor Basket ----");
                        for (h=1;h<=5;h++) {
                            System.out.print("Nama atlet ke-" + h + ": ");
                            nama = input05.nextLine();
                        }
                    } 
                    if (k==3 && j>=1 && j<=jumlah) {
                        System.out.println("---- Masukkan nama atlet pada cabor Bola Voli ----");
                        for (h=1;h<=5;h++) {
                            System.out.print("Nama atlet ke-" + h + ": ");
                            nama = input05.nextLine();
                        }
                        System.out.println();
                } 
            }
        }
        input05.close();
    }
}