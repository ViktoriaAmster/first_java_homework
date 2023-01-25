import java.util.Random;

public class program {
    public static void main(String[] args) {

        Random rnd = new Random();
        Integer i = rnd.nextInt(2000);
        System.out.println(i);
        int n;
        System.out.println(n = Integer.toBinaryString(i).length());

        int kol1;
        if((i % n == 0) | (Short.MAX_VALUE % n == 0)){
            kol1 = (Short.MAX_VALUE - i) / n + 1;
        }
        else {
            kol1 = ((Short.MAX_VALUE - i) / n);
        }
        int[] m1 = new int[kol1];
        int count = 0;
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[count] = j;
                count++;
            }
        }

        int kol2;
        int countMul;
        if ((i % n == 0) | (Short.MIN_VALUE % n == 0)) {
            countMul = (i - Short.MIN_VALUE) / n + 1;
        }
        else {
            countMul = (i - Short.MIN_VALUE) / n;
        }

        kol2 = (i - Short.MIN_VALUE + 1 - countMul);
        int[] m2 = new int[kol2];
        count = 0;
        for (int j = Short.MIN_VALUE; j <= i ; j++) {
            if (j % n != 0) {
                m2[count] = j;
                count++;
            }
        }
    }
}
