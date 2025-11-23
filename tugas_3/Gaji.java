package tugas_3;

import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gaji[] = {5000000, 6500000, 9500000};
        int lembur[] = {30, 32, 34, 36, 38};

        System.out.print("Masukan golongan (A/B/C) : ");
        String golongan = input.nextLine().toUpperCase();

        int gajiTmp = 0;

        if (golongan.equals("A")) {
             gajiTmp = gaji[0];
        } else if (golongan.equals("B")) {
            gajiTmp = gaji[1];
        } else if (golongan.equals("C")) {
            gajiTmp = gaji[2];
        } else {
            System.out.println("Golongan tidak diketahui");
            System.exit(0);
        }


        System.out.print("Masukan jam lembur : ");
        int jamLembur = input.nextInt();
        double persen = 0;

        if (jamLembur >= 1) {
            if (jamLembur >= 5) {
                persen = lembur[4] / 100.0;
            } else {
                persen = lembur[jamLembur - 1] / 100.0;
            }
        }

        double gajiLembur = gajiTmp * persen;
        double takeHomePay = gajiTmp + gajiLembur;

        System.out.println("Persen : " + persen);
        System.out.println("Gaji Lembur : " + (int) gajiLembur);
        System.out.println("Take Home Pay : " + (int) takeHomePay);
    }
}
