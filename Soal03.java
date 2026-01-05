import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[5];
        int nilai1 = 0;
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = input.nextInt();

        }
        int max = nilai[0];
        int min = nilai[0];
        for (int i = 1; i < nilai.length ; i++) {
            if (nilai[i] > max) max = nilai[i];
            if (nilai[i] < min) min = nilai[i];
        }
        System.out.println("nilai max : "+  max);
        System.out.println("nilai min : "+  min);
    }
}
