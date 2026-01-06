import java.util.Scanner;
public class soal5 {
    public static void main(String[] args) {

       int[] nilai = {23, 67, 23, 56,232, 876,};
        int max = nilai[0];
        for (int i = 0; i < nilai.length ; i++) {
            if (nilai[i] > max){
                max = nilai[i];
            }
        }
        System.out.print("nilai max : " + max);
    }
}
