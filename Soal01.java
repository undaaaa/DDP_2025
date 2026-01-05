import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah siswa : ");
        int siswa = input.nextInt();
        int[] nilai = new int[siswa];
        int total = 0;
        for (int i = 0; i < nilai.length ; i++) {
            System.out.print("siswa " + (i+1) + " : ");
            nilai[i] = input.nextInt();
            total += nilai[i];


        }
        double rata = total / nilai.length;
        System.out.println("Jumlah nilai : " + total);
        System.out.print("Nilai rata-rata : " + rata);
    }

}
