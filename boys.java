import java.util.Scanner;

class boys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float dist = sc.nextFloat();
        float res = 5000;
        if (dist < 10) {
            res = res + 15 * dist;
        } else if (dist < 50) {
            res = res + (dist - 10) * 14 + 10 * 15;
        } else if (dist < 100) {
            res = res + (dist - 50) * 12 + 10 * 15 + 40 * 14;
        } else if (dist < 1000) {
            res = res + (dist - 100) * 11 + 10 * 15 + 40 * 14 + 50 * 12;
        } else {
            res = res + (dist - 1000) * 10 + 10 * 15 + 40 * 15 + 50 * 12 + 900 * 11;
        }

        res = (float) (res + 0.18 * res);
        res = (float) (res + 0.12 * res);
        System.out.println("Total Fair is - " + res);
    }
}