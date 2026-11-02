import java.util.Scanner;

public class Tugas2_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        
        int i = 1;
        int totalAngka = 0;
        
        while (i <= n) {
            int j = 1;

            while (j <= n) {
                System.out.print("\t" + j * i);
                totalAngka += j * i;
                j++;
                
            }
            System.out.println();
            i++;
         
        }
        System.out.println("Total Angka Anda Adalah: " + totalAngka);
        
    }
}

