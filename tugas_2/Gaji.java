import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gaji = 0;
        double persen = 0;

        System.out.print("Masukan golongan (A/B/C) : ");
        String golongan = input.nextLine().toUpperCase();

        if (golongan.equals("A")) {
            gaji = 5000000;
        } else if (golongan.equals("B")) {
            gaji = 6500000;
        } else if (golongan.equals("C")) {
            gaji = 9500000;
        } else {
            System.out.println("Golongan tidak diketahui");
            System.exit(0);
        }

        System.out.print("Masukan jam lembur : ");
        int jamLembur = input.nextInt();

        if (jamLembur == 1) {
            persen = 0.3;
        } else if (jamLembur == 2) {
            persen = 0.32;
        } else if (jamLembur == 3) {
            persen = 0.34;
        } else if (jamLembur == 4) {
            persen = 0.36;
        } else if (jamLembur >= 5) {
            persen = 0.38;
        } else {
            persen = 0;
        }

        int takeHomePay = (int) (gaji * persen) + gaji;
        System.out.println("Take Home Pay " + takeHomePay);
    }
}
