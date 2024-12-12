
import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        tampilkanAngkaGanjil(N);
        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
        /* Pekerjaan anda mulai dari sini */
    public static void tampilkanAngkaGanjil(int n) {
        System.out.println("Angka ganjil dari 0 hingga " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }
}
