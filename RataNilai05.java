import java.util.Scanner;
    /**
     * RataNilai05
     */
    public class RataNilai05 {
    
        public static void main(String[] args) {
            Scanner input05 = new Scanner(System.in);

            int i, j, nilai;
            float totalNilai, rataNilai;

            i=1;
            while (i<=5) {
                totalNilai = 0;
                for (j=1;j<=5;j++) {
                    if (i>=1 && i<= 5 && j==1) {
                    System.out.println("Input Nilai Mahasiswa ke " + i);
                    }
                    System.out.print("Nilai ke-" + j + " = ");
                    nilai = input05.nextInt();
                    totalNilai += nilai;
                }
                rataNilai = totalNilai/5;
                System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah  " + rataNilai);
                i++;
            }
        }
    }