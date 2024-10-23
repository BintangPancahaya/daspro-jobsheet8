import java.util.Scanner;
public class Tugas105 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        int i, j, k, angka;
        k = 1;

        System.out.print("Masukkan angka (min 3): ");
        angka = input05.nextInt();

        for (i=1;i<=angka;i++) {
            for (j=1;j<=angka;j++) {
                if (i>=2 && i<=angka-1 && j>=2 && j<=angka-1) {
                    System.out.print("  ");
                }
                else { 
                System.out.print(angka + " ");
                }
            }
            System.out.println(" ");
        }
    }
}