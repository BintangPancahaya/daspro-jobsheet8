import java.util.Scanner;
    /**
     * RataNilai05
     */
    public class RataNilai05 {
    
        public static void main(String[] args) {
            Scanner input05 = new Scanner(System.in);

            int i, j;
            float nilai, totalNilai, rataNilai;

            for (i=1;i<=5;i++) {
                totalNilai = 0;
                for (j=1;j<=5;j++) {
                    System.out.print("Nilai ke-" + j + " = ");
                    nilai = input05.nextFloat();
                    totalNilai += nilai;
                }
                rataNilai = totalNilai/5;
                System.out.print(rataNilai);
            }
        }
    }