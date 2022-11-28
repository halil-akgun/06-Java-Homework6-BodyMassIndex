package bodymassindex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int weight, height;

        System.out.print("Boyunuz (cm): ");
        height = (input.nextInt());
        double heightM = height / 100.0;

        System.out.print("Kilonuz (kg): ");
        weight = input.nextInt();
        double weightDouble = weight;

        double bmi = weightDouble / (heightM * heightM);
        System.out.print("Vücut Kitle İndeksiniz: " + bmi);

    }
}