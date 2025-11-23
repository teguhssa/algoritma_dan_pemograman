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
        switch (golongan) {
            case "A":
                gajiTmp = gaji[0];
                break;
            case "B":
                gajiTmp = gaji[1];
                break;
            case "C":
                gajiTmp = gaji[2];
                break;
            default:
                System.out.println("Golongan tidak diketahui");
                System.exit(0);
        }

        System.out.print("Masukan jam lembur : ");
        int jamLembur = input.nextInt();
        double persen = 0;

        if (jamLembur >= 1) {
            if (jamLembur >= 5) {
                persen = lembur[4] / 100;
            } else {
                persen = lembur[jamLembur - 1] / 100;
            }
        } else {
            persen = 0;
        }


        int takeHomePay = (int) (gajiTmp * persen) + gajiTmp;
        System.out.println("Take Home Pay " + takeHomePay);
    }
}
