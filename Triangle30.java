import java.util.Scanner;

public class Triangle30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        System.out.println("\nSegitiga Naik:");
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("\nSegitiga Terbalik:");
        i = n; // Inisialisasi ulang i dari nilai n
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); 
            i--; 
        }

        sc.close();
    }
}